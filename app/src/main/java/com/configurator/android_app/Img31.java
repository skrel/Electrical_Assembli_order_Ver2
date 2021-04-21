package com.configurator.android_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Img31 extends AppCompatActivity {

    EditText img31editText1, img31editText2, img31editText3, img31editText4;
    Button button8;
    DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img31);
        myDb = new DatabaseHelper(this);

        img31editText1 = (EditText) findViewById(R.id.img31editText1);

        img31editText2 = (EditText) findViewById(R.id.img31editText2);

        img31editText3 = (EditText) findViewById(R.id.img31editText3);

        img31editText4 = (EditText) findViewById(R.id.img31editText4);
        //img31editText4.setText("31");

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
                                img31editText1.getText().toString(),
                                img31editText2.getText().toString(),
                                img31editText3.getText().toString(),
                                img31editText4.getText().toString());

                        if(isInserted == true)
                            Toast.makeText(Img31.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Img31.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


}

