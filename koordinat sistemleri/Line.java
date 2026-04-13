public class Line {

    private Point start;
    private Point end;


    Line() {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public double length(){
        return start.distanceFromPoint(end);

    }
    @Override
    public String toString() {
        return start.toString()+","+end.toString();
    }



}
