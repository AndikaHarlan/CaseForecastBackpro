package skripsibackpro;

/**
 *
 * @author ANDIKA
 */
public class Pengujian {
    public static void main(String[] args) {
        Data data = new Data("Demam Tifoid-Paratifoid");
        int panjangData = 12;
        int jumlahData = 36;
        int iterasi = 100000;
        double alfa = 0.05;
        
        Backpro backpro = new Backpro(panjangData, alfa);
        
        //TRAINING
        double[][] bobotBaru = backpro.backpro(data.getDataLatih(panjangData, jumlahData), iterasi);
        //TESTING
        double[][] bobotHidden = new double[bobotBaru.length-1][bobotBaru[0].length-1];
        double[] bobotOutput = new double[bobotBaru.length-1];
        double[] bias = bobotBaru[bobotBaru.length-1];
        double[] denor = new double[data.getDataUji(panjangData).length];
                
        for(int i=0;i<bobotHidden.length;i++){
            for(int j=0;j<bobotHidden[0].length;j++){
                bobotHidden[i][j] = bobotBaru[i][j];
            }
        }
        for(int i=0;i<bobotOutput.length;i++){
            bobotOutput[i] = bobotBaru[i][bobotBaru[0].length-1];
        }
        double[][] dataUji = data.getDataUji(panjangData);
        for(int i=0;i<denor.length;i++){
            denor[i] = backpro.deNormalisasi(backpro.feedForward(dataUji, i, bobotHidden, bias, bobotOutput), dataUji);
//            System.out.print(dataUji[i][panjangData]+" - ");
//            System.out.println(denor[i]);
        }
        double mse = backpro.mse(denor, dataUji);
        double akurat = backpro.akurat(mse);
        System.out.print("MSE : ");
        System.out.println(mse);
        System.out.print("Akurat : ");
        System.out.println(akurat);
    }
}
