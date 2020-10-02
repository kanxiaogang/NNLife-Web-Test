package jp.co.nn.receipt.repository;

import java.util.Date;


public class Receipt {
	private Integer id;
	private String title;
	private String makingTime;
	private String serves;
	private String ingredients;
	private Integer cost;
	private Date created_at;
	private Date updated_at;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMakingTime() {
		return makingTime;
	}
	public void setMakingTime(String makingTime) {
		this.makingTime = makingTime;
	}
	public String getServes() {
		return serves;
	}
	public void setServes(String serves) {
		this.serves = serves;
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	@Override
	public String toString() {
		return "Receipt [id=" + id + ", title=" + title + ", makingTime=" + makingTime + ", serves=" + serves
				+ ", ingredients=" + ingredients + ", cost=" + cost + ", created_at=" + created_at + ", updated_at="
				+ updated_at + "]";
	}
	
	

}
