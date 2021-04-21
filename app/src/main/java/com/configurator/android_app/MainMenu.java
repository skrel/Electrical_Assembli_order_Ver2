package com.configurator.android_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.configurator.android_app.R;

public class MainMenu extends AppCompatActivity {

    private Button button1, button2, button3, button4, button5, button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        addListenerOnButton();

    }

    private void addListenerOnButton() {
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);

        button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Prebox");
                        startActivity(intent);

                    }
                }
        );

        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Cart");
                        startActivity(intent);

                    }
                }
        );

        button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Panel");
                        startActivity(intent);

                    }
                }
        );

        button4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Conduit");
                        startActivity(intent);

                    }
                }
        );

        button5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Support");
                        startActivity(intent);

                    }
                }
        );

        button6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Cable");
                        startActivity(intent);

                    }
                }
        );


}}