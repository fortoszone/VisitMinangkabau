package com.forto.iak3.visitminangkabau;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by forto on 01/05/17.
 */

public class MainActivityPadang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_padang);

        /**
         * button method
         */
        Button nextToBukittinggi = (Button) findViewById(R.id.nextPadang);
        Button backToIntro = (Button) findViewById(R.id.backPadang);

        /**
         * move to next part -> Bukittinggi
         */
        nextToBukittinggi.setOnClickListener(new View.OnClickListener() {

            /**
             * button class
             * @param arg0
             */
            public void onClick(View arg0) {
                Intent i = new Intent(getApplicationContext(), MainActivityBukit.class);
                startActivity(i);
            }
        });

        /**
         * move to previous part -> Intro
         */
        backToIntro.setOnClickListener(new View.OnClickListener() {

            /**
             * button class
             * @param arg0
             */
            public void onClick(View arg0) {
                Intent i = new Intent(getApplicationContext(), MainActivityIntro.class);
                startActivity(i);
            }
        });

    }
}
