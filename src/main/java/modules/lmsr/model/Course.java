package modules.lmsr.model;

import static modules.lmsr.model.Mountain.*;

public enum Course {
    TAN_1("Eisige Allee", TAN),
    TAN_2("Weinender Wald", TAN),
    TAN_3("Grimmiger Hang", TAN),
    TAN_4("Saphir See", TAN),

    MON_1("Sendero Perdido", MON),
    MON_2("Velo Glacial", MON),
    MON_3("Cuesta Del Alba", MON),
    MON_4("Salto Rizado", MON),

    SIE_1("Barren Plateau", SIE),
    SIE_2("Spiraling Descent", SIE),
    SIE_3("Queens Canyon", SIE),
    SIE_4("Crimson Pool", SIE),

    BAI_1("Hanlin", BAI),
    BAI_2("Donggu", BAI),
    BAI_3("Huanta", BAI),
    BAI_4("Jingku", BAI),

    BEN_1("Isle of Tamh", BEN),
    BEN_2("Glen Darach", BEN),
    BEN_3("Auld Monadh", BEN),
    BEN_4("Loch Rioghail", BEN);

    private final String courseName;
    private final Mountain mountain;

    Course(String courseName, Mountain mountain) {
        this.courseName = courseName;
        this.mountain = mountain;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getMountainName() {
        return mountain.getName();
    }
}
