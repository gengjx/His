package com.gjxsoft.domain;


import java.util.Date;

public class Register {

  private long id;
  private String caseNumber;//1
  private String realName;
  private long gender;//1
  private String iDnumber;//1
  private Date birthDate;//1
  private long age;//1
  private String ageType;//1
  private String homeAddress;//1
  private Date visitDate;
  private String noon; //1
  private long deptId; //1
  private long userId; //1
  private long registLeId; //1
  private long settleId;//1
  private String isBook;//1
  private Date registTime;
  private long registerId;
  private long visitState;//1


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getCaseNumber() {
    return caseNumber;
  }

  public void setCaseNumber(String caseNumber) {
    this.caseNumber = caseNumber;
  }


  public String getRealName() {
    return realName;
  }

  public void setRealName(String realName) {
    this.realName = realName;
  }


  public long getGender() {
    return gender;
  }

  public void setGender(long gender) {
    this.gender = gender;
  }


  public String getIDnumber() {
    return iDnumber;
  }

  public void setIDnumber(String iDnumber) {
    this.iDnumber = iDnumber;
  }



  public void setBirthDate(java.sql.Date birthDate) {
    this.birthDate = birthDate;
  }


  public long getAge() {
    return age;
  }

  public void setAge(long age) {
    this.age = age;
  }


  public String getAgeType() {
    return ageType;
  }

  public void setAgeType(String ageType) {
    this.ageType = ageType;
  }


  public String getHomeAddress() {
    return homeAddress;
  }

  public void setHomeAddress(String homeAddress) {
    this.homeAddress = homeAddress;
  }



  public void setVisitDate(java.sql.Date visitDate) {
    this.visitDate = visitDate;
  }


  public String getNoon() {
    return noon;
  }

  public void setNoon(String noon) {
    this.noon = noon;
  }


  public long getDeptId() {
    return deptId;
  }

  public void setDeptId(long deptId) {
    this.deptId = deptId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getRegistLeId() {
    return registLeId;
  }

  public void setRegistLeId(long registLeId) {
    this.registLeId = registLeId;
  }


  public long getSettleId() {
    return settleId;
  }

  public void setSettleId(long settleId) {
    this.settleId = settleId;
  }


  public String getIsBook() {
    return isBook;
  }

  public void setIsBook(String isBook) {
    this.isBook = isBook;
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  public Date getVisitDate() {
    return visitDate;
  }

  public void setVisitDate(Date visitDate) {
    this.visitDate = visitDate;
  }

  public Date getRegistTime() {
    return registTime;
  }

  public void setRegistTime(Date registTime) {
    this.registTime = registTime;
  }

  public void setRegistTime(java.sql.Timestamp registTime) {
    this.registTime = registTime;
  }


  public long getRegisterId() {
    return registerId;
  }

  public void setRegisterId(long registerId) {
    this.registerId = registerId;
  }


  public long getVisitState() {
    return visitState;
  }

  public void setVisitState(long visitState) {
    this.visitState = visitState;
  }

  public String getiDnumber() {
    return iDnumber;
  }

  public void setiDnumber(String iDnumber) {
    this.iDnumber = iDnumber;
  }

  @Override
  public String toString() {
    return "Register{" +
            "id=" + id +
            ", caseNumber='" + caseNumber + '\'' +
            ", realName='" + realName + '\'' +
            ", gender=" + gender +
            ", iDnumber='" + iDnumber + '\'' +
            ", birthDate=" + birthDate +
            ", age=" + age +
            ", ageType='" + ageType + '\'' +
            ", homeAddress='" + homeAddress + '\'' +
            ", visitDate=" + visitDate +
            ", noon='" + noon + '\'' +
            ", deptId=" + deptId +
            ", userId=" + userId +
            ", registLeId=" + registLeId +
            ", settleId=" + settleId +
            ", isBook='" + isBook + '\'' +
            ", registTime=" + registTime +
            ", registerId=" + registerId +
            ", visitState=" + visitState +
            '}';
  }
}
