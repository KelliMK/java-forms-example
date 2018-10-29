package org.wecancodeit.blogposts.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Post {

	@Id @GeneratedValue private Long id;
	private String title;
	
	@Lob
	private String content;

	public Post() {
		super();
	}

	public Post(String title, String content) {
		this.title = title;
		this.content = content;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

}
