package classes.sentenceStructure;

public class Punctuation {
    public Punctuation comma() {
        System.out.print(", ");
        return this;
    }

    public Punctuation dot() {
        System.out.println(".");
        return this;
    }

    public Punctuation space() {
        System.out.print(" ");
        return this;
    }

}