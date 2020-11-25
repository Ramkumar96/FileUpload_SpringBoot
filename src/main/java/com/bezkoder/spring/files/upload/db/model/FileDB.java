package com.bezkoder.spring.files.upload.db.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "files")
public class FileDB {
  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  private String id;

  private String name;

  private String type;

  @Lob
  private byte[] data;

  private String username;

  private String details;

  public FileDB() {
  }

  public FileDB(String name, String type, byte[] data, String username, String details) {
    this.name = name;
    this.type = type;
    this.data = data;
    this.username = username;
    this.details = details;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public byte[] getData() {
    return data;
  }

  public void setData(byte[] data) {
    this.data = data;
  }

  public String getUsername() {return username; }

  public void setUsername(String username) { this.username = username; }

  public String getDetails() { return details; }

  public void setDetails(String details) { this.details = details; }
}
