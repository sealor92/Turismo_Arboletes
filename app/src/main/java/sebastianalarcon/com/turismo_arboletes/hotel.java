package sebastianalarcon.com.turismo_arboletes;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class hotel extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_hotel, container, false);


        final TextView thoteles =(TextView) view.findViewById(R.id.thoteles);
        final ImageView ihoteles = (ImageView) view.findViewById(R.id.ihoteles);

        Spinner spinner = (Spinner) view.findViewById( R.id.hoteles_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(),R.array.hoteles_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        return inflater.inflate(R.layout.fragment_hotel, container, false);
    }

}
