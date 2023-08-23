package Test;

public class Food {

    float water;
    float butter;
    float flour;
    float salt;

//  16 лепех
    Food(float water, float butter, float flour, float salt) {
        this.butter = butter;
        this.flour = flour;
        this.salt = salt;
        this.water = water;
    }

    public void quantity4() {
        System.out.println("Количество ингридиентов в граммах для 4 тортиллий");
        System.out.println("Мука: " + flour / 4);
        System.out.println("Масло: " + butter / 4);
        System.out.println("Вода: " + water / 4);
        System.out.println("Соль(чайные ложки): " + salt / 4);
    }

    public static void main(String[] args) {
        Food f1 = new Food(200, 50, 320, 0.5f);
        f1.quantity4();
    }
}
