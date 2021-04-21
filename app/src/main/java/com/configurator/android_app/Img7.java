package com.configurator.android_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Img7 extends AppCompatActivity {

    EditText img7editText1, img7editText2, img7editText3, img7editText4;
    Button button8;
    DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img7);
        myDb = new DatabaseHelper(this);

        img7editText1 = (EditText) findViewById(R.id.img7editText1);
        img7editText1.setText("One gang ring, Device XXXXXX");

        img7editText2 = (EditText) findViewById(R.id.img7editText2);
        img7editText2.setText("Stud mount, open back welded box, no bracket");

        img7editText3 = (EditText) findViewById(R.id.img7editText3);

        img7editText4 = (EditText) findViewById(R.id.img7editText4);
        //img7editText4.setText("7");

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
                                img7editText1.getText().toString(),
                                img7editText2.getText().toString(),
                                img7editText3.getText().toString(),
                                img7editText4.getText().toString());

                        if(isInserted == true)
                            Toast.makeText(Img7.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Img7.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


}
