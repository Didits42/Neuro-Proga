package abstractclass;

import classes.exeptions.IllegalArgumentException;
import classes.sentenceStructure.enums.Gender;

public abstract class Character {
    protected String name;
    protected Gender gender;

    public Character(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public final String getName() {
        return name;
    }

    public final Gender getGender() {
        return gender;
    }

    public abstract void printSubjPronoun() throws IllegalArgumentException;

    public abstract void printPossPronoun() throws IllegalArgumentException;
}
