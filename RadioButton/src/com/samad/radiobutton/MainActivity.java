package com.samad.radiobutton;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class MainActivity extends Activity {
	RadioButton male,female;
	RadioGroup gender;
	TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        male=(RadioButton)findViewById(R.id.radioButton1);
        female=(RadioButton)findViewById(R.id.radioButton2);
        t=(TextView)findViewById(R.id.textView2);
        gender=(RadioGroup)findViewById(R.id.rdGender);
        gender.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup arg0, int arg1) {
				// TODO Auto-generated method stub
				if(male.isChecked()){
					t.setText("You are a Man");
				}
				if(female.isChecked()){
					t.setText("You are a Woman");
				}
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
