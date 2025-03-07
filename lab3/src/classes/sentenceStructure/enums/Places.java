package classes.sentenceStructure.enums;

public enum Places {
    CASTLE("В Глиммингенском замке "),
    OUTSIDE("Снаружи "),
    TOWER("На крышу угловой башни "),
    WHEEL("На старом колесе от телеги "),
    NOTHING(""),
    THERE("Там ");

    private final String name;

    Places(String name) {
        this.name = name;
    }
    public String getPlace() {
        return name;
    }

}

