package week2_work;

public class Main {

	public static void main(String[] args) {

		Cource cource1= new Cource();
		cource1.CourceAdd(1, "Yazýlým Geliþtirici Yetiþtirme Kampý(C#/Angular)", "./images/cource1.jpg", 
				"Engin DEMÝROÐ", 38);
		Cource cource2=new Cource();
		cource2.CourceAdd(2, "Yazýlým Geliþtirici Yetiþtirme Kampý(Java/React)", "./images/cource2.jpg", 
				"Engin DEMÝROÐ", 73);
		Cource cource3=new Cource();
		cource3.CourceAdd(3, "Yazýlým Geliþtirici Yetiþtirme Kampý(Php/Vue)", "./images/cource2.jpg", 
				"Engin DEMÝROÐ", 61);
		
		Cource cources[]= {cource1,cource2,cource3};
		System.out.println("\nKurslarýmýz: \n......");
		
		for(Cource cource:cources) {
			
			
			System.out.print( cource.id+"    "+cource.courceName+"    "+cource.courceImageUrl+"   "+
			cource.teacherName+"   "+cource.progressLevel+" Course State:  ");
			Cource.CourseState(cource.progressLevel);
			System.out.println();
		}
			
	
		
		/*Category category1=new Category(1,"Kurslarým");
		Category category2=new Category(2,"Kampa Hazýrlýk");
		Category category3=new Category(3,"Tüm Kurslarým");
		Category category4=new Category(4,"Sýk Sorulan Sorular");
		Category categories[]= {category1,category2,category3,category4};
		System.out.println("Categories:");
		for(Category category:categories) {
			System.out.println(category.categoryId+" "+category.categoryName);
			
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
