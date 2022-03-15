
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        
        ArrayList<ArrayList<String>> recipes = new ArrayList<>();
        ArrayList<String> food = new ArrayList<>();
        
        try (Scanner fs = new Scanner(Paths.get(fileName))) {
            while (fs.hasNextLine()) {
                String row = fs.nextLine();
                if (row.equals("")) {
                    recipes.add(food);
                    food = new ArrayList<>();
                    continue;
                }else {
                    food.add(row);
                }
            }
            recipes.add(food);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        System.out.println("Commands:\n"
                + "list - lists the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient\n");
        
        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("list")) {
                System.out.println("\nRecipes: ");
                for (ArrayList<String> recipe : recipes) {
                    String foodName = recipe.get(0);
                    String cookingTime = recipe.get(1);
                    System.out.println(foodName + ", cooking time: " + cookingTime);
                }
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String searchedFood = scanner.nextLine();
                System.out.println("Recipes:");
                for (int i = 0; i < recipes.size(); i++) {
                    ArrayList<String> currentFood = recipes.get(i);
                    if (currentFood.get(0).toLowerCase().contains(searchedFood.toLowerCase())) {
                        System.out.println(currentFood.get(0) + ", cooking time: " + currentFood.get(1));
                    }
                }
            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int cookingTime = Integer.parseInt(scanner.nextLine());
                
                System.out.println("Recipes:");
                for (ArrayList<String> recipe : recipes) {
                    if (Integer.parseInt(recipe.get(1)) <= cookingTime) {
                        System.out.println(recipe.get(0) + ", cooking time: " + recipe.get(1));
                    }
                }
            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println("Recipes: ");
                for (ArrayList<String> recipe : recipes) {
                    for (int i = 2; i < recipe.size(); i++) {
                        if (recipe.get(i).toLowerCase().equals(ingredient)) {
                            System.out.println(recipe.get(0) + ", cooking time: " + recipe.get(1));
                        }
                    }
                }
            }
            else {
                continue;
            }
        }
        System.out.println(recipes);
    }

}
