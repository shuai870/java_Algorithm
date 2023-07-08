public class Hw {
    //计算回文数

    public int a,b,c,d,e;
    public int X = 0;
    public void find() {
        for (int i = 10000; i <= 99999; i++) {
            a = i/10000;
            b = i/1000%10;
            c = i/100%10;
            d = i/10%10;
            e = i%10;
            if(a==e && b==d){
                System.out.println(i);
                X++;
            }

        }
        System.out.println("回文数一共有"+X);
    }

}
