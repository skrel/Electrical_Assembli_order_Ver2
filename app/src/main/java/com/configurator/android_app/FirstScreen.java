package com.configurator.android_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class FirstScreen extends AppCompatActivity {

    private Button button_about, button_main_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
        addListenerOnButton();
    }

    private void addListenerOnButton() {
        button_about = (Button) findViewById(R.id.button_about);
        button_about.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent("com.configurator.user.android_app.About");
                            startActivity(intent);

                        }
                    }
        );

        button_main_menu = (Button) findViewById(R.id.button_main_menu);
        button_main_menu.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.configurator.user.android_app.MainMenu");
                        startActivity(intent);

                    }
                }
        );

    }
}
