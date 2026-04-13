import java.util.ArrayList;

public class PolyLine {

    private ArrayList<Point> noktaListesi = new ArrayList<>();


    public PolyLine() {
    }


    public PolyLine(Line cizgi) {
        noktaListesi.add(cizgi.getStart());
        noktaListesi.add(cizgi.getEnd());
    }


    public void addPoint(Point nokta) {
        noktaListesi.add(nokta);
    }


    public void addLine(Line cizgi) {
        noktaListesi.add(cizgi.getStart());
        noktaListesi.add(cizgi.getEnd());
    }


    public void addPolyLine(PolyLine diger) {

        for (int i = 0; i < diger.noktaListesi.size(); i++) {

            Point p = diger.noktaListesi.get(i);

            noktaListesi.add(p);
        }
    }


    @Override
    public String toString() {
        String sonuc = "[";

        for (int i = 0; i < noktaListesi.size(); i++) {
            sonuc += noktaListesi.get(i).toString();

            if (i < noktaListesi.size() - 1) {
                sonuc += ", ";
            }
        }

        sonuc += "]";
        return sonuc;
    }
}









