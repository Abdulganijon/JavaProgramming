package homework.day39_inheritance.app;

public class App {
     String appName;
     double version;

    public App(String appName, double version) {
        this.appName = appName;
        this.version = version;
    }
    public void download(){
        System.out.println(appName + " is downloading version: " + version);
    }

    @Override
   public String toString() {
        return "App{" +
               "appName='" + appName + '\'' +
                ", version=" + version +
               '}';
    }
}
