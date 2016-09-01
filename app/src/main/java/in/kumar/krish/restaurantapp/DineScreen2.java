package in.kumar.krish.restaurantapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Dezyne 2 on 9/1/2016.
 */
public class DineScreen2 extends Activity {

    Button built;
    private int mYear, mMonth, mDay, mHour, mMinute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datetimeguest);

        built =(Button)findViewById(R.id.builtOrder);
        built.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DineScreen2.this ,ComplexScreen.class);
                startActivity(intent);
            }
        });
    }
}
