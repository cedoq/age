public class Main {
    public static void main(String[] args) {
        int i;
        int age; //age
        int team=1; //number of teams
        int c = 25; //teammates count
        float mid = 0; // mid age
       /*for(team = 1;team<=2;team++){
            System.out.println(team + " команда ");
            for(i = 1; i<=c;i++){
                age = (int) (Math.random()*100);
                mid = mid + age;
                System.out.print(i + " игроку " + age+ " лет ");
            }
            mid = mid/c;
           System.out.println("");
            System.out.println("средний возраст в команде равен " + mid);

    } */
        for(team = 1;team<=2;team++){
            System.out.println(team + " команда ");
            for(i = 1; i<=c;i++){
                age = (int) (Math.random()*22+18);
                mid = mid + age;
                System.out.print(i + " игроку " + age+ " лет ");
            }
            mid = mid/c;
            System.out.println("");
            System.out.println("средний возраст в команде равен " + mid);

        }
    }}
