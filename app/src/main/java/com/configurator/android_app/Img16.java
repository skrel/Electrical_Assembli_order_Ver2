package com.configurator.android_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Img16 extends AppCompatActivity {

    EditText img16editText1, img16editText2, img16editText3, img16editText4;
    Button button8;
    DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img16);
        myDb = new DatabaseHelper(this);

        img16editText1 = (EditText) findViewById(R.id.img16editText1);
        img16editText1.setText("One gang ring, Device XXXXXX");

        img16editText2 = (EditText) findViewById(R.id.img16editText2);
        img16editText2.setText("Between studs, 4 inch square welded box, XXXXXX bracket or similar (16in stud, not adjustable)");

        img16editText3 = (EditText) findViewById(R.id.img16editText3);

        img16editText4 = (EditText) findViewById(R.id.img16editText4);
        //img16editText4.setText("16");

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
                                img16editText1.getText().toString(),
                                img16editText2.getText().toString(),
                                img16editText3.getText().toString(),
                                img16editText4.getText().toString());

                        if(isInserted == true)
                            Toast.makeText(Img16.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Img16.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


}
