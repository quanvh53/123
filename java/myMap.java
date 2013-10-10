import java.util.*;
import java.io.*;

public class myMap{
    public static void main(String[] args){

	HashMap<String,Integer> map = new HashMap<String,Integer>();
                mapsub2.myput2(map);
	
	HashMap<Integer, String> mmap = new HashMap<Integer,String>();
	mapsub.myput(mmap);

	String line;
	Scanner input = new Scanner(System.in);
//	System.out.print("nhap du lieu can ma hoa :");
	line = read.myread("inputdata.dat");
	System.out.print(line);
	int key;
	System.out.print("\nnhap key :");
	key = input.nextInt();
	
	char[] subline = line.toCharArray();
	
	int leg = subline.length;
	int[] roso = new int[leg];
	int[] maso = new int[leg];
	
	for(int k=0;k<leg;k++){
		roso[k] = map.get(String.valueOf(subline[k]));
		maso[k] = (roso[k] + key)%26;
		}

	System.out.print("ket qua ban ro so :");
	for(int i=0;i<leg;i++) System.out.print(roso[i]);

	System.out.print("\nket qua ma hoa so :");
	for(int i=0;i<leg;i++) System.out.print(maso[i]);

	String[] submachu = new String[leg];
	for(int i=0;i<leg;i++) submachu[i] =mmap.get(maso[i]); 

    	BufferedWriter bw = null;
	try {
		bw = new BufferedWriter(new FileWriter("outputdata.txt"));
		System.out.print("\nket qua ma hoa chu :");
		for(int i=0;i<leg;i++){ 
			System.out.print(submachu[i]); 
			bw.write(submachu[i]);
		}		
		bw.flush();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	    }
}
