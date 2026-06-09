public double calcularPrecioFinal(String tipoCliente, int edad, double importe, boolean primeraCompra){

    double descuento = 0;
    double recargo = 0;

    if (tipoCliente.equals("VIP")) {
        descuento += 0.15;
        if (edad > 60) {
            descuento += 0.05;
        }
    } else if (tipoCliente.equals("REGULAR")) {
        if (importe > 200) {
            descuento += 0.10;
        } else if (importe > 100) {
            descuento += 0.05;
        }
    } else {
        recargo += 0.05;
    }
    if (primeraCompra) {
        if (importe > 50) {
            descuento += 0.05;
        } else {
            recargo += 0.02;
        }
    }
    double precioFinal = importe - (importe * descuento) + (importe * recargo);
    if (precioFinal < 0) {
        precioFinal = 0;
    }
    return precioFinal;
}

/*
camino 1: i,2,4,6,7,8,13,17,18,19
camino 2: i,2,4,6,7,8,13,17,19
camino 3: i,3,5,9,12,14,16,13,17,19
camino 4: i,3,5,9,12,14,16,13,17,18,19
camino 5: i,3,5,10,12,14,16,13,17,19
camino 6: i,3,5,10,12,14,16,13,17,19
camino 7: i,3,5,9,12,14,16,13,17,18,19
camino 8: i,3,5,9,12,14,15,13,17,19
camino 9: i,3,5,9,12,14,15,13,17,18,19

*/