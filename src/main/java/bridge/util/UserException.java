package bridge.util;

public class UserException {
    public int bridgeSizeException(String input) {
        try {
            int size = bridgeSizeNumberException(input);
            bridgeSizeRangeException(size);
            return size;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }
    }

    public int bridgeSizeNumberException(String input) {
        try {
            int size = Integer.parseInt(input);
            return size;
        } catch (NumberFormatException e) {
            System.out.println("[ERROR] 다리 길이는 3부터 20 사이의 숫자여야 합니다.");
            throw new IllegalArgumentException();
        }
    }

    public void bridgeSizeRangeException(int size) {
        if (size < 3 || size > 20) {
            System.out.println("[ERROR] 다리 길이는 3부터 20 사이의 숫자여야 합니다.");
            throw new IllegalArgumentException();
        }
    }
}