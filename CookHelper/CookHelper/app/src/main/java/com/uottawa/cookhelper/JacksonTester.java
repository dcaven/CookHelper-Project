package com.uottawa.cookhelper;

/**
 * Created by Odera on 11/30/2016.
 */

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonMethod;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.JsonGenerationException;

//import static com.uottawa.cookhelper.Ingredient.Units.grams;


public class JacksonTester {
    public static void main(String args[]) {

        float quantity = 30;
        String name = "onions";
        String unit = "grams";
        Ingredient ing = new Ingredient(name, quantity, unit);
        Ingredient ing1 = new Ingredient("mango", 30, "teaSpoon");


        LinkedList<Ingredient> ingredientsList = new LinkedList<>();
        ingredientsList.add(ing);
        ingredientsList.add(ing1);

        LinkedList<String> stepsList = new LinkedList<>();
        stepsList.add("fuck you");
        stepsList.add("then kill yourself");

        //Recipe(String name, String type, String origin, String cat, LinkedList<Ingredient> list, LinkedList<String> steps

        Recipe pie = new Recipe("Pie", "Chicken", "China", "appetizer", ingredientsList, stepsList);
        Recipe swag = new Recipe("Swag", "Beef", "Nigeria", "mainDish", ingredientsList, stepsList);
        try {
            writeJSON(pie, pie.getName());
            writeJSON(swag, swag.getName()) ;
        }
        catch (JsonParseException e) { e.printStackTrace(); }
        catch (JsonMappingException e) { e.printStackTrace(); }
        catch (IOException e) { e.printStackTrace(); }

    }
    public static void writeJSON(Recipe rep, String name) throws JsonGenerationException, JsonMappingException, IOException{
        ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(JsonMethod.FIELD, JsonAutoDetect.Visibility.ANY);
        mapper.writeValue(new File(name + ".json"), rep);
    }
    private Recipe readJSON() throws JsonParseException, JsonMappingException, IOException{
        ObjectMapper mapper = new ObjectMapper();
        Recipe rep = mapper.readValue(new File("rep.json"), Recipe.class);
        return rep;
    }

}



