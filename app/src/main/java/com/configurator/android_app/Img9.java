package com.configurator.android_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Img9 extends AppCompatActivity {

    EditText img9editText1, img9editText2, img9editText3, img9editText4;
    Button button8;
    DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img9);
        myDb = new DatabaseHelper(this);

        img9editText1 = (EditText) findViewById(R.id.img9editText1);
        img9editText1.setText("One gang ring, Device XXXXXX");

        img9editText2 = (EditText) findViewById(R.id.img9editText2);
        img9editText2.setText("Between studs, 4 inch square welded box, adjustable XXXXXX bracket (16in - 24in) or similar");

        img9editText3 = (EditText) findViewById(R.id.img9editText3);

        img9editText4 = (EditText) findViewById(R.id.img9editText4);
        //img9editText4.setText("9");

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
                                img9editText1.getText().toString(),
                                img9editText2.getText().toString(),
                                img9editText3.getText().toString(),
                                img9editText4.getText().toString());

                        if(isInserted == true)
                            Toast.makeText(Img9.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Img9.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


}
