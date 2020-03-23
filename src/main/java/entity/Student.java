package entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {
	private Integer sid;
	private String name;
	private Integer age;
	private Double weight;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date bri;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Integer sid, String name, Integer age, Double weight, Date bri) {
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.bri = bri;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", age=" + age + ", weight=" + weight + ", bri=" + bri + "]";
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Date getBri() {
		return bri;
	}

	public void setBri(Date bri) {
		this.bri = bri;
	}
	
}
