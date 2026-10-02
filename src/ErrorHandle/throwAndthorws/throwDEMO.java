package ErrorHandle.throwAndthorws;

public class throwDEMO {
    public static void main(String[] args) throws Exception , RuntimeException{
        int age = 19;
        if(age < 18){
            throw new Exception("Age under 18 can't vote");
        }
        if(age > 18){
//            unchecked or runtime no need to throws at the first not like
//            to the check exception
            throw new RuntimeException("you can vote");
        }
        System.out.println("Can vote");
    }
}
