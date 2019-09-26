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

        // Cargamos las variables
        nameText = findViewById(R.id.nameTxt);
        helloText =  findViewById(R.id.helloTxt);
        greetBt =  findViewById(R.id.welcomeBt);
        image =  findViewById(R.id.imgSwitch);

    }

    public void onGreetBtPressed(View view) { // Podemos usar el XML para llamar a un evento aquí
        String msg;

        // Usamos el calendario para obtener la hora del día
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR_OF_DAY);

        if( hour < 12 ) {
            image.setImageResource(R.drawable.amanecer);
            msg = getString(R.string.morning);
        } else if( hour < 19 ) {
            image.setImageResource(R.drawable.atardecer);
            msg = getString(R.string.afternoon);
        } else {
            image.setImageResource(R.drawable.anochecer);
            msg = getString(R.string.night);
        }

        helloText.setText(String.format("%s %s\n%s", getString(R.string.hello), nameText.getText(), msg));

    }

}
