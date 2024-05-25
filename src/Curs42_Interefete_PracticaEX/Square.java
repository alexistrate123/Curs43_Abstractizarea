package Curs42_Interefete_PracticaEX;

public class Square implements  RegularPolygon {
    int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int getNumSides() {
        return 4;
    }

    @Override
    public int getSideLength() {
        return this.sideLength;
    }


}
