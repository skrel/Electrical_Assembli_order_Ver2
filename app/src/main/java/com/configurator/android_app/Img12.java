package com.configurator.android_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Img12 extends AppCompatActivity {

    EditText img12editText1, img12editText2, img12editText3, img12editText4;
    Button button8;
    DatabaseHelper myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img12);
        myDb = new DatabaseHelper(this);

        img12editText1 = (EditText) findViewById(R.id.img12editText1);
        img12editText1.setText("Two gang ring, Device XXXXXX");

        img12editText2 = (EditText) findViewById(R.id.img12editText2);
        img12editText2.setText("Between studs, 4 inch square welded box, telescoping XXXXXX bracket (16in - 20in) or similar");

        img12editText3 = (EditText) findViewById(R.id.img12editText3);

        img12editText4 = (EditText) findViewById(R.id.img12editText4);
        //img12editText4.setText("12");

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
                                img12editText1.getText().toString(),
                                img12editText2.getText().toString(),
                                img12editText3.getText().toString(),
                                img12editText4.getText().toString());

                        if(isInserted == true)
                            Toast.makeText(Img12.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Img12.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }


}
