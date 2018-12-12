package com.example.administrator.a1;

/**
 импорт Библиотек для работы
 */

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Создал PDA
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    /**

     */
    Button IdButtonLang;
    Button IdButtonClose;
    Button IdButtonSettings;
    ImageButton IdImageButton;
    TextView IdTextHelp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IdButtonSettings = (Button) findViewById(R.id.IdButtonSettings);
        IdButtonClose = (Button) findViewById(R.id.IdButtonClose);
        IdButtonLang = (Button) findViewById(R.id.IdButtonLang);
        IdImageButton = (ImageButton) findViewById(R.id.IdImageButton);

        IdButtonSettings.setOnClickListener(this);

        View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    //case R.id.IdButtonSettings:
                       // IdButtonSettings.setOnClickListener(this);
                      //  Intent intent = new Intent(this, SettingsActivity.class);
                      //  startActivity(intent);
                      //  break;
                    case R.id.IdButtonClose:
                        //IdTextHelp.setText("pizdec");
                        break;
                    case R.id.IdButtonLang:
                        IdButtonLang.setText(R.string.TextButtonLangEN);
                        break;

                }

            }
        };

       // IdButtonSettings.setOnClickListener(onClickListener);
        IdButtonLang.setOnClickListener(onClickListener);
        IdButtonClose.setOnClickListener(onClickListener);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.IdButtonSettings:

                Intent intent = new Intent(this, SettingsActivity2.class);
                startActivity(intent);
                break;
        }
    }
}
