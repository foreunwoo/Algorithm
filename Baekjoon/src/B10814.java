import java.util.*;

public class B10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp;
        String tmp2;

        Client[] clients = new Client[n];

        for(int i=0; i<clients.length; i++) {
            int age = sc.nextInt();
            String name = sc.next();

            clients[i] = new Client(age, name);
        }

        for(int i=0; i< clients.length-1; i++) {
            for(int j=i+1; j< clients.length; j++) {
                if(clients[i].getAge() > clients[j].getAge()) {
                    tmp = clients[i].getAge();
                    clients[i].setAge(clients[j].getAge());
                    clients[j].setAge(tmp);

                    tmp2 = clients[i].getName();
                    clients[i].setName(clients[j].getName());
                    clients[j].setName(tmp2);
                }
            }

        }

        for(int i=0; i<clients.length; i++) {
            clients[i].show();
        }

    }

}

class Client {
    private int age;
    private String name;

    public Client(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(getAge()+" "+getName());
    }
}
