package day24_loops;

public class YoutubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        int seconds = 0;
        //video is 1 min 57 sec
        //While we did not reach to last second - print Watching Youtube video: second 1
        //at the end print - Finished watching Cat video, let's start from the beginning

        System.out.println("World's smallest cat \uD83D\uDC08 - BBC video");
        while (seconds <= 117){
            System.out.println("Watching \uD83D\uDC08 at second:" + seconds);
            seconds++;
            Thread.sleep(1000);  // zabavia go i kato pechati doly v konzolata e na vsiaka sekunda print-a

        }
        System.out.println("Finished watching the \uD83D\uDC08 video");
        System.out.println("Let's watch another one");
    }


}
