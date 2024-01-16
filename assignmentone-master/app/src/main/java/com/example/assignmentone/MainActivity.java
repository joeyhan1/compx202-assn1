package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] buttonArray = {R.id.ib_cs, R.id.ib_design, R.id.ib_math, R.id.ib_se };
        //Initiate and perform click event on imagebutton selected
        for(int i =0; i < buttonArray.length; i++) {
            //Finds the imagebutton view and make it to variable
            ImageButton buttonPressed = (ImageButton) findViewById(buttonArray[i]);
            buttonPressed.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Shows that the click function is working
                    Toast.makeText(getApplicationContext(), "Working", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                    //Sends the current selected view id to the detail activity
                    intent.putExtra("image",view.getId());
                    startActivity(intent);
                }
            });

        }
    }

}