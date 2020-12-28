import static java.lang.Boolean.TRUE;
import static java.lang.System.err;
import static java.lang.System.out;

public class CodeCommiter {

    Developer developer;

    public CodeCommiter(Developer developer) {
        this.developer = developer;
    }

    public void commitCode() {
        if (!developer.isDevelopmentFinished()) {
            err.println("Process not done yet");
        }

        try {
            commitSolution();
        } catch (MergeProblemsException e) {
            resolveConflictAndCommit();
        } catch (Exception ex) {
            err.println("Not expected !! Nothing was commited");
            err.println(String.format("[%s]: Sabia não!", developer.getName()));
        }
    }

    private void commitSolution() throws MergeProblemsException {
        throw new MergeProblemsException();
//        throw new NullPointerException();
//        out.println("Solução commitada no git");
    }

    private void resolveConflictAndCommit(){
        out.println("Conflito resolvido,  código mergeado e commitado");
    }

}
