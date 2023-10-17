public class BowlingTeam {
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

    public static void main(String[] args) {
        BowlingTeam myTeam = new BowlingTeam();
        myTeam.setTeamName("Example Team");

        myTeam.setMember(0, "Member 1");
        myTeam.setMember(1, "Member 2");
        myTeam.setMember(2, "Member 3");
        myTeam.setMember(3, "Member 4");

        System.out.println("Team Name: " + myTeam.getTeamName());
        System.out.println("Team Member 2: " + myTeam.getMember(1));
    }
}
