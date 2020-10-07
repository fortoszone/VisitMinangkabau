package com.forto.iak3.visitminangkabau;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by forto on 01/05/17.
 */

public class MainActivitySiberut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_siberut);

        /**
         * button method
         */
        Button nextToHarau = (Button)findViewById(R.id.nextSiberut);
        Button backToSawahlunto = (Button)findViewById(R.id.backSiberut);

        /**
         * move to next part -> MainActivityHarau
         */
        nextToHarau.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(getApplicationContext(), MainActivityHarau.class);
                startActivity(i);
            }
        });

        /**
         * back to next part -> MainActivitySawahlunto
         */
        backToSawahlunto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(getApplicationContext(), MainActivitySawahlunto.class);
                startActivity(i);
            }
        });

    }
}
