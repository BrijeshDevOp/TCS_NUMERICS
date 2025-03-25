public class TowerOfHanoi {
    static void towerOfHanoi(int n, char from, char to, char aux) {

        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        } else {

            towerOfHanoi(n - 1, from, aux, to);
            System.out.println("Move disk " + n + " from " + from + " to " + to);

            towerOfHanoi(n - 1, aux, to, from);
        }

    }

    public static void main(String[] args) {
        int n = 5;
        towerOfHanoi(n, 'A', 'B', 'C');
    }

}
