package classes.characters;

import abstractclass.Character;
import classes.sentenceStructure.enums.Gender;

import java.util.Objects;

public class Residents extends Character {
    public Residents() {
        super("Жильцы", Gender.GROUP);
    }

    @Override
    public void printPossPronoun() {
        System.out.print("они");
    }

    @Override
    public void printSubjPronoun() {
        System.out.print("их");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Residents residents = (Residents) obj;
        return super.equals(residents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public String toString() {
        return "Residents{name='" + getName() + "', gender=" + getGender() + "}";
    }

}
