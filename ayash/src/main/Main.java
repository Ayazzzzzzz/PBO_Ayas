/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main;

import kampus.dosen;
import kampus.mahasiswa;

public class Main {
    public static void main(String[] args) {
        try {
            dosen dosen1 = new dosen("Eka Rusli S.Kom, M.T", , "Basis data");
            mahasiswa mh1 = new mahasiswa("s" , 19, 12322);
            
            dosen1.data();
            dosen1.perwalian();
            dosen1.ujian();
            dosen1.pembelajaran();
            dosen1.penggajian();
            dosen1.penelitian();
            
            mh1.data();
            mh1.perwalian();
            mh1.ujian();
            mh1.krs();
            
        } catch (Exception e) {
            System.out.println("Argument tidak valid.");
        }
    }
}
