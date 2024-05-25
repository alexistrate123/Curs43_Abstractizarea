package Curs42_Interefete_PracticaEX;

import java.lang.reflect.Method;

public class Main {
    /*
Practic 2:

O interfata numita RegularPolygon cu doua metode abstracte: getNumSides() si getSideLength()

O clasa EquilateralTriangle care implementeaza interfata, are getNumSides() return 3 si getSideLength() returneaza o variabila
de instanta setata de constructor;

O clasa Square care implementeaza interfata, are are getNumSides() return 4 si getSideLength() returneaza o variabila
de instanta setata de constructor;

Adaugati o metoda statica getTotalSides(), care data unui regularPolygon, returneaza suma numarului de laturi ale tuturor
elementelor;

Adaugati 2 metode:
- getPerimeter()
- getInteriorAngle()


     */

    public static void main(String[] args) {
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(5);
        Square square = new Square(10);

        System.out.println("Triunghiul echilateral are " + getTotalSides(equilateralTriangle) + " laturi.");
        System.out.println("Patratul are " + getTotalSides(square) + " laturi.");
        System.out.println();
        System.out.println("Perimetrul triunghiului echilateral este: " + getPerimeter(equilateralTriangle));
        System.out.println("Perimetrul patratului este: " + getPerimeter(square));
        System.out.println();
        System.out.println("Unghiul interior al triunghiului echilateral este: " + getInteriorAngle(equilateralTriangle));
        System.out.println("Unghiul interior al patratului este: " + getInteriorAngle(square));


    }


    public static int getTotalSides(RegularPolygon regularPolygon) {
        return regularPolygon.getNumSides();
    }

    public static int getPerimeter(RegularPolygon regularPolygon1) {
        return regularPolygon1.getNumSides() * regularPolygon1.getSideLength();
    }

    public static int getInteriorAngle(RegularPolygon regularPolygon2) {
        return (int) ((regularPolygon2.getNumSides() - 2) * Math.PI / regularPolygon2.getNumSides());
    }


}
