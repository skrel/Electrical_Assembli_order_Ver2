package com.configurator.android_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Panel extends AppCompatActivity {

    private Button button35, button37, button38;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panel);
        addListenerOnButton();

    }

    private void addListenerOnButton() {
        button35 = (Button) findViewById(R.id.button35);
        button37 = (Button) findViewById(R.id.button37);
        button38 = (Button) findViewById(R.id.button38);

        button35.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Img28");
                        startActivity(intent);

                    }
                }
        );

        button37.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Img30");
                        startActivity(intent);

                    }
                }
        );

        button38.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Img31");
                        startActivity(intent);

                    }
                }
        );

    }
}