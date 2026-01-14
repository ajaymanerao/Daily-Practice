import java.util.concurrent.TimeUnit;

public class SongMessage {
    public static void main(String[] args) {
        String[] lyrics = {
            "Mein ab kyun hosh may aata nahi?",
            "Sukoon yeh dil kyun paata nahi?",
            "Kyun torrun khud se jo thay waaday",
            "Ke ab yeh ishq nibhaana nahi?",
            "Mein morrun tum se jo yeh chehra",
            "Dobara nazar milana nahi",
            "Yeh duniya jaanay mera dard",
            "Tujhe yeh nazar kyun aata nahi?"
        };

        //double[] delays = {2.0, 1, 2, 2, 1.7, 2.0, 1.9, 2.2};
         
         try {
            TimeUnit.MILLISECONDS.sleep(500);

            for (int i = 0; i < lyrics.length; i++) {
                typeEffect(lyrics[i]);
               // TimeUnit.SECONDS.sleep((long) delays[i]);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void typeEffect(String line) throws InterruptedException {
        for (char ch : line.toCharArray()) {
            System.out.print(ch);
            TimeUnit.MILLISECONDS.sleep(30);
        }
        System.out.println();
    }
}
