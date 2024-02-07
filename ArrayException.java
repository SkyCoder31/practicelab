public class ArrayException {
    public static void main(String[] args) {
        int[] arr=new int[4];
        try {
            int i=arr[4];
            System.out.println("execute");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
