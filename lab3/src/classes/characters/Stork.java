package classes.characters;

import abstractclass.Character;
import classes.sentenceStructure.enums.Gender;
import classes.exeptions.IllegalArgumentException;

import java.util.Objects;

public class Stork extends Character {
    public Stork(Gender gender) throws IllegalArgumentException {
        super(
                switch (gender) {
                    case MALE -> "Аист";
                    case FEMALE -> "Аистиха";
                    case GROUP -> "Аисты";
                    default -> throw new IllegalArgumentException();
                    }, gender);
    }

    @Override
    public void printPossPronoun() throws IllegalArgumentException {
        String pronoun = switch (gender) {
            case MALE -> "его";
            case FEMALE -> "её";
            case GROUP -> "их";
            default -> throw new IllegalArgumentException();
        };
        System.out.print(pronoun);
    }

    @Override
    public void printSubjPronoun() throws IllegalArgumentException {
        String pronoun = switch (gender) {
            case MALE -> "он";
            case FEMALE -> "она";
            case GROUP -> "они";
            default -> throw new IllegalArgumentException();
        };
        System.out.print(pronoun);
    }

    public Stork getPlural() {
        System.out.print("Аисты");
        return this;
    }

    public Stork getFemale() {
        System.out.print("Аистиха");
        return this;
    }

    public Stork getMale() {
        System.out.print("Аист");
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Stork stork = (Stork) obj;
        return super.equals(stork);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public String toString() {
        return "Stork{name='" + getName() + "', gender=" + getGender() + "}";
    }
}