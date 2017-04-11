package com.changhe;

public class ExitDemo {

	public static void main(String[] args) {
		
	}

}
/*
1.参考文献

http://hi.baidu.com/accpzhangbo/blog/item/52aeffc683ee6ec238db4965.html
2.解析

查看Java.lang.System的源代码，我们可以找到System.exit(status)这个方法的说明，代码如下：

[java] view plain copy

    *//** 
       * Terminates the currently running Java Virtual Machine. The 
       * argument serves as a status code; by convention, a nonzero status 
       * code indicates abnormal termination. 
       * <p> 
       * This method calls the <code>exit</code> method in class 
       * <code>Runtime</code>. This method never returns normally. 
       * <p> 
       * The call <code>System.exit(n)</code> is effectively equivalent to 
       * the call: 
       * <blockquote><pre> 
       * Runtime.getRuntime().exit(n) 
       * </pre></blockquote> 
       * 
       * @param      status   exit status. 
       * @throws  SecurityException 
       *        if a security manager exists and its <code>checkExit</code> 
       *        method doesn't allow exit with the specified status. 
       * @see        java.lang.Runtime#exit(int) 
       *//*  
      public static void exit(int status) {  
    untime.getRuntime().exit(status);  
      }  

ע����˵�ĺ�������������������������ǰ���������е�java����������status�Ƿ����������ô��ʾ�Ƿ������˳���

    System.exit(0)�ǽ�������������������ݶ�ͣ���� ����dispose()ֻ�ǹر�������ڣ����ǲ�û��ֹͣ����application exit() ��
    ������Σ��ڴ涼�ͷ��ˣ�Ҳ����˵��JVM���ر��ˣ��ڴ�����������ܻ���ʲô����
    System.exit(0)�������˳����򣬶�System.exit(1)����˵��0��ʾ�������˳�����
    System.exit(status)����statusΪ��ֵ�����˳����򡣺�return ��������²�ͬ�㣺
       return�ǻص���һ�㣬��System.exit(status)�ǻص����ϲ�

3.ʾ��

��һ��if-else�ж��У�������ǳ����ǰ�������Ԥ���ִ�У������������Ҫֹͣ������ô����ʹ��System.exit(0)��
��System.exit(1)һ�����catch���У��������쳣����Ҫֹͣ��������ʹ��System.exit(1)�����status=1��������ʾ��������Ƿ������˳���*/