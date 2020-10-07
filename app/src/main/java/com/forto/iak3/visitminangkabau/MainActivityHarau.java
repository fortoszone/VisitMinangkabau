package com.forto.iak3.visitminangkabau;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by forto on 01/05/17.
 */

public class MainActivityHarau extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_harau);

        /**
         * button method
         */

        Button backToSawahlunto = (Button) findViewById(R.id.backHarau);
        Button nextToCredit = (Button) findViewById(R.id.nextHarau);

        /**
         * step to the previous part -> SiberutIsland
         */
        backToSawahlunto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(getApplicationContext(), MainActivitySiberut.class);
                startActivity(i);
            }
        });

        /**
         * step to the next part -> credit
         */
        nextToCredit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(getApplicationContext(), MainActivityCredit.class);
                startActivity(i);
            }
        });
    }
}
