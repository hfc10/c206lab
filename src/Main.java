//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Nadador nadador1 = new Nadador();
        Corredor corredor1 = new Corredor();
        Ciclista ciclista1 = new Ciclista();

        nadador1.treinar();
        corredor1.treinar();
        ciclista1.treinar();


        corredor1.colocarEquipamento();
        ciclista1.colocarEquipamento();


    }
}