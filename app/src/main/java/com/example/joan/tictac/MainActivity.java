package com.example.joan.tictac;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

       // int pointsForPlayerX = 0;
       // int pointsForPlayerO = 0;
      // int score;

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn9, btn8, ResetBoard;
    /**
     * Giving the Data type Integer a variable name...
     */
    int turn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        ResetBoard = findViewById(R.id.btnResetScores);

        /**
         * Sets the Data type integer of variable name turn to 1...
         */

        turn = 1;
        /**
         * The result method/function will check whether after every click the combination
         * of three has been made or not...
         */

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn1.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn1.setText("X");
                        result(view);
                    } else if (turn == 2) {
                        turn = 1;
                        btn1.setText("O");
                        result(view);
                    }
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn2.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn2.setText("X");
                        result(view);
                    } else if (turn == 2) {
                        turn = 1;
                        btn2.setText("O");
                        result(view);
                    }
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn3.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn3.setText("X");
                        result(view);
                    } else if (turn == 2) {
                        turn = 1;
                        btn3.setText("O");
                        result(view);
                    }
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn4.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn4.setText("X");
                        result(view);
                    } else if (turn == 2) {
                        turn = 1;
                        btn4.setText("O");
                        result(view);
                    }
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn5.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn5.setText("X");
                        result(view);
                    } else if (turn == 2) {
                        turn = 1;
                        btn5.setText("O");
                        result(view);
                    }
                }
            }

        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn6.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn6.setText("X");
                        result(view);
                    } else if (turn == 2) {
                        turn = 1;
                        btn6.setText("O");
                        result(view);
                    }
                }
            }

        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn7.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn7.setText("X");
                        result(view);
                    } else if (turn == 2) {
                        turn = 1;
                        btn7.setText("O");
                        result(view);
                    }
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn8.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn8.setText("X");
                        result(view);
                    } else if (turn == 2) {
                        turn = 1;
                        btn8.setText("O");
                        result(view);
                    }
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn9.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn9.setText("X");
                        result(view);
                    } else if (turn == 2) {
                        turn = 1;
                        btn9.setText("O");
                        result(view);
                    }
                }
                result(view);
            }

        });

    }


    /**
     * The result method/function will check whether after every click the combination
     * of three has been made or not...
     *
     * @param view
     */
    private void result(Object view) {
        String a, b, c, d, e, f, g, h, i;
        boolean end = false;

        a = btn1.getText().toString();
        b = btn2.getText().toString();
        c = btn3.getText().toString();
        d = btn4.getText().toString();
        e = btn5.getText().toString();
        f = btn6.getText().toString();
        g = btn7.getText().toString();
        h = btn8.getText().toString();
        i = btn9.getText().toString();


        if (a.equals("X") && b.equals("X") && c.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            //pointsForPlayerX = score + 1;
            //displayForPlayerX(pointsForPlayerX);
            end = true;
        }

        if (a.equals("X") && e.equals("X") && i.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (a.equals("X") && d.equals("X") && g.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (b.equals("X") && e.equals("X") && h.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (c.equals("X") && f.equals("X") && i.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d.equals("X") && e.equals("X") && f.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (g.equals("X") && h.equals("X") && i.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();

            end = true;

        }

        if (a.equals("O") && b.equals("O") && c.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (a.equals("O") && e.equals("O") && i.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (a.equals("O") && d.equals("O") && g.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (b.equals("O") && e.equals("O") && h.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (c.equals("O") && f.equals("O") && i.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (d.equals("O") && e.equals("O") && f.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (g.equals("O") && h.equals("O") && i.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (g.equals("X") && e.equals("X") && c.equals("X")) {
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (g.equals("O") && e.equals("O") && c.equals("O")) {
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
        }

        if (end) {
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);

        }

        /**Displays the given score for Player1.
        *

        public void displayForPlayerX(int score) {
            TextView scoreView = findViewById(R.id.player1_points);
            scoreView.setText(String.valueOf(score));
        }

        /**
         * Displays the given score for Player2.

        public void displayForPlayerO(int score) {
            TextView scoreView = findViewById(R.id.player2_points);
            scoreView.setText(String.valueOf(score));
        }

        /**
         * Resets the points for both players back to 0.
        public void resetScore (View v){
            pointsForPlayerX = 0;
            pointsForPlayerO = 0;
            displayForPlayerX(pointsForPlayerX);
            displayForPlayerO(pointsForPlayerO);
      **/
        }


    }

}