package com.yanglijun.news_v1.entity;

import java.io.Serializable;

public class Picture implements Serializable {
	private String _id;
	private String createdAt;
	private String desc;
	private String publishedAt;
	private String source;
	private String type;
	private String url;
    private boolean used;
    private String who;
    
	public Picture() {
		super();
	}

	public Picture(String _id, String createdAt, String desc, String publishedAt, String source, String type,
			String url, boolean used, String who) {
		super();
		this._id = _id;
		this.createdAt = createdAt;
		this.desc = desc;
		this.publishedAt = publishedAt;
		this.source = source;
		this.type = type;
		this.url = url;
		this.used = used;
		this.who = who;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getPublishedAt() {
		return publishedAt;
	}

	public void setPublishedAt(String publishedAt) {
		this.publishedAt = publishedAt;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isUsed() {
		return used;
	}

	public void setUsed(boolean used) {
		this.used = used;
	}

	public String getWho() {
		return who;
	}

	public void setWho(String who) {
		this.who = who;
	}

	@Override
	public String toString() {
		return "Picture [_id=" + _id + ", createdAt=" + createdAt + ", desc=" + desc + ", publishedAt=" + publishedAt
				+ ", source=" + source + ", type=" + type + ", url=" + url + ", used=" + used + ", who=" + who + "]";
	}


    
}
