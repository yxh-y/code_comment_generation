package methodEmbedding.Speaking_in_Tongues.S.LYD1278;

import java.util.*;
import java.io.*;

public class Letter
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader baca= new BufferedReader(new InputStreamReader(System.in));
		int T= Integer.parseInt(baca.readLine());
		
		for(int i=1; i<=T; i++)
		{
			StringTokenizer token= new StringTokenizer(baca.readLine());
			System.out.print("Case #"+i+": ");
			while(token.hasMoreTokens())
			{
				String a= token.nextToken();
				char[] data=a.toCharArray();;
				
				for(int j=0; j<data.length; j++)
				{
					switch (data[j])
					{
						case 'a':System.out.print("y"); break;
						case 'b':System.out.print("h"); break;
						case 'c':System.out.print("e"); break;
						case 'd':System.out.print("s"); break;
						case 'e':System.out.print("o"); break;
						case 'f':System.out.print("c"); break;
						case 'g':System.out.print("v"); break;
						case 'h':System.out.print("x"); break;
						case 'i':System.out.print("d"); break;
						case 'j':System.out.print("u"); break;
						case 'k':System.out.print("i"); break;
						case 'l':System.out.print("g"); break;
						case 'm':System.out.print("l"); break;
						case 'n':System.out.print("b"); break;
						case 'o':System.out.print("k"); break;
						case 'p':System.out.print("r"); break;
						case 'q':System.out.print("z"); break;
						case 'r':System.out.print("t"); break;
						case 's':System.out.print("n"); break;
						case 't':System.out.print("w"); break;
						case 'u':System.out.print("j"); break;
						case 'v':System.out.print("p"); break;
						case 'w':System.out.print("f"); break;
						case 'x':System.out.print("m"); break;
						case 'y':System.out.print("a"); break;
						case 'z':System.out.print("q"); break;
					}
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
