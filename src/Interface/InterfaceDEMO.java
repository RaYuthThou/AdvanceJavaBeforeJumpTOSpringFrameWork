package Interface;

public class InterfaceDEMO {
    public static void main(String[] args){
        ABA aba = new ABA();
        aba.payment(1000);

        CriditCard criditCard = new CriditCard();
        criditCard.payment(2000);
    }
}
