package com.yapeng.mySpringBasic;

public class TextEditorCon {
    private SpellChecker spellChecker;
    private String name;

    public TextEditorCon( SpellChecker spellChecker, String name ) {
        this.spellChecker = spellChecker;
        this.name = name;
    }
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
    public String getName() {
        return name;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
