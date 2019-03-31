public class Test_11 {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        switch ("+") {
            case "+":
                if(a < b){
                    System.out.println(a);
                }else{
                    System.out.println(b);
                }
                break;
            case "":
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
