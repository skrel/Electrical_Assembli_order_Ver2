package com.configurator.android_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Img15 extends AppCompatActivity {

    EditText img15editText1, img15editText2, img15editText3, img15editText4;
    Button button8;
    DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img15);
        myDb = new DatabaseHelper(this);

        img15editText1 = (EditText) findViewById(R.id.img15editText1);
        img15editText1.setText("One gang ring, Device XXXXXX");

        img15editText2 = (EditText) findViewById(R.id.img15editText2);
        img15editText2.setText("Between studs, 4 inch square welded box, XXXXXX bracket or similar (16in stud, not adjustable)");

        img15editText3 = (EditText) findViewById(R.id.img15editText3);

        img15editText4 = (EditText) findViewById(R.id.img15editText4);
        //img15editText4.setText("15");

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
                                img15editText1.getText().toString(),
                                img15editText2.getText().toString(),
                                img15editText3.getText().toString(),
                                img15editText4.getText().toString());

                        if(isInserted == true)
                            Toast.makeText(Img15.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Img15.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


}
