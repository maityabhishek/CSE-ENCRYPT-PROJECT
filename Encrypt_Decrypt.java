


import java.io.*;
import java.util.*;
public class Encrypt_Decrypt {
	
public String Filelocation;
public String key="";
	public void Encrypt() throws Exception 
	{
		int encpArray1[] ={1,4,1,4,2,1,3,5,6,2,3,7};
		int encpArray2[] ={3,1,4,2,8,5,7,1,4,2,8,6};
		int encpArray3[] ={0,1,1,2,3,5,8,13,21,34,55,89};
		int encpArray4[] ={2,7,1,8,2,8,1,8,2,8,4,5};
		int eA1point=0,eA2point=0,eA3point=0,eA4point=0;
		
		//Scanner sc=new Scanner(new FileReader(Filelocation));
		BufferedReader br= new BufferedReader(new FileReader(Filelocation));
		//BufferedReader fr=new BufferedReader(new FileWriter("EncptDATA.txt"));
		//FileWriter fw=new FileWriter("EncptDATA.txt");
		BufferedWriter fw = new BufferedWriter(new FileWriter("EncptDATA.txt"));

                //fw.write("rasmi");
		int r1,r2,r3,r4,val;
		int index;
		String DataSrc,EncptStr="";
		
		r1=(int)Math.abs(Math.random()*10);
		r2=(int)Math.abs(Math.random()*10);
		r3=(int)Math.abs(Math.random()*10);
		r4=(int)Math.abs(Math.random()*10);
		key= key+r1;
                key= key+" "+r2;
                key= key+" "+r3;
                key= key+" "+r4;
		while((DataSrc=br.readLine())!=null)
		{
			
			index=0;
			
			do
			{
				if(index<DataSrc.length())
				{
					if(index%2==0)
					{
						if(r1%2==0)
						{
							EncptStr=EncptStr+(char)(DataSrc.charAt(index)+encpArray1[eA1point]);
							eA1point++;
							if(eA1point>=encpArray1.length)
								eA1point=0;
							index++;
						}
						else
						{
							EncptStr=EncptStr+(char)(DataSrc.charAt(index)+encpArray2[eA2point]);
							eA2point++;
							if(eA2point>=encpArray2.length)
								eA2point=0;
							index++;
						
						}
					}
					else
					{
						if(r2%2==0)
						{
							EncptStr=EncptStr+(char)(DataSrc.charAt(index)+encpArray3[eA3point]);
							eA3point++;
							if(eA3point>=encpArray3.length)
								eA3point=0;
							index++;
						}
						else
						{
							EncptStr=EncptStr+(char)(DataSrc.charAt(index)+encpArray4[eA4point]);
							eA4point++;
							if(eA4point>=encpArray4.length)
								eA4point=0;
							index++;
						
						}
						
					}
					
				}
			}
			while(index<DataSrc.length());
			//print to file
                        System.out.println(EncptStr);
			fw.write(EncptStr);
			EncptStr="";
			
			
				
			}
                         fw.close();

                
                
		
			
				
		}


	public void Decrypt() throws Exception 
	{
		int encpArray1[] ={1,4,1,4,2,1,3,5,6,2,3,7};
		int encpArray2[] ={3,1,4,2,8,5,7,1,4,2,8,6};
		int encpArray3[] ={0,1,1,2,3,5,8,13,21,34,55,89};
		int encpArray4[] ={2,7,1,8,2,8,1,8,2,8,4,5};
		int eA1point=0,eA2point=0,eA3point=0,eA4point=0;
		
		//Scanner sc=new Scanner(new FileReader(Filelocation));
		BufferedReader br= new BufferedReader(new FileReader(Filelocation));
		//BufferedReader fr=new BufferedReader(new FileWriter("EncptDATA.txt"));
		//FileWriter fw=new FileWriter("EncptDATA.txt");
		BufferedWriter fw = new BufferedWriter(new FileWriter("DecryptDATA.txt"));
		
                //fw.write("rasmi");
		int r1,r2,r3,r4,val;
		int index=0;
		String DataSrc,EncptStr="";
		
		r1=Integer.parseInt(key.charAt(0)+"");
		r2=Integer.parseInt(key.charAt(2)+"");
		r3=Integer.parseInt(key.charAt(4)+"");
		r4=Integer.parseInt(key.charAt(6)+"");
		System.out.println(r1+" " +r2+" " +r3+" " +r4+" "); // temporary


		while((DataSrc=br.readLine())!=null)
		{
			System.out.println(DataSrc);
			index=0;
			
			do
			{
				if(index<DataSrc.length())
				{
					if(index%2==0)
					{
						if(r1%2==0)
						{
							EncptStr=EncptStr+(char)(DataSrc.charAt(index)-encpArray1[eA1point]);
							eA1point++;
							if(eA1point>=encpArray1.length)
								eA1point=0;
							index++;
						}
						else
						{
							EncptStr=EncptStr+(char)(DataSrc.charAt(index)-encpArray2[eA2point]);
							eA2point++;
							if(eA2point>=encpArray2.length)
								eA2point=0;
							index++;
						
						}
					}
					else
					{
						if(r2%2==0)
						{
							EncptStr=EncptStr+(char)(DataSrc.charAt(index)-encpArray3[eA3point]);
							eA3point++;
							if(eA3point>=encpArray3.length)
								eA3point=0;
							index++;
						}
						else
						{
							EncptStr=EncptStr+(char)(DataSrc.charAt(index)-encpArray4[eA4point]);
							eA4point++;
							if(eA4point>=encpArray4.length)
								eA4point=0;
							index++;
						
						}
						
					}
					
				}
			}
			while(index<DataSrc.length());
			//print to file
                        System.out.println(EncptStr);
			fw.write(EncptStr);
			EncptStr="";
			
			
				
			}
                         fw.close();

                
                
		
			
				
		}

		
		
		
		 
		
		
		
		
	}



