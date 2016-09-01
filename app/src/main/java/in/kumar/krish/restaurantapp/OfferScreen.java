package in.kumar.krish.restaurantapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Dezyne 2 on 9/1/2016.
 */
public class OfferScreen extends Activity {
    Button order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pickup);

        order = (Button)findViewById(R.id.borderButton);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OfferScreen.this ,ComplexScreen.class);
                startActivity(intent);
            }
        });
    }
}
