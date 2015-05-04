package net.megamil.restaurante;


import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.Locale;

public class ListaPratosFragment extends android.support.v4.app.ListFragment {

    private static final NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    private AdapterPratos ap;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ap = new AdapterPratos(getActivity(), ObjetoPrato.JsonChamada());

        setListAdapter(ap);

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        //super.onListItemClick(l, v, position, id);

        ObjetoPrato prato = (ObjetoPrato) ap.getItem(position);

        Toast.makeText(getActivity(), "Prato: " + prato.getNome() + " Preço: " + nf.format(prato.getPreco()), Toast.LENGTH_LONG).show();

    }
}
