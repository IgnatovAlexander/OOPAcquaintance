package HomeWork_Lession6;

public class SumModelRac extends CalcModelRac {

    @Override
    public String result() {
        int x;
        int y;
        x = (x1 * y2) + (x2 * y1);
        y = y1 * y2;
        return x + "/" + y;
    }

    @Override
    public void setX1(int value) {
        super.x1 = value;
    }

    @Override
    public void setY1(int value) {
        super.y1 = value;
    }

    @Override
    public void setX2(int value) {
        super.x2 = value;
    }

    @Override
    public void setY2(int value) {
        super.y2 = value;
    }

}

