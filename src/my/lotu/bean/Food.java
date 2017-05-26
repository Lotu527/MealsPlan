package my.lotu.bean;

/**
 * Food entity. @author MyEclipse Persistence Tools
 */

public class Food{

	// Fields

	private Integer id;
	private String name;
	private String type1;
	private String type2;
	private Double price;
	private Double protein;
	private Double carbohydrate;
	private Double fat;
	private Double calorie;
	private Double mass;

	// Constructors

	/** default constructor */
	public Food() {
		super();
	}

	/** full constructor */
	public Food(String name, String type1, String type2, Double price,
			Double protein, Double carbohydrate, Double fat, Double calorie,
			Double mass) {
		super();
		this.name = name;
		this.type1 = type1;
		this.type2 = type2;
		this.price = price;
		this.protein = protein;
		this.carbohydrate = carbohydrate;
		this.fat = fat;
		this.calorie = calorie;
		this.mass = mass;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType1() {
		return this.type1;
	}

	public void setType1(String type1) {
		this.type1 = type1;
	}

	public String getType2() {
		return this.type2;
	}

	public void setType2(String type2) {
		this.type2 = type2;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getProtein() {
		return this.protein;
	}

	public void setProtein(Double protein) {
		this.protein = protein;
	}

	public Double getCarbohydrate() {
		return this.carbohydrate;
	}

	public void setCarbohydrate(Double carbohydrate) {
		this.carbohydrate = carbohydrate;
	}

	public Double getFat() {
		return this.fat;
	}

	public void setFat(Double fat) {
		this.fat = fat;
	}

	public Double getCalorie() {
		return this.calorie;
	}

	public void setCalorie(Double calorie) {
		this.calorie = calorie;
	}

	public Double getMass() {
		return this.mass;
	}

	public void setMass(Double mass) {
		this.mass = mass;
	}

}