package com.example.carlybaja.moreviewsdemo;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;

public class SpinnerActivity extends Activity implements AdapterView.OnItemSelectedListener{
    @Override
    public void onItemSelected(AdapterView<?> parent, View view,
                               int position, long id) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback



    }
}
