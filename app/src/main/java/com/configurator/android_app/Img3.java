package com.configurator.android_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Img3 extends AppCompatActivity {

    EditText img3editText1, img3editText2, img3editText3, img3editText4;
    Button button8;
    DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img3);
        myDb = new DatabaseHelper(this);

        img3editText1 = (EditText) findViewById(R.id.img3editText1);
        img3editText1.setText("One gang ring, Device XXXXXX");

        img3editText2 = (EditText) findViewById(R.id.img3editText2);
        img3editText2.setText("Stud mount, 4 inch square welded box, XXX bracket");

        img3editText3 = (EditText) findViewById(R.id.img3editText3);

        img3editText4 = (EditText) findViewById(R.id.img3editText4);
        //img3editText4.setText("3");

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
                                img3editText1.getText().toString(),
                                img3editText2.getText().toString(),
                                img3editText3.getText().toString(),
                                img3editText4.getText().toString());

                        if(isInserted == true)
                            Toast.makeText(Img3.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Img3.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


}