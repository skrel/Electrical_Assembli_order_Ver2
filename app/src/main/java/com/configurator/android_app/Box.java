package com.configurator.android_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Box extends AppCompatActivity {

   private Button button11, button12, button13, button14, button15, button16, button17, button18, button19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_box);
        addListenerOnButton();

    }

    private void addListenerOnButton() {
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        button16 = (Button) findViewById(R.id.button16);
        button17 = (Button) findViewById(R.id.button17);
        button18 = (Button) findViewById(R.id.button18);
        button19 = (Button) findViewById(R.id.button19);

        button11.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Img1");
                        startActivity(intent);

                    }
                }
        );

        button12.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Img3");
                        startActivity(intent);

                    }
                }
        );

        button13.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Img5");
                        startActivity(intent);

                    }
                }
        );

        button14.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Img7");
                        startActivity(intent);

                    }
                }
        );

        button15.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Img9");
                        startActivity(intent);

                    }
                }
        );

        button16.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Img11");
                        startActivity(intent);

                    }
                }
        );

        button17.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Img15");
                        startActivity(intent);

                    }
                }
        );

        button18.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Img13");
                        startActivity(intent);

                    }
                }
        );

        button19.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Img32");
                        startActivity(intent);

                    }
                }
        );

    }
}
