package com.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileEncoding {
	
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\zhangke\\Desktop\\CalendarDemo2.java");
		findFile(file);
	}
	
	public static void findFile(File path) throws IOException{
		//设定一个路径,进行寻找遍历,以.java为结尾的文件,递归
		//是文件夹
		if(path.isDirectory()){
			File[] listFiles = path.listFiles(fileFilter);
			if(listFiles!=null){
				for (File file2 : listFiles) {
					//还是文件夹
					if(file2.isDirectory()){
						findFile(file2);
					}
				}
			}
		}else{
			//是文件,进行编码
			encodeFile(path);
			System.out.println("成功了");
		}
	}
	
	
	//创建一个文件过滤器，只保留java文件
	static FileFilter fileFilter = new FileFilter() {
		public boolean accept(File pathname) {
			// 先判断不为空
			if (pathname != null) {
				// 判断存在,且是以.java为结尾的
				if (pathname.exists() && pathname.getName().endsWith(".java")) {
					return true;
				}
			}
			return false;
		}
	};

	
	
	public static  void encodeFile(File file) throws IOException {
			/*BufferedInputStream bs = new BufferedInputStream(new FileInputStream(file));
			BufferedOutputStream bo=new BufferedOutputStream(new FileOutputStream(new File("D:\\1.java")));
			int len=0;
			byte[] arr=new byte[1024];
			while((len=bs.read(arr))!=-1){
				String string = new String(arr,"UTF-8");
				bo.write(string.getBytes());
			}
		bs.close();
		bo.close();
			*/
			BufferedReader reader = new BufferedReader(new FileReader(file));
			BufferedWriter  writer=new BufferedWriter(new FileWriter(new File("D:\\1.java")));
			String len=null;
			while((len=reader.readLine())!=null){
				//编辑编码
				len=new String(len.getBytes("GBK"),"UTF-8");
				writer.write(len);
				writer.newLine();
				System.out.println(len);
			}
			reader.close();
			writer.close();
		
		
	}

}
