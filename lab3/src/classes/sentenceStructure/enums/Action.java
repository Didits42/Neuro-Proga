package classes.sentenceStructure.enums;

import interfaces.toGenderOrPluralForm;
import abstractclass.Character;

public enum Action implements toGenderOrPluralForm {
    WAS("был", "была", "было", "были"),
    THREW("побросал", "побросала", "побросало", "побросали"),
    RUN("сбежался", "сбежалась", "сбежалось", "сбежались"),
    LIVED("жил", "жила", "жило", "жили"),
    MADE("устроил", "устроила", "устроило", "устроили"),
    PUT("выложил", "выложила", "выложило", "выложили"),
    COVERED("выстлал", "выстлала", "выстлало", "выстлали"),
    OVERGREW("оброс", "обросла", "обросло", "обросли");

    private final String maleVerb;
    private final String femaleVerb;
    private final String neutralVerb;
    private final String pluralVerb;

    Action(String maleVerb, String femaleVerb, String neutralVerb, String pluralVerb) {
        this.maleVerb = maleVerb;
        this.femaleVerb = femaleVerb;
        this.neutralVerb = neutralVerb;
        this.pluralVerb = pluralVerb;
    }

    @Override
    public String toGenderOrPlural(Gender gender) {
        return switch (gender) {
            case MALE -> maleVerb;
            case FEMALE -> femaleVerb;
            case NEUTRAL -> neutralVerb;
            case GROUP -> pluralVerb;
        };
    }

    //public void formAction(Character subject, Places place, String moreInfo) {
    //    System.out.print(place.getPlace() + subject.getName() + " " + toGenderOrPlural(subject.getGender()));
    //    if (!moreInfo.isEmpty()) {
    //        System.out.print(" " + moreInfo);
    //    }
    //    System.out.println(".");
    //}

    //public void formAction(Character subject, Places place) {
    //    formAction(subject, place, "");
    //}

}