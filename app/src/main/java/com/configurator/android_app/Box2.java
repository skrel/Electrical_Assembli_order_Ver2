package com.configurator.android_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Box2 extends AppCompatActivity {

    private Button button20, button21, button22, button23, button24, button25, button26, button27;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_box2);
        addListenerOnButton();

    }

    private void addListenerOnButton() {
        button20 = (Button) findViewById(R.id.button20);
        button21 = (Button) findViewById(R.id.button21);
        button22 = (Button) findViewById(R.id.button22);
        button23 = (Button) findViewById(R.id.button23);
        button24 = (Button) findViewById(R.id.button24);
        button25 = (Button) findViewById(R.id.button25);
        button26 = (Button) findViewById(R.id.button26);
        button27 = (Button) findViewById(R.id.button27);

        button20.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Img2");
                        startActivity(intent);

                    }
                }
        );

        button21.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Img4");
                        startActivity(intent);

                    }
                }
        );

        button22.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Img6");
                        startActivity(intent);

                    }
                }
        );

        button23.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Img8");
                        startActivity(intent);

                    }
                }
        );

        button24.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Img10");
                        startActivity(intent);

                    }
                }
        );

        button25.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Img12");
                        startActivity(intent);

                    }
                }
        );

        button26.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Img16");
                        startActivity(intent);

                    }
                }
        );

        button27.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Img14");
                        startActivity(intent);

                    }
                }
        );

    }
}
