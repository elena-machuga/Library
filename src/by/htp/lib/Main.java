package by.htp.lib;

public class Main {

	public static void main(String[] args) {
		
//		Student sergey = new Student("Sergey", 33, "Asus", "Minsk", 5.0);
//		Student blackhorse = new Student("Olen'", 5);
//		Student progulshchik = new Student("Progulshchik", 22, "Gomel");
//		Student novichek = new Student("Vasya", 20, "Lenovo", "Vitebsk");
//		Student bomzh = new Student("Bomzhara", 25, "Dell", 10.0);
//		System.out.println();
		
		Book poemsPushkin = new Book("Poems", "Pushkin", 2000, 200, "poetry");
		Book hamletShakespeare = new Book("Hamlet", "Shakespeare", 2014, 98, "poetry");
		Book stakhKorotkevich = new Book("Wild Hunting of King Stakh", "Korotkevich", 1998, 526, "novel");
		Book civilCode = new Book("Ñivil Code", 2000, 980, "law");
		Book poirotChristie = new Book("Hercule Poirot", "Christie", 2017, 365, "detective");
		Book hiddenPanov = new Book("Hidden City", "Panov", 2009, 748, "fantasy");
		
		Library library = new Library();
		
		library.addBook(poemsPushkin);
		library.addBook(hamletShakespeare);
		library.addBook(stakhKorotkevich);
		library.addBook(civilCode);
		library.addBook(poirotChristie);
		library.addBook(hiddenPanov);
		
		System.out.println(library.toString());
		
		library.removeBook(civilCode);
		
		System.out.println(library.toString());
		
		library.borrowBook("Poems");
		System.out.println(poemsPushkin.toString());
		
		library.searchByTitle("hercule poirot");
		library.searchByTitle("hercul poirot");
		
		Book columbus = new Book("Columbus", 2001, 325, "adventure");
		
		library.searchBook(columbus);
		library.searchBook(hiddenPanov);
		
		library.returnBook("Poems");
		System.out.println(poemsPushkin.toString());

	}

}
