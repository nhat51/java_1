package codesnippet;

public class enumDirection {
    enum Direction{
        East, West, North, South
    }

    public static void main(String[] args) {
        Direction direction;
        direction = Direction.East;
        System.out.println("Value:" + direction);
    }
}
