package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="trading")
public class Access {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hotelid")
    private Long hotelid;
	

	@Column(name = "hotelname")
    private String hotelname;

    public String hotelname() {
		return hotelname;
	}

	public void sethotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	//@Column(name = "hoteladdress")
	public String hoteladdress() {
		return hoteladdress;
	}

	public void sethoteladdress(String hoteladdress) {
		this.hoteladdress = hoteladdress;
	}

	