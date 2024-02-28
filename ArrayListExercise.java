import java.util.ArrayList;

public class ArrayListExercise {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Purple");

        for (String color : colors) {
            System.out.println(color);
        }

        colors.add(2, "Grey");
        colors.remove(1);
        System.out.println(colors);

        String searchTerm = "Green";
        String searchResult = searchColor(colors, searchTerm);
        System.out.println(searchResult);
    }
        public static String searchColor(ArrayList<String> colors, String searchTerm){
            int index = -1;
            for (int i = 0; i < colors.size(); i++){
                if (colors.get(i).equalsIgnoreCase(searchTerm)){
                    index = i;
                    break;

                }
            }
        if (index!= -1) {
            return "Color=" + searchTerm + "   Index=" + index;
        } else {
            return "Color not found in the ArrayList";
        }

        }
    }


