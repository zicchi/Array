/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanArray;

/**
 *
 * @author Evolved
 */
public class testarraydua{

int nis [][] = {{210651},{210651},{210652}};
String nama [][] = {{"Rizvan Dimas"},{"NurAzmi"},{"Devita Fahma"}};
public void tampil(String n){
System.out.println("Identitas Siswa Angkatan 24");
}
public void namanis (){
for (int i = 0; i< 1; i++){
for (int j = 0; j< 1; j++){
System.out.println(nama[1][j]+":"+nis[1][j]);
}
}
}
public static void main (String[]args){
testarraydua siswa = new testarraydua();
siswa.tampil(null);
siswa.namanis();
}
}
