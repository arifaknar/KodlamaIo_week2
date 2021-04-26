package week2_work;

public class Cource {
	int id;
	String courceName;
	String courceImageUrl;
	String teacherName;
	int progressLevel;
	
	public void CourceAdd(int id, String courceName, String courceImageUrl, String teacherName, int progressLevel) {
		
		this.id=id;
		this.courceName=courceName;
		this.courceImageUrl=courceImageUrl;
		this.teacherName=teacherName;
		this.progressLevel=progressLevel;
		System.out.println(this.courceName+" adlý kurs eklenmiþtir.");
	}
	
	public static void CourseState(int progressLevel2) {
		
		if(progressLevel2>=70)
		{
			System.out.print("Good");
		}
		else if(progressLevel2>=50){
			
			System.out.print("Middle");
		}
		else {
			System.out.print("Bad");
		}
		
	}
	
	
	
	

}
