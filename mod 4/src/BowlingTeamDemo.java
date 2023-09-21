import java.util.*;

public class BowlingTeamDemo {
    public static void main(String[] args) {
        final int NUM_TEAMS = 4;
        final int NUM_TEAM_MEMBERS = 4;
        Scanner input = new Scanner(System.in);
        
        BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
        
        for (int i = 0; i < NUM_TEAMS; i++) {
            teams[i] = new BowlingTeam();
            
            System.out.print("Enter team " + (i + 1) + " name >> ");
            String teamName = input.nextLine();
            teams[i].setTeamName(teamName);
            
            for (int j = 0; j < NUM_TEAM_MEMBERS; j++) {
                System.out.print("Enter team member's name for team " + (i + 1) + " >> ");
                String memberName = input.nextLine();
                teams[i].setMember(j, memberName);
            }
        }
        
        for (int y = 0; y < NUM_TEAMS; ++y) {
            System.out.println("\nMembers of team " + teams[y].getTeamName());
            for (int x = 0; x < NUM_TEAM_MEMBERS; ++x)
                System.out.print(teams[y].getMember(x) + " ");
            System.out.println();
        }
    }
}

class BowlingTeam {
    private String teamName;
    private String[] members = new String[4];

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
