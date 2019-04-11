package creatCommandLineApplication;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class FileSearchApp {
String path;
String regex;
String ZipFleName;
Pattern pattern;
List<File> zipFile=new ArrayList<File>();

	public static void main(String[] args) {
		FileSearchApp app=new FileSearchApp();
		//use switch method 
		switch(Math.min(args.length,3)) {
		case 0:
			System.out.println("Usage: FileSearchApp path[regex][zipfile");
			return;
		case 3:app.setZipFleName(args[2]);
		case 2:app.setRegex(args[1]);
		case 1:app.setPath(args[0]);
		}
		//at the time of run u can go run congiration then on their
		// argument tab-->in ./ two three print out will be according to argument
		app.walkDirectoryJava8(app.getPath());
	}//end main
	
	public boolean searchFile(File file) throws IOException {
	return Files.lines(file.toPath(), StandardCharsets.UTF_8)
			.anyMatch(t -> searchText(t));
			}//end of searchFile method
	
	public  boolean searchText(String text) {
		return(this.getRegex()==null)? true : 
				this.pattern.matcher(text).matches();
	}//end searchtext method

	public void addFileToZip(File file) {
		if(getZipFileName()!=null) {
			zipFile.add(file);
		}
		
	}//end of addFiletoZip Method
	public String getZipFileName() {
		return ZipFleName;
		// TODO Auto-generated method stub
		
	}

	public void walkDirectoryJava8(String path) {
		try {
			//File.walk maethod will turn into stream
			//.forEach can fo to each element by using .forEach 
			
			Files.walk(Paths.get(path)).forEach(f -> {
				try {
					processFile(f.toFile());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		} 
		//end try
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//end catch
	}//end method
	
	public void processFile(File file) throws IOException {
		if(searchFile(file)) {
			addFileToZip(file);
		}//end if loop
	}//end method
	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}//end mathod
	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}//end mathod
	/**
	 * @return the regex
	 */
	public String getRegex() {
		this.pattern=pattern.compile(getRegex());
		return regex;
	}//end mathod
	/**
	 * @param regex the regex to set
	 */
	public void setRegex(String regex) {
		this.regex = regex;
	}//end mathod
	/**
	 * @return the zipFleName
	 */
	public String getZipFleName() {
		return ZipFleName;
	}//end mathod
	/**
	 * @param zipFleName the zipFleName to set
	 */
	public void setZipFleName(String zipFleName) {
		ZipFleName = zipFleName;
	}//end mathod

}//end class
