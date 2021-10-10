package my;

import graphql.schema.DataFetcher;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CupService {

    private final List<Cup> cups;

    public CupService() {
        cups = init();
    }

    private List<Cup> init() {
        Cup brew = Cup.builder().withSize("medium").withLiquid("brew").build();
        Cup cappuccino = Cup.builder().withSize("small").withLiquid("cappuccino").build();
        Cup espresso = Cup.builder().withSize("small").withLiquid("espresso").build();
        Cup latte = Cup.builder().withSize("large").withLiquid("latte").build();
        return Arrays.asList(brew, cappuccino, espresso, latte);
    }

    public List<Cup> getCupsBySize(String size) {
        return cups.stream()
                .filter(cup -> cup.getSize().equals(size))
                .collect(Collectors.toList());
    }

    public List<Cup> getCups() {
        return cups;
    }

    public DataFetcher<List<Cup>> getCupsBySizeDataFetcher() {
        return dataFetchingEnvironment -> {
            String size = dataFetchingEnvironment.getArgument("size");
            return getCupsBySize(size);
        };
    }

    public DataFetcher<List<Cup>> getAllCupsDataFetcher() {
        return dataFetchingEnvironment -> getCups();
    }
}
