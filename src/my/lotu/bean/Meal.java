package my.lotu.bean;

/**
 * Meal entity. @author MyEclipse Persistence Tools
 */

public class Meal implements java.io.Serializable {

	// Fields

	private Integer id;
	private String type;
	private String foods;
	private Double price;
	private Double calorie;
	private Integer score;

	// Constructors

	/** default constructor */
	public Meal() {
	}

	/** full constructor */
	public Meal(String type, String foods, Double price, Double calorie,
			Integer score) {
		this.type = type;
		this.foods = foods;
		this.price = price;
		this.calorie = calorie;
		this.score = score;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFoods() {
		return this.foods;
	}

	public void setFoods(String foods) {
		this.foods = foods;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getCalorie() {
		return this.calorie;
	}

	public void setCalorie(Double calorie) {
		this.calorie = calorie;
	}

	public Integer getScore() {
		return this.score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

}