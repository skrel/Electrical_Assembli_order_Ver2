package com.configurator.android_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Img19 extends AppCompatActivity {

    EditText img19editText1, img19editText2, img19editText3, img19editText4;
    Button button8;
    DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img19);
        myDb = new DatabaseHelper(this);

        img19editText1 = (EditText) findViewById(R.id.img19editText1);
        img19editText1.setText("Roller Hanger");

        img19editText2 = (EditText) findViewById(R.id.img19editText2);

        img19editText3 = (EditText) findViewById(R.id.img19editText3);

        img19editText4 = (EditText) findViewById(R.id.img19editText4);
        //img19editText4.setText("19");

        button8 = (Button) findViewById(R.id.button8);

        AddData();

    }

    // add data

    public void AddData() {
        button8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb.insertData(
                                img19editText1.getText().toString(),
                                img19editText2.getText().toString(),
                                img19editText3.getText().toString(),
                                img19editText4.getText().toString());

                        if(isInserted == true)
                            Toast.makeText(Img19.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Img19.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


}

