package net.megamil.restaurante;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class AdapterBebidas extends BaseAdapter {

    private static final NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    private List<ObjetoBebida> bebibas;
    private LayoutInflater inflater;

    public AdapterBebidas(Context context, List<ObjetoBebida> bebibas){
        this.bebibas = bebibas;
        inflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return bebibas.size();
    }

    @Override
    public Object getItem(int position) {
        return bebibas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        ViewHolder vh;

        if (view == null) {

            view = inflater.inflate(R.layout.lista_item,parent,false);
            vh = new ViewHolder();

            vh.img = (ImageView) view.findViewById(R.id.img);
            vh.nome = (TextView) view.findViewById(R.id.nome);
            vh.preco = (TextView) view.findViewById(R.id.preco);
            view.setTag(vh);
        } else {
            vh = (ViewHolder) view.getTag();
        }

        ObjetoBebida bebida = bebibas.get(position);

        vh.nome.setText(bebida.getNome());
        vh.preco.setText(nf.format(bebida.getPreco()));

        //Trazer imagem pelo id como String (Passado pelo construtor)
        Context context = vh.img.getContext();
        int id = context.getResources().getIdentifier(bebida.getImg(), "drawable", context.getPackageName());
        vh.img.setImageResource(id);

        return view;
    }

    private static class ViewHolder {
        public ImageView img;
        public TextView nome;
        public TextView preco;
    }

}
