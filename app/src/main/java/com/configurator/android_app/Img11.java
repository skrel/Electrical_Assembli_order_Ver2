package com.configurator.android_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Img11 extends AppCompatActivity {

    EditText img11editText1, img11editText2, img11editText3, img11editText4;
    Button button8;
    DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img11);
        myDb = new DatabaseHelper(this);

        img11editText1 = (EditText) findViewById(R.id.img11editText1);
        img11editText1.setText("One gang ring, Device XXXXXX");

        img11editText2 = (EditText) findViewById(R.id.img11editText2);
        img11editText2.setText("Between studs, 4 inch square welded box, telescoping XXXXXX bracket (16in - 20in) or similar");

        img11editText3 = (EditText) findViewById(R.id.img11editText3);

        img11editText4 = (EditText) findViewById(R.id.img11editText4);
        //img11editText4.setText("11");

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
                                img11editText1.getText().toString(),
                                img11editText2.getText().toString(),
                                img11editText3.getText().toString(),
                                img11editText4.getText().toString());

                        if(isInserted == true)
                            Toast.makeText(Img11.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Img11.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


}
