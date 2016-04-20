import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.Random;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/home.vtl" );
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());


  } //end of main function

  public ArrayList<Integer> doesApp(Integer val) {
    Random gen = new Random();
    ArrayList<Integer> results = new ArrayList<Integer>();
    results.add(val);
    Integer choiceAI = gen.nextInt(3);
    results.add(choiceAI);

    System.out.println(results);
    return results;
  }

  public String addRpsPlayer(ArrayList<Integer> resultArray){
    HashMap<String, Integer> rps = new HashMap();
    String playerChoice;
    rps.put("rock", 0);
    rps.put("paper", 1);
    rps.put("scissors", 2);

    if(resultArray.get(0) == rps.get("rock")){
      playerChoice = "rock";
    }else if (resultArray.get(0) == rps.get("paper")){
      playerChoice = "paper";
    }else{
      playerChoice = "scissors";
        }

        System.out.println(playerChoice);
        return playerChoice;
  }


  public String addRpsComp(ArrayList<Integer> resultArray){
    HashMap<String, Integer> rps = new HashMap();
    String compChoice;
    rps.put("rock", 0);
    rps.put("paper", 1);
    rps.put("scissors", 2);
    if(resultArray.get(1) == rps.get("rock")){
      compChoice = "rock";
    }else if (resultArray.get(1) == rps.get("paper")){
      compChoice = "paper";
    }else{
      compChoice = "scissors";
        }

    System.out.println(compChoice);
    return compChoice;

  }

public String whoWon(ArrayList<Integer> resultArray){
  Integer pc = resultArray.get(0);
  Integer cc = resultArray.get(1);
  String win = "";
  if(pc == cc){
    win = "none";
    System.out.println(win);
    return win;

  }
  if(pc == cc-1){
    win = "comp";
    System.out.println(win);
    return win;

  }
  if(pc == cc+1){
    win = "player";
    System.out.println(win);
    return win;

  }
  if(pc == cc-2){
    win = "player";
    System.out.println(win);
    return win;

  }
  if(pc == cc+2){
    win = "comp";
    System.out.println(win);
    return win;

  }
  else{
    win = "everything is broken";}
    System.out.println(win);
    return win;


}

}
