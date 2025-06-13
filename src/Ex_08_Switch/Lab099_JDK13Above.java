package Ex_08_Switch;

public class Lab099_JDK13Above {
    public static void main(String[] args) {

        int itemCode = 001;
        switch (itemCode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");
        }

    }

}
