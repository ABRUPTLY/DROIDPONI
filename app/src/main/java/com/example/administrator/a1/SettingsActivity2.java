package com.example.administrator.a1;

import android.annotation.SuppressLint;
import android.app.UiAutomation;
import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

@SuppressLint("Registered")
public class SettingsActivity2 extends AppCompatActivity implements View.OnClickListener {

    RadioButton IdRBOneMode;
    RadioButton IdRBTwoMode;
    RadioButton IdRBNetMode;
    RadioButton RB;
    Button IdButtBtSet;
    TextView IdTextSett;
    RadioGroup radioGroup;

    // public / protected / private
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings2);


        IdButtBtSet = findViewById(R.id.IdButtBtSet);
        IdButtBtSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "настройка Bluetooth ",
                        Toast.LENGTH_SHORT).show();

                BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
                if (!mBluetoothAdapter.isEnabled()) {mBluetoothAdapter.enable(); }
                    else{Toast.makeText(getApplicationContext(),
                        "Bluetooth Al-Ready Enable", Toast.LENGTH_LONG).show();}
            }
        });

/*
        View.OnClickListener radioButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RB = (RadioButton)v;
                switch (RB.getId()) {
                    case R.id.IdButtonSettings: TextView.setBackgroundColor(Color.parseColor("#ff0000"));
                    // IdButtonSettings.setOnClickListener(this);
                    //  Intent intent = new Intent(this, SettingsActivity.class);
                    //  startActivity(intent);
                    break;
                    case R.id.IdButtonClose:te(Color.parseColor("#0000ff"));
                        //IdTextHelp.setText("pizdec");
                    break;
                    case R.id.IdButtonLang:setBackgroundColor(Color.parseColor("#00ff00"));
                        //IdButtonLang.setText(R.string.TextButtonLangEN);
                    break;
                    default:
                        break;
         */
        radioGroup = findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case -1: // ресурсы и мультиязычные приложения
                        Toast.makeText(getApplicationContext(), "Ничего не выбрано",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.IdRBOneMode:
                        Toast.makeText(getApplicationContext(), "выбран режим один игрок",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.IdRBTwoMode:
                        Toast.makeText(getApplicationContext(), "выбран режим два игрока",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.IdRBNetMode:
                        Toast.makeText(getApplicationContext(), "выбран сетевой режим",
                                Toast.LENGTH_SHORT).show();
                        break;

                    default:
                        break;
               }
            }
        });

        //IdRBOneMode.setOnClickListener(onClickListener);
        //IdButtTwoMode.setOnClickListener(onClickListener);
        //IdButtNetwMode.setOnClickListener(onClickListener);


    }




    @Override
    public void onClick(View v) {

    }
}