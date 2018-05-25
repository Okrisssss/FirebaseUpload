package apple.example.com.firebaseupload;

public class Upload {

    public Upload(String name, String url) {
        this.name = name;
        this.url = url;
    }

    private String name;
    private String url;

    public Upload (){}


    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
