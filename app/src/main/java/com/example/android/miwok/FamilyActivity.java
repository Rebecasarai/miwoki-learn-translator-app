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
        words.add(new Word("Father", "әpә", R.drawable.family_father));
        words.add(new Word("Mother", "Oṭiiko", R.drawable.family_mother));
        words.add(new Word("Daughter", "Tolookosu",R.drawable.family_daughter));
        words.add(new Word("Son", "Oyyiisa",R.drawable.family_son));
        words.add(new Word("Grand Father", "massokka",R.drawable.family_grandfather));
        words.add(new Word("Grand Mother", "temmokka",R.drawable.family_grandmother));
        words.add(new Word("Older Brother", "kenekaku",R.drawable.family_older_brother));
        words.add(new Word("Older Sister", "kawinṭa",R.drawable.family_older_sister));
        words.add(new Word("Younger Sister", "wo'e",R.drawable.family_younger_sister));
        words.add(new Word("Younger Brother", "na'aacha",R.drawable.family_younger_brother));



        int index=0;

        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}
