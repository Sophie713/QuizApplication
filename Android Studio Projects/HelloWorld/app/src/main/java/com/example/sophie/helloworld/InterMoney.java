package com.example.sophie.helloworld;

import android.provider.UserDictionary;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class InterMoney extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inter_money);



        ArrayList<MyDictionary> intermediateMoney = new ArrayList<MyDictionary>();

        intermediateMoney.add(new MyDictionary("have enough money to buy something", "(can) afford"));
        intermediateMoney.add(new MyDictionary("verb, give money to someone for a limited time","lend to"));
        intermediateMoney.add(new MyDictionary("verb, take money from someone for a limited time","borrow from"));
        intermediateMoney.add(new MyDictionary("noun, money you borrow to buy a house","mortgage"));
        intermediateMoney.add(new MyDictionary("have value (My car is _____ 80.000,-)","(be) worth"));
        intermediateMoney.add(new MyDictionary("verb, before you pay someone back you ___ them money","owe"));
        intermediateMoney.add(new MyDictionary("noun, money you borrow","loan"));
        intermediateMoney.add(new MyDictionary("verb, money you pay for a service, (The mechanic _____ me 500,-)","charge"));
        intermediateMoney.add(new MyDictionary("verb, have a price, (The book ____ 300,-)","cost"));
        intermediateMoney.add(new MyDictionary("noun, money you owe","debt"));
        intermediateMoney.add(new MyDictionary("noun, money you pay to the state","tax"));
        intermediateMoney.add(new MyDictionary("metal money", "coin"));
        intermediateMoney.add(new MyDictionary("paper money","note"));
        intermediateMoney.add(new MyDictionary("verb, spend stupidly","waste"));
        intermediateMoney.add(new MyDictionary("verb, get money after someone dies","inherit"));

        WordsAdapter itemsAdapter =
                new WordsAdapter(this, intermediateMoney);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);

        }

    }

