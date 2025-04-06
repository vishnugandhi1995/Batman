public class Myfirstclass {





    public static void main(String[] args){

        String input = "vishnu";
        String Reverse = "";
        for(int i = input.length() - 1; i>=0; i--){
            Reverse += input.charAt(i);
        }
        System.out.println("reverse of the "+Reverse);

    }



}
