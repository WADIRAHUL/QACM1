package Practice;

public class EException {
	
		public static void Sheela() throws Exception
		{
			System.out.println("Sheela came"); 
			int a=10;
			int b=0;
			int res =a/b;
			System.out.println(res);
			System.out.println("Sheela went");
		}
		public static void main(String[] args) throws Exception
		{
			System.out.println("Main Begin");
			jimmu();
			System.out.println("Main End");
		}
		public static void jimmu() throws Exception
		{
			System.out.println("Jimmu came");
			Sheela();
			System.out.println("Jimmu Waiting");
		}
	}





