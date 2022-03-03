package com.samad.multtable;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
	EditText editText;
	Button button;
	TextView textView1,textView2;
	int num,mul,res;
	String str="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.editText1);
        textView1=(TextView)findViewById(R.id.textView1);
        textView2=(TextView)findViewById(R.id.textView2);
        button=(Button)findViewById(R.id.button1);
        button.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View arg0) {
				
				if(editText.length()>0){
					
					num=Integer.parseInt(editText.getText().toString());
					textView1.setText("Multiplication Table of "+num);
					for(int i=0;i<=10;i++){
						mul=i;
						res=num*mul;
						str+= "\n"+mul+"x"+num+"="+res;
					}
					textView2.setText(str);
					str="";
				}else{
					str="Enter Some Value";
					textView1.setText(str);
					str="";
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
