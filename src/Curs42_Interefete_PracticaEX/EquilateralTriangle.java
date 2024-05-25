package Curs42_Interefete_PracticaEX;

public class EquilateralTriangle implements RegularPolygon{
    int sideLength;

    public EquilateralTriangle(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int getNumSides() {
        return 3;
    }

    @Override
    public int getSideLength() {
          return this.sideLength;
    }


}
