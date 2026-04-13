public class Point {

    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;

    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(x=" + this.x + ",y= " + this.y + ")";
    }


    public double distanceFromPoint(Point dısarıdanGelen) {

        int farkX = this.x - dısarıdanGelen.getX();
        int farkY = this.y - dısarıdanGelen.getY();

        double toplam = Math.pow(farkX, 2) + Math.pow(farkY, 2);
        return Math.sqrt(toplam);


    }


}
