import jdk.internal.jline.internal.TestAccessible;

public class Calc {
    @TestAccessible
    @Test
    public void bala(){
        int a = 1;
        int b = 2;
        int sum = a + b;

        System.out.println(sum);
    }
}
