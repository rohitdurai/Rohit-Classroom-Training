package Array;

public class VarArgDemo {
    static int doSum(int[] data){
        int sum=0;
        for (int i=0; i<data.length; i++){
            sum+= data[i];

        }
        return sum;
    }
    static int doSum2(int...data){
        int sum=0;
        for (int i=0; i<data.length; i++){
            sum+= data[i];

        }
        return sum;
    }
    public static void main(String[] args) {
        int[]array = {10,2,30};
    int sum1 = doSum(array);
    int sum2 = doSum2(10,2,5,8,996,55,69,55);
        System.out.println(+sum1);
        System.out.println(+sum2);
    }
}
