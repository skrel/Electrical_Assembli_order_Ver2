package com.configurator.android_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Cable extends AppCompatActivity {

    private Button button39;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cable);
        addListenerOnButton();

    }

    private void addListenerOnButton() {
        button39 = (Button) findViewById(R.id.button39);

        button39.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.Img33");
                        startActivity(intent);

                    }
                }
        );

    }
}
