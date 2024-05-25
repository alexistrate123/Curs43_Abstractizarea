package Practica1;

public class Dreptunghi implements Forma {
    String culoare;
    int latime;
    int lungime;

    public Dreptunghi(String culoare, int latime, int lungime) {
        this.culoare = culoare;
        this.latime = latime;
        this.lungime = lungime;
    }


    @Override
    public boolean fitText(String text) {
        return text.length() < lungime;
    }

    @Override
    public String toString() {
        return "Dreptunghi{" +
                "culoare='" + culoare + '\'' +
                ", latime=" + latime +
                ", lungime=" + lungime +
                '}';
    }
}
