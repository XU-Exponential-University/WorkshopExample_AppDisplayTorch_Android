package com.xuuniversity.displaytorch;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //button and boolean declaration
    private Button toggle;
    private boolean isOn;

    //messages displayed on the button, to tell the user what to do
    private String TURN_ON_MESSAGE = "Tap me to switch light on";
    private String TURN_OFF_MESSAGE = "Tap me to switch light off";

    //background colors of the button
    private int onColor = Color.WHITE;
    private int offColor = Color.BLACK;

    //text colors of the button to ensure readability
    private int textOnColor = Color.BLACK;
    private int textOffColor = Color.WHITE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setting layout resource
        setContentView(R.layout.activity_main);

        //getting the toggle button by ID
        toggle = findViewById(R.id.toggle);

        //setting current state to off
        switchLightOff();

        //adding onClickListener to the Button and switching state according to the isOn variable
        toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isOn){
                    switchLightOff();
                }else{
                    switchLightOn();
                }
            }
        });
    }


    //sets parameters to make lights on
    private void switchLightOn(){
        isOn = true;
        toggle.setText(TURN_OFF_MESSAGE);
        toggle.setTextColor(textOnColor);
        toggle.setBackgroundColor(onColor);
    }

    //sets parameters to make lights off
    private void switchLightOff(){
        isOn = false;
        toggle.setText(TURN_ON_MESSAGE);
        toggle.setTextColor(textOffColor);
        toggle.setBackgroundColor(offColor);
    }
}
