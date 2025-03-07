package classes.sentenceStructure;

import classes.sentenceStructure.enums.Places;
import abstractclass.Character;
import classes.sentenceStructure.enums.Action;

public record SentenceRecordWithArray(Places place, Character subject, Action action, String moreInfo, ListOfThings list) {
    public void formSentenceWithArray() {
        String sentence = place.getPlace() + subject.getName() + " " + action.toGenderOrPlural(subject.getGender());

        if (!moreInfo.isEmpty()) {
            sentence += " " + moreInfo;
        }

        if (list != null) {
            sentence += " " + list.getItemsAsString();
        }

        System.out.println(sentence + ".");
    }
}