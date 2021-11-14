package com.company;

public class PC {
    public int memorija;
    public String tipNaMemorija;
    public int hardDisk;
    public String golemina="GB";
    public String ssd;

    public PC() {
        this.memorija = 2;
        this.tipNaMemorija = "DDR4";
        this.hardDisk = 160;
        this.golemina = "GB";
        this.ssd = "SSD m.2";
    }

    public void PrvMetod (int zgolemiMemorija, int novSSDDisk){
        System.out.println("Memorijata beshe:"+" "+this.memorija+golemina+" "+"Sega iznesuva"+" "+(zgolemiMemorija+golemina));
        System.out.println("Tipot na memorijata e:"+" "+tipNaMemorija);
        System.out.println("Noviot disk e:"+" "+novSSDDisk+" "+"Ima golemina od:"+" "+(novSSDDisk+golemina));
        System.out.println("Prethodno imavme Disk i znesuvashe"+" "+hardDisk+golemina);
    }
}

