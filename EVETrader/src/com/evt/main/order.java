package com.evt.main;

public class order {

	long order_id;
    int type_id;
    long location_id;
    long volume_total;
    float price;
     	
	public order(long order_id, int type_id, long location_id, long volume_total, float price) {
		super();
		this.order_id = order_id;
		this.type_id = type_id;
		this.location_id = location_id;
		this.volume_total = volume_total;
		this.price = price;
	}

	public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
	}

	public long getOrder_id() {
		return order_id;
	}

	public void setOrder_id(long order_id) {
		this.order_id = order_id;
	}

	public int getType_id() {
		return type_id;
	}

	public void setType_id(int type_id) {
		this.type_id = type_id;
	}

	public long getLocation_id() {
		return location_id;
	}

	public void setLocation_id(long location_id) {
		this.location_id = location_id;
	}

	public long getVolume_total() {
		return volume_total;
	}

	public void setVolume_total(long volume_total) {
		this.volume_total = volume_total;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
		
		
        
}
