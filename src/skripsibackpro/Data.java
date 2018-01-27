package skripsibackpro;
import java.sql.*;
/**
 *
 * @author ANDIKA
 */
public class Data {
    private Statement stat;
    private Connection konek;
    private String url = "jdbc:mysql://localhost:3306/penyakit";
    private ResultSet res;
    private int[] data;
    
    public Data(String jenisPenyakit){
        koneksi();
        String penyakit = "";
        switch(jenisPenyakit){
            case "Demam Tifoid-Paratifoid":
                penyakit = "demam";
                break;
            case "Nasofaringitis Akut":
                penyakit = "nesofaring";
                break;
        }
        data = new int[60];
        int i = 0;
        try{
            res = stat.executeQuery("SELECT jumlah FROM "+penyakit+";");
            while((res.next()) && (i<data.length)){
                data[i] = res.getInt("jumlah");
                i++;
            }
        }
        catch(Exception e){
        }
    }
    
    public double[][] getDataLatih(int panjangData, int jumlahData){
        int hitungData = jumlahData+panjangData;
        int[] dataTemp = new int[data.length-12];
        for(int i=0;i<dataTemp.length;i++){
            dataTemp[i] = data[i];
        }
        int[] dataLatih = new int[hitungData];
        for(int i=dataTemp.length-1;i>(dataTemp.length-hitungData-1);i--){
            dataLatih[i-(dataTemp.length-hitungData)] = dataTemp[i];
        }
        double[][] dataLatihFix = new double[jumlahData][panjangData+1];
        for(int i=0;i<dataLatihFix.length;i++){
            for(int j=0;j<dataLatihFix[0].length;j++){
                dataLatihFix[i][j] = dataLatih[i+j];
            }
        }
        return dataLatihFix;
    }
    
    public double[][] getDataUji(int panjangData){
        int hitungData = 12+panjangData;
        int[] dataUji = new int[hitungData];
        for(int i=data.length-1;i>(data.length-hitungData-1);i--){
            dataUji[i-(data.length-hitungData)] = data[i];
        }
        double[][] dataUjiFix = new double[12][panjangData+1];
        for(int i=0;i<dataUjiFix.length;i++){
            for(int j=0;j<dataUjiFix[0].length;j++){
                dataUjiFix[i][j] = dataUji[i+j];
            }
        }
        return dataUjiFix;
    }
    
    public double[][] getDataRamalBulanan(String bulan, String tahun, int panjangData){
        double[][] dataRamalBulanan = new double[1][panjangData+1];
        int bln = 0;
        int thn = 0;
        switch(bulan){
            case "Januari":
                bln = 1;
                break;
            case "Februari":
                bln = 2;
                break;
            case "Maret":
                bln = 3;
                break;
            case "April":
                bln = 4;
                break;
            case "Mei":
                bln =5;
                break;
            case "Juni":
                bln = 6;
                break;
            case "Juli":
                bln = 7;
                break;
            case "Agustus":
                bln = 8;
                break;
            case "September":
                bln = 9;
                break;
            case "Oktober":
                bln = 10;
                break;
            case "November":
                bln = 11;
                break;
            case "Desember":
                bln = 12;
                break;
        }
        switch(tahun){
            case "2012":
                thn = 1;
                break;
            case "2013":
                thn = 2;
                break;
            case "2014":
                thn = 3;
                break;
            case "2015":
                thn = 4;
                break;
            case "2016":
                thn = 5;
                break;
        }
        int sampai = (12*(thn-1))+(bln-1);
        int dari = sampai-panjangData;
        int j=0;
        for(int i=dari;i<=sampai;i++){
            dataRamalBulanan[0][j] = data[i];
            j++;
        }
        return dataRamalBulanan;
    }
            
//        koneksi();
//        int bln = 0;
//        String penyakit = "";
//        switch(jenisPenyakit){
//            case "Demam Tifoid-Paratifoid":
//                penyakit = "demam";
//                break;
//            case "Nasofaringitis Akut":
//                penyakit = "nesofaring";
//                break;
//        }
//        switch(bulan){
//            case "Januari":
//                bln = 1;
//            case "Februari":
//                bln = 2;
//            case "Maret":
//                bln = 3;
//            case "April":
//                bln = 4;
//            case "Mei":
//                bln =5;
//            case "Juni":
//                bln = 6;
//            case "Juli":
//                bln = 7;
//            case "Agustus":
//                bln = 8;
//            case "September":
//                bln = 9;
//            case "Oktober":
//                bln = 10;
//            case "November":
//                bln = 11;
//            case "Desember":
//                bln = 12;
//        }
//        
//        data = new int[60];
//        int i = 0;
//        try{
//            res = stat.executeQuery("SELECT jumlah FROM "+penyakit+";");
//            while((res.next()) && (i<data.length)){
//                data[i] = res.getInt("jumlah");
//                i++;
//            }
//        }
//        catch(Exception e){
//        }
     
//    public int[] getData(){
//        return data;
//    }
    
    private void koneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            konek = DriverManager.getConnection(url,"root","");
            stat = konek.createStatement();
        }
        catch(Exception e){
        }
    }
    
//    public double[][] aturData (int[] data){
//        double[][] dataBaru = new double[data.length/7][7];
//        for(int i=0;i<dataBaru.length;i++){
//            for(int j=0;j<dataBaru[i].length;j++){
//                dataBaru[i][j] = (double)data[j%dataBaru[i].length+i*dataBaru[i].length];
//            }
//        }
//        return dataBaru;
//    }
//    
    public static void main(String[] args) {
//        Data data = new Data("2012","Januari","2014","April","Demam Tifoid-Paratifoid");
        Data data = new Data("Demam Tifoid-Paratifoid");
        double[][] dataTampung = data.getDataRamalBulanan("Juni","2015",6);
                
        for(int i=0;i<dataTampung.length;i++){
            for(int j=0;j<dataTampung[i].length;j++){
                System.out.print(dataTampung[i][j]+" ");
            }
            System.out.println("");
        }
//        for(int i=0;i<dataTampung.length;i++){
//            System.out.print(dataTampung[i]+" ");
//        }
//        System.out.println("");
        

//        double[][] dataTampung2 = data.aturData(dataTampung);
//        for(int i=0;i<dataTampung2.length;i++){
//            for(int j=0;j<dataTampung2[i].length;j++){
//                System.out.print(dataTampung2[i][j]+" ");
//            }
//            System.out.println("");
//        }
    }
    
}

