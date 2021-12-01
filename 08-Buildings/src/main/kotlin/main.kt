package buildings

// Generic class exercise
/*
    Create a generic function for type BaseBuildingMaterial and call it isSmallBuilding,
    which takes a Building with a building material T as an argument. If the materials
    needed are less than 500, print "small building", otherwise, print "large building".
*/

fun main(args: Array<String>) {
    var house = Building(Wood())
    house.build()
    var school = Building(Brick())
    school.build()
    isSmallBuilding(house)
    isSmallBuilding(school)
}

open class BaseBuildingMaterial(val numberNeeded: Int = 1)

class Wood : BaseBuildingMaterial(4)

class Brick : BaseBuildingMaterial(8)

class Building<out T: BaseBuildingMaterial>(val buildingMaterial: T) {
    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = buildingMaterial.numberNeeded * baseMaterialsNeeded

    fun build() {
        println("$actualMaterialsNeeded ${buildingMaterial::class.simpleName} required.")
    }
}

fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) println("Small building")
    else println("large building")
}
