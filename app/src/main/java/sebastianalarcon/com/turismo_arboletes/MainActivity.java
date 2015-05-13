package sebastianalarcon.com.turismo_arboletes;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        main fragment = new main();
        fragmentTransaction.add(android.R.id.content,fragment).commit();
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

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //noinspection SimplifiableIfStatement
        /*switch(id)
        {
            case R.id.action_settings:
                return true;
            case R.id.action_aboutus:
                //about fragment= new about();
                //fragmentTransaction.replace(android.R.id.content,fragment).commit();
                Intent i = new Intent(this,aboutus.class);
                startActivity(i);
                return true;
            case R.id.action_bares:
                //bar fragment=new bar();
                //fragmentTransaction.replace(android.R.id.content,fragment).commit();
                Intent s = new Intent(this,bares.class);
                startActivity(s);
                return true;
            case R.id.action_hoteles:
                Intent d = new Intent(this,hoteles.class);
                startActivity(d);
                return true;
            case R.id.action_sitios:
                Intent a= new Intent(this, sitios.class);
                startActivity(a);
                return true;
            case R.id.action_demografia:
                Intent b=new Intent(this, demografia.class);
                startActivity(b);
                return true;
        }*/

        if(id==R.id.action_aboutus)
        {
            about fragment= new about();
            fragmentTransaction.replace(android.R.id.content,fragment).commit();
        }

        if(id==R.id.action_bares)
        {
            bar fragment= new bar();
            fragmentTransaction.replace(android.R.id.content,fragment).commit();
        }

        if(id==R.id.action_hoteles)
        {
            hotel fragment= new hotel();
            fragmentTransaction.replace(android.R.id.content,fragment).commit();
        }

        if(id==R.id.action_sitios)
        {
            sitio fragment= new sitio();
            fragmentTransaction.replace(android.R.id.content,fragment).commit();
        }

        if(id==R.id.action_demografia)
        {
            demography fragment= new demography();
            fragmentTransaction.replace(android.R.id.content,fragment).commit();
        }

        if(id==R.id.action_main)
        {
            main fragment = new main();
            fragmentTransaction.replace(android.R.id.content,fragment).commit();
        }

        return super.onOptionsItemSelected(item);
    }
}
