public class Usuario {
    public static void main(String[] args) throws Exception{
       
        SmartTV smartv = new SmartTV();

        System.out.println("TV Ligada ? " + SmartTV.ligada);
        System.out.println("Canal Atual ? " + SmartTV.canal);
        System.out.println("Volume atual ? " + SmartTV.volume);
    }
}
