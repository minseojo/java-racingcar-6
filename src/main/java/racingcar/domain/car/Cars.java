package racingcar.domain.car;

import java.util.List;

public record Cars(List<Car> cars) {
    public Cars(List<Car> cars) {
        this.cars = List.copyOf(cars);
    }
}
