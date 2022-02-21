package com.sample.checkbox;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
	CheckBox biriyani,porotta,noodles;
	Button submit;
	TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        biriyani=(CheckBox)findViewById(R.id.biriyani);
        porotta=(CheckBox)findViewById(R.id.porotta);
        noodles=(CheckBox)findViewById(R.id.noodles);
        res=(TextView)findViewById(R.id.textView1);
        submit=(Button)findViewById(R.id.submit);
        submit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String arr="";
				if(biriyani.isChecked()|| porotta.isChecked()||noodles.isChecked()){
					if(biriyani.isChecked()){
						arr+="\nBiriyani selected";
					}
					if(porotta.isChecked()){
						arr+="\nPorotta selected";
					}
					if(noodles.isChecked()){
						arr+="\nNoodles selected";
					}
					res.setText(arr);
				}else{
					res.setText("\nSelect something");
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
