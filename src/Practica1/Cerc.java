package Practica1;

public class Cerc implements Forma {
    private double raza;
    String culoare;

    public Cerc(double raza, String culoare) {
        this.raza = raza;
        this.culoare = culoare;
    }
    @Override
    public boolean fitText(String text) {
        return text.length() * 0.5 < 2 * Math.PI * raza;
    }

    @Override
    public String toString() {
        return "Cerc{" +
                "raza=" + raza +
                ", culoare='" + culoare + '\'' +
                '}';
    }
}
