package application.viewmodel.homelanding;

import java.util.ArrayList;
import java.util.List;

public class MenuItemVM {
    private String text;
    private String link;
    private List<MenuItemVM> child;

    public MenuItemVM(String text, String link) {
        this.text = text;
        this.link = link;
        this.child = new ArrayList<>();

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<MenuItemVM> getChild() {
        return child;
    }

    public void setChild(List<MenuItemVM> child) {
        this.child = child;
    }
}
