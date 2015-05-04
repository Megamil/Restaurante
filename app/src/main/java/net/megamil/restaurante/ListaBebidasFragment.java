package net.megamil.restaurante;


import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.Locale;

public class ListaBebidasFragment extends android.support.v4.app.ListFragment {

    private static final NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    private AdapterBebidas ab;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ab = new AdapterBebidas(getActivity(), ObjetoBebida.JsonChamada());

        setListAdapter(ab);

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        //super.onListItemClick(l, v, position, id);

        ObjetoBebida bebida = (ObjetoBebida) ab.getItem(position);

        Toast.makeText(getActivity(), "Bebida: " + bebida.getNome() + " Preço: " + nf.format(bebida.getPreco()), Toast.LENGTH_LONG).show();

    }
}