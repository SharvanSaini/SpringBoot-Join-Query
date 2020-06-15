package com.demo.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "Department", schema = "dbo", catalog = "KSCDatabase")
@Table(name = "Department")
public class DepartmentEntity {
  private int departmentId;
  private String departName;

  @Id
  @Column(name = "DepartmentId")
  public int getDepartmentId() {
      return departmentId;
  }

  public void setDepartmentId(int departmentId) {
      this.departmentId = departmentId;
  }

  @Basic
  @Column(name = "DepartName")
  public String getDepartName() {
      return departName;
  }

  public void setDepartName(String departName) {
      this.departName = departName;
  }
}
