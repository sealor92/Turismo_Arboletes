package sebastianalarcon.com.turismo_arboletes;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;


public class hoteles extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);

        TextView thoteles =(TextView) findViewById(R.id.thoteles);
        ImageView ihoteles = (ImageView) findViewById(R.id.ihoteles);
        Spinner spinner = (Spinner) findViewById(R.id.hoteles_spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.hoteles_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hoteles, menu);
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
            case R.id.action_bares:
                Intent s = new Intent(this,bares.class);
                startActivity(s);
                return true;
            case R.id.action_main:
                Intent d = new Intent(this,MainActivity.class);
                startActivity(d);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
