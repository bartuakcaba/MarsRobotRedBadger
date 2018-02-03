/**
 * Created by bartu on 03/02/2018.
 */
public enum  Direction {

    N,E,S,W;

    public Direction next() {
        if (values()[ordinal()] == W) {
            return N;
        }
        return values()[ordinal() + 1];
    }

    public Direction prev() {
        if (values()[ordinal()] == N) {
            return W;
        }
        return values()[ordinal() - 1];
    }
}
