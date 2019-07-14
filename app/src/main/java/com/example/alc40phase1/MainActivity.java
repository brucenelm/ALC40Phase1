package com.example.alc40phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button alcButton, profileButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        alcButton = findViewById(R.id.button_alc);
        profileButton = findViewById(R.id.button_myprofile);

        alcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAboutAlc();

            }
        });

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMyProfile();
            }
        });

    }

    private void openMyProfile() {
        Intent intent = new Intent(this, MyProfile.class);
        startActivity(intent);
    }

    private void openAboutAlc() {

        Intent intent = new Intent(this, AboutAlc.class);
        startActivity(intent);
    }
    }

