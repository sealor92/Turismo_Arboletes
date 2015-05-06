package sebastianalarcon.com.turismo_arboletes;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;


public class sitios extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios);

        final TextView tsitios =(TextView) findViewById(R.id.tsitios);
        final ImageView isitios = (ImageView) findViewById(R.id.isitios);
        final Spinner spinner = (Spinner) findViewById(R.id.sitios_spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.sitios_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch(position) {

                    case 0:
                        isitios.setImageResource(R.drawable.sitio1);
                        tsitios.setText(R.string.sitio1);
                        break;

                    case 1:
                        isitios.setImageResource(R.drawable.sitio2);
                        tsitios.setText(R.string.sitio2);
                        break;

                    case 2:
                        isitios.setImageResource(R.drawable.sitio3);
                        tsitios.setText(R.string.sitio3);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sitios, menu);
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
            case R.id.action_main:
                Intent i = new Intent(this,MainActivity.class);
                startActivity(i);
                return true;
            case R.id.action_bares:
                Intent s = new Intent(this,bares.class);
                startActivity(s);
                return true;
            case R.id.action_hoteles:
                Intent d = new Intent(this,hoteles.class);
                startActivity(d);
                return true;
            case R.id.action_aboutus:
                Intent a= new Intent(this,aboutus.class);
                startActivity(a);
                return true;
            case R.id.action_demografia:
                Intent b=new Intent(this,demografia.class);
                startActivity(b);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
