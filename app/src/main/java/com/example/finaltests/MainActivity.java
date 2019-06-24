package com.example.finaltests;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText bookNameEditText = findViewById(R.id.bookNameEditText);
        final EditText genreEditText = findViewById(R.id.genreEditText);
        final Button addButton = findViewById(R.id.addButtom);
        final List <Book> list = new ArrayList<>();
        final RecyclerView listRecyclerView = findViewById(R.id.listRecyclerView);
        listRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        final BooksAdapter adapter = new BooksAdapter(this, list);
        listRecyclerView.setAdapter(adapter);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Book bookTest = new Book(bookNameEditText.getText().toString());
                bookTest.genre = genreEditText.getText().toString();
                list.add(bookTest);
                adapter.notifyDataSetChanged();

            }
        });

        }

    }

