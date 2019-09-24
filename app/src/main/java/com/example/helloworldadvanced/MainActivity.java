package com.example.helloworldadvanced;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private EditText nameText;
    private TextView helloText;
    private Button greetBt;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nameText = (EditText) findViewById(R.id.nameTxt);

        helloText = (TextView) findViewById(R.id.helloTxt);

        greetBt = (Button) findViewById(R.id.welcomeBt);

        image = (ImageView) findViewById(R.id.imgSwitch);

    }

    public void onGreetBtPressed(View view) { // Podemos usar el XML para llamar a un evento aquí
        helloText.setText(String.format("Hello %s", nameText.getText()));

        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR_OF_DAY);

        if( hour < 12 ) {
            image.setImageResource(R.drawable.amanecer);
        } else if( hour < 19 ) {
            image.setImageResource(R.drawable.atardecer);
        } else {
            image.setImageResource(R.drawable.anochecer);
        }

    }

}
