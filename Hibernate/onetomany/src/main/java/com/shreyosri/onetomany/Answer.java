package com.shreyosri.onetomany;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="answer")
@Entity

public class Answer {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String studentname;
private String answer;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}
}
