package com.example.service;

import com.example.entity.Blog;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 */
@Service
public class BlogService{

    private List<Blog> list=new ArrayList<>();

    public BlogService(){
        list.add(new Blog(1L, " spring in action", "good!"));
        list.add(new Blog(2L,"spring boot in action", "nice!"));
    }


    public List<Blog> getBlogs() {
        return list;
    }


    public void deleteBlog(long id) {
        Iterator iter = list.iterator();
        while(iter.hasNext()) {
            Blog blog= (Blog) iter.next();
            if (blog.getId()==id){
                iter.remove();
            }
        }
    }
}
