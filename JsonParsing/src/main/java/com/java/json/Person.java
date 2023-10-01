package com.java.json;

public class Person {
	
	
	
	private String name;
	
	private String favoritegame;
	
	private String subscriber;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFavoritegame() {
		return favoritegame;
	}

	public void setFavoritegame(String favoritegame) {
		this.favoritegame = favoritegame;
	}

	public String getSubscriber() {
		return subscriber;
	}

	public void setSubscriber(String subscriber) {
		this.subscriber = subscriber;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", favoritegame=" + favoritegame + ", subscriber=" + subscriber + "]";
	}
	
	

	
	

}
