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
public class RestaurantChooser extends Activity {

    Button choose;
    ImageButton search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      setContentView(R.layout.dine_in);

        choose =(Button)findViewById(R.id.chooseRestButton) ;
        search =(ImageButton)findViewById(R.id.imageButton2);

        choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RestaurantChooser.this ,OfferScreen.class);
                startActivity(intent);
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RestaurantChooser.this ,ZipCode.class);
                startActivity(intent);
            }
        });

    }
}
