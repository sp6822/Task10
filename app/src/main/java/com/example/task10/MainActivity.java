package com.example.task10;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity
{

    ToggleButton tb;
    Switch sw;
    Button click;
    ConstraintLayout screen;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb = (ToggleButton) findViewById(R.id.tb);
        sw = (Switch) findViewById(R.id.sw);
        click = (Button) findViewById(R.id.click);
        screen = (ConstraintLayout)findViewById(R.id.main);
    }

    public void check (View view)
    {
        if (!sw.isChecked() && !tb.isChecked())
        {
            screen.setBackgroundResource(R.drawable.image1);
        }
        else if (!sw.isChecked() && tb.isChecked())
        {
            screen.setBackgroundResource(R.drawable.image2);
        }
        else if (sw.isChecked() && !tb.isChecked())
        {
            screen.setBackgroundResource(R.drawable.image3);
        }
        else if (sw.isChecked() && tb.isChecked())
        {
            screen.setBackgroundResource(R.drawable.image4);
        }
    }
}
