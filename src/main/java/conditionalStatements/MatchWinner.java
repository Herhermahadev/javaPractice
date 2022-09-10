package conditionalStatements;
//With if-else check winner of the match on base of score
public class MatchWinner {
    public static void winner(int TeamIndia,int TeamAustralia,int TeatUk)
    {
        if(TeamAustralia>TeamIndia && TeamAustralia>TeatUk){
            System.out.println("Team Australia is the winner");
        }
        else if(TeamIndia>TeamAustralia && TeamIndia>TeatUk){
            System.out.println("Team India is the winner");
        }
        else {
            System.out.println("Team UK is the winner");
        }

    }

    public static void main(String[] args) {
        winner(210,195,209);
    }

}
