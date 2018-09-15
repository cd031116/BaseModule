package base.lyj.com.myuibase.bean;

import java.io.Serializable;

public class MainData implements Serializable{

    private String title;

    private int tId;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public MainData(String title, int tId) {
        this.title = title;
        this.tId = tId;
    }
}
