package com.example.carlybaja.moreviewsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioGroup rgSex = (RadioGroup) findViewById(R.id.rgSex);
        final Switch swEmail = (Switch) findViewById(R.id.swEmail);
        final CheckBox cbAgreement = (CheckBox) findViewById(R.id.cbAdreement);
        Button btnSubmit = (Button) findViewById(R.id.btnSubmit);
        final Spinner mySpinner = (Spinner) findViewById(R.id.mySpinner);
        final DatePicker dpEvent = (DatePicker) findViewById(R.id.dpEvent);


        btnSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //Show Sex
                int radioId = rgSex.getCheckedRadioButtonId();
                RadioButton rbSex = findViewById(radioId);
                // If sex equal Null
                if(rbSex !=null)
                Toast.makeText(MainActivity.this, "Your sex is :" + rbSex.getText(),
                         Toast.LENGTH_LONG).show();

                // Show Email Notification choice
                Toast.makeText(MainActivity.this,
                        "Receive Email : " +(swEmail.isChecked() ? "Yes" : "No"),
                Toast.LENGTH_SHORT).show();

                if(swEmail.isChecked()) {
                    // Save email in Database
                }

                // Spinner Show Planet
                Toast.makeText(MainActivity.this,
                        "Planets :" + (String) mySpinner.getSelectedItem(),
                        Toast.LENGTH_SHORT).show();


                // Show Agreement to Terms
                Toast.makeText(MainActivity.this,
                        "Did you agree to Terms : " +(cbAgreement.isChecked() ? "Yes" : "No"),
                        Toast.LENGTH_SHORT).show();

                // Show Date
                Toast.makeText(MainActivity.this,
                        "Date :" + dpEvent.getDayOfMonth() + "/" + dpEvent.getMonth() +
                                "/" + dpEvent.getYear(),
                        Toast.LENGTH_SHORT).show();


            }
        });
    }
}
