package LibraryArangement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private String publisher;
    private int issueNumber;
    private String publicationDate;
    private int pages;
    private String summary;

    public Book(String title, String author, String publisher, int issueNumber, String publicationDate, int pages, String summary) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;
        this.pages = pages;
        this.summary = summary;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public int getPages() {
        return pages;
    }

    public String getSummary() {
        return summary;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void insertBook(Book book) {
        books.add(book);
        System.out.println("图书插入成功！");
    }

    public void deleteBook(String title) {
        boolean removed = false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(title)) {
                books.remove(i);
                removed = true;
                break;
            }
        }
        if (removed) {
            System.out.println("图书删除成功！");
        } else {
            System.out.println("未找到图书！");
        }
    }

    public void searchBooks(String keyword) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                results.add(book);
            }
        }
        if (results.isEmpty()) {
            System.out.println("未找到匹配的图书！");
        } else {
            System.out.println("搜索结果：");
            for (Book book : results) {
                System.out.println("书名：" + book.getTitle());
                System.out.println("作者：" + book.getAuthor());
                System.out.println("出版社：" + book.getPublisher());
                System.out.println("刊号：" + book.getIssueNumber());
                System.out.println("出版日期：" + book.getPublicationDate());
                System.out.println("页数：" + book.getPages());
                System.out.println("摘要：" + book.getSummary());
                System.out.println();
            }
        }
    }
}

