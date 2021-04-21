package com.configurator.android_app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Electrical extends AppCompatActivity {

    ListView list;
    String titles[] = {

            "One Gang Ring - One Box",
            "One Gang Ring - One Box",
            "One Gang Ring - One Box",
            "One Gang Ring - One Box",
            "One Gang Ring - One Box",
            //"One Gang Ring - One Box",
            //"One Gang Ring - One Box",
            //"One Gang Ring - One Box",
            //"One Gang Ring - One Box",

            //"Two Gang Ring - One Box",
            //"Two Gang Ring - One Box",
            //"Two Gang Ring - One Box",
            //"Two Gang Ring - One Box",
            //"Two Gang Ring - One Box",
            //"Two Gang Ring - One Box",
            //"Two Gang Ring - One Box",
            //"Two Gang Ring - One Box",

            //"One Gang Ring - Two Boxes",
            //"One Gang Ring - Two Boxes",
            //"One Gang Ring - Two Boxes",
            //"One Gang Ring - Two Boxes",

    };
    String descriptions[] = {

            //1"Stud mount, 4 inch square welded box, XXX bracket or similar",
            //3"Stud mount, 4 inch square welded box, XXX bracket or similar",
            //5"Stud mount, 4 inch square welded box, XXX bracket or similar",

            //7"Stud mount, open back welded box, no bracket",

            //9"Between studs, 4 inch square welded box, adjustable XXXXXX bracket (16in - 24in) or similar",

            //11"Between studs, 4 inch square welded box, telescoping XXXXXX bracket (16in - 20in) or similar",

            //15"Between studs, 4 inch square welded box, XXXXXX bracket or similar (16in stud, not adjustable)",

            //13"Between studs, open back box, adjustable XXXXXX bracket (16in - 24in) or similar",

            //32"Stud mount, old work box",

            //2"Stud mount, 4 inch square welded box, XXX bracket or similar",
            //4"Stud mount, 4 inch square welded box, XXX bracket or similar",
            //6"Stud mount, 4 inch square welded box, XXX bracket or similar",

            //8"Stud mount, open back welded box, no bracket",

            //10"Between studs, 4 inch square welded box, adjustable XXXXXX bracket (16in - 24in) or similar",

            //12"Between studs, 4 inch square welded box, telescoping XXXXXX bracket (16in - 20in) or similar",

            //16"Between studs, 4 inch square welded box, XXXXXX bracket or similar (16in stud, not adjustable)",

            //14"Between studs, open back box, adjustable XXXXXX bracket (16in - 24in) or similar",

            //20"Between studs, (2)x4 inch square welded boxes, XXXXXX bracket or similar (16in stud, not adjustable)",

            //21"Between studs, (2)xOpen back boxes, adjustable XXXXXX bracket (16in - 24in) or similar",

            //22"Between studs, (2)x4 inch square welded boxes, adjustable XXXXXX bracket (16in - 24in) or similar",

            //24"Between studs, (2)x4 inch square welded boxes, telescoping XXXXXX bracket (16in - 20in) or similar"

    };

    int imgs[] = {

            //R.drawable.img1,
            //R.drawable.img3,
            //R.drawable.img5,
            //R.drawable.img7,
            //R.drawable.img9,
            //R.drawable.img11,
            //R.drawable.img15,
            //R.drawable.img13,
            //R.drawable.img,
            //R.drawable.img2,
            //R.drawable.img4,
            //R.drawable.img6,
            //R.drawable.img8,
            //R.drawable.img10,
            //R.drawable.img12,
            //R.drawable.img16,
            //R.drawable.img14,
            //R.drawable.img20,
            //R.drawable.img21,
            //R.drawable.img22,
            //R.drawable.img24
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power);

        list = findViewById(R.id.list1);

        MyAdapter adapter = new MyAdapter(this, titles, imgs, descriptions);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0) {
                    Intent myIntent = new Intent(view.getContext(),Img1.class);
                    startActivity(myIntent);
                }
                if (position==1) {
                    Intent myIntent = new Intent(view.getContext(),Img3.class);
                    startActivity(myIntent);
                }
            }
        });

    }

    class MyAdapter extends ArrayAdapter<String>{
        Context context;
        String myTitles[];
        String myDescriptions[];
        int[] imgs;

        MyAdapter(Context c, String[] titles, int[] imgs, String[] descriptions){
            super(c,R.layout.row_power, R.id.text1, titles);
            this.context=c;
            this.imgs=imgs;
            this.myTitles=titles;
            this.myDescriptions=descriptions;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row_power, parent, false);
            ImageView images = row.findViewById(R.id.logo);
            TextView myTitle = row.findViewById(R.id.text1);
            TextView myDescription = row.findViewById(R.id.text2);
            images.setImageResource(imgs[position]);
            myTitle.setText(titles[position]);
            myDescription.setText(descriptions[position]);
            return row;
        }


    }

}