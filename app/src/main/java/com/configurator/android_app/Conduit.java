package com.configurator.android_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Conduit extends AppCompatActivity {

    private Button button40, button41;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conduit);
        addListenerOnButton();

    }

    private void addListenerOnButton() {
        button40 = (Button) findViewById(R.id.button40);
        button41 = (Button) findViewById(R.id.button41);

        button40.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Img25");
                        startActivity(intent);

                    }
                }
        );

        button41.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Img26");
                        startActivity(intent);

                    }
                }
        );
    }
}
