public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoDoPlano = "plus";

        if (anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo");
        }else{
            System.out.println("Filme retrô que vale a pena assistir");
        }

        if (incluidoNoPlano || tipoDoPlano.equals("plus")){
            System.out.println("Filme Liberado");
        }else{
            System.out.println("Deve pagar a locação");
        }
    }
}