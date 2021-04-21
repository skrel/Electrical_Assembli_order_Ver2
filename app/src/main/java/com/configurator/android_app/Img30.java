package com.configurator.android_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Img30 extends AppCompatActivity {

    EditText img30editText1, img30editText2, img30editText3, img30editText4;
    Button button8;
    DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img30);
        myDb = new DatabaseHelper(this);

        img30editText1 = (EditText) findViewById(R.id.img30editText1);

        img30editText2 = (EditText) findViewById(R.id.img30editText2);

        img30editText3 = (EditText) findViewById(R.id.img30editText3);

        img30editText4 = (EditText) findViewById(R.id.img30editText4);
        //img30editText4.setText("30");

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
                                img30editText1.getText().toString(),
                                img30editText2.getText().toString(),
                                img30editText3.getText().toString(),
                                img30editText4.getText().toString());

                        if(isInserted == true)
                            Toast.makeText(Img30.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Img30.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


}
