/*
 * *
 *  * Copyright(c) 2010-2016 by GmsdTech Inc.
 *  * All Rights Reserved
 *
 */
package org.our.note.util.md5;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

/**
 * MD5算法
 *
 * @author jinkai
 */
public class MD5Util {

    private static final String ALGORITHM = "MD5";

    /**
     * 加密
     *
     * @param in
     * @return
     */
    public static String digest(String in) {
        try {
            return DatatypeConverter.printHexBinary(digest(in.getBytes("UTF-8"))).toLowerCase();
        } catch (UnsupportedEncodingException e) {
            // can't be here
            throw new RuntimeException(e);
        }
    }

    private static byte[] digest(byte[] in) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(ALGORITHM);
            messageDigest.reset();
            return messageDigest.digest(in);
        } catch (NoSuchAlgorithmException e) {
            // can't be here
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.println(digest("xiangshang"));
    }
}
