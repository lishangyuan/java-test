package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	
	public static void main(String[] args) throws Exception{
		
		String arr[] = {"2015-12-12", "2014-09-01", "2015-10-24", "2016-01-05"};
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
            	Date date1 = sdf.parse(arr[j] );
            	Date date2 = sdf.parse(arr[j+1] );
            	if(date1.getTime() > date2.getTime()) {
            		String temp = arr[j + 1];
            		arr[j + 1] = arr[j];
                    arr[j] = temp;
            	}
            }
        }
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);	
		}
	}
}
