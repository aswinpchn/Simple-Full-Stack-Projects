package edu.sjsu.cmpe275.aop.tweet;

import java.io.IOException;
import java.util.Random;

public class TweetServiceImpl implements TweetService {

  /***
   * Following is a dummy implementation.
   * You can tweak the implementation to suit your need, but this file is NOT part of the submission.
   */

  // This is the actual place where business logic will generally happen, Here is the place where fantasy IOException can occur.
  // If no error happens here, it goes to AfterReturning in StatsAspect. if IOException is thrown, this goes directly to Retry.

  @Override
  public void tweet(String user, String message) throws IllegalArgumentException, IOException {
    Random r = new Random();
    if(r.nextInt(100) > 80)
      throw new IOException();
    System.out.printf("User %s tweeted message: %s\n", user, message);
  }

  @Override
  public void follow(String follower, String followee) throws IOException {
    Random r = new Random();
    int randomNumber = r.nextInt(100);
    if(randomNumber > 80)
      throw new IOException();
    System.out.printf("User %s followed user %s \n", follower, followee);
  }

  @Override
  public void block(String user, String follower)
          throws IllegalArgumentException, UnsupportedOperationException, IOException {
    Random r = new Random();
    if(r.nextInt(100) > 80)
      throw new IOException();
    System.out.printf("User %s blocked user %s \n", user, follower);
  }

  @Override
  public void unblock(String user, String follower)
          throws IllegalArgumentException, UnsupportedOperationException, IOException {
    Random r = new Random();
    if(r.nextInt(100) > 80)
      throw new IOException();
    System.out.printf("User %s unblocked user %s \n", user, follower);
  }


}
