package org.example.data.model

data class City(
    val cityName: String,
    val country: String,
    val mealsPrices: MealsPrices,
    val drinksPrices: DrinksPrices,
    val fruitAndVegetablesPrices: FruitAndVegetablesPrices,
    val foodPrices: FoodPrices,
    val servicesPrices: ServicesPrices,
    val clothesPrices: ClothesPrices,
    val transportationsPrices: TransportationsPrices,
    val carsPrices: CarsPrices,
    val realEstatesPrices: RealEstatesPrices,
    val averageMonthlyNetSalaryAfterTax: Float?,
    val dataQuality: Boolean,
)
data class CarsPrices(
    val volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar: Float?,
    val toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar: Float?,
)

data class ClothesPrices(
    val onePairOfJeansLevis50oneOrSimilar: Float?,
    val oneSummerDressInAChainStoreZaraHAndM: Float?,
    val onePairOfNikeRunningShoesMidRange: Float?,
    val onePairOfMenLeatherBusinessShoes: Float?,
)
data class DrinksPrices(
    val cappuccinoRegularInRestaurants: Float?,
    val cokePepsiAThirdOfLiterBottleInRestaurants: Float?,
    val waterAThirdOfLiterBottleInRestaurants: Float?,
    val milkRegularOneLiter: Float?,
    val waterOneAndHalfLiterBottleAtTheMarket: Float?,
)

data class TransportationsPrices(
    val oneWayTicketLocalTransport: Float?,
    val monthlyPassRegularPrice: Float?,
    val taxiStartNormalTariff: Float?,
    val taxi1kmNormalTariff: Float?,
    val taxi1hourWaitingNormalTariff: Float?,
    val gasolineOneLiter: Float?,
)

data class FoodPrices(
    val loafOfFreshWhiteBread500g: Float?,
    val riceWhite1kg: Float?,
    val eggsRegular12: Float?,
    val localCheese1kg: Float?,
    val chickenFillets1kg: Float?,
    val beefRound1kgOrEquivalentBackLegRedMeat: Float?,
)
data class ServicesPrices(
    val basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment: Float?,
    val oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans: Float?,
    val internet60MbpsOrMoreUnlimitedDataCableAdsl: Float?,
    val fitnessClubMonthlyFeeForOneAdult: Float?,
    val tennisCourtRentOneHourOnWeekend: Float?,
    val cinemaInternationalReleaseOneSeat: Float?,
    val preschoolOrKindergartenFullDayPrivateMonthlyForOneChild: Float?,
    val internationalPrimarySchoolYearlyForOneChild: Float?,
)

data class RealEstatesPrices(
    val apartmentOneBedroomInCityCentre: Float?,
    val apartmentOneBedroomOutsideOfCentre: Float?,
    val apartment3BedroomsInCityCentre: Float?,
    val apartment3BedroomsOutsideOfCentre: Float?,
    val pricePerSquareMeterToBuyApartmentInCityCentre: Float?,
    val pricePerSquareMeterToBuyApartmentOutsideOfCentre: Float?,
)


data class MealsPrices(
    val mealInexpensiveRestaurant: Float?,
    val mealFor2PeopleMidRangeRestaurant: Float?,
    val mealAtMcDonaldSOrEquivalent: Float?,
)

data class FruitAndVegetablesPrices(
    val apples1kg: Float?,
    val banana1kg: Float?,
    val oranges1kg: Float?,
    val tomato1kg: Float?,
    val potato1kg: Float?,
    val onion1kg: Float?,
    val lettuceOneHead: Float?,
)