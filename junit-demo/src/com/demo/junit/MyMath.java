package  com.demo.junit;

public class MyMath {

    public int Sum(int[] numbers){
        var sum = 0;
        for (var n : numbers){
            sum +=n;
        }
        return sum;
    }
}
