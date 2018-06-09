package readfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadingTxtFileOldWay {
	public static void main(String[] args) throws IOException,FileNotFoundException {
//		FileReader fr=new FileReader("Numbers.txt");
//		BufferedReader bf= new BufferedReader(fr);
//		for(int i=1;i<=1000;i++) {
//			System.out.print(i+" ");
//			System.out.println(bf.readLine());
//		}
		List<Integer> num=new ArrayList<>();
		
		try(FileReader fr= new FileReader("Numbers.txt");
			 BufferedReader br= new BufferedReader(fr);){
			
			
			String value;
			int max;
			while((value=br.readLine())!=null) {
					num.add(Integer.valueOf(value));
					
//				System.out.print(num);
			}
			max=num.get(0);
			for(int number :num) {
				if(number>max) {
					max=number;
				}
			}
			System.out.println(max);
			// unique number
			List<Integer> newList=new ArrayList<>();
			int duplicates = 0;
			for(Integer number: num) {
				if(!newList.contains(number)) {
					newList.add(number);
				}else {
					duplicates++;
				}
			}System.out.println(newList.size());
			System.out.println(duplicates);
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		
		}
		
	
	
	}

}
