package com.ctepe.batak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;

public class SinglePlayer extends AppCompatActivity {

    ImageView im_1, im_2, im_3, im_4, im_5, im_6, im_7, im_8, im_9, im_10, im_11, im_12, im_13, im_orta1, im_orta2, im_orta3, im_orta4;
    ImageView imAI1_1, imAI1_2, imAI1_3, imAI1_4, imAI1_5, imAI1_6, imAI1_7, imAI1_8, imAI1_9, imAI1_10, imAI1_11, imAI1_12, imAI1_13;
    ImageView imAI2_1, imAI2_2, imAI2_3, imAI2_4, imAI2_5, imAI2_6, imAI2_7, imAI2_8, imAI2_9, imAI2_10, imAI2_11, imAI2_12, imAI2_13;
    ImageView imAI3_1, imAI3_2, imAI3_3, imAI3_4, imAI3_5, imAI3_6, imAI3_7, imAI3_8, imAI3_9, imAI3_10, imAI3_11, imAI3_12, imAI3_13;

    int[] card_player = new int[13];
    int[] card_AI1 = new int[13];
    int[] card_AI2 = new int[13];
    int[] card_AI3 = new int[13];
    int playing_card = 0;
    int flag_player = 0;

    TextView tv;

    Button onayla;
    Button devam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_player);

        im_1 = (ImageView) findViewById(R.id.imageView);
        im_2 = (ImageView) findViewById(R.id.imageView2);
        im_3 = (ImageView) findViewById(R.id.imageView3);
        im_4 = (ImageView) findViewById(R.id.imageView4);
        im_5 = (ImageView) findViewById(R.id.imageView5);
        im_6 = (ImageView) findViewById(R.id.imageView6);
        im_7 = (ImageView) findViewById(R.id.imageView7);
        im_8 = (ImageView) findViewById(R.id.imageView_2);
        im_9 = (ImageView) findViewById(R.id.imageView_3);
        im_10 = (ImageView) findViewById(R.id.imageView_4);
        im_11 = (ImageView) findViewById(R.id.imageView_5);
        im_12 = (ImageView) findViewById(R.id.imageView_6);
        im_13 = (ImageView) findViewById(R.id.imageView_7);

        im_orta1 = (ImageView) findViewById(R.id.imageView_orta1);
        im_orta2 = (ImageView) findViewById(R.id.imageView_orta2);
        im_orta3 = (ImageView) findViewById(R.id.imageView_orta3);
        im_orta4 = (ImageView) findViewById(R.id.imageView_orta4);

        imAI1_1 = (ImageView) findViewById(R.id.imageViewAI1_1);
        imAI1_2 = (ImageView) findViewById(R.id.imageViewAI1_2);
        imAI1_3 = (ImageView) findViewById(R.id.imageViewAI1_3);
        imAI1_4 = (ImageView) findViewById(R.id.imageViewAI1_4);
        imAI1_5 = (ImageView) findViewById(R.id.imageViewAI1_5);
        imAI1_6 = (ImageView) findViewById(R.id.imageViewAI1_6);
        imAI1_7 = (ImageView) findViewById(R.id.imageViewAI1_7);
        imAI1_8 = (ImageView) findViewById(R.id.imageViewAI1_8);
        imAI1_9 = (ImageView) findViewById(R.id.imageViewAI1_9);
        imAI1_10 = (ImageView) findViewById(R.id.imageViewAI1_10);
        imAI1_11 = (ImageView) findViewById(R.id.imageViewAI1_11);
        imAI1_12 = (ImageView) findViewById(R.id.imageViewAI1_12);
        imAI1_13 = (ImageView) findViewById(R.id.imageViewAI1_13);

        imAI2_1 = (ImageView) findViewById(R.id.imageViewAI2_1);
        imAI2_2 = (ImageView) findViewById(R.id.imageViewAI2_2);
        imAI2_3 = (ImageView) findViewById(R.id.imageViewAI2_3);
        imAI2_4 = (ImageView) findViewById(R.id.imageViewAI2_4);
        imAI2_5 = (ImageView) findViewById(R.id.imageViewAI2_5);
        imAI2_6 = (ImageView) findViewById(R.id.imageViewAI2_6);
        imAI2_7 = (ImageView) findViewById(R.id.imageViewAI2_7);
        imAI2_8 = (ImageView) findViewById(R.id.imageViewAI2_8);
        imAI2_9 = (ImageView) findViewById(R.id.imageViewAI2_9);
        imAI2_10 = (ImageView) findViewById(R.id.imageViewAI2_10);
        imAI2_11 = (ImageView) findViewById(R.id.imageViewAI2_11);
        imAI2_12 = (ImageView) findViewById(R.id.imageViewAI2_12);
        imAI2_13 = (ImageView) findViewById(R.id.imageViewAI2_13);

        imAI3_1 = (ImageView) findViewById(R.id.imageViewAI3_1);
        imAI3_2 = (ImageView) findViewById(R.id.imageViewAI3_2);
        imAI3_3 = (ImageView) findViewById(R.id.imageViewAI3_3);
        imAI3_4 = (ImageView) findViewById(R.id.imageViewAI3_4);
        imAI3_5 = (ImageView) findViewById(R.id.imageViewAI3_5);
        imAI3_6 = (ImageView) findViewById(R.id.imageViewAI3_6);
        imAI3_7 = (ImageView) findViewById(R.id.imageViewAI3_7);
        imAI3_8 = (ImageView) findViewById(R.id.imageViewAI3_8);
        imAI3_9 = (ImageView) findViewById(R.id.imageViewAI3_9);
        imAI3_10 = (ImageView) findViewById(R.id.imageViewAI3_10);
        imAI3_11 = (ImageView) findViewById(R.id.imageViewAI3_11);
        imAI3_12 = (ImageView) findViewById(R.id.imageViewAI3_12);
        imAI3_13 = (ImageView) findViewById(R.id.imageViewAI3_13);


        ArrayList random_num = new ArrayList();

        for (int i=0; i<52; i++){
            random_num.add(i);
        }

        Collections.shuffle(random_num);

        final int[] random_cards = {
                R.mipmap.d1, R.mipmap.d2, R.mipmap.d3, R.mipmap.d4, R.mipmap.d5, R.mipmap.d6, R.mipmap.d7, R.mipmap.d8, R.mipmap.d9, R.mipmap.d10, R.mipmap.dj, R.mipmap.dq, R.mipmap.dk,
                R.mipmap.c1, R.mipmap.c2, R.mipmap.c3, R.mipmap.c4, R.mipmap.c5, R.mipmap.c6, R.mipmap.c7, R.mipmap.c8, R.mipmap.c9, R.mipmap.c10, R.mipmap.cj, R.mipmap.cq, R.mipmap.ck,
                R.mipmap.h1, R.mipmap.h2, R.mipmap.h3, R.mipmap.h4, R.mipmap.h5, R.mipmap.h6, R.mipmap.h7, R.mipmap.h8, R.mipmap.h9, R.mipmap.h10, R.mipmap.hj, R.mipmap.hq, R.mipmap.hk,
                R.mipmap.s1, R.mipmap.s2, R.mipmap.s3, R.mipmap.s4, R.mipmap.s5, R.mipmap.s6, R.mipmap.s7, R.mipmap.s8, R.mipmap.s9, R.mipmap.s10, R.mipmap.sj, R.mipmap.sq, R.mipmap.sk};



        for (int i=0; i<13; i++) {
            card_player [i] = (int) random_num.get(i);
            card_AI1 [i] = (int) random_num.get(i+13);
            card_AI2 [i] = (int) random_num.get(i+26);
            card_AI3 [i] = (int) random_num.get(i+39);
        }


        for (int i =0; i<card_player.length; i++) {

            for (int j=0; j<card_player.length-(i+1); j++) {
                if (card_player[j] > card_player [j+1]) {
                    int dummy = card_player [j+1];
                    card_player[j+1]=card_player[j];
                    card_player[j]=dummy;
                }
            }

        }

        for (int i =0; i<card_AI1.length; i++) {

            for (int j=0; j<card_AI1.length-(i+1); j++) {
                if (card_AI1[j] > card_AI1 [j+1]) {
                    int dummy = card_AI1 [j+1];
                    card_AI1[j+1]=card_AI1[j];
                    card_AI1[j]=dummy;
                }
            }

        }

        for (int i =0; i<card_AI2.length; i++) {

            for (int j=0; j<card_AI2.length-(i+1); j++) {
                if (card_AI2[j] > card_AI2 [j+1]) {
                    int dummy = card_AI2 [j+1];
                    card_AI2[j+1]=card_AI2[j];
                    card_AI2[j]=dummy;
                }
            }

        }

        for (int i =0; i<card_AI3.length; i++) {

            for (int j=0; j<card_AI3.length-(i+1); j++) {
                if (card_AI3[j] > card_AI3 [j+1]) {
                    int dummy = card_AI3 [j+1];
                    card_AI3[j+1]=card_AI3[j];
                    card_AI3[j]=dummy;
                }
            }

        }


        im_1.setImageResource(random_cards[card_player[0]]);
        im_2.setImageResource(random_cards[card_player[1]]);
        im_3.setImageResource(random_cards[card_player[2]]);
        im_4.setImageResource(random_cards[card_player[3]]);
        im_5.setImageResource(random_cards[card_player[4]]);
        im_6.setImageResource(random_cards[card_player[5]]);
        im_7.setImageResource(random_cards[card_player[6]]);
        im_8.setImageResource(random_cards[card_player[7]]);
        im_9.setImageResource(random_cards[card_player[8]]);
        im_10.setImageResource(random_cards[card_player[9]]);
        im_11.setImageResource(random_cards[card_player[10]]);
        im_12.setImageResource(random_cards[card_player[11]]);
        im_13.setImageResource(random_cards[card_player[12]]);


        imAI1_1.setImageResource(random_cards[card_AI1[0]]);
        imAI1_2.setImageResource(random_cards[card_AI1[1]]);
        imAI1_3.setImageResource(random_cards[card_AI1[2]]);
        imAI1_4.setImageResource(random_cards[card_AI1[3]]);
        imAI1_5.setImageResource(random_cards[card_AI1[4]]);
        imAI1_6.setImageResource(random_cards[card_AI1[5]]);
        imAI1_7.setImageResource(random_cards[card_AI1[6]]);
        imAI1_8.setImageResource(random_cards[card_AI1[7]]);
        imAI1_9.setImageResource(random_cards[card_AI1[8]]);
        imAI1_10.setImageResource(random_cards[card_AI1[9]]);
        imAI1_11.setImageResource(random_cards[card_AI1[10]]);
        imAI1_12.setImageResource(random_cards[card_AI1[11]]);
        imAI1_13.setImageResource(random_cards[card_AI1[12]]);

        imAI2_1.setImageResource(random_cards[card_AI2[0]]);
        imAI2_2.setImageResource(random_cards[card_AI2[1]]);
        imAI2_3.setImageResource(random_cards[card_AI2[2]]);
        imAI2_4.setImageResource(random_cards[card_AI2[3]]);
        imAI2_5.setImageResource(random_cards[card_AI2[4]]);
        imAI2_6.setImageResource(random_cards[card_AI2[5]]);
        imAI2_7.setImageResource(random_cards[card_AI2[6]]);
        imAI2_8.setImageResource(random_cards[card_AI2[7]]);
        imAI2_9.setImageResource(random_cards[card_AI2[8]]);
        imAI2_10.setImageResource(random_cards[card_AI2[9]]);
        imAI2_11.setImageResource(random_cards[card_AI2[10]]);
        imAI2_12.setImageResource(random_cards[card_AI2[11]]);
        imAI2_13.setImageResource(random_cards[card_AI2[12]]);

        imAI3_1.setImageResource(random_cards[card_AI3[0]]);
        imAI3_2.setImageResource(random_cards[card_AI3[1]]);
        imAI3_3.setImageResource(random_cards[card_AI3[2]]);
        imAI3_4.setImageResource(random_cards[card_AI3[3]]);
        imAI3_5.setImageResource(random_cards[card_AI3[4]]);
        imAI3_6.setImageResource(random_cards[card_AI3[5]]);
        imAI3_7.setImageResource(random_cards[card_AI3[6]]);
        imAI3_8.setImageResource(random_cards[card_AI3[7]]);
        imAI3_9.setImageResource(random_cards[card_AI3[8]]);
        imAI3_10.setImageResource(random_cards[card_AI3[9]]);
        imAI3_11.setImageResource(random_cards[card_AI3[10]]);
        imAI3_12.setImageResource(random_cards[card_AI3[11]]);
        imAI3_13.setImageResource(random_cards[card_AI3[12]]);


        im_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playing_card = random_cards[card_player[0]];
                im_orta4.setImageResource(playing_card);
                flag_player = 1;

            }
        });

        im_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playing_card = random_cards[card_player[1]];
                im_orta4.setImageResource(playing_card);
                flag_player = 2;
            }
        });

        im_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playing_card = random_cards[card_player[2]];
                im_orta4.setImageResource(playing_card);
                flag_player = 3;

            }
        });

        im_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playing_card = random_cards[card_player[3]];
                im_orta4.setImageResource(playing_card);
                flag_player = 4;

            }
        });

        im_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playing_card = random_cards[card_player[4]];
                im_orta4.setImageResource(playing_card);
                flag_player = 5;

            }
        });

        im_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playing_card = random_cards[card_player[5]];
                im_orta4.setImageResource(playing_card);
                flag_player = 6;

            }
        });

        im_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playing_card = random_cards[card_player[6]];
                im_orta4.setImageResource(playing_card);
                flag_player = 7;

            }
        });

        im_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playing_card = random_cards[card_player[7]];
                im_orta4.setImageResource(playing_card);
                flag_player = 8;

            }
        });

        im_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playing_card = random_cards[card_player[8]];
                im_orta4.setImageResource(playing_card);
                flag_player = 9;

            }
        });

        im_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playing_card = random_cards[card_player[9]];
                im_orta4.setImageResource(playing_card);
                flag_player = 10;

            }
        });

        im_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playing_card = random_cards[card_player[10]];
                im_orta4.setImageResource(playing_card);
                flag_player = 11;

            }
        });

        im_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playing_card = random_cards[card_player[11]];
                im_orta4.setImageResource(playing_card);
                flag_player = 12;

            }
        });

        im_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playing_card = random_cards[card_player[12]];
                im_orta4.setImageResource(playing_card);
                flag_player = 13;

            }
        });


        onayla = (Button) findViewById(R.id.btn_onayla);
        devam = (Button) findViewById(R.id.btn_devam);

        tv = (TextView) findViewById(R.id.tv);

        onayla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                switch (flag_player) {

                    case 1 :  im_1.setImageResource(R.mipmap.b1fv);
                        break;
                    case 2 :  im_2.setImageResource(R.mipmap.b1fv);
                        break;
                    case 3:  im_3.setImageResource(R.mipmap.b1fv);
                        break;
                    case 4 :  im_4.setImageResource(R.mipmap.b1fv);
                        break;
                    case 5 :  im_5.setImageResource(R.mipmap.b1fv);
                        break;
                    case 6 :  im_6.setImageResource(R.mipmap.b1fv);
                        break;
                    case 7 :  im_7.setImageResource(R.mipmap.b1fv);
                        break;
                    case 8 :  im_8.setImageResource(R.mipmap.b1fv);
                        break;
                    case 9 :  im_9.setImageResource(R.mipmap.b1fv);
                        break;
                    case 10 : im_10.setImageResource(R.mipmap.b1fv);
                        break;
                    case 11 : im_11.setImageResource(R.mipmap.b1fv);
                        break;
                    case 12 : im_12.setImageResource(R.mipmap.b1fv);
                        break;
                    case 13 : im_13.setImageResource(R.mipmap.b1fv);
                        break;

                }

                int card_number = card_player[flag_player-1];

                if (card_number<13) {
                    tv.setText("karo");
                }
                else if (card_number>=13 && card_number<26) {
                    tv.setText("sinek");
                }
                else if (card_number>=26 && card_number<39) {
                    tv.setText("kupa");
                }
                else {
                    tv.setText("maça");
                }

            }
        });

        devam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_single_player, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
