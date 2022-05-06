package com.example;

// pyramid class, that corresponds to the information in the json file
public class Pyramid {

  protected Integer id;
  protected String name;
  protected String[] contributors;

  // constructor
  public Pyramid(
    Integer pyramidId,
    String pyramidName,
    String[] pyramidContributors
  ) {
    id = pyramidId;
    name = pyramidName;
    contributors = pyramidContributors;
  }
  public void print() {
    System.out.printf("Name %s\n", name);
    System.out.printf("\tid: %d\n", id);
    System.out.printf("\tPyramid Contributors: ");
    for (int i = 0; i < contributors.length; i++)
    {
      System.out.println(contributors[i]);
      if (i != (contributors.length - 1))
      {
        System.out.print(", ");
      }
    }
    System.out.println("");
  }
}
