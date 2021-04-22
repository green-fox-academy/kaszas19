package com.zoli.weak03.day03;

import java.util.ArrayList;
import java.util.List;

public class Blog {

  List<BlogPost> blogPostList = new ArrayList<>();

  public void add(BlogPost blogPost) {
    blogPostList.add(blogPost);
  }

  public void delete(int del) {
    blogPostList.remove(del);
  }

  public void update(int newIndex, BlogPost blogPost) {
    blogPostList.set(newIndex, blogPost);
  }

}
