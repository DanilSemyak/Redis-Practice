package ru.semyak.redis_practice.entites;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@RedisHash("User")
public class User implements Serializable {

    private Integer id;
    private String name;
}
