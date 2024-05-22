package com.domain.demo.entities;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "tb_order")
@Entity
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Instant instante;
	private OrderStatus status;

	@OneToMany(mappedBy = "order")
	private List<OrderItem> items = new ArrayList<>();
	
	@JoinColumn(name = "client_id")
	@ManyToOne
	private Client client;

	public Order(Long id, Instant instante, OrderStatus status, Client client) {
		super();
		this.id = id;
		this.instante = instante;
		this.status = status;
		this.client = client;
	}
	
	public double getTotal() {
		double som = 0.0;
		for(OrderItem item : items) {
			som = som + item.getSubTotal();
		}
		return som;
	}
}
