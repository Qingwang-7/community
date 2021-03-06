package com.nowcoder.community.util;



import org.apache.commons.lang3.StringUtils;
import org.springframework.util.DigestUtils;


import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: qingwang
 * @Date: 2021/05/17/20:10
 * @Description:
 */
public class CommunityUtil {


    public static String generateUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }


    public static String md5(String key){
        if(StringUtils.isBlank(key)){
            return null;
        }
        return DigestUtils.md5DigestAsHex(key.getBytes());
    }

}
