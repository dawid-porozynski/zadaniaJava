
public class Main {
    public class Card {
        public enum value {
            King, Ace, Queen, Jack, Ten, Nine, Eight, Seven, Six, Five, Four, Three, Two, One
        }
        public enum color {
            Spade, Heart, Diamond, Club
        }
    }
    public static void main(String[] args) {

        System.out.println(Card.color.Spade+" "+Card.value.Five);
        System.out.println(Card.color.Diamond+ " "+Card.value.Ace);
        System.out.println(Card.color.Heart+" "+Card.value.Jack);
    }
}