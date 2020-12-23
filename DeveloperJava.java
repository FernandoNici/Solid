import static java.lang.Boolean.TRUE;
import static java.lang.System.err;
import static java.lang.System.out;

public class DeveloperJava implements Developer {

    private String name;

    private String issue;
    
    private Boolean isDevelopmentFinished = Boolean.FALSE;

    private Boolean isIssueAnalyzed = Boolean.FALSE;

    private Boolean isSolutionCommited = Boolean.FALSE;

    // Verificar possibilidade de aplicas state

    public DeveloperJava(String name, String issue) {
        this.name = name;
        this.issue = issue;
    }

    @Override
    public void developmentOfSolution() {
        analyzeIssue(this.issue);

        out.println(String.format("Solução desenvolvida em Java pelo [%s]", this.name));

        try {
            commitSolution();
            this.isDevelopmentFinished = TRUE;
        } catch (MergeProblemsException e) {
            resolveConflictAndCommit();
        } catch (Exception ex) {
            err.println("Not expected !! Nothing was commited");
            err.println(String.format("[%s]: Sabia não!", name));
        }

        if (isAllProcessDone()) {
            out.println(String.format("Parabéns [%s] pelo trabalho!", this.name));
        }
    }

    @Override
    public void commitSolution() throws MergeProblemsException {
        throw new MergeProblemsException();
//        throw new NullPointerException();
//        out.println("Solução commitada no git");
//        this.isSolutionCommited = TRUE;
//        this.isDevelopmentFinished = TRUE;
    }

    private void analyzeIssue(String issue) {
        out.println(String.format("Issue analisada [%s]", issue));
        this.isIssueAnalyzed = TRUE;
    }

    private void resolveConflictAndCommit(){
        out.println("Conflito resolvido,  código mergeado e commitado");
        this.isSolutionCommited = TRUE;
        this.isDevelopmentFinished = TRUE;
    }

    public Boolean isAllProcessDone() {
        return isIssueAnalyzed &&
                isSolutionCommited &&
                isDevelopmentFinished;
    }
}
