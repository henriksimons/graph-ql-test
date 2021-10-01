package my;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CupService {

    private List<Cup> cups;

    public CupService() {
        cups = init();
    }

    public List<Cup> init() {
        Cup cup0 = new Cup("small", "espresso");
        Cup cup1 = new Cup("medium", "cappuccino");
        Cup cup2 = new Cup("large", "latte");
        Cup cup3 = new Cup("large", "brew");
        return Arrays.asList(cup0, cup1, cup2, cup3);
    }

    public List<Cup> getCups(String size) {
        return cups.stream()
                .filter(cup -> cup.getSize().equals(size))
                .collect(Collectors.toList());
    }

    public List<Cup> getCups() {
        return cups;
    }
}
