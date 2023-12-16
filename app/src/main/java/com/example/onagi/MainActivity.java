package com.example.onagi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtName;
    private TextView txtAbout;
    private ImageView txtProfilePic;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = findViewById(R.id.txtName);
        txtAbout = findViewById(R.id.txtAbout);
        txtProfilePic = findViewById(R.id.imageView);
    }
}