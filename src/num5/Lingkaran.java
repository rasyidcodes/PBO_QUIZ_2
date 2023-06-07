package num5;

public class Lingkaran {
        final double jariJari;
        final  double phi = 3.14;
        public Lingkaran(double jariJari) {
            this.jariJari = jariJari;
        }
        public final double hitungLuas() {
            return phi*jariJari*jariJari;
        }
}
