package homework.day39_inheritance.app;

public class User {
    public static void main(String[] args) {
        Instagram insta = new Instagram("Instagram", 2.5);
        System.out.println(insta);

        Youtube youtube = new Youtube (2.6);
        System.out.println(youtube.appName);
        System.out.println(youtube.version);
        youtube.download();
        youtube.watchVideo();
        System.out.println(youtube);

    }



}
