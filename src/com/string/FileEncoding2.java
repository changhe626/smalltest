package com.string;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/*在开发过程中，可能会遇到文件编码的转换，虽然说开发工具eclipse可以转换编码，但是有的情况却很不方便。比如，
原来文件本身的编码是GBK，现在要转换成UTF-8，如果直接在eclipse中把文件编码修改成UTF-8，恭喜你，是乱码，
因为不能直接从GBK到UTF-8进行转换，这时就需要我们手动的来转换编码。下面是一个文件编码转换的工具类。*/

public class FileEncoding2 {
	public static void main(String[] args) throws Exception {
		convert("C:\\Users\\zhangke\\Desktop\\CalendarDemo2.java", "GBK", "UTF-8", new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith("txt");
			}
		});
	}

	/**
	 * 把指定文件或目录转换成指定的编码
	 * @param fileName
	 *            要转换的文件
	 * @param fromCharsetName
	 *            源文件的编码
	 * @param toCharsetName
	 *            要转换的编码
	 * @throws Exception
	 */
	public static void convert(String fileName, String fromCharsetName, String toCharsetName) throws Exception {
		convert(new File(fileName), fromCharsetName, toCharsetName, null);
	}

	/**
	 * 把指定文件或目录转换成指定的编码
	 * 
	 * @param file
	 *            要转换的文件或目录
	 * @param fromCharsetName
	 *            源文件的编码
	 * @param toCharsetName
	 *            要转换的编码
	 * @throws Exception
	 */
	public static void convert(File file, String fromCharsetName, String toCharsetName) throws Exception {
		convert(file, fromCharsetName, toCharsetName, null);
	}

	/**
	 * 把指定文件或目录转换成指定的编码
	 * 
	 * @param file
	 *            要转换的文件或目录
	 * @param fromCharsetName
	 *            源文件的编码
	 * @param toCharsetName
	 *            要转换的编码
	 * @param filter
	 *            文件名过滤器
	 * @throws Exception
	 */
	public static void convert(String fileName, String fromCharsetName, String toCharsetName, FilenameFilter filter)
			throws Exception {
		convert(new File(fileName), fromCharsetName, toCharsetName, filter);
	}

	/**
	 * 把指定文件或目录转换成指定的编码
	 * 
	 * @param file
	 *            要转换的文件或目录
	 * @param fromCharsetName
	 *            源文件的编码
	 * @param toCharsetName
	 *            要转换的编码
	 * @param filter
	 *            文件名过滤器
	 * @throws Exception
	 */
	public static void convert(File file, String fromCharsetName, String toCharsetName, FilenameFilter filter) throws Exception {
		if (file.isDirectory()) {
			File[] fileList = null;
			if (filter == null) {
				fileList = file.listFiles();
			} else {
				fileList = file.listFiles(filter);
			}
			for (File f : fileList) {
				convert(f, fromCharsetName, toCharsetName, filter);
			}
		} else {
			if (filter == null || filter.accept(file.getParentFile(), file.getName())) {
				String fileContent = getFileContentFromCharset(file, fromCharsetName);
				saveFile2Charset(file, toCharsetName, fileContent);
			}
		}
	}

	/**
	 * 以指定编码方式读取文件，返回文件内容
	 *
	 * @param file
	 *            要转换的文件
	 * @param fromCharsetName
	 *            源文件的编码
	 * @return
	 * @throws Exception
	 */
	public static String getFileContentFromCharset(File file, String fromCharsetName) throws Exception {
		if (!Charset.isSupported(fromCharsetName)) {
			throw new UnsupportedCharsetException(fromCharsetName);
		}
		InputStream inputStream = new FileInputStream(file);
		InputStreamReader reader = new InputStreamReader(inputStream, fromCharsetName);
		char[] chs = new char[(int) file.length()];
		reader.read(chs);
		String str = new String(chs).trim();
		reader.close();
		return str;
	}

	/**
	 * 以指定编码方式写文本文件，存在会覆盖
	 * 
	 * @param file
	 *            要写入的文件
	 * @param toCharsetName
	 *            要转换的编码
	 * @param content
	 *            文件内容
	 * @throws Exception
	 */
	public static void saveFile2Charset(File file, String toCharsetName, String content) throws Exception {
		if (!Charset.isSupported(toCharsetName)) {
			throw new UnsupportedCharsetException(toCharsetName);
		}
		OutputStream outputStream = new FileOutputStream(new File("D:\\1.java"));
		OutputStreamWriter outWrite = new OutputStreamWriter(outputStream, toCharsetName);
		outWrite.write(content);
		outWrite.close();
	}
}