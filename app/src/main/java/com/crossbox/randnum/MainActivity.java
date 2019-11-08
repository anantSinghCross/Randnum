package com.crossbox.randnum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView t1;
    MaterialButton mb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.num);
        mb1 = findViewById(R.id.mb1);

        mb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int num = rand.nextInt(10);
                t1.setText(String.valueOf(num));
//                new MaterialAlertDialogBuilder(MainActivity.this).setMessage(String.valueOf(num))
//                        .setPositiveButton("OK",null)
//                        .show();
            }
        });
    }
}
