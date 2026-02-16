package modules.lmsr.logic;

import modules.lmsr.model.Course;

import java.util.List;

public class CourseRandomizer {
    private boolean includeDlc = false;

    public void setIncludeDlc(boolean includeDlc) {
        this.includeDlc = includeDlc;
    }

    public String getCoursesInRandomOrder() {
        CourseSelector courseSelector = new CourseSelector();
        List<Course> courseList = courseSelector.generateRandomCourseList(this.includeDlc);
        return buildCourseListString(courseList);
    }

    private String buildCourseListString(List<Course> courseList) {
        StringBuilder sb = new StringBuilder();

        String intro = String.format("Great! Here's a randomized list of tours for Lonely Mountains: Snow Riders, DLC courses " + (includeDlc? "" : "NOT ") + "included:\n\n");
        sb.append(intro);

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