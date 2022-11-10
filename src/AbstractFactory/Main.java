package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        FilmesAcaoFactory filmeAcao = new FilmesAcaoFactory();
        IFilmeBrasileiro filmeAcaoBR = filmeAcao.getFilmeBrasileiro();
        IFilmeAmericano filmeAcaoUS = filmeAcao.getFilmeAmericano();

        System.out.println(filmeAcaoBR.nomeFilme());
        System.out.println(filmeAcaoUS.nomeFilme());

        FilmesComediaFactory filmeComedia = new FilmesComediaFactory();
        IFilmeBrasileiro filmeComediaBR = filmeComedia.getFilmeBrasileiro();
        IFilmeAmericano filmeComediaUS = filmeComedia.getFilmeAmericano();

        System.out.println(filmeComediaBR.nomeFilme());
        System.out.println(filmeComediaUS.nomeFilme());
    }
}
