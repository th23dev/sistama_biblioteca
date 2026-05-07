package org.example;

public class DVD extends ItemBiblioteca{

    public DVD(String titulo, int anoPublicacao) {
        super(titulo, anoPublicacao);
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        double multa;

        if(diasAtraso <= 7){
            multa = diasAtraso;
            return multa;
        } else{
            multa = 7;
            int diasAposAtraso = diasAtraso - 7;
            multa += (diasAposAtraso * 2);
            return multa;
        }
    }
}
