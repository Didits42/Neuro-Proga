package classes.characters;

import abstractclass.Character;
import classes.sentenceStructure.enums.Gender;

import java.util.Objects;

public class Mess extends Character {
    public Mess() {
        super("переполох", Gender.MALE);
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
        Mess mess = (Mess) obj;
        return super.equals(mess);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }


    @Override
    public String toString() {
        return "Mess{name='" + getName() + "', gender=" + getGender() + "}";
    }

}