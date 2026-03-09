import java.util.*;

class Student 
{
    int id;
    String name;
    Student(int id,String name) 
    {
        this.id=id;
        this.name=name;
    }
    void display()
     {
        System.out.println("Student ID: "+id+" | Name: "+name);
    }
}
class Book 
{
    int id;
    String title;
    boolean issued;
    Book(int id,String title) 
    {
        this.id=id;
        this.title=title;
        this.issued=false;
    }
    void display()
     {
        System.out.println("Book ID: "+id+" | Title: "+title+" | Issued: "+issued);
    }
}
class StudentManagement
 {
    ArrayList<Student> students=new ArrayList<>();
    void addStudent(int id,String name)
     {
        students.add(new Student(id,name));
        System.out.println("Student added successfully.");
    }
    void viewStudents()
     {
        if (students.isEmpty())
         {
            System.out.println("No students found.");
            return;
        }
        for (Student s:students) 
        {
            s.display();
        }
    }
    void searchStudent(int id)
     {
        for(Student s:students)
         {
            if (s.id==id) 
            {
                s.display();
                return;
            }
        }
        System.out.println("Student not found.");
    }
    void deleteStudent(int id)
     {
        Iterator<Student> it=students.iterator();
        while (it.hasNext()) 
        {
            Student s=it.next();
            if (s.id==id) 
            {
                it.remove();
                System.out.println("Student deleted.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
class LibraryManagement
 {
    ArrayList<Book> books=new ArrayList<>();
    void addBook(int id,String title) {
        books.add(new Book(id,title));
        System.out.println("Book added successfully.");
    }
    void viewBooks() 
    {
        if (books.isEmpty()) 
        {
            System.out.println("No books available.");
            return;
        }
        for(Book b:books)
         {
            b.display();
        }
    }
    void issueBook(int id)
     {
        for(Book b:books) 
        {
            if (b.id==id) 
            {
                if(!b.issued) 
                {
                    b.issued=true;
                    System.out.println("Book issued successfully.");
                } else 
                {
                    System.out.println("Book already issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
    void returnBook(int id) 
    {
        for(Book b:books) 
        {

            if(b.id==id)
             {
                if(b.issued)
                 {
                    b.issued = false;
                    System.out.println("Book returned successfully.");
                }
                 else 
                {
                    System.out.println("Book was not issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
public class smslms
 {
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        StudentManagement sms=new StudentManagement();
        LibraryManagement lms=new LibraryManagement();
        while (true) 
        {
            System.out.println("\n===== MAIN MENU =====");
            System.out.println("1. Student Management System");
            System.out.println("2. Library Management System");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice=sc.nextInt();
            switch (choice)
             {
                case 1:
                    System.out.println("\n--- Student Management ---");
                    System.out.println("1. Add Student");
                    System.out.println("2. View Students");
                    System.out.println("3. Search Student");
                    System.out.println("4. Delete Student");
                    System.out.print("Enter choice: ");
                    int sChoice = sc.nextInt();
                    if (sChoice == 1) 
                    {
                        System.out.print("Enter Student ID: ");
                        int id = sc.nextInt();
                        System.out.print("Enter Student Name: ");
                        String name = sc.next();
                        sms.addStudent(id, name);
                    }
                    else if(sChoice == 2)
                    {
                        sms.viewStudents();
                    }
                    else if(sChoice == 3) 
                    {

                        System.out.print("Enter Student ID: ");
                        int id=sc.nextInt();
                        sms.searchStudent(id);
                    }
                    else if(sChoice == 4)
                     {
                        System.out.print("Enter Student ID: ");
                        int id=sc.nextInt();
                        sms.deleteStudent(id);
                    }
                    break;
                case 2:
                    System.out.println("\n--- Library Management ---");
                    System.out.println("1. Add Book");
                    System.out.println("2. View Books");
                    System.out.println("3. Issue Book");
                    System.out.println("4. Return Book");
                    System.out.print("Enter choice: ");
                    int lChoice=sc.nextInt();
                    if (lChoice == 1) 
                    {
                        System.out.print("Enter Book ID: ");
                        int id=sc.nextInt();
                        System.out.print("Enter Book Title: ");
                        String title=sc.next();
                        lms.addBook(id, title);
                    }
                    else if(lChoice==2) 
                    {
                        lms.viewBooks();
                    }
                    else if(lChoice==3) 
                    {
                        System.out.print("Enter Book ID: ");
                        int id=sc.nextInt();
                        lms.issueBook(id);
                    }
                    else if(lChoice==4)
                     {
                        System.out.print("Enter Book ID: ");
                        int id=sc.nextInt();
                        lms.returnBook(id);
                    }
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}