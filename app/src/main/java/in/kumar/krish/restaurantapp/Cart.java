package in.kumar.krish.restaurantapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/**
 * Created by Dezyne 2 on 9/2/2016.
 */
public class Cart extends Activity {

Button pay;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cartlayout);
        pay =(Button)findViewById(R.id.paytm);

        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context,R.style.MyStyle);

                // set title
                alertDialogBuilder.setTitle("\t\t\t\t\tOrder Confirmed");

                // set dialog message
                alertDialogBuilder
                        .setMessage("Your Order has been placed.\n Your id is 65454")
                        .setCancelable(false)
                        .setPositiveButton("OK\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                // if this button is clicked, close
                                // current activity
                                Cart.this.finish();
                                Intent intent = new Intent(Cart.this ,OfferScreen.class);
                                startActivity(intent);

                            }
                        });

                // create alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                // show it
                alertDialog.show();
            }

        });


    }
}
