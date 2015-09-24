package cal.span.com.cal;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button clr,del,one,two,three,four,five,six,seven,eight,nine,add,equ;
    EditText editText;
    String op1,op,op2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click();
    }

    public void click() {
        clr = (Button) findViewById(R.id.button1);
        del = (Button) findViewById(R.id.button2);
        one = (Button) findViewById(R.id.button3);
        two = (Button) findViewById(R.id.button4);
        three = (Button) findViewById(R.id.button5);
        four = (Button) findViewById(R.id.button6);
        five = (Button) findViewById(R.id.button7);
        add = (Button) findViewById(R.id.button18);
        editText = (EditText) findViewById(R.id.edit);
        equ = (Button) findViewById(R.id.button17);

        while(true) {
            one.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    String i = "1";
                    editText.append(i);

                }
            });

            two.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    String i = "2";
                    editText.append(i);

                }
            });
            three.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    String i = "3";
                    editText.append(i);

                }
            });
            four.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    String i = "4";
                    editText.append(i);

                }
            });
            five.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    String i = "5";
                    editText.append(i);

                }
            });

            add.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    String op = "+";
                    setOp(op);
                    String op1 = editText.getText().toString();
                    setOp1(op1);
                    editText.setText("");
                    editText.setText("+");
                    editText.setText("");
                }
            });

            equ.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {

                    String op2 = editText.getText().toString();
                    editText.setText("");
                    setOp2(op2);
                }
            });


            if (getOp().equals("+")) {
                String result = getOp1() + getOp2();
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
            }


        }
    }



    void setOp1(String str){
         op1=str;
    }
    String getOp1(){
        return op1;
    }




    void setOp2(String str){
        op2=str;
    }
    String getOp2(){
        return op2;
    }




    void setOp(String op0){
        String op=op0;
    }
    String getOp(){
        return op;
    }




}
