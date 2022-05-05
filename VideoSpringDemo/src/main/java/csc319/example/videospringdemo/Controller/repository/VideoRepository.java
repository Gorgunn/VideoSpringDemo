package csc319.example.videospringdemo.Controller.repository;

import csc319.example.videospringdemo.Controller.Video;

import java.util.Collection;

public interface VideoRepository {
    //Add a video
    public boolean addVideo(Video v);
    //Get the videos that added
    public Collection<Video> getVideo();
    //Find all videos matching by a title
    public Collection<Video> findByTitle(String title);


}
