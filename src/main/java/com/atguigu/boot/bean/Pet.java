package com.atguigu.boot.bean;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ConfigurationProperties(prefix = "pet")
public class Pet {
    private String name;
}
