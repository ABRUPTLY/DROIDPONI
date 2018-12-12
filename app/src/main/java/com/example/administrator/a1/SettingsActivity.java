package com.example.administrator.a1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity implements View.OnClickListener {

    Button IdButtOneMode;
    Button IdButtTwoMode;
    Button IdButtNetwMode;
    Button IdButtBtSet;
    //TextView IdTextSett;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        IdButtOneMode = (Button) findViewById(R.id.IdButtOneMode);
        IdButtTwoMode = (Button) findViewById(R.id.IdButtTwoMode);
        IdButtNetwMode = (Button) findViewById(R.id.IdButtNetwMode);
        IdButtBtSet = (Button) findViewById(R.id.IdButtBtSet);

        IdButtOneMode.setOnClickListener(this);

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
                        //IdButtonLang.setText(R.string.TextButtonLangEN);
                        break;

                }

            }
        };

        IdButtOneMode.setOnClickListener(onClickListener);
        IdButtTwoMode.setOnClickListener(onClickListener);
        IdButtNetwMode.setOnClickListener(onClickListener);


    }




    @Override
    public void onClick(View v) {

    }
}