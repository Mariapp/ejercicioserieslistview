package com.example.didact.ejercicioserieslistview;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by DIDACT on 20/02/2018.
 */

public class Serie implements Parcelable {

    String nombre;
    String temporadas;
    String capitulos;
    String año;
    String genero;
    String resumen;

    public Serie(String nombre, String temporadas, String capitulos, String año, String genero, String resumen) {
        this.nombre = nombre;
        this.temporadas = temporadas;
        this.capitulos = capitulos;
        this.año = año;
        this.genero = genero;
        this.resumen = resumen;
    }

    protected Serie(Parcel in) {
        nombre = in.readString();
        temporadas = in.readString();
        capitulos = in.readString();
        año = in.readString();
        genero = in.readString();
        resumen = in.readString();
    }

    public static final Creator <Serie> CREATOR = new Creator <Serie>() {
        @Override
        public Serie createFromParcel(Parcel in) {
            return new Serie(in);
        }

        @Override
        public Serie[] newArray(int size) {
            return new Serie[size];
        }
    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(String temporadas) {
        this.temporadas = temporadas;
    }

    public String getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(String capitulos) {
        this.capitulos = capitulos;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.nombre);
        parcel.writeString(this.año);
        parcel.writeString(this.temporadas);
        parcel.writeString(this.capitulos);
        parcel.writeString(this.resumen);
        parcel.writeString(this.genero);

    }
    private void readFromParcel(Parcel p) {

        this.nombre = p.readString();
        this.capitulos = p.readString();
        this.temporadas = p.readString();
        this.resumen = p.readString();
        this.genero = p.readString();
        this.año = p.readString();



    }
}
