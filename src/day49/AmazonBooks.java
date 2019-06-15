package day49;

import day49_2.EBook;

public class AmazonBooks {

	public static void main(String[] args) {
		PaperBook book1 = new PaperBook();
		book1.author = "Mark Twain";
//		book1.setTitle("The Adventures of Tom Saweyer");
		book1.chapterCount = 33;
		book1.isHardcover = true;
		book1.price = 19.99;
		book1.pageCount = 274;
		System.out.println(book1);
		
		//book1 is a instance of Book class?
		//because Book is a super class for PaperBook
		//thus, book2 is an instance of Book too
		//instanceof this is the keyword that indicates
		//if instance related to the class
		System.out.println(book1 instanceof Book);
		//not even will compile --> System.out.println(book1 instanceof Animal);
	
		EBook ebook1=new EBook();
		ebook1.author="Walter Savich";
		System.out.println(ebook1);
	}
}
