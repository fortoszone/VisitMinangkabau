package com.forto.iak3.visitminangkabau;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityIntro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_intro);

        /**
         * button method
         */

        Button start=(Button)findViewById(R.id.start_text_view);

        start.setOnClickListener(new View.OnClickListener() {

            /**
             * button to next part -> Padang
             * @param arg0
             */
            public void onClick(View arg0) {
                Intent i = new Intent(getApplicationContext(), MainActivityPadang.class);
                startActivity(i);
            }
        });
    }
}