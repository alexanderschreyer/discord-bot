package modules.lmsr.model;

public enum Mountain {
    TAN("Tannenstein"),
    MON("Monte Guanaco"),
    SIE("Sierra Gelida"),
    BAI("Baifushan"),
    BEN("Ben Fiadhein");

    private final String name;

    Mountain(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}