package classes.sentenceStructure;

import classes.sentenceStructure.enums.Places;
import abstractclass.Character;
import classes.sentenceStructure.enums.*;

public record SentenceRecord(Places place, Character subject1, Character subject2, Action action, String moreInfo) {
    public void formSentence() {
        String subjects = subject1.getName();
        if (subject2 != null) {
            subjects += " и " + subject2.getName();
        }

        Gender verbGender;
        if (subject2 == null) {
            verbGender = subject1.getGender();
        } else {
            verbGender = Gender.GROUP;
        }
        String verb = action.toGenderOrPlural(verbGender);

        String sentence = place.getPlace() + subjects + " " + verb;
        if (!moreInfo.isEmpty()) {
            sentence += " " + moreInfo;
        }
        sentence += ".";
        System.out.println(sentence);
    }
}