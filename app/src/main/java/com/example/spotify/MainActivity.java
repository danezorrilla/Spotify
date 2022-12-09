package com.example.spotify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Artist> artists = new ArrayList<>();
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        artists.add(new Artist(R.drawable.img, "J.Cole", "Artist"));
        artists.add(new Artist(R.drawable.img_1, "Red Hot Chili Peppers", "Artist"));

        listView = findViewById(R.id.listview);
        adapter = new MyAdapter(this, R.layout.user_library, artists);
        listView.setAdapter(adapter);
    }
}