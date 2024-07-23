package com.redis.entity;

import java.io.Serializable;

import org.springframework.data.redis.core.RedisHash;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@RedisHash("Product")
public class Product implements Serializable{
	private int id;
	private String name;
	private int qty;
	private long price;

}
