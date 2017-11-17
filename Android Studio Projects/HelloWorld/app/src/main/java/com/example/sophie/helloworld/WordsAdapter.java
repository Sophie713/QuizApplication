package com.example.sophie.helloworld;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.example.sophie.helloworld.MyDictionary;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sophie on 11/16/2017.
 */


  public class WordsAdapter extends ArrayAdapter {


    WordsAdapter(Context context, ArrayList<MyDictionary> words) {
        super(context, R.layout.list_item, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater sophiesInflater = LayoutInflater.from(getContext());
        View customView = sophiesInflater.inflate(R.layout.list_item, parent, false);

        MyDictionary currentWord = (MyDictionary) getItem(position);

        String definitions = currentWord.setText(currentWord.getDefinition());
        String vocabulary = getVocabulary();
        TextView newDefinition = customView.findViewById(R.id.definitions);
        TextView newWords = customView.findViewById(R.id.vocabulary);

        newDefinition.setText(definitions);
        newWords.setText(vocabulary);
        return customView;
    }


}