package com.simplilearn.backend.entiry;

import java.util.List;

import javax.persistence.ManyToOne;

public class Category {

	private int id;
	private String name;
	private List<Product> products;
}
