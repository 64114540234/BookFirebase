package com.example.bookfirebase;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bAddBook, bShowImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bAddBook = (Button) findViewById(R.id.bAddBook);
        bAddBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAddBook();
            }
        });

        bShowImages = (Button) findViewById(R.id.bShowBook);
        bShowImages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showBook();
            }
        });

    }

    private void showAddBook(){
        Intent intent = new Intent(MainActivity.this, AddBook.class);
        MainActivity.this.startActivity(intent);
    }

    private void showBook(){
        Intent intent = new Intent(MainActivity.this, ShowBook.class);
        MainActivity.this.startActivity(intent);
    }
}