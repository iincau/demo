package com.example.demo;

import java.util.Objects;

/**
 * @author Ionut Incau <ionut.incau@8x8.com> on 19-Jun-23 at 11:51 AM
 */
public class Tag {

	private String key;
	private String value;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Tag tag = (Tag) o;
		return Objects.equals(key, tag.key) && Objects.equals(value, tag.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(key, value);
	}

	@Override
	public String toString() {
		return "Tag{" +
				"key='" + key + '\'' +
				", value='" + value + '\'' +
				'}';
	}
}
