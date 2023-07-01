import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

public class ex{
    public static void main(String[] args) {
        NoteBook noteBook1 = new NoteBook("5770","Dell");
        noteBook1.Color("black");
        noteBook1.HDD(1000);
        noteBook1.OS("windows");
        noteBook1.RAM(16);
        
        NoteBook noteBook2 = new NoteBook("15LT6","Lenovo");
        noteBook2.Color("white");
        noteBook2.HDD(500);
        noteBook2.OS("windows");
        noteBook2.RAM(8);

        NoteBook noteBook3 = new NoteBook("AC75","Acer");
        noteBook3.Color("white");
        noteBook3.HDD(2000);
        noteBook3.OS("linux");
        noteBook3.RAM(4);

        NoteBook noteBook4 = new NoteBook("OMAN11","Xiomi");
        noteBook4.Color("white");
        noteBook4.HDD(1500);
        noteBook4.OS("windows");
        noteBook4.RAM(32);

        NoteBook noteBook5 = new NoteBook("15-DW","HP");
        noteBook5.Color("silver");
        noteBook5.HDD(1000);
        noteBook5.OS("linux");
        noteBook5.RAM(8);

        HashSet <NoteBook> noteBooks = new HashSet<>(Arrays.asList(noteBook1,noteBook2,noteBook3,noteBook4,noteBook5));
        sortNoteBooks(noteBooks);
    }
      
    public static void sortNoteBooks(HashSet <NoteBook> noteBooks){
        HashSet <NoteBook> result = new HashSet<>();
        System.out.println("Здравствуйте");
        System.out.print("Введите цифру, соответствующую необходимому критерию (1 - ОЗУ, 2 - Объем ЖД, 3 - Операционная система, 4 - цвет, 5 - поиск): ");
        Scanner scan = new Scanner(System.in);
        Integer num = scan.nextInt();
        scan.nextLine();
        HashMap<String, Object> filters = new HashMap<>();
        while(num != 5){
            switch(num){
            case (1):
                System.out.println("Введите минимальную оперативную память");
                Integer op = scan.nextInt();
                scan.nextLine();
                filters.put("RAM", op);
                break;
            case(2):
                System.out.println("Введите минимальный объем ЖД" );
                Integer hdd = scan.nextInt();
                scan.nextLine();
                filters.put("HDD", hdd);
                break;
            case(3):
                System.out.println("Введите ОС");
                String os = scan.nextLine();
                filters.put("OS", os);
                break;
            case(4):
                System.out.println("Введите цвет");
                String col = scan.nextLine();
                filters.put("color", col);
                break;
            }
        
        System.out.println("Введите цифру, соответствующую необходимому критерию (1 - ОЗУ, 2 - Объем ЖД, 3 - Операционная система, 4 - цвет, 5 - поиск): ");
        num = scan.nextInt();
        scan.nextLine();
    }
    scan.close();
        for (Entry<String, Object> entry : filters.entrySet()) {
            if(entry.getKey().equals("RAM")){
                Iterator it = noteBooks.iterator();
                while(it.hasNext()){
                    NoteBook noteBook = (NoteBook) it.next();
                    if(noteBook.getRAM() == (Integer)entry.getValue()){
                        result.add(noteBook);
                    }
                }
            }
            if(entry.getKey().equals("HDD")){
                Iterator it = noteBooks.iterator();
                while(it.hasNext()){
                    NoteBook noteBook = (NoteBook)it.next();
                    if(noteBook.getHDD() == (Integer)entry.getValue()){
                        result.add(noteBook);
                    }
                }
            }
            if(entry.getKey().equals("OS")){
                Iterator it = noteBooks.iterator();
                while(it.hasNext()){
                    NoteBook noteBook = (NoteBook)it.next();
                        if(noteBook.getOS().equals(entry.getValue())){
                            result.add(noteBook);
                        }
                    }
                }
            if(entry.getKey().equals("color")){
                Iterator it = noteBooks.iterator();
                while(it.hasNext()){
                    NoteBook noteBook = (NoteBook)it.next();
                        if(noteBook.getColor().equals(entry.getValue())){
                            result.add(noteBook);
                        }
                    }
                }
            }
        
            Iterator it = result.iterator();
            while(it.hasNext()){
                NoteBook noteBook = (NoteBook)it.next();
                System.out.println(noteBook.toString());
                System.out.println();
            }
        }
}