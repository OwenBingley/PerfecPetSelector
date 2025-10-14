public class PetAssigner {


public static String assignPet(String name, String colorPreference, String favoriteSeason) {


String pet = "pet rock"; // Default pet


boolean nameStartsWithConsonant = !name.matches("^[AEIOUaeiou].*");


if ("blue".equalsIgnoreCase(colorPreference)) {
if ("fall".equalsIgnoreCase(favoriteSeason)) {


pet = "alligator";
} else if ("spring".equalsIgnoreCase(favoriteSeason)) {


pet = "ostrich";
} else if (nameStartsWithConsonant && !"summer".equalsIgnoreCase(favoriteSeason) && !"fall".equalsIgnoreCase(favoriteSeason)) {


pet = "axolotl";

} else if ("green".equalsIgnoreCase(colorPreference)) {


if (nameStartsWithConsonant && "winter".equalsIgnoreCase(favoriteSeason)) {
pet = "giraffe";


} else if (!"fall".equalsIgnoreCase(favoriteSeason)) {
pet = "dog";
}


} else if ("red".equalsIgnoreCase(colorPreference)) {
if (name.matches("^[AEIOUaeiou].*")) {


pet = "porcupine";
} else {
pet = "panda";
}


}


if ("summer".equalsIgnoreCase(favoriteSeason)) {
if (!"dog".equals(pet) && !"panda".equals(pet) && !"porcupine".equals(pet)) {


pet = "pony";
}
}


return pet;
}


public static void main(String[] args) {



String name = "Owen";
String colorPreference = "blue";
String favoriteSeason = "spring";


String assignedPet = assignPet(name, colorPreference, favoriteSeason);
System.out.println("Assigned pet: " + assignedPet);


}
}
