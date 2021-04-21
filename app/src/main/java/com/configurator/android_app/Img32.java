package com.configurator.android_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Img32 extends AppCompatActivity {

    EditText img32editText1, img32editText2, img32editText3, img32editText4;
    Button button8;
    DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img32);
        myDb = new DatabaseHelper(this);

        img32editText1 = (EditText) findViewById(R.id.img32editText1);
        img32editText1.setText("One gang ring, Device XXXXXX");

        img32editText2 = (EditText) findViewById(R.id.img32editText2);
        img32editText2.setText("Stud mount, old work box");

        img32editText3 = (EditText) findViewById(R.id.img32editText3);

        img32editText4 = (EditText) findViewById(R.id.img32editText4);
        //img32editText4.setText("32");

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
                                img32editText1.getText().toString(),
                                img32editText2.getText().toString(),
                                img32editText3.getText().toString(),
                                img32editText4.getText().toString());

                        if(isInserted == true)
                            Toast.makeText(Img32.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Img32.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


}
