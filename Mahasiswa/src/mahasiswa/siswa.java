/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

/**
 *
 * @author Administrator
 */
public class siswa {
    private String name;
    private int age;

    public siswa(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Nama: " + name);
        System.out.println("Usia: " + age);
    }

    public static void main(String[] args) {
        siswa siswa = new siswa("A Nurul Kausar", 22);
        siswa.displayInfo();
    }
}

    

