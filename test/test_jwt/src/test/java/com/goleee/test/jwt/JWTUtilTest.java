package com.goleee.test.jwt;

import io.jsonwebtoken.Claims;
import org.junit.Test;

public class JWTUtilTest {
    @Test
    public void createJWT(){

        String jwt = JWTUtil.createJWT("1", "111", "admin", JWTUtil.DAY_TTL);
        System.out.println(jwt);
    }

    @Test
    public void parseJWT(){
        Claims claims = JWTUtil.parseJWT("eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIxIiwiaWF0IjoxNTc1NjQ0NTA5LCJzdWIiOiJhZG1pbiIsImlzcyI6IjExMSIsImV4cCI6MTU3Njc1NTYyMH0.ARoDILosX5_6NsAYAR4ZzScJRyAJibo9Vq9sJxX9kxo");
        System.out.println(claims);
    }
}
