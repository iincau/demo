package com.example.demo;

import java.util.List;
import java.util.Objects;

/**
 * @author Ionut Incau <ionut.incau@8x8.com> on 19-Jun-23 at 11:51 AM
 */
public class Metadata {

	private String id;
	private List<Tag> tags;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Metadata metadata = (Metadata) o;
		return Objects.equals(id, metadata.id) && Objects.equals(tags, metadata.tags);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, tags);
	}

	@Override
	public String toString() {
		return "Metadata{" +
				"id='" + id + '\'' +
				", tags=" + tags +
				'}';
	}
}
