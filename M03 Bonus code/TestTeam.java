import java.util.Scanner;

public class TestTeam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Team team1 = new Team("", "", "");
        Team team2 = new Team("", "", "");
        Team team3 = new Team("", "", "");

        setTeamData(team1, scanner);
        setTeamData(team2, scanner);
        setTeamData(team3, scanner);

        System.out.println("\nTeam 1:");
        displayTeamInfo(team1);

        System.out.println("\nTeam 2:");
        displayTeamInfo(team2);

        System.out.println("\nTeam 3:");
        displayTeamInfo(team3);

        scanner.close();
    }

    public static void setTeamData(Team team, Scanner scanner) {
        System.out.println("Enter high school name: ");
        String highSchoolName = scanner.nextLine();

        System.out.println("Enter sport: ");
        String sport = scanner.nextLine();

        System.out.println("Enter team name: ");
        String teamName = scanner.nextLine();

        team = new Team(highSchoolName, sport, teamName);
    }

    public static void displayTeamInfo(Team team) {
        System.out.println("High School Name: " + team.getHighSchoolName());
        System.out.println("Sport: " + team.getSport());
        System.out.println("Team Name: " + team.getTeamName());
        System.out.println("Motto: " + Team.MOTTO);
    }
}
