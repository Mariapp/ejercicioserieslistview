package com.example.didact.ejercicioserieslistview; /**
 * Created by DIDACT on 21/02/2018.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class Adaptadorseries extends ArrayAdapter<Serie> {
    ArrayList<Serie> series;
    Context c;
    public Adaptadorseries(Context c, ArrayList<Serie> coches) {
        super(c, R.layout.item_series, coches);
        this.series = coches;
        this.c = c;
    }
    public View getView(int position, View view, ViewGroup
            viewGroup) {
        LayoutInflater inflater =
                LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.item_series, null);

        TextView tvnombre = (TextView)
                item.findViewById(R.id.tvnombre);
        tvnombre.setText(series.get(position).getNombre() );

        TextView tvtemporadas = (TextView)
                item.findViewById(R.id.tvtemporadas);
        tvtemporadas.setText(series.get(position).getTemporadas() );


        TextView tvcapitulos = (TextView)
                item.findViewById(R.id.tvcapitulos);
        tvcapitulos.setText(series.get(position).getCapitulos() );


        TextView tvaño = (TextView)
                item.findViewById(R.id.tvaño);
        tvaño.setText(series.get(position).getAño() );

        TextView resumen = (TextView)
                item.findViewById(R.id.tvresumen);
        resumen.setText(series.get(position).getResumen() );






        String genero = series.get(position).getGenero();
        int idImagen = c.getResources().getIdentifier(genero,
                "drawable", c.getPackageName());
        ImageView imggenero = (ImageView)
                item.findViewById(R.id.imggenero);
        imggenero.setImageResource(idImagen);





        return item;
    }

    }





