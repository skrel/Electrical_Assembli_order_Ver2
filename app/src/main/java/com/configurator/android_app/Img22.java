package com.configurator.android_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Img22 extends AppCompatActivity {

    EditText img22editText1, img22editText2, img22editText3, img22editText4;
    Button button8;
    DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img22);
        myDb = new DatabaseHelper(this);

        img22editText1 = (EditText) findViewById(R.id.img22editText1);
        img22editText1.setText("One gang ring, Device XXXXXX");

        img22editText2 = (EditText) findViewById(R.id.img22editText2);
        img22editText2.setText("Between studs, (2)x4 inch square welded boxes, adjustable XXXXXX bracket (16in - 24in) or similar");

        img22editText3 = (EditText) findViewById(R.id.img22editText3);

        img22editText4 = (EditText) findViewById(R.id.img22editText4);
        //img22editText4.setText("22");

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
                                img22editText1.getText().toString(),
                                img22editText2.getText().toString(),
                                img22editText3.getText().toString(),
                                img22editText4.getText().toString());

                        if(isInserted == true)
                            Toast.makeText(Img22.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Img22.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


}
