package de.htw_berlin.de.BodyMassTrack;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class BmiData {
    private int alter;
    private double größe;
    private double gewicht;
    private LocalDate datum;

    public double getBmi() {
        if (größe <= 0) return 0;
        double berechneterBmi = gewicht / (größe * größe);
        return Math.round(berechneterBmi * 100.0) / 100.0;
    }
}
