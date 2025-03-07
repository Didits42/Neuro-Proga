import classes.characters.*;
import classes.exeptions.IllegalArgumentException;
import classes.sentenceStructure.*;
import classes.sentenceStructure.enums.*;


//Castle, tower, Wheel, outside

//ДАНО:
// В Глиммингенском замке был переполох.
// Все жильцы побросали свои насиженные места и сбежались на крышу угловой башни, - там жил аист Эрменрих со своей аистихой.
// Гнездо у них было отличное.
// Аисты устроили его на старом колесе от телеги, выложили в несколько рядов прутьями и дерном, выстлали мягким мхом и пухом.
// А снаружи гнездо обросло густой травой и даже мелким кустарником.

//ИТОГ:
//В Глиммингенском замке переполох был.
//Жильцы побросали их насиженные места. На крышу угловой башни Жильцы сбежались.
//Там Аист Эрменрих жил и его Аистиха.
//Гнездо было отличное у них.
//На старом колесе от телеги Аисты устроили гнездо. Аисты выложили в несколько рядов прутья, дёрн. Аисты выстлали мягкий мох, пух.
//Снаружи гнездо обросло густой травой, мелким кустарником.


public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        Mess mess = new Mess();
        Places castle = Places.CASTLE;

        SentenceRecord sentence1 = new SentenceRecord(castle, mess, null, Action.WAS, "");
        sentence1.formSentence();
        //System.out.println(sentence1.toString());


        Residents residents = new Residents();
        Places noPlace = Places.NOTHING;
        SentenceRecord sentence2 = new SentenceRecord(noPlace, residents, null, Action.THREW, "их насиженные места");
        sentence2.formSentence();
        //System.out.println(sentence2.toString());

        Places tower = Places.TOWER;
        SentenceRecord sentence3 = new SentenceRecord(tower, residents, null, Action.RUN, "");
        sentence3.formSentence();
        //System.out.println(sentence3.toString());

        Ermenrih ermenrih = new Ermenrih();
        Stork femaleStock = new Stork(Gender.FEMALE);
        Places there = Places.THERE;
        SentenceRecord sentence4 = new SentenceRecord(there, ermenrih, femaleStock, Action.LIVED, "");
        sentence4.formSentence();
        //System.out.println(sentence4.toString());

        Nest nest = new Nest();
        SentenceRecord sentence5 = new SentenceRecord(noPlace, nest, null, Action.WAS, "отличное");
        sentence5.formSentence();
        //System.out.println(sentence5.toString());

        Places wheel = Places.WHEEL;
        Stork twoStorks = new Stork(Gender.GROUP);
        SentenceRecord sentence6 = new SentenceRecord(wheel, ermenrih, femaleStock, Action.MADE, "гнездо");
        sentence6.formSentence();
        //System.out.println(sentence6.toString());


        String[] materials = {"прутья", "дёрн"};
        ListOfThings listM = new ListOfThings(materials);
        SentenceRecordWithArray sentence7 = new SentenceRecordWithArray(noPlace, twoStorks, Action.PUT, "в несколько рядов", listM);
        sentence7.formSentenceWithArray();
        //System.out.println(sentence7.toString());

        String[] materialsSoft = {"мягким мхом", "пухом"};
        ListOfThings listS = new ListOfThings(materialsSoft);
        SentenceRecordWithArray sentence8 = new SentenceRecordWithArray(noPlace, twoStorks, Action.COVERED, "", listS);
        sentence8.formSentenceWithArray();
        //System.out.println(sentence8.toString());

        String[] grass = {"густой травой", "мелким кустарником"};
        Places outside = Places.OUTSIDE;
        ListOfThings listG = new ListOfThings(grass);
        SentenceRecordWithArray sentence9 = new SentenceRecordWithArray(outside, nest, Action.OVERGREW, "", listG);
        sentence9.formSentenceWithArray();
        //System.out.println(sentence9.toString());


    }
}
