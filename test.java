package Test;

import java.util.Scanner;

public class test {

 

	@SuppressWarnings("unused")

	public static void main(String[] args) {

		//���� ������

				int[] kor_dapji = new int[] {1,2,3,4,1,2,3,4,1,2};

				int[] eng_dapji = new int[] {1,2,3,4,1,2,3,4,1,2};

				int[] mat_dapji = new int[] {1,2,3,4,1,2,3,4,1,2};

				System.out.print("ans ");

				for(int i =0; i<10; i++)

 

				System.out.printf("%2d",kor_dapji[i]);

 

				int i = 0;

				System.out.printf("%2d",eng_dapji[i]);

 

				System.out.printf("%2d",mat_dapji[i]);

 

				System.out.println("\n-------------------------");

 

				

 

				for (int j=0; j<3; j++) //�л� ���� n�� 

 

				{

 

					//�л� �����

 

					int[] stu_dapji = new int[10];

 

					

 

					//����

 

					System.out.printf("stu%d",j);

 

					for(int i1=0; i1<10; i1++)

 

					{

 

						stu_dapji[i1] = (int)(Math.random()*4+1); //1~4

 

						System.out.printf("%2d",stu_dapji[i1]);

 

					}

 

					

 

					//ä��

 

					System.out.print("\n    ");

 

					int o = 0;//���� ����

 

					for (int i1=0; i1<10; i1++)

 

					{

 

						if (kor_dapji[i1] == stu_dapji[i1])

 

						{

 

							o++;

 

							System.out.print(" O");

 

						}

 

						else

 

							System.out.print(" X");

 

					}

 

					//������ǥ

 

					System.out.printf("  jumsu = %d\n", o*10);

 

				} //�л� 3�� for

 

				

 

				// stu0 10 stu1 20 stu2 30, max

 

				// int[] kor_stu_score = new int[3];

 

				// kor_stu_score[j] = jumsu; line44

 

				

 

		Scanner s = new Scanner(System.in);

 

		int n =0; //�л� �� set

 

 

 

		test t = new test();

 

		

 

		while(true)

 

		{

 

			System.out.println("--------------------");

 

			System.out.println(" 1 : ä��         ");

 

			System.out.println(" 2 : ���� ó��         ");

 

			System.out.println(" 3 : ������ ���ϱ�        ");

 

			System.out.println(" 4 : �Ұ�            ");

 

			System.out.println(" 5 : exit         ");

 

			System.out.println("---------------------");

 

			System.out.print(" menu select : ");

 

		    String sel = s.next();

 

		    

 

		    if (sel.equals("1"))  //���ڿ� ��

		    {	

 

				t.kor_check();

 

				t.eng_check();

 

				t.mat_check();

 

		    }

 

		    else if (sel.equals("2"))

		    {

		    	int stuno = 101;

		    	int mid = 30;

		    	int gm = 30;

		    	int rp = 20;

		    	int chul = 10;

		    	int tot = stuno + mid + gm + rp + chul;

		    	System.out.println("============================");

		    	System.out.println("�й�  �߰� �⸻ ����Ʈ �⼮ ���� ����");

		    	System.out.println("cs101 30 30  20    10  90  A0 ");

		    	System.out.println("----------------------------");

		    }

		    	

		    else if (sel.equals("3"))

		    {
		     double tot = 0;
			double grade = tot;
		      if(grade >= 90)
		    	  System.out.print("A");
		      else if
			      	(grade >= 80)
			    	  System.out.print("B");
		      else if
				      (grade >= 70)
				    	  System.out.print("C");
				  else if
				    (grade >= 65)
				  	  System.out.print("D");
				    else
				    	(grade >= 60)
				    	  System.out.print("F");

		    }

		    

		    else if (sel.equals("4"))

		    {

		    	System.out.println("�ڹ� ���ҷ���");

		    }

		    else if (sel.equals("5"))

		    {

               break;

		    }

		    else continue;

		}

	}

 

		     

 

		

 

	//�ʵ�

 

	private int[] kor_stu;

 

	private int[] eng_stu;

 

	private int[] mat_stu;

 

	

 

	// ??? �ʵ� ����???

 

	private int n; //�л� ��

 

	

 

	//��ü ���� �ʱ�ȭ

 

	public test()

 

	{

 

		Scanner s = new Scanner(System.in);

 

		

 

		kor_stu = null;

 

		eng_stu = null;

 

		mat_stu = null;

 

		System.out.print("n :");

 

		n = s.nextInt();

 

		kor_stu = new int[n];

 

		eng_stu = new int[n];

 

		mat_stu = new int[n];

 

		for(int i =0; i<n; i++)

 

		{

 

			kor_stu[i] = eng_stu[i] = mat_stu[i] = 0;

 

		}

 

	}

 

	public void kor_check()

 

	{

 

		//���� ������ ����

 

		int[] kor_dapji = new int[10];

 

		for(int i=0; i<10; i++)

 

		{

			kor_dapji[i] = (int)(Math.random()*4+1);

		}

	}

 

		

 

 

		public void eng_check()

 

		{

 

			//���� ������ ����

 

			int[] eng_dapji = new int[10];

 

			for(int i=0; i<10; i++)

 

			{

 

				eng_dapji[i] = (int)(Math.random()*4+1);

 

			}

		}

		

		

			public void mat_check()

 

			{

 

				//���� ������ ����

 

				int[] mat_dapji = new int[10];

 

				for(int i=0; i<10; i++)

 

				{

 

					mat_dapji[i] = (int)(Math.random()*4+1);

 

				}

 

			

 

		System.out.print("ans ");

 

		int[] kor_dapji = null;

 

		int[] eng_dapji = null;

 

		int[] mat_dapji1 = null;

 

		for(int i =0; i<10; i++)

 

		System.out.printf("%2d",kor_dapji[i]);

 

		int i = 0;

 

		System.out.printf("%2d",eng_dapji[i]);

 

		System.out.printf("%2d",mat_dapji1[i]);

 

		System.out.println("\n-------------------------");

 

				

 

		// for(int i=0; i<n; i++) kor_stu[i] = 0; // reset

 

		for (int j=0; j<n; j++) //�л� ���� n�� 

 

		{

 

			//�л� �����

 

			int[] stu_dapji = new int[10];

 

			

 

			//����

 

			System.out.printf("stu%d",j);

 

			for(int i1=0; i1<10; i1++)

 

			{

 

				stu_dapji[i1] = (int)(Math.random()*3+1); //1~3

 

				System.out.printf("%2d",stu_dapji[i1]);

 

			}

 

			

 

			//ä��

 

			System.out.print("\n    ");

 

			int o = 0;//���� ����

 

			for (int i1=0; i1<10; i1++)

 

			{

 

				if (kor_dapji[i1] == stu_dapji[i1])

 

				{

 

					o++;

 

					System.out.print(" O");

 

				}

 

				else

 

					System.out.print(" X");

 

			}

 

			//������ǥ

 

			System.out.printf("  jumsu = %d\n", o*10);

 

			kor_stu[j] = o*10; // ??? max ave

 

		} //�л� n�� for

 

	}

 

	

 

	public Object find_max() 

 

	{

 

		

 

		//kor max min

 

    	int kor = 0;

 

    	int eng = 100;

 

    	int mat= 30;

 

    	int hap =0, ave=0;

 

    	for (int i=0; i<n; i++)

 

    	{

 

    		if (kor < kor_stu[i])

 

    			kor = kor_stu[i];

 

    		hap += kor_stu[i];

 

    		

 

    		if

 

    		(mat <mat_stu[i])

 

    		mat = mat_stu[i];

 

    		hap+= mat_stu[i];

 

    		

 

    		if (eng < eng_stu[i])

 

    			eng = eng_stu[i];

 

    		hap += eng_stu[i];

 

    	}

 

    	System.out.printf("kor : %d\n", kor);

 

    	System.out.printf("eng : %d\n", eng);

 

    	System.out.printf("mat : %d\n", mat);

 

    	System.out.printf("ave : %d\n", ave);

	//�޼ҵ�

	return ave;

	} //main

}//class