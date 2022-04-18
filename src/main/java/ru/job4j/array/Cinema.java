package ru.job4j.array;

import java.util.Objects;

public class Cinema {

    public static Place checkEmptyPlace(Place[][] places) {
        int seatWrong = 0;
        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places[i].length; j++) {
                if (places[i][j] == null) {
                    if (i + 1 < places.length
                            && places[i + 1][j] != null) {
                        seatWrong++;
                    }
                    if (i - 1 > 0 && i - 1 < places.length
                            && places[i - 1][j] != null) {
                        seatWrong++;
                    }
                    if (j - 1 > 0 && j - 1 < places[i].length
                            && places[i][j - 1] != null) {
                        seatWrong++;
                    }
                    if (j + 1 < places[i].length
                            && places[i][j + 1] != null) {
                        seatWrong++;
                    }
                    if (seatWrong == 0) {
                        System.out.println("Success: " + "places " + i + " " + j);
                        Place place  = new Place(i, j);
                        return place;
                    } else {
                        seatWrong = 0;
                    }
                }
            }
        }
        return null;
    }

    public static class Place {
        private int row;
        private int cell;

        public Place(int row, int cell) {
            this.row = row;
            this.cell = cell;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Place place = (Place) o;
            return row == place.row
                    && cell == place.cell;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, cell);
        }
    }

}
