package classes.characters;

import abstractclass.Character;
import classes.sentenceStructure.enums.Gender;

import java.util.Objects;

public class Nest extends Character {
    public Nest() {
        super("Гнездо", Gender.NEUTRAL);
    }

    @Override
    public void printPossPronoun() {
        System.out.print("его");
    }

    @Override
    public void printSubjPronoun() {
        System.out.print("он");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Nest nest = (Nest) obj;
        return super.equals(nest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }


    @Override
    public String toString() {
        return "Nest{name='" + getName() + "', gender=" + getGender() + "}";
    }


}
