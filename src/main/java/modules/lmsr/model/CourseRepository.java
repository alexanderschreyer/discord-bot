package modules.lmsr.model;

import java.util.ArrayList;
import java.util.List;

import static modules.lmsr.model.Course.*;

public class CourseRepository {
    private List<Course> tannenstein;
    private List<Course> monteGuanaco;
    private List<Course> sierraGelida;
    private List<Course> baifushan;
    private List<Course> benFiadhein;

    public CourseRepository() {
        tannenstein = new ArrayList<>();
        tannenstein.add(TAN_1);
        tannenstein.add(TAN_2);
        tannenstein.add(TAN_3);
        tannenstein.add(TAN_4);

        monteGuanaco = new ArrayList<>();
        monteGuanaco.add(MON_1);
        monteGuanaco.add(MON_2);
        monteGuanaco.add(MON_3);
        monteGuanaco.add(MON_4);

        sierraGelida = new ArrayList<>();
        sierraGelida.add(SIE_1);
        sierraGelida.add(SIE_2);
        sierraGelida.add(SIE_3);
        sierraGelida.add(SIE_4);

        baifushan = new ArrayList<>();
        baifushan.add(BAI_1);
        baifushan.add(BAI_2);
        baifushan.add(BAI_3);
        baifushan.add(BAI_4);

        benFiadhein = new ArrayList<>();
        benFiadhein.add(BEN_1);
        benFiadhein.add(BEN_2);
        benFiadhein.add(BEN_3);
        benFiadhein.add(BEN_4);
    }

    public List<Course> getTannenstein() {
        return tannenstein;
    }

    public List<Course> getSierraGelida() {
        return sierraGelida;
    }

    public List<Course> getMonteGuanaco() {
        return monteGuanaco;
    }

    public List<Course> getBaifushan() {
        return baifushan;
    }

    public List<Course> getBenFiadhein() {
        return benFiadhein;
    }
}