package com.forto.iak3.visitminangkabau;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by forto on 01/05/17.
 */

public class MainActivityBukit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bukit);

        /**
         * button method
         */
        Button nextToSawahlunto = (Button) findViewById(R.id.nextBukit);
        Button backToPadang = (Button) findViewById(R.id.backBukit);

        /**
         * move to next part -> Sawahlunto
         */
        nextToSawahlunto.setOnClickListener(new View.OnClickListener() {

            /**
             * button class
             * @param arg0
             */
            public void onClick(View arg0) {
                Intent i = new Intent(getApplicationContext(), MainActivitySawahlunto.class);
                startActivity(i);
            }
        });

        /**
         * back to previous part -> Padang
         */
        backToPadang.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(getApplicationContext(), MainActivityPadang.class);
                startActivity(i);
            }
        });
    }
}
