public class Main {
    public static void main(String[] args) {
        Class<Aplicacao> classe = Aplicacao.class;
        TabelaAnnotition anotacaoClasse = classe.getAnnotation(TabelaAnnotition.class);
        
        System.out.println("Anotação da classe: " + anotacaoClasse.value());
    }
}