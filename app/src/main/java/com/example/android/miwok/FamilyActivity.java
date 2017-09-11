/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Father", "әpә", R.drawable.ic_action_name));
        words.add(new Word("Two", "Oṭiiko", R.drawable.mom));
        words.add(new Word("Three", "Tolookosu",R.drawable.mom));
        words.add(new Word("Four", "Oyyiisa",R.drawable.mom));
        words.add(new Word("Five", "massokka",R.drawable.mom));
        words.add(new Word("Six", "temmokka",R.drawable.mom));
        words.add(new Word("Seven", "kenekaku",R.drawable.mom));
        words.add(new Word("Eight", "kawinṭa",R.drawable.mom));
        words.add(new Word("Nine", "wo'e",R.drawable.mom));
        words.add(new Word("Ten", "na'aacha",R.drawable.mom));



        int index=0;

        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}
