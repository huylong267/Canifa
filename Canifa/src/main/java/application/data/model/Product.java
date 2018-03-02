package application.data.model;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "tbl_product")
public class Product {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "productid")
    @Id
    private  int id;
    @Column(name ="name")
    private String name;
    @Column(name = "image")
    private String image;
    @Column(name ="short_desc")
    private  String short_desc;
    @Column(name = "create_date")
    private Date create_date;
    @Column(name = "price")
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getShort_desc() {
        return short_desc;
    }

    public void setShort_desc(String short_desc) {
        this.short_desc = short_desc;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }
}
