import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public enum Rom {
    I(1), IV(4), V(5), IX(9), X(10),XX(20);

    private int value;

    Rom(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static List<Rom> getReverseSortedValues() {
        return Arrays.stream(values())
                .sorted(Comparator.comparing((Rom e) -> e.value).reversed())
                .collect(Collectors.toList());
    }
}
