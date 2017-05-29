package my.lotu.bean;

/**
 * Plan entity. @author MyEclipse Persistence Tools
 */

public class Plan implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String type;
	private String dayPlanId;
	private Double price;
	private Double score;
	private Integer time;

	// Constructors

	/** default constructor */
	public Plan() {
	}

	/** full constructor */
	public Plan(String name, String type, String dayPlanId, Double price,
			Double score, Integer time) {
		this.name = name;
		this.type = type;
		this.dayPlanId = dayPlanId;
		this.price = price;
		this.score = score;
		this.time = time;
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDayPlanId() {
		return this.dayPlanId;
	}

	public void setDayPlanId(String dayPlanId) {
		this.dayPlanId = dayPlanId;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getScore() {
		return this.score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Integer getTime() {
		return this.time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

}