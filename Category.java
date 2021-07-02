package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

//类别
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category implements Serializable {

  private String id;
  private String cateName;
  private String levels;
  private String parentId;
  private List<Category> categoryList;
}
