package com.configurator.android_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Img5 extends AppCompatActivity {

    EditText img5editText1, img5editText2, img5editText3, img5editText4;
    Button button8;
    DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img5);
        myDb = new DatabaseHelper(this);

        img5editText1 = (EditText) findViewById(R.id.img5editText1);
        img5editText1.setText("One gang ring, Device XXXXXX");

        img5editText2 = (EditText) findViewById(R.id.img5editText2);
        img5editText2.setText("Stud mount, 4 inch square welded box, XXX bracket");

        img5editText3 = (EditText) findViewById(R.id.img5editText3);

        img5editText4 = (EditText) findViewById(R.id.img5editText4);
        //img5editText4.setText("5");

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
                                img5editText1.getText().toString(),
                                img5editText2.getText().toString(),
                                img5editText3.getText().toString(),
                                img5editText4.getText().toString());

                        if(isInserted == true)
                            Toast.makeText(Img5.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Img5.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


}
