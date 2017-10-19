package by.htp.lib;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> shells;
	private int bookCount;

	public Library() {
		shells = new ArrayList<>();
	}

	public void addBook(Book book) {
		shells.add(book);
		book.setOnHand(false);
		bookCount++;
	}

	public void removeBook(Book book) {
		shells.remove(book);
		bookCount--;
	}

	public void searchBook(Book book) {
		int count = 0;
		for (Book b : shells) {
			if (b.equals(book)) {
				System.out.println(b.toString());
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Book not found.");
		}
	}

	public void searchByTitle(String title) {
		int count = 0;
		for (Book book : shells) {
			if (book.getTitle().equalsIgnoreCase(title)) {
				System.out.println(book.toString());
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Book not found.");
		}

	}

	public void borrowBook(String title) {
		for (Book book : shells) {
			if (book.getTitle().equalsIgnoreCase(title)) {
				book.setOnHand(true);
			}
		}
	}

	public void returnBook(String title) {
		for (Book book : shells) {
			if (book.getTitle().equalsIgnoreCase(title)) {
				book.setOnHand(false);
			}
		}
	}

	@Override
	public String toString() {
		return "Total books in Library: " + bookCount + "\n" + shells;
	}

}
