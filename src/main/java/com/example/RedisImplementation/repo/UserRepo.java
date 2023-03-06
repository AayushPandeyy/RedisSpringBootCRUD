package com.example.pagination.PaginationImplementation.repo;

import com.example.pagination.PaginationImplementation.entity.User;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepo{
    public static final String HASH_KEY = "User";
    private final RedisTemplate template;

    public UserRepo(RedisTemplate template) {
        this.template = template;
    }

    public User save(User user){
        template.opsForHash().put(HASH_KEY,user.getId(),user);
        return user;
    }

    public List<User> findAll(){
        return template.opsForHash().values(HASH_KEY);
    }

    public User findById(Long id){
        return (User) template.opsForHash().get(HASH_KEY,id);
    }

    public String deleteProduct(Long id){
        template.opsForHash().delete(HASH_KEY,id);
        return "Deleted Successfully";
    }

}
