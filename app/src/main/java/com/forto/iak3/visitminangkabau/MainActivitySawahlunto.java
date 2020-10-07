package com.forto.iak3.visitminangkabau;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by forto on 01/05/17.
 */

public class MainActivitySawahlunto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sawahlunto);

        /**
         * button method
         */
        Button nextToSiberut = (Button) findViewById(R.id.nextSawahlunto);
        Button backToBukittinggi = (Button) findViewById(R.id.backSawahlunto);

        /**
         * move to next part -> Bukittinggi
         */
        nextToSiberut.setOnClickListener(new View.OnClickListener() {

            /**
             * button class
             * @param arg0
             */

            public void onClick(View arg0) {
                Intent i = new Intent(getApplicationContext(), MainActivitySiberut.class);
                startActivity(i);
            }
        });

        /**
         * back to previous part -> Bukittinggi
         */
        backToBukittinggi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(getApplicationContext(), MainActivityBukit.class);
                startActivity(i);
            }
        });

    }
}
