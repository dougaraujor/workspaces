package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
    private Integer id;
    private Date moment;
    private OrderStatus status;

    // Construtor
    public Order() {
    }

    // Construtor com argumentos
    public Order(Integer id, Date moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    // Get,Setters ID
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    //

    // Get,Setter moment
    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }
    //

    // Get,Setters status
    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public String toString() {
        return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
    }

}
