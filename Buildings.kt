package Buildings
/*
Connect me on LinkedIn
https://linkedin.com/in/brunorijo

Let’s put this into practice using building materials and a building that needs certain amounts of those materials.
1. Create a new package and file and call them Buildings.
2. Create a class BaseBuildingMaterial with a property numberNeeded that is set to 1.
    You always need 1 of the base material.
3. Create two subclasses, Wood and Brick. For BaseBuildingMaterial you need 4 units of
    wood or 8 units of brick. Now you have a type hierarchy.
4. Create a generic class Building that can take any building material as its argument,
    and only building materials.
5. A building always requires 100 base materials. Add a property baseMaterialsNeeded and set it to 100.
6. Add another property, actualMaterialsNeeded and use a one-line function to calculate
    this from numberNeeded of the passed-in material.
7. Add a method build() that prints the type and number of materials needed.
    Hint: Use reflection to get the class and simple name: instance::class.simpleName
8. Create a main function and make a building using Wood.
9. If you did this correctly, running main() will print something like “400 Wood required”.
10. Create a generic function for type BaseBuildingMaterial and call it isSmallBuilding,
    which takes a Building with a building material T as an argument. If the materials
    needed are less than 500, print "small building", otherwise, print "large building"
* */

fun main() {
    var building1 : Building<Wood> = Building(Wood())
    building1.build()
}

class Building<T>(material: BaseBuildingsMaterial){
    var baseMaterialsNeeded: BaseBuildingsMaterial = BaseBuildingsMaterial(100)
    var actualMaterialsNeeded = baseMaterialsNeeded.numberNeeded.times(material.numberNeeded)
    fun build() = println("The materials name is ${baseMaterialsNeeded::class.simpleName} " +
            "and the number of material is ${actualMaterialsNeeded}")
}

open class BaseBuildingsMaterial(var numberNeeded : Int = 1) {
    fun <T> isSmallBiulding(b: Building<T>)=  if (b.actualMaterialsNeeded >= 500) println("small building") else println("large building")
}
class Wood: BaseBuildingsMaterial(4){}
class Brick: BaseBuildingsMaterial(8){}
