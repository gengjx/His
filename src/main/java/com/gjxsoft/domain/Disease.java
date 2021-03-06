package com.gjxsoft.domain;


public class Disease {

  private long id;
  private String diseaseCode;
  private String diseaseName;
  private String diseaseIcd;
  private long diseCategoryId;
  private long delMark;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getDiseaseCode() {
    return diseaseCode;
  }

  public void setDiseaseCode(String diseaseCode) {
    this.diseaseCode = diseaseCode;
  }


  public String getDiseaseName() {
    return diseaseName;
  }

  public void setDiseaseName(String diseaseName) {
    this.diseaseName = diseaseName;
  }


  public String getDiseaseIcd() {
    return diseaseIcd;
  }

  public void setDiseaseIcd(String diseaseIcd) {
    this.diseaseIcd = diseaseIcd;
  }


  public long getDiseCategoryId() {
    return diseCategoryId;
  }

  public void setDiseCategoryId(long diseCategoryId) {
    this.diseCategoryId = diseCategoryId;
  }


  public long getDelMark() {
    return delMark;
  }

  public void setDelMark(long delMark) {
    this.delMark = delMark;
  }

}
