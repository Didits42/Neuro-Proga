package classes.characters;

import abstractclass.Character;
import classes.sentenceStructure.enums.Gender;

import java.util.Objects;

public class Ermenrih extends Character {
    public Ermenrih() {
        super("Аист Эрменрих", Gender.MALE);
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
        Ermenrih ermenrih = (Ermenrih) obj;
        return super.equals(ermenrih);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }


    @Override
    public String toString() {
        return "Ermenrih{" + "name='" + super.getName() + "', " + "gender=" + super.getGender() + "}";
    }
}
