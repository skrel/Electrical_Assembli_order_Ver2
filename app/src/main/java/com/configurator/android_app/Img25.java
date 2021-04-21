package com.configurator.android_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Img25 extends AppCompatActivity {

    EditText img25editText1, img25editText2, img25editText3, img25editText4;
    Button button8;
    DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img25);
        myDb = new DatabaseHelper(this);

        img25editText1 = (EditText) findViewById(R.id.img25editText1);
        img25editText1.setText("90 degree bend");

        img25editText2 = (EditText) findViewById(R.id.img25editText2);

        img25editText3 = (EditText) findViewById(R.id.img25editText3);

        img25editText4 = (EditText) findViewById(R.id.img25editText4);
        //img25editText4.setText("25");

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
                                img25editText1.getText().toString(),
                                img25editText2.getText().toString(),
                                img25editText3.getText().toString(),
                                img25editText4.getText().toString());

                        if(isInserted == true)
                            Toast.makeText(Img25.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Img25.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


}