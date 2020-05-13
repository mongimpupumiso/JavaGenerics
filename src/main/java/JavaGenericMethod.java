public class JavaGenericMethod {

    public static class GenericMethod {


        public static < E > void printArrayContent( E[] inputArray ) {
            for(E element : inputArray) {
                System.out.printf("%s ", element);
            }
        }
        public static void main(String[] Args){
            Integer[] IntArray ={5,10,15,20,25};
            String[] stringArray = {"five","ten","fifteen","twenty","twenty five"};

            GenericMethod.printArrayContent(stringArray);
            System.out.println();
            GenericMethod.printArrayContent(IntArray);

        }
    }

}
