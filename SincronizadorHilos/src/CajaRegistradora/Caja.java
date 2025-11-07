package CajaRegistradora;

class Caja {
    private double total = 0.0;

    public synchronized void cobrar(double cantidad) {
        total += cantidad;
    }

    public double getTotal() {
        return total;
    }
}

