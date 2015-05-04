package net.megamil.restaurante;


import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.Locale;

public class ListaLanchesFragment extends android.support.v4.app.ListFragment {

    private static final NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    private AdapterLanches al;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        al = new AdapterLanches(getActivity(), ObjetoLanche.JsonChamada());

        setListAdapter(al);

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        //super.onListItemClick(l, v, position, id);

        ObjetoLanche lanche = (ObjetoLanche) al.getItem(position);

        Toast.makeText(getActivity(), "Lanche: " + lanche.getNome() + " Preço: " + nf.format(lanche.getPreco()), Toast.LENGTH_LONG).show();

    }
}
