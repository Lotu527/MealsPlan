package my.lotu.bean;

/**
 * DayPlan entity. @author MyEclipse Persistence Tools
 */

public class DayPlan implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Integer breakfast;
	private Integer lunch;
	private Integer dinner;
	private Double price;
	private Double calorie;
	private Integer score;

	// Constructors

	/** default constructor */
	public DayPlan() {
	}

	/** full constructor */
	public DayPlan(String name, Integer breakfast, Integer lunch,
			Integer dinner, Double price, Double calorie, Integer score) {
		this.name = name;
		this.breakfast = breakfast;
		this.lunch = lunch;
		this.dinner = dinner;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getBreakfast() {
		return this.breakfast;
	}

	public void setBreakfast(Integer breakfast) {
		this.breakfast = breakfast;
	}

	public Integer getLunch() {
		return this.lunch;
	}

	public void setLunch(Integer lunch) {
		this.lunch = lunch;
	}

	public Integer getDinner() {
		return this.dinner;
	}

	public void setDinner(Integer dinner) {
		this.dinner = dinner;
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