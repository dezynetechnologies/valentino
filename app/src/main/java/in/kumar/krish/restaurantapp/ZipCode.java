package in.kumar.krish.restaurantapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by Dezyne 2 on 9/1/2016.
 */
public class ZipCode extends Activity {

    ImageButton zip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zip_code);

        zip =(ImageButton)findViewById(R.id.imageButton);

        zip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ZipCode.this ,OfferScreen.class);
                startActivity(intent);
            }
        });
    }
}
