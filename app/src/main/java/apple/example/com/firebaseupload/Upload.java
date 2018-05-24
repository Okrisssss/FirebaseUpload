package apple.example.com.firebaseupload;

public class Upload {

    private String name;
    private String url;

    public Upload(String name, String url) {
        this.name = name;
        this.url = url;

    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
