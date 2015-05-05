package sebastianalarcon.com.turismo_arboletes;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class bares extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bares);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bares, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch(id)
        {
            case R.id.action_settings:
                return true;
            case R.id.action_aboutus:
                Intent i = new Intent(this,aboutus.class);
                startActivity(i);
                return true;
            case R.id.action_main:
                Intent s = new Intent(this,MainActivity.class);
                startActivity(s);
                return true;
            case R.id.action_hoteles:
                Intent d = new Intent(this,hoteles.class);
                startActivity(d);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
