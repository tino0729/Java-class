import java.util.*;

public class BowlingTeamDemo4 {
    public static void main(String[] args) {
        final int NUM_TEAMS = 4;
        BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
        
        // Call the getTeamData method to populate the teams array
        getTeamData(teams);

        System.out.print("\n\nEnter a team name to see its roster >> ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        for (int y = 0; y < teams.length; ++y) {
            if (name.equals(teams[y].getTeamName())) {
                System.out.println("\nMembers of team " + teams[y].getTeamName());
                for (int x = 0; x < BowlingTeam.NUM_TEAM_MEMBERS; ++x) {
                    System.out.print(teams[y].getMember(x) + " ");
                }
                System.out.println();
            }
        }
    }

    // New method to populate the BowlingTeam array
    public static void getTeamData(BowlingTeam[] teams) {
        String name;
        final int NUM_TEAMS = 4;
        int x;
        int y;
        final int NUM_TEAM_MEMBERS = 4;
        Scanner input = new Scanner(System.in);

        for (y = 0; y < NUM_TEAMS; ++y) {
            teams[y] = new BowlingTeam();
            System.out.print("Enter team name >> ");
            name = input.nextLine();
            teams[y].setTeamName(name);
            for (x = 0; x < NUM_TEAM_MEMBERS; ++x) {
                System.out.print("Enter team member's name >> ");
                name = input.nextLine();
                teams[y].setMember(x, name);
            }
        }
    }
}

class BowlingTeam {
    private String teamName;
    private String[] members = new String[4];
    
    public static final int NUM_TEAM_MEMBERS = 4;

    public void setTeamName(String team) {
        teamName = team;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setMember(int number, String name) {
        members[number] = name;
    }

    public String getMember(int number) {
        return members[number];
    }
}
