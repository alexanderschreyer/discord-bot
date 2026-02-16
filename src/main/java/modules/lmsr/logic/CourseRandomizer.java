package modules.lmsr.logic;

import modules.lmsr.model.Course;

import java.util.List;

public class CourseRandomizer {

    public String getCoursesInRandomOrder() {
        CourseSelector courseSelector = new CourseSelector();
        courseSelector.setIncludeDlc(true);
        List<Course> courseList = courseSelector.generateRandomCourseList();
        return buildCourseListString(courseList);
    }

    private String buildCourseListString(List<Course> courseList) {
        StringBuilder sb = new StringBuilder();

        int tourIndex = 1;
        int courseIndex = 0;

        for(Course course : courseList) {
            if (courseIndex == 0) {
                sb.append("**Tour ").append(tourIndex).append("**\n");
                tourIndex++;
            }
            courseIndex++;
            sb.append(courseIndex).append(": ").append(course.getCourseName()).append(" [").append(course.getMountainName()).append("] \n");
            if (courseIndex % 4 == 0) {
                sb.append("\n");
                courseIndex = 0;
            }
        }

        return sb.toString();
    }
}