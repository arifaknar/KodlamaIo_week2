package week2_work;

public class Main {

	public static void main(String[] args) {

		Cource cource1= new Cource();
		cource1.CourceAdd(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp�(C#/Angular)", "./images/cource1.jpg", 
				"Engin DEM�RO�", 38);
		Cource cource2=new Cource();
		cource2.CourceAdd(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp�(Java/React)", "./images/cource2.jpg", 
				"Engin DEM�RO�", 73);
		Cource cource3=new Cource();
		cource3.CourceAdd(3, "Yaz�l�m Geli�tirici Yeti�tirme Kamp�(Php/Vue)", "./images/cource2.jpg", 
				"Engin DEM�RO�", 61);
		
		Cource cources[]= {cource1,cource2,cource3};
		System.out.println("\nKurslar�m�z: \n......");
		
		for(Cource cource:cources) {
			
			
			System.out.print( cource.id+"    "+cource.courceName+"    "+cource.courceImageUrl+"   "+
			cource.teacherName+"   "+cource.progressLevel+" Course State:  ");
			Cource.CourseState(cource.progressLevel);
			System.out.println();
		}
			
	
		
		/*Category category1=new Category(1,"Kurslar�m");
		Category category2=new Category(2,"Kampa Haz�rl�k");
		Category category3=new Category(3,"T�m Kurslar�m");
		Category category4=new Category(4,"S�k Sorulan Sorular");
		Category categories[]= {category1,category2,category3,category4};
		System.out.println("Categories:");
		for(Category category:categories) {
			System.out.println(category.categoryId+" "+category.categoryName);
			
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
