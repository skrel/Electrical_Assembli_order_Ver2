package com.configurator.android_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Img33 extends AppCompatActivity {

    EditText img33editText1, img33editText2, img33editText3, img33editText4;
    Button button8;
    DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img33);
        myDb = new DatabaseHelper(this);

        img33editText1 = (EditText) findViewById(R.id.img33editText1);

        img33editText2 = (EditText) findViewById(R.id.img33editText2);

        img33editText3 = (EditText) findViewById(R.id.img33editText3);

        img33editText4 = (EditText) findViewById(R.id.img33editText4);
        //img33editText4.setText("33");

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
                                img33editText1.getText().toString(),
                                img33editText2.getText().toString(),
                                img33editText3.getText().toString(),
                                img33editText4.getText().toString());

                        if(isInserted == true)
                            Toast.makeText(Img33.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Img33.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


}
