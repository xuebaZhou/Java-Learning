package LibraryArangement;

import java.util.Scanner;

public class BookManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("请选择操作：");
            System.out.println("1. 插入图书");
            System.out.println("2. 删除图书");
            System.out.println("3. 查找图书");
            System.out.println("0. 退出");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 读取换行符

            switch (choice) {
                case 1:
                    System.out.println("请输入图书信息：");
                    System.out.print("书名：");
                    String title = scanner.nextLine();
                    System.out.print("作者：");
                    String author = scanner.nextLine();
                    System.out.print("出版社：");
                    String publisher = scanner.nextLine();
                    System.out.print("刊号：");
                    int issueNumber = scanner.nextInt();
                    scanner.nextLine(); // 读取换行符
                    System.out.print("出版日期：");
                    String publicationDate = scanner.nextLine();
                    System.out.print("页数：");
                    int pages = scanner.nextInt();
                    scanner.nextLine(); // 读取换行符
                    System.out.print("摘要：");
                    String summary = scanner.nextLine();

                    Book book = new Book(title, author, publisher, issueNumber, publicationDate, pages, summary);
                    library.insertBook(book);
                    break;

                case 2:
                    System.out.print("请输入要删除的图书的书名：");
                    String deleteTitle = scanner.nextLine();
                    library.deleteBook(deleteTitle);
                    break;

                case 3:
                    System.out.print("请输入关键字：");
                    String keyword = scanner.nextLine();
                    library.searchBooks(keyword);
                    break;

                case 0:
                    System.out.println("程序已退出，谢谢使用！");
                    return;

                default:
                    System.out.println("无效的选择！");
                    break;
            }
        }
    }
}