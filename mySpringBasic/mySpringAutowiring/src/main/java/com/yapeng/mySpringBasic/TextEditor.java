package com.yapeng.mySpringBasic;

public class TextEditor {
    private SpellChecker spellCheckerByName;
    private String name;

    public SpellChecker getSc() {
        return spellCheckerByName;
    }

    public void setSc(SpellChecker spellChecker) {
        this.spellCheckerByName = spellChecker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void spellCheck() {
        spellCheckerByName.checkSpelling();
    }
}
