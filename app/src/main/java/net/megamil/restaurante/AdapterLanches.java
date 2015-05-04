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

public class AdapterLanches extends BaseAdapter {

    private static final NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    private List<ObjetoLanche> lanches;
    private LayoutInflater inflater;

    public AdapterLanches(Context context, List<ObjetoLanche> lanches){
        this.lanches = lanches;
        inflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return lanches.size();
    }

    @Override
    public Object getItem(int position) {
        return lanches.get(position);
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
            vh.acompanhamento = (TextView) view.findViewById(R.id.acompanhamento);
            vh.preco = (TextView) view.findViewById(R.id.preco);
            view.setTag(vh);
        } else {
            vh = (ViewHolder) view.getTag();
        }

        ObjetoLanche lanche = lanches.get(position);

        if(lanche.getAcompanhamento() != "") {

            vh.acompanhamento.setText("Acompanha: " + lanche.getAcompanhamento());

        } else {

            vh.acompanhamento.setText("");

        }

        vh.nome.setText(lanche.getNome());
        vh.preco.setText(nf.format(lanche.getPreco()));

        //Trazer imagem pelo id como String (Passado pelo construtor)
        Context context = vh.img.getContext();
        int id = context.getResources().getIdentifier(lanche.getImg(), "drawable", context.getPackageName());
        vh.img.setImageResource(id);

        return view;
    }

    private static class ViewHolder {
        public ImageView img;
        public TextView nome;
        public TextView acompanhamento;
        public TextView preco;
    }

}
