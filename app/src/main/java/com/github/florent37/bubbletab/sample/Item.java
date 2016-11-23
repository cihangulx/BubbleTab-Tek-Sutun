package com.github.florent37.bubbletab.sample;

/**
 * Created by Cihan on 23.11.2016.
 */

public class Item  {
   private String isim;
    private int resim;

    public Item(String isim, int resim) {
        this.isim = isim;
        this.resim = resim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getResim() {
        return resim;
    }

    public void setResim(int resim) {
        this.resim = resim;
    }
}
