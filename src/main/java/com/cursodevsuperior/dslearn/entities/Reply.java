package com.cursodevsuperior.dslearn.entities;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_reply")
public class Reply {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String body;
	private Instant moment;

	@ManyToOne
	@JoinColumn(name = "topic_id")
	private Topic topic;

	@ManyToOne
	@JoinColumn(name = "author_id")
	private User author;

	@ManyToMany
	@JoinTable(name = "tb_reply_likes",
			joinColumns = @JoinColumn(name = "reply_id"),
			inverseJoinColumns = @JoinColumn(name = "user_id"))
	private List<User> likes = new ArrayList<>();

	public Reply() {
	}

	public Reply(Long id, String body, Instant moment, Topic topic, User author) {
		this.id = id;
		this.body = body;
		this.moment = moment;
		this.topic = topic;
		this.author = author;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public List<User> getLikes() {
		return likes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reply other = (Reply) obj;
		return Objects.equals(id, other.id);
	}
}
