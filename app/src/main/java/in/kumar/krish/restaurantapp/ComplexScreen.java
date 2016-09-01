package in.kumar.krish.restaurantapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Dezyne 2 on 9/1/2016.
 */
public class ComplexScreen extends Activity {

    Button piz,pa,anpiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.complexscreen);
        piz =(Button)findViewById(R.id.pizza);
        pa= (Button)findViewById(R.id.pasta);
        anpiz =(Button)findViewById(R.id.antipasta);



    }
}
