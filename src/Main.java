public class Main {
    public static void main(String[] args) {
        // Создание объекта ServiceStation
        ServiceStation station = new ServiceStationImpl();

        // Создание объектов классов Bicycle, Car и Truck
        Bicycle mountainBike = new Bicycle(2, 30, "горный");
        Bicycle roadBike = new Bicycle(2, 40, "шоссейный");
        Car toyotaCamry = new Car(4, 220, "бензиновый", "Toyota", "Camry");
        Car fordMustang = new Car(4, 250, "бензиновый", "Ford", "Mustang");
        Truck truck = new Truck(6, 160, "дизельный", 10.0);

        // Обслуживание всех объектов на станции
        station.service(mountainBike); // Вывод: Обслужено колёс - 2
        //        Обслужено навесное оборудование велосипеда типа "горный"
        station.service(roadBike); // Вывод: Обслужено колёс - 2
        //        Обслужено навесное оборудование велосипеда типа "шоссейный"
        station.service(toyotaCamry); // Вывод: Обслужено колёс - 4
        //        Обслужен двигатель типа "бензиновый"
        //        Обслужен автомобиль марки "Toyota" модели "Camry"
        station.service(fordMustang); // Вывод: Обслужено колёс - 4
        //        Обслужен двигатель типа "бензиновый"
        //        Обслужен автомобиль марки "Ford" модели "Mustang"
        station.service(truck); // Вывод: Обслужено колёс - 6
        //        Обслужен двигатель типа "дизельный"
        //        Обслужен грузовик с грузоподъемностью 10.0 тонн
    }
}