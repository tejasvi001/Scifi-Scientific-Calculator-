package com.example.scientificcalculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // creating variables for our text view and button
    private TextView tvsec;
    private TextView tvMain;
    private Button bac;
    private Button bc;
    private Button bbrac1;
    private Button bbrac2;
    private Button bsin;
    private Button bcos;
    private Button btan;
    private Button blog;
    private Button bln;
    private Button bfact;
    private Button bsquare;
    private Button bsqrt;
    private Button binv;
    private Button b0;
    private Button b9;
    private Button b8;
    private Button b7;
    private Button b6;
    private Button b5;
    private Button b4;
    private Button b3;
    private Button b2;
    private Button b1;
    private Button bpi;
    private Button bmul;
    private Button bminus;
    private Button bplus;
    private Button bequal;
    private Button bdot;
    private Button bdiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initializing all our variables.
        tvsec = findViewById(R.id.idTVSecondary);
        tvMain = findViewById(R.id.idTVprimary);
        bac = findViewById(R.id.bac);
        bc = findViewById(R.id.bc);
        bbrac1 = findViewById(R.id.bbrac1);
        bbrac2 = findViewById(R.id.bbrac2);
        bsin = findViewById(R.id.bsin);
        bcos = findViewById(R.id.bcos);
        btan = findViewById(R.id.btan);
        blog = findViewById(R.id.blog);
        bln = findViewById(R.id.bln);
        bfact = findViewById(R.id.bfact);
        bsquare = findViewById(R.id.bsquare);
        bsqrt = findViewById(R.id.bsqrt);
        binv = findViewById(R.id.binv);
        b0 = findViewById(R.id.b0);
        b9 = findViewById(R.id.b9);
        b8 = findViewById(R.id.b8);
        b7 = findViewById(R.id.b7);
        b6 = findViewById(R.id.b6);
        b5 = findViewById(R.id.b5);
        b4 = findViewById(R.id.b4);
        b3 = findViewById(R.id.b3);
        b2 = findViewById(R.id.b2);
        b1 = findViewById(R.id.b1);
        bpi = findViewById(R.id.bpi);
        bmul = findViewById(R.id.bmul);
        bminus = findViewById(R.id.bminus);
        bplus = findViewById(R.id.bplus);
        bequal = findViewById(R.id.bequal);
        bdot = findViewById(R.id.bdot);
        bdiv = findViewById(R.id.bdiv);

        // adding on click listener to our all buttons.
        b1.setOnClickListener(v -> {
            // on below line we are appending
            // the expression to our text view.
            tvMain.setText(tvMain.getText().toString() + "1");
        });
        b2.setOnClickListener(v -> {
            // on below line we are appending
            // the expression to our text view.
            tvMain.setText(tvMain.getText().toString() + "2");
        });
        b3.setOnClickListener(v -> {
            // on below line we are appending
            // the expression to our text view.
            tvMain.setText(tvMain.getText().toString() + "3");
        });
        b4.setOnClickListener(v -> {
            tvMain.setText(tvMain.getText().toString() + "4");
        });
        b5.setOnClickListener(v -> {
            tvMain.setText(tvMain.getText().toString() + "5");
        });
        b6.setOnClickListener(v -> {
            tvMain.setText(tvMain.getText().toString() + "6");
        });
        b7.setOnClickListener(v -> {
            tvMain.setText(tvMain.getText().toString() + "7");
        });
        b8.setOnClickListener(v -> {
            tvMain.setText(tvMain.getText().toString() + "8");
        });
        b9.setOnClickListener(v -> {
            tvMain.setText(tvMain.getText().toString() + "9");
        });
        b0.setOnClickListener(v -> {
            tvMain.setText(tvMain.getText().toString() + "0");
        });
        bdot.setOnClickListener(v -> {
            tvMain.setText(tvMain.getText().toString() + ".");
        });
        bplus.setOnClickListener(v -> {
            tvMain.setText(tvMain.getText().toString() + "+");
        });
        bdiv.setOnClickListener(v -> {
            tvMain.setText(tvMain.getText().toString() + "/");
        });
        bbrac1.setOnClickListener(v -> {
            tvMain.setText(tvMain.getText().toString() + "(");
        });
        bbrac2.setOnClickListener(v -> {
            tvMain.setText(tvMain.getText().toString() + ")");
        });
        bpi.setOnClickListener(v -> {
            // on clicking on pi button we are adding
            // pi value as 3.142 to our current value.
            tvMain.setText(tvMain.getText().toString() + "3.142");
            tvsec.setText(bpi.getText().toString());
        });
        bsin.setOnClickListener(v -> {
            tvMain.setText(tvMain.getText().toString() + "sin");
        });
        bcos.setOnClickListener(v -> {
            tvMain.setText(tvMain.getText().toString() + "cos");
        });
        btan.setOnClickListener(v -> {
            tvMain.setText(tvMain.getText().toString() + "tan");
        });
        binv.setOnClickListener(v -> {
            tvMain.setText(tvMain.getText().toString() + "^" + "(-1)");
        });
        bln.setOnClickListener(v -> {
            tvMain.setText(tvMain.getText().toString() + "ln");
        });
        blog.setOnClickListener(v -> {
            tvMain.setText(tvMain.getText().toString() + "log");
        });

        bminus.setOnClickListener(v -> {
            // on clicking on minus we are checking if
            // the user has already a minus operation on screen.
            // if minus operation is already present
            // then we will not do anything.
            String str = tvMain.getText().toString();
            if (!str.substring(str.length() - 1).equals("-")) {
                tvMain.setText(tvMain.getText().toString() + "-");
            }
        });
        bmul.setOnClickListener(v -> {
            // if mul sign is not present in our
            // text view then only we are adding
            // the multiplication operator to it.
            String str = tvMain.getText().toString();
            if (!str.substring(str.length() - 1).equals("*")) {
                tvMain.setText(tvMain.getText().toString() + "*");
            }
        });
        bsqrt.setOnClickListener(v -> {
            if (tvMain.getText().toString().isEmpty()) {
                // if the entered number is empty we are displaying an error message.
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show();
            } else {
                String str = tvMain.getText().toString();
                // on below line we are calculation
                // square root of the given number.
                double r = Math.sqrt(Double.parseDouble(str));
                // on below line we are converting our double
                // to string and then setting it to text view.
                String result = Double.toString(r);
                tvMain.setText(result);
            }
        });
        bequal.setOnClickListener(v -> {
            String str = tvMain.getText().toString();
            // on below line we are calling an evaluate
            // method to calculate the value of expressions.
            double result = evaluate(str);
            // on below line we are getting result
            // and setting it to text view.
            String r = Double.toString(result);
            tvMain.setText(r);
            tvsec.setText(str);
        });
        bac.setOnClickListener(v -> {
            // on clicking on ac button we are clearing
            // our primary and secondary text view.
            tvMain.setText("");
            tvsec.setText("");
        });
        bc.setOnClickListener(v -> {
            // on clicking on c button we are clearing
            // the last character by checking the length.
            String str = tvMain.getText().toString();
            if (!str.equals("")) {
                str = str.substring(0, str.length() - 1);
                tvMain.setText(str);
            }
        });
        bsquare.setOnClickListener(v -> {
            if (tvMain.getText().toString().isEmpty()) {
                // if the entered number is empty we are displaying an error message.
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show();
            } else {
                // on below line we are getting the expression and then calculating the square of the number
                double d = Double.parseDouble(tvMain.getText().toString());
                // on below line we are calculating the square.
                double square = d * d;
                // after calculating the square we
                // are setting it to text view.
                tvMain.setText(Double.toString(square));
                // on below line we are setting
                // the d to secondary text view.
                tvsec.setText(d + "²");
            }
        });
        bfact.setOnClickListener(v -> {
            if (tvMain.getText().toString().isEmpty()) {
                // if the entered number is empty we are displaying an error message.
                Toast.makeText(this, "Please enter a valid number..", Toast.LENGTH_SHORT).show();
            } else {
                // on below line we are getting int value
                // and calculating the factorial value of the entered number.
                int value = Integer.parseInt(tvMain.getText().toString());
                int fact = factorial(value);
                tvMain.setText(Integer.toString(fact));
                tvsec.setText(value + "`!");
            }

        });

    }

    public int factorial(int n) {
        // this method is use to find factorial
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
    }

    public double evaluate(String str) {
        return new Object() {
            // on below line we are creating variable
            // for tracking the position and char pos.
            int pos = -1, ch;

            // below method is for moving to next character.
            void nextChar() {
                // on below line we are incrementing our position
                // and moving it to next position.
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            // this method is use to check the extra space
            // present int the expression and removing it.
            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                // on below line we are checking the char pos
                // if both is equal then we are returning it to true.
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            // below method is to parse our
            // expression and to get the ans
            // in this we are calling a parse
            // expression method to calculate the value.
            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char) ch);
                return x;
            }

            // in this method we will only perform addition and
            // subtraction operation on the expression.
            double parseExpression() {
                double x = parseTerm();
                while (true) {
                    if (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            // in below method we will perform
            // only multiplication and division operation.
            double parseTerm() {
                double x = parseFactor();
                while (true) {
                    if (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            // below method is use to parse the factor
            double parseFactor() {
                //on below line we are checking for addition
                // and subtraction and performing unary operations.
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus
                // creating a double variable for ans.
                double x;
                // on below line we are creating
                // a variable for position.
                int startPos = pos;
                // on below line we are checking
                // for opening and closing parenthesis.
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if (ch >= '0' && ch <= '9' || ch == '.') {
                    // numbers
                    while (ch >= '0' && ch <= '9' || ch == '.') nextChar();
                    // on below line we are getting sub string from our string using start and pos.
                    x = Double.parseDouble(str.substring(startPos, pos));
                } else if (ch >= 'a' && ch <= 'z') {
                    // on below function we are checking for the operator in our expression.
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, pos);
                    // calling a method to parse our factor.
                    x = parseFactor();
                    // on below line we are checking for square root.
                    if (func.equals("sqrt")) {
                        x = Math.sqrt(x);
                    } else if (func.equals("sin")) {
                        x = Math.sin(Math.toRadians(x));
                    } else if (func.equals("cos")) {
                        x = Math.cos(Math.toRadians(x));
                    } else if(func.equals("tan"))
                        x= Math.tan(Math.toRadians(x));
                    else if (func.equals("log"))  Math.log10(x);
                    else if(func.equals("ln"))  Math.log(x);
                    else
                        throw new RuntimeException("Unknown function: " + func) ;
                } else {
                    // if the condition not satisfy then we are returning the exception
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }
                // on below line we are calculating the power of the expression.
                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation
                return x;
            }
            // at last calling a parse for our expression.
        }.parse();
    }
}


