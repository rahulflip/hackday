package com.entity;

        import javax.persistence.*;
        import java.util.Date;

@Entity
@Table(name="order_dh_map")
public class OrderDHMap {

    @Id
    @GeneratedValue
    @Column(name = "id")
    Integer id;

    @Column(name = "order")
    Integer order;

    @Column(name = "dh_id")
    Integer dhId;

    @Column(name = "date")
    Date date;
    


    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getDh_id() {
        return dhId;
    }

    public void setDh_id(Integer dhId) {
        this.dhId = dhId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
