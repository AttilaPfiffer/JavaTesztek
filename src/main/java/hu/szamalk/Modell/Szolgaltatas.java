package hu.szamalk.Modell;

import java.util.ArrayList;

public class Szolgaltatas {
    private ArrayList<String> nevek;

    public int nevekDb() {
        return nevek.size();
    }

    public String[] getNevek() {
        String[] s = new String[nevek.size()];
        return nevek.toArray(s);
    }

    public Szolgaltatas() {
        this(new ArrayList<>());
    }

    public Szolgaltatas(String nev) {
        this(new ArrayList<>());
        nevek.add(nev);
    }

    public Szolgaltatas(ArrayList<String> nevek) {
        this.nevek = nevek;
    }



    public void setNevek(ArrayList<String> nevek) {
        this.nevek = nevek;
    }




}
