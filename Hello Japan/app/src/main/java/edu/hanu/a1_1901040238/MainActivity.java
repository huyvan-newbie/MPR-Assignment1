package edu.hanu.a1_1901040238;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageButton btnHiragana;
    private ImageButton btnKatakana;

    private TextView Hiragana;
    private TextView Katakana;

    private ScrollView hiraganaScroll;
    private ScrollView katakanaScroll;

    private MediaPlayer PLAYER;

    private boolean play = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHiragana = findViewById(R.id.btnHiragana);
        Button btnKatakana = findViewById(R.id.btnKatakana);

        hiraganaScroll = findViewById(R.id.hiragana);
        katakanaScroll = findViewById(R.id.katakana);

        TextView h_View = findViewById(R.id.Hiragana);
        TextView k_View = findViewById(R.id.Katakana);

        katakanaScroll.setVisibility(View.GONE);
        k_View.setVisibility(View.GONE);

        btnHiragana.setBackgroundResource(R.color.ButtonSelected);
        btnKatakana.setBackgroundResource(R.color.ButtonNorm);

        btnHiragana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hiraganaScroll.setVisibility(View.VISIBLE);
                katakanaScroll.setVisibility(View.GONE);
                h_View.setVisibility(View.VISIBLE);
                k_View.setVisibility(View.GONE);
                hiraganaScroll.fullScroll(ScrollView.FOCUS_UP);

                if(play){
                    btnHiragana.setBackgroundResource(R.color.ButtonSelected);
                    btnKatakana.setBackgroundResource(R.color.ButtonNorm);
                }
            }
        });

        btnKatakana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hiraganaScroll.setVisibility(View.GONE);
                katakanaScroll.setVisibility(View.VISIBLE);
                h_View.setVisibility(View.GONE);
                k_View.setVisibility(View.VISIBLE);
                katakanaScroll.fullScroll(ScrollView.FOCUS_UP);

                if(play){
                    btnKatakana.setBackgroundResource(R.color.ButtonSelected);
                    btnHiragana.setBackgroundResource(R.color.ButtonNorm);
                }
            }
        });

//=================================RAW PLAYER=====================================================//
//        MediaPlayer a = MediaPlayer.create(MainActivity.this, R.raw.a);
//        MediaPlayer i = MediaPlayer.create(MainActivity.this, R.raw.i);
//        MediaPlayer u = MediaPlayer.create(MainActivity.this, R.raw.u);
//        MediaPlayer e = MediaPlayer.create(MainActivity.this, R.raw.e);
//        MediaPlayer o = MediaPlayer.create(MainActivity.this, R.raw.o);
//
//        MediaPlayer ka = MediaPlayer.create(MainActivity.this, R.raw.ka);
//        MediaPlayer ki = MediaPlayer.create(MainActivity.this, R.raw.ki);
//        MediaPlayer ku = MediaPlayer.create(MainActivity.this, R.raw.ku);
//        MediaPlayer ke = MediaPlayer.create(MainActivity.this, R.raw.ke);
//        MediaPlayer ko = MediaPlayer.create(MainActivity.this, R.raw.ko);
//
//        MediaPlayer sa = MediaPlayer.create(MainActivity.this, R.raw.sa);
//        MediaPlayer shi = MediaPlayer.create(MainActivity.this, R.raw.shi);
//        MediaPlayer su = MediaPlayer.create(MainActivity.this, R.raw.su);
//        MediaPlayer se = MediaPlayer.create(MainActivity.this, R.raw.se);
//        MediaPlayer so = MediaPlayer.create(MainActivity.this, R.raw.so);
//
//        MediaPlayer ta = MediaPlayer.create(MainActivity.this, R.raw.ta);
//        MediaPlayer chi = MediaPlayer.create(MainActivity.this, R.raw.chi);
//        MediaPlayer tsu = MediaPlayer.create(MainActivity.this, R.raw.tsu);
//        MediaPlayer te = MediaPlayer.create(MainActivity.this, R.raw.te);
//        MediaPlayer to = MediaPlayer.create(MainActivity.this, R.raw.to);
//
//        MediaPlayer na = MediaPlayer.create(MainActivity.this, R.raw.na);
//        MediaPlayer ni = MediaPlayer.create(MainActivity.this, R.raw.ni);
//        MediaPlayer nu = MediaPlayer.create(MainActivity.this, R.raw.nu);
//        MediaPlayer ne = MediaPlayer.create(MainActivity.this, R.raw.ne);
//        MediaPlayer no = MediaPlayer.create(MainActivity.this, R.raw.no);
//
//        MediaPlayer ha = MediaPlayer.create(MainActivity.this, R.raw.ha);
//        MediaPlayer hi = MediaPlayer.create(MainActivity.this, R.raw.hi);
//        MediaPlayer fu = MediaPlayer.create(MainActivity.this, R.raw.fu);
//        MediaPlayer he = MediaPlayer.create(MainActivity.this, R.raw.he);
//        MediaPlayer ho = MediaPlayer.create(MainActivity.this, R.raw.ho);
//
//        MediaPlayer ma = MediaPlayer.create(MainActivity.this, R.raw.ma);
//        MediaPlayer mi = MediaPlayer.create(MainActivity.this, R.raw.mi);
//        MediaPlayer mu = MediaPlayer.create(MainActivity.this, R.raw.mu);
//        MediaPlayer me = MediaPlayer.create(MainActivity.this, R.raw.me);
//        MediaPlayer mo = MediaPlayer.create(MainActivity.this, R.raw.mo);
//
//        MediaPlayer ya = MediaPlayer.create(MainActivity.this, R.raw.ya);
//        MediaPlayer yu = MediaPlayer.create(MainActivity.this, R.raw.yu);
//        MediaPlayer yo = MediaPlayer.create(MainActivity.this, R.raw.yo);
//
//        MediaPlayer ra = MediaPlayer.create(MainActivity.this, R.raw.ra);
//        MediaPlayer ri = MediaPlayer.create(MainActivity.this, R.raw.ri);
//        MediaPlayer ru = MediaPlayer.create(MainActivity.this, R.raw.ru);
//        MediaPlayer re = MediaPlayer.create(MainActivity.this, R.raw.re);
//        MediaPlayer ro = MediaPlayer.create(MainActivity.this, R.raw.ro);
//
//        MediaPlayer wa = MediaPlayer.create(MainActivity.this, R.raw.wa);
//        MediaPlayer wo = MediaPlayer.create(MainActivity.this, R.raw.wo);
//
//        MediaPlayer n = MediaPlayer.create(MainActivity.this, R.raw.n);

//=================================BUTTON=========================================================//

        //-------------Hiragana-------------------------------------------//
        ImageButton a_H = findViewById(R.id.a);
        ImageButton i_H = findViewById(R.id.i);
        ImageButton u_H = findViewById(R.id.u);
        ImageButton e_H = findViewById(R.id.e);
        ImageButton o_H = findViewById(R.id.o);

        ImageButton ka_H = findViewById(R.id.ka);
        ImageButton ki_H = findViewById(R.id.ki);
        ImageButton ku_H = findViewById(R.id.ku);
        ImageButton ke_H = findViewById(R.id.ke);
        ImageButton ko_H = findViewById(R.id.ko);

        ImageButton sa_H = findViewById(R.id.sa);
        ImageButton shi_H = findViewById(R.id.shi);
        ImageButton su_H = findViewById(R.id.su);
        ImageButton se_H = findViewById(R.id.se);
        ImageButton so_H = findViewById(R.id.so);

        ImageButton ta_H = findViewById(R.id.ta);
        ImageButton chi_H = findViewById(R.id.chi);
        ImageButton tsu_H = findViewById(R.id.tsu);
        ImageButton te_H = findViewById(R.id.te);
        ImageButton to_H = findViewById(R.id.to);

        ImageButton na_H = findViewById(R.id.na);
        ImageButton ni_H = findViewById(R.id.ni);
        ImageButton nu_H = findViewById(R.id.nu);
        ImageButton ne_H = findViewById(R.id.ne);
        ImageButton no_H = findViewById(R.id.no);

        ImageButton ha_H = findViewById(R.id.ha);
        ImageButton hi_H = findViewById(R.id.hi);
        ImageButton fu_H = findViewById(R.id.fu);
        ImageButton he_H = findViewById(R.id.he);
        ImageButton ho_H = findViewById(R.id.ho);

        ImageButton ma_H = findViewById(R.id.ma);
        ImageButton mi_H = findViewById(R.id.mi);
        ImageButton mu_H = findViewById(R.id.mu);
        ImageButton me_H = findViewById(R.id.me);
        ImageButton mo_H = findViewById(R.id.mo);

        ImageButton ya_H = findViewById(R.id.ya);
        ImageButton yu_H = findViewById(R.id.yu);
        ImageButton yo_H = findViewById(R.id.yo);

        ImageButton ra_H = findViewById(R.id.ra);
        ImageButton ri_H = findViewById(R.id.ri);
        ImageButton ru_H = findViewById(R.id.ru);
        ImageButton re_H = findViewById(R.id.re);
        ImageButton ro_H = findViewById(R.id.ro);

        ImageButton wa_H = findViewById(R.id.wa);
        ImageButton wo_H = findViewById(R.id.wo);

        ImageButton n_H = findViewById(R.id.n);

        //-------------Katakana-------------------------------------------//
        ImageButton a_K = findViewById(R.id.a1);
        ImageButton i_K = findViewById(R.id.i1);
        ImageButton u_K = findViewById(R.id.u1);
        ImageButton e_K = findViewById(R.id.e1);
        ImageButton o_K = findViewById(R.id.o1);

        ImageButton ka_K = findViewById(R.id.ka1);
        ImageButton ki_K = findViewById(R.id.ki1);
        ImageButton ku_K = findViewById(R.id.ku1);
        ImageButton ke_K = findViewById(R.id.ke1);
        ImageButton ko_K = findViewById(R.id.ko1);

        ImageButton sa_K = findViewById(R.id.sa1);
        ImageButton shi_K = findViewById(R.id.shi1);
        ImageButton su_K = findViewById(R.id.su1);
        ImageButton se_K = findViewById(R.id.se1);
        ImageButton so_K = findViewById(R.id.so1);

        ImageButton ta_K = findViewById(R.id.ta1);
        ImageButton chi_K = findViewById(R.id.chi1);
        ImageButton tsu_K = findViewById(R.id.tsu1);
        ImageButton te_K = findViewById(R.id.te1);
        ImageButton to_K = findViewById(R.id.to1);

        ImageButton na_K = findViewById(R.id.na1);
        ImageButton ni_K = findViewById(R.id.ni1);
        ImageButton nu_K = findViewById(R.id.nu1);
        ImageButton ne_K = findViewById(R.id.ne1);
        ImageButton no_K = findViewById(R.id.no1);

        ImageButton ha_K = findViewById(R.id.ha1);
        ImageButton hi_K = findViewById(R.id.hi1);
        ImageButton fu_K = findViewById(R.id.fu1);
        ImageButton he_K = findViewById(R.id.he1);
        ImageButton ho_K = findViewById(R.id.ho1);

        ImageButton ma_K = findViewById(R.id.ma1);
        ImageButton mi_K = findViewById(R.id.mi1);
        ImageButton mu_K = findViewById(R.id.mu1);
        ImageButton me_K = findViewById(R.id.me1);
        ImageButton mo_K = findViewById(R.id.mo1);

        ImageButton ya_K = findViewById(R.id.ya1);
        ImageButton yu_K = findViewById(R.id.yu1);
        ImageButton yo_K = findViewById(R.id.yo1);

        ImageButton ra_K = findViewById(R.id.ra1);
        ImageButton ri_K = findViewById(R.id.ri1);
        ImageButton ru_K = findViewById(R.id.ru1);
        ImageButton re_K = findViewById(R.id.re1);
        ImageButton ro_K = findViewById(R.id.ro1);

        ImageButton wa_K = findViewById(R.id.wa1);
        ImageButton wo_K = findViewById(R.id.wo1);

        ImageButton n_K = findViewById(R.id.n1);

//=================================ON CLICK LISTENER==============================================//

        //-------------Hiragana-------------------------------------------//
        a_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.a);
                PLAYER.start();
            }
        });
        i_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.i);
                PLAYER.start();
            }
        });
        u_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.u);
                PLAYER.start();
            }
        });
        e_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.e);
                PLAYER.start();
            }
        });
        o_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.o);
                PLAYER.start();
            }
        });


        ka_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.ka);
                PLAYER.start();
            }
        });
        ki_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.ki);
                PLAYER.start();
            }
        });
        ku_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.ku);
                PLAYER.start();
            }
        });
        ke_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.ke);
                PLAYER.start();
            }
        });
        ko_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.ko);
                PLAYER.start();
            }
        });


        sa_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.sa);
                PLAYER.start();
            }
        });
        shi_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.shi);
                PLAYER.start();
            }
        });
        su_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.su);
                PLAYER.start();
            }
        });
        se_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.se);
                PLAYER.start();
            }
        });
        so_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.so);
                PLAYER.start();
            }
        });


        ta_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.ta);
                PLAYER.start();
            }
        });
        chi_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.chi);
                PLAYER.start();
            }
        });
        tsu_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.tsu);
                PLAYER.start();
            }
        });
        te_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.te);
                PLAYER.start();
            }
        });
        to_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.to);
                PLAYER.start();
            }
        });


        na_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.na);
                PLAYER.start();
            }
        });
        ni_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.ni);
                PLAYER.start();
            }
        });
        nu_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.nu);
                PLAYER.start();
            }
        });
        ne_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null) {
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.ne);
                PLAYER.start();
            }
        });
        no_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if (PLAYER != null){
                        PLAYER.reset();
                    }
                    PLAYER = MediaPlayer.create(MainActivity.this, R.raw.no);
                    PLAYER.start();
            }
        });


        ha_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.ha);
                PLAYER.start();
            }
        });
        hi_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.hi);
                PLAYER.start();
            }
        });
        fu_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.fu);
                PLAYER.start();
            }
        });
        he_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.he);
                PLAYER.start();
            }
        });
        ho_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.ho);
                PLAYER.start();
            }
        });


        ma_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.ma);
                PLAYER.start();
            }
        });
        mi_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.mi);
                PLAYER.start();
            }
        });
        mu_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.mu);
                PLAYER.start();
            }
        });
        me_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.me);
                PLAYER.start();
            }
        });
        mo_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.mo);
                PLAYER.start();
            }
        });


        ya_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.ya);
                PLAYER.start();
            }
        });
        yu_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.yu);
                PLAYER.start();
            }
        });
        yo_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.yo);
                PLAYER.start();
            }
        });


        ra_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.ra);
                PLAYER.start();
            }
        });
        ri_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.ri);
                PLAYER.start();
            }
        });
        ru_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.ru);
                PLAYER.start();
            }
        });
        re_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.re);
                PLAYER.start();
            }
        });
        ro_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.ro);
                PLAYER.start();
            }
        });


        wa_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.wa);
                PLAYER.start();
            }
        });
        wo_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.wo);
                PLAYER.start();
            }
        });


        n_H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.n);
                PLAYER.start();
            }
        });


        //-------------Katakana-------------------------------------------//
        a_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.a);
                PLAYER.start();
            }
        });
        i_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.i);
                PLAYER.start();
            }
        });
        u_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.u);
                PLAYER.start();
            }
        });
        e_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.e);
                PLAYER.start();
            }
        });
        o_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.o);
                PLAYER.start();
            }
        });


        ka_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.ka);
                PLAYER.start();
            }
        });
        ki_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.ki);
                PLAYER.start();
            }
        });
        ku_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.ku);
                PLAYER.start();
            }
        });
        ke_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.ke);
                PLAYER.start();
            }
        });
        ko_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.ko);
                PLAYER.start();
            }
        });


        sa_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.sa);
                PLAYER.start();
            }
        });
        shi_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.shi);
                PLAYER.start();
            }
        });
        su_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.su);
                PLAYER.start();
            }
        });
        se_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.se);
                PLAYER.start();
            }
        });
        so_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.so);
                PLAYER.start();
            }
        });


        ta_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.ta);
                PLAYER.start();
            }
        });
        chi_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.chi);
                PLAYER.start();
            }
        });
        tsu_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.tsu);
                PLAYER.start();
            }
        });
        te_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.te);
                PLAYER.start();
            }
        });
        to_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.to);
                PLAYER.start();
            }
        });


        na_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.na);
                PLAYER.start();
            }
        });
        ni_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.ni);
                PLAYER.start();
            }
        });
        nu_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.nu);
                PLAYER.start();
            }
        });
        ne_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null) {
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.ne);
                PLAYER.start();
            }
        });
        no_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.no);
                PLAYER.start();
            }
        });


        ha_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.ha);
                PLAYER.start();
            }
        });
        hi_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.hi);
                PLAYER.start();
            }
        });
        fu_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.fu);
                PLAYER.start();
            }
        });
        he_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.he);
                PLAYER.start();
            }
        });
        ho_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.ho);
                PLAYER.start();
            }
        });


        ma_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.ma);
                PLAYER.start();
            }
        });
        mi_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.mi);
                PLAYER.start();
            }
        });
        mu_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.mu);
                PLAYER.start();
            }
        });
        me_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.me);
                PLAYER.start();
            }
        });
        mo_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.mo);
                PLAYER.start();
            }
        });


        ya_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.ya);
                PLAYER.start();
            }
        });
        yu_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.yu);
                PLAYER.start();
            }
        });
        yo_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.yo);
                PLAYER.start();
            }
        });


        ra_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.ra);
                PLAYER.start();
            }
        });
        ri_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.ri);
                PLAYER.start();
            }
        });
        ru_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.ru);
                PLAYER.start();
            }
        });
        re_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.re);
                PLAYER.start();
            }
        });
        ro_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.ro);
                PLAYER.start();
            }
        });


        wa_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.wa);
                PLAYER.start();
            }
        });
        wo_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.wo);
                PLAYER.start();
            }
        });


        n_K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PLAYER != null){
                    PLAYER.reset();
                }
                PLAYER = MediaPlayer.create(MainActivity.this, R.raw.n);
                PLAYER.start();
            }
        });

    }
}