package com.example.amber.loginscreen;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b1;
TextView t1,t2;
EditText e1,e2;
int count = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setbutton();
    }
    public void setbutton()
    {
        b1 = (Button)findViewById(R.id.b1);
        t1 = (TextView)findViewById(R.id.t1);
        t2  = (TextView)findViewById(R.id.t2);
        e1 = (EditText)findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.getText().toString().equals("admin") && e2.getText().toString().equals("admin"))
                {
                    Toast.makeText(getApplicationContext(),"Redirecting", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Sorry", Toast.LENGTH_LONG).show();
                    t2.setVisibility(View.VISIBLE);
                    t2.setBackgroundColor(Color.RED);
                    count--;
                    t2.setText(Integer.toString(count));

                    if (count == 0) {
                        b1.setEnabled(false);
                    }

                }
            }
        });
    }
}
