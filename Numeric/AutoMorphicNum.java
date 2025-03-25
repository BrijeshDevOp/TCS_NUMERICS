public class AutoMorphicNum {
    public static void main(String[] args) {
        int num = 6;
        int temp = num;
        int sqr = num * num;
        int count = 1;

        while (num != 0) {
            count = count * 10;
            num = num / 10;
        }

        if (sqr % count == temp)
            System.out.println(" It is Automorphic ");
        else
            System.out.println(" Not Automorphic ");
    }
}
