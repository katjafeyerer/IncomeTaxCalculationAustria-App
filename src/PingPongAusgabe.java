public class PingPongAusgabe {
    public static void main(String[] args) {

        //fori --> dadurch ein Codesnipped generiert

        for (int number = 1; number < 100; number++) {
            if (number % 6 ==0) {
                System.out.println(number + " pingpong");
            }
            else if (number % 3 ==0) {
                System.out.println(number + " pong");
            }
            else if (number %2 ==0) {
                    System.out.println(number + " ping");
            }
            else {
                System.out.println(number + " -");
            }
        }

    }
}
