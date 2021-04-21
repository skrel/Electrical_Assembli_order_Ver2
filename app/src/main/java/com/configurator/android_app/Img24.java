package com.configurator.android_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Img24 extends AppCompatActivity {

    EditText img24editText1, img24editText2, img24editText3, img24editText4;
    Button button8;
    DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img24);
        myDb = new DatabaseHelper(this);

        img24editText1 = (EditText) findViewById(R.id.img24editText1);
        img24editText1.setText("One gang ring, Device XXXXXX");

        img24editText2 = (EditText) findViewById(R.id.img24editText2);
        img24editText2.setText("Between studs, (2)x4 inch square welded boxes, telescoping XXXXXX bracket (16in - 20in) or similar");

        img24editText3 = (EditText) findViewById(R.id.img24editText3);

        img24editText4 = (EditText) findViewById(R.id.img24editText4);
        //img24editText4.setText("24");

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
                                img24editText1.getText().toString(),
                                img24editText2.getText().toString(),
                                img24editText3.getText().toString(),
                                img24editText4.getText().toString());

                        if(isInserted == true)
                            Toast.makeText(Img24.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Img24.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


}
