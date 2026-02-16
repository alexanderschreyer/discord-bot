package modules.lmsr.logic;

import modules.lmsr.model.Course;
import modules.lmsr.model.CourseRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CourseSelector {
    private boolean allowMixed = false;
    private boolean includeDlc = false;

    private final CourseRepository courseRepository;

    public CourseSelector() {
        this.courseRepository = new CourseRepository();
    }

    public void setAllowMixed(boolean allowMixed) {
        this.allowMixed = allowMixed;
    }

    public void setIncludeDlc(boolean includeDlc) {
        this.includeDlc = includeDlc;
    }

    public List<Course> generateRandomCourseList() {
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
