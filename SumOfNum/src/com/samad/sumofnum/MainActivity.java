package com.samad.sumofnum;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	EditText n1,n2;
    Button b;
    TextView res;
    int num1,num2,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        n1=(EditText)(findViewById(R.id.editText1));
        n2=(EditText)(findViewById(R.id.editText2));
        res=(TextView)(findViewById(R.id.textView1));
        b=(Button)findViewById(R.id.button1);
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(n1.length()>0 && n2.length()>0){
					num1=Integer.parseInt(n1.getText().toString());
					num2=Integer.parseInt(n2.getText().toString());
					sum=num1+num2;
					res.setText("Sum is "+sum);
				}else{
					res.setText("Input Some Value");
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
