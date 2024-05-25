package Practica1;

public class Main {
    /*
    Creati clasele: Cerc si Dreptunghi; si interfetele: Forma si Semn;

    Pentru a crea semne , trebuie sa realizam forme destul de mari pentru a se potrivi textului pentru semn

    Scrieti o metoda pe Forma -> fitText(), care ia textul ca argument si determina daca lungimea textului este
    mai mica decat lungime/raza forme. Puteti obtine lungimea unui String apeland lungimea metodei pe String.

     */

    public static void main(String[] args) {
        Cerc cerc = new Cerc(5, "rosu");
        Dreptunghi dreptunghi = new Dreptunghi("maro", 10, 15);
        System.out.println();

        System.out.println(cerc);
        System.out.println(dreptunghi);

        System.out.println();


        String text = "Acest text este prea lung pentru un cerc";

        if (cerc.fitText(text)) {
            System.out.println("Textul se potrivește pe cerc");
        } else {
            System.out.println("Textul nu se potrivește pe cerc");
        }

        if (dreptunghi.fitText(text)) {
            System.out.println("Textul se potrivește pe dreptunghi");
        } else {
            System.out.println("Textul nu se potrivește pe dreptunghi");
        }

         // DE REFACUT PENTRU JOI!
    }
}
