import java.util.Scanner;

public class TestGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for the game:");

        System.out.println("Team 1:");
        Team team1 = createTeam(scanner);

        System.out.println("\nTeam 2:");
        Team team2 = createTeam(scanner);

        System.out.println("Enter game time (e.g., 7 PM): ");
        String gameTime = scanner.nextLine();

        Game game = new Game(team1, team2, gameTime);

        displayGameInfo(game);

        scanner.close();
    }

    public static Team createTeam(Scanner scanner) {
        System.out.println("Enter high school name: ");
        String highSchoolName = scanner.nextLine();

        System.out.println("Enter sport: ");
        String sport = scanner.nextLine();

        System.out.println("Enter team name: ");
        String teamName = scanner.nextLine();

        return new Team(highSchoolName, sport, teamName);
    }

    public static void displayGameInfo(Game game) {
        System.out.println("\nGame Details:");
        System.out.println("Game Time: " + game.getGameTime());

        System.out.println("\nTeam 1:");
        displayTeamInfo(game.getTeam1());

        System.out.println("\nTeam 2:");
        displayTeamInfo(game.getTeam2());
    }

    public static void displayTeamInfo(Team team) {
        System.out.println("High School Name: " + team.getHighSchoolName());
        System.out.println("Sport: " + team.getSport());
        System.out.println("Team Name: " + team.getTeamName());
        System.out.println("Motto: " + Team.MOTTO);
    }
}
