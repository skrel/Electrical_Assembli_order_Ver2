package com.configurator.android_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Prebox extends AppCompatActivity {

    private Button button42, button43, button44;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prebox);
        addListenerOnButton();

    }

    private void addListenerOnButton() {
        button42 = (Button) findViewById(R.id.button42);
        button43 = (Button) findViewById(R.id.button43);
        button44 = (Button) findViewById(R.id.button44);

        button42.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Box");
                        startActivity(intent);

                    }
                }
        );

        button43.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Box2");
                        startActivity(intent);

                    }
                }
        );

        button44.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Box3");
                        startActivity(intent);

                    }
                }
        );

    }
}
