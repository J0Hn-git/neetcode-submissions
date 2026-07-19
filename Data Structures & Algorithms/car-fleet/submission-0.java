

class Solution {

    class Car {
        int position;
        double time;

        Car(int position, double time) {
            this.position = position;
            this.time = time;
        }
    }

    public int carFleet(int target, int[] position, int[] speed) {

        int n = position.length;
        Car[] cars = new Car[n];

        // Calculate the time each car takes to reach the target
        for (int i = 0; i < n; i++) {
            double time = (double) (target - position[i]) / speed[i];
            cars[i] = new Car(position[i], time);
        }

        // Sort cars by position in descending order
        Arrays.sort(cars, (a, b) -> b.position - a.position);

        Stack<Double> stack = new Stack<>();

        for (Car car : cars) {

            if (stack.isEmpty()) {
                stack.push(car.time);
            } else {

                // New fleet
                if (car.time > stack.peek()) {
                    stack.push(car.time);
                }
                // Otherwise, this car joins the fleet ahead,
                // so we do nothing.
            }
        }

        return stack.size();
    }
}