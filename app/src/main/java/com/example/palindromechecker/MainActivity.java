package com.example.palindromechecker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText field_1;
    private Button check;
    private TextView show_answer;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        field_1=findViewById(R.id.editText);
        check=findViewById(R.id.button);
        show_answer=findViewById(R.id.textView3);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String e_text=field_1.getText().toString();
            String reverse = "";
            for(int i=e_text.length()-1; i>=0; i--)
            {
                reverse=reverse+e_text.charAt(i);
            }
            if(e_text.equals(reverse))
            {
                Toast.makeText( MainActivity.this,"Palindrome String",Toast.LENGTH_SHORT).show();
                show_answer.setText(e_text+" is a Palindrome");

            }
            else
            {
                Toast.makeText(MainActivity.this,"Not a Palindrome",Toast.LENGTH_SHORT).show();
                show_answer.setText(e_text+" not a Palindrome");
            }
//                String e_text=field_1.getText().toString();
//                StringBuffer sb=new StringBuffer(field_1.getText().toString());
//                StringBuffer reverse=sb.reverse();
//                //show_answer.setText(reverse);
//                if(e_text.equals(reverse))
//                {
//                  show_answer.setText(e_text +" is a Palindrome ");
//                }
//                else
//                {
//                    show_answer.setText("Not a Palindrome");
//                }

            }
        });


    }
}
