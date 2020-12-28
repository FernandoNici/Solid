public interface Developer {

	public void developmentOfSolution();

	public Boolean isDevelopmentFinished();

	public void analyzeIssue(String issue);

	public String getName();
}


/*
Falta de coesão — uma classe não deve assumir responsabilidades que não são suas;
Alto acoplamento — Mais responsabilidades geram um maior nível de dependências, deixando o sistema engessado e frágil para alterações;
Dificuldades na implementação de testes automatizados — É difícil de “mockar” esse tipo de classe;
Dificuldades para reaproveitar o código;
*/