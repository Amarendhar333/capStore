package com.capgemini.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CartItem implements Serializable{

    private static final long serialVersionUID = -6050058936968302003L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="cart_item_id")
    private Long cartItemId;


    @OneToOne
    @JoinColumn(name="product_id")
    private Product product;
    
    @Column(name="total_price_double")
    private double totalPriceDouble;

    @Column(name="quantity")
    private int quantity;

    

    public Long getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(Long cartItemId) {
		this.cartItemId = cartItemId;
	}

	/*public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }*/

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

	public double getTotalPriceDouble() {
		return totalPriceDouble;
	}

	public void setTotalPriceDouble(double totalPriceDouble) {
		this.totalPriceDouble = totalPriceDouble;
	}
}

