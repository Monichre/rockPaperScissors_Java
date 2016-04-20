import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.Random;

public class App {
  public static void main(String[] args) {}

  public ArrayList<Integer> doesApp(Integer val) {
    Random gen = new Random();
    ArrayList<Integer> results = new ArrayList<Integer>();
    results.add(val);
    Integer choiceAI = gen.nextInt(3);
    results.add(choiceAI);

    System.out.println(results);
    return results;
  }

  public HashMap<String, Integer> addRPS(ArrayList<Integer> resultArray){
    HashMap<String, Integer> rps = new HashMap();
    String playerChoice;
    String compChoice;
    rps.put("rock", 0);
    rps.put("paper", 1);
    rps.put("scissors", 2);

    if(resultArray[0] == rps.get("rock")){
      playerChoice = "rock";
    }else if (resultArray[0] == rps.get("paper")){
      playerChoice = "paper";
    }else{
      playerChoice = "scissors";
        }

    if(resultArray[1] == rps.get("rock")){
      compChoice = "rock";
    }else if (resultArray[1] == rps.get("paper")){
      compChoice = "paper";
    }else{
      compChoice = "scissors";
        }









  }
}
