package HomeWork_Lession6;

public class DivModelRac extends CalcModelRac {

    @Override
    public String result() {
        int x;
        int y;
        x = x1 * y2;
        y = y2 * x1;
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

