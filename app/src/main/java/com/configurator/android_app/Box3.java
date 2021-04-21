package com.configurator.android_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Box3 extends AppCompatActivity {

    private Button button28, button29, button30, button31;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_box3);
        addListenerOnButton();

    }

    private void addListenerOnButton() {
        button28 = (Button) findViewById(R.id.button28);
        button29 = (Button) findViewById(R.id.button29);
        button30 = (Button) findViewById(R.id.button30);
        button31 = (Button) findViewById(R.id.button31);


        button28.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Img20");
                        startActivity(intent);

                    }
                }
        );

        button29.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Img21");
                        startActivity(intent);

                    }
                }
        );

        button30.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Img22");
                        startActivity(intent);

                    }
                }
        );

        button31.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Img24");
                        startActivity(intent);

                    }
                }
        );


    }
}
