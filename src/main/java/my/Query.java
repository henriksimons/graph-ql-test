package my;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import java.util.List;

public class Query implements GraphQLQueryResolver {

    private final CupService cupService;

    public Query(CupService cupService) {
        this.cupService = cupService;
    }

    private List<Cup> getCupsBySize(String size) {
        return cupService.getCupsBySize(size);
    }

    private List<Cup> getAllCups() {
        return cupService.getCups();
    }
}
