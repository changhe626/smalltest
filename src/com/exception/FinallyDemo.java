package com.exception;

import java.util.zip.DataFormatException;

public class FinallyDemo {
	public static void main(String[] args) {
		try {
            System.out.println(doStuff(-1));
            System.out.println(doStuff(100));
        } catch (Exception e) {
            System.out.println("这里是永远不会到达的");
        }
		
	}
	//执行的过程是,进入方法执行,,判断的确小雨0 ,准备抛出异常了,
	//先去finally中返回-1,就没有抛出异常了,继续执行main中的下一步
	
	//该方法抛出受检异常
    public static int doStuff(int _p) throws Exception {
        try {
            if (_p < 0) {
                throw new DataFormatException(" 数据格式错误 ");
            } else {
                return _p;
            }

        } catch (Exception e) {
            // 异常处理
            throw e;
        } finally {
            return -1;
        }
    }

}
