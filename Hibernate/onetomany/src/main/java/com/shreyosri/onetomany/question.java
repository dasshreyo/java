package com.shreyosri.onetomany;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Table(name="question")
@Entity
public class question {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String qname;
@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name="qid")
private List<Answer> answer;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getQname() {
	return qname;
}
public void setQname(String qname) {
	this.qname = qname;
}
public List<Answer> getAnswer() {
	return answer;
}
public void setAnswer(List<Answer> answer) {
	this.answer = answer;
}
}
