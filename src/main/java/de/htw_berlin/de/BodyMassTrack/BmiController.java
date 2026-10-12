package de.htw_berlin.de.BodyMassTrack;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class BmiController {
    @GetMapping(path = "/bmi")
    public ResponseEntity<List<BmiData>> getBmiRecords() {
        List<BmiData> records = new ArrayList<>();

        records.add(new BmiData(25, 1.80, 77.5, LocalDate.now().minusMonths(1)));
        records.add(new BmiData(25, 1.80, 75.0, LocalDate.now()));

        return ResponseEntity.ok(records);
    }
}
