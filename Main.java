import java.util.Scanner;
class Main{
    public static void main (String[]args){
        try(Scanner e = new Scanner(System.in)){
            // Creating a new object of the class Tv.
            Tv tv1 = new Tv();
            // Declaring a variable called opcao.
            int opcao;
            do{
                // Printing a menu to the user.
                System.out.println("Escolha uma opção: \n 1 - Aumentar o volume; \n 2 - Diminuir o volume; \n 3 - Subir canal; \n 4 - Descer canal; \n 5 - Desligar TV; \n 6 - Ligar TV. \n 7 - Mostrar status. ");
                // Reading the user's input.
                opcao = e.nextInt();
                // Checking if the tv is turned off and if the user's input is not 6.
                while (tv1.ligado==false && opcao != 6){
                    System.out.println("Sua televisão ainda não foi ligada. Aperte 6 para ligá-la");
                    opcao = e.nextInt();
                }
                switch (opcao){
                    case 1:
                        tv1.setAumentarVolume(true);
                    break;
                    case 2:
                        tv1.setDiminuirVolume(true);
                    break;
                    case 3:
                        tv1.setSubirCanal(true);
                    break;
                    case 4:
                        tv1.setDescerCanal(true);
                    break;
                    case 5:
                        tv1.setDesligarTv(true);
                    break;
                    case 6:
                        tv1.setLigarTv(true);
                    break;
                    case 7:
                        tv1.retornStatus();
                    break;
                    default:
                        System.out.println("A opção selecionada é inválida, escolha outra opção.");
                    break;
                }
            }while(tv1.ligado==true);
        }
    }
}