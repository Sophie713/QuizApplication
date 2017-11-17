package com.example.sophie.helloworld;

/**
 * Created by Sophie on 11/16/2017.
 */

public class MyDictionary {
    //** Definition of the word */
    private String mDefinition;
    //** New word to learn
    private String mVocabulary;

    /** Create a new Word object.
     *
     * @param definition definition of the word
     * @param newWord word to learn
     */


    public MyDictionary(String definition, String newWord) {
        mDefinition = definition;
        mVocabulary = newWord;
    }

    /**
     * +     * Get the default translation of the word.
     */
    public String getDefinition() {
        return mDefinition;
    }

    /**
     * +     * Get the Miwok translation of the word.
     */
    public String getNewWord() {
        return mVocabulary;
    }
}
