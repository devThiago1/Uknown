package com.uknown.appPost.repository;

import com.uknown.appPost.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);

}
