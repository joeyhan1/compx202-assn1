package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Array Variables
        int[] buttonArray = {R.id.ib_cs, R.id.ib_design, R.id.ib_math, R.id.ib_se };
        String[] bannersArray = getResources().getStringArray(R.array.string_array_banners);
        String[] titleArray = getResources().getStringArray(R.array.string_array_titles);
        String[] contentArray = getResources().getStringArray(R.array.string_array_content);
        //Getting the selected view id from the MainActivity
        Intent intent = getIntent();
        int imageID = intent.getIntExtra("image", 0);
        for(int i =0; i < buttonArray.length; i++) {
            //Getting all the views
            ImageView imageViewImage = (ImageView) findViewById(R.id.iv_image);
            TextView textViewTitle = (TextView) findViewById(R.id.tv_title);
            TextView textViewContent = (TextView) findViewById(R.id.tv_content);
            //Checking for the selected view id from the MainActivity
            if (imageID == buttonArray[i]) {
                //Converting the string from the bannerArray into id
                int bannerID = getResources().getIdentifier(bannersArray[i],"drawable",getPackageName());
                //Populate the DetailActivity with dummy data from arrays.xml
                imageViewImage.setImageResource(bannerID);
                textViewTitle.setText(titleArray[i]);
                textViewContent.setText(contentArray[i]);
            }
        }
    }
}