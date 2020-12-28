import static java.lang.Boolean.TRUE;
import static java.lang.System.err;
import static java.lang.System.out;

public class DeveloperJava implements Developer {

    private String name;

    private String issue;
    
    private Boolean isDevelopmentFinished = Boolean.FALSE;

    private Boolean isIssueAnalyzed = Boolean.FALSE;

    public DeveloperJava(String name, String issue) {
        this.name = name;
        this.issue = issue;
    }

    @Override
    public void developmentOfSolution() {
        analyzeIssue(this.issue);

        out.println(String.format("Solução desenvolvida em Java pelo [%s]", this.name));

        isDevelopmentFinished = TRUE;
    }

    @Override
    public void analyzeIssue(String issue) {
        out.println(String.format("Issue analisada [%s]", issue));
        this.isIssueAnalyzed = TRUE;
    }

    @Override
    public Boolean isDevelopmentFinished() {
        return this.isDevelopmentFinished;
    }

    @Override
    public String getName() {
        return name;
    }
}
