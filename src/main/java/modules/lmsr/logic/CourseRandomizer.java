package modules.lmsr.logic;

import modules.lmsr.model.Course;
import modules.lmsr.model.CourseRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CourseRandomizer {
    // TODO : IMPLEMENT OPTION TO DISABLE MULTIPLE COURSES OF THE SAME MOUNTAIN PER TOUR
    private boolean disallowMultiple = false;

    private final CourseRepository courseRepository;

    public CourseRandomizer() {
        this.courseRepository = new CourseRepository();
    }

    public void setDisallowMultiple(boolean disallowMultiple) {
        this.disallowMultiple = disallowMultiple;
    }

    public List<Course> generateRandomCourseList(boolean includeDlc) {
        List<Course> courses = new ArrayList<>();
        courses.addAll(courseRepository.getTannenstein());
        courses.addAll(courseRepository.getMonteGuanaco());
        courses.addAll(courseRepository.getSierraGelida());
        courses.addAll(courseRepository.getBaifushan());
        if (includeDlc) {
            courses.addAll(courseRepository.getBenFiadhein());
        }
        Collections.shuffle(courses);
        return courses;
    }
}
