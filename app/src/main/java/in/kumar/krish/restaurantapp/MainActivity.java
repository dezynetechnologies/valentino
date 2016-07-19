package in.kumar.krish.restaurantapp;

import android.app.Activity;
import android.content.Intent;
import android.inputmethodservice.KeyboardView;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        ImageView Splash = (ImageView)findViewById(R.id.splashScreen);
        ImageView Login = (ImageView)findViewById(R.id.loginScreen);
        TextView Welcome = (TextView)findViewById(R.id.welcomeText);
        final EditText Email = (EditText) findViewById(R.id.emailText);
        final EditText Password = (EditText) findViewById(R.id.passwordText);
        final Button LoginButton =(Button)findViewById(R.id.Loginbutton);

        Splash.animate().alpha(0f).setDuration(5000);
        Login.animate().alpha(1f).setDuration(5000);
        Welcome.animate().alpha(1f).setDuration(5000);
        Email.animate().alpha(1f).setDuration(5000);
        Password.animate().alpha(1f).setDuration(5000);
        LoginButton.animate().alpha(1f).setDuration(5000);


        Email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Email.setText("");
            }
        });

        Password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Password.setText("");
            }
        });

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplication(),Screen1.class);
                startActivity(intent);


            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
