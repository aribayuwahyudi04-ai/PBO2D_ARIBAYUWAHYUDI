/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author HYPE AMD
 */
class Mahasiswa {

    private Mahasiswa(String ari_Bayu, int i, String surabaya) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 // Membuat class Person
class Person {
    // Atribut
    String name;
    int age;
    String city;

    // Constructor untuk mengisi nilai atribut
    Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    // Method untuk menampilkan informasi
    void displayInfo() {
        System.out.println("Nama  : " + name);
        System.out.println("Umur  : " + age);
        System.out.println("Kota  : " + city);
    }
}

// Class utama
public class Maahasiswa {
    public static void (String[] args) {
        
        // Membuat object dari class Person
        Mahasiswa person1 = new Mahasiswa("Ari Bayu", 19, "Surabaya");
        
        // Menampilkan informasi menggunakan method displayInfo()
        person1.displayInfo();
    }
 }   
}
