package com.crossbox.randnum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;

import java.util.Random;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    MaterialTextView t1;
    MaterialButton mb1;
    TextInputEditText min;
    TextInputEditText max;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.num);
        mb1 = findViewById(R.id.mb1);
        min = findViewById(R.id.minVal);
        max = findViewById(R.id.maxVal);

        mb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(min.getText().toString().equals("") || max.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "You need to enter both values", Toast.LENGTH_SHORT).show();
                }
                else if(Integer.parseInt(min.getText().toString()) > Integer.parseInt(max.getText().toString())){
                    Toast.makeText(MainActivity.this, "Enter correct values please", Toast.LENGTH_SHORT).show();
                }
                else{
                    int minVal = Integer.parseInt(min.getText().toString());
                    int maxVal = Integer.parseInt(max.getText().toString());
                    Log.i("EMPTY_TEXT", String.valueOf(minVal));
                    Random rand = new Random();
                    int genInt = rand.nextInt(maxVal+1);
                    while(genInt<minVal){
                        genInt = rand.nextInt(maxVal+1);
                    }
                    t1.setText(String.valueOf(genInt));
                }
            }
        });
    }
}
