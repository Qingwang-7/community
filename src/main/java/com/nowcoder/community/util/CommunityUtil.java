package com.nowcoder.community.util;

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

}
