package database;

import java.util.ArrayList;
import java.util.List;

import models.Vol;

public class VolsBD {
    private static List<Vol> vols = new ArrayList<Vol>();
    static {
        vols.add(new Vol("SXB123", "Strasbourg", "Paris", 1250));
        vols.add(new Vol("SXB127", "Strasbourg", "Paris", 1420));
        vols.add(new Vol("CDC129", "Poitiers", "Paris", 1710));
    }

    public static List<Vol> getVols() {
        return vols;
    }

    public static Vol getVolById(String id) {
        for (Vol vol : vols) {
            if (vol.getNumVol().equals(id)) {
                return vol;
            }
        }
        return new Vol(id, "-", "-", 0);
    }

    public static Vol getVolByParam(String departure, String arrival, int departureTime) {
        for (Vol vol : vols) {
            if (vol.getVilleDepart().equals(departure) && vol.getVilleArrivee().equals(arrival) && vol.getHeureDepart() == departureTime) {
                return vol;
            }
        }
        return new Vol("No flight matches", "-", "-", 0);
    }
    
}