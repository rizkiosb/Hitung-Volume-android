package com.example.jurussehatrosulullah;

import java.util.ArrayList;

public class Desc_obat {
    public static String[][] data =new String[][]{
            {"Autoimun","Manfaat : \n1.Menyeimbangkan kolesterol\n2.Asam urat\n3.nyeri sendi dan\n4.memperbaiki pencernaan\n","https://scontent-yyz1-1.cdninstagram.com/vp/3035e67602975048d1115cc9aa490381/5D96D197/t51.2885-15/e35/60103197_1568840913248177_7514049831755928755_n.jpg?_nc_ht=scontent-yyz1-1.cdninstagram.com"},
            {"Anti Pilek","Manfaat :\nRempah-rempah ini mengandung mineral dan kalium, dimana menjadi komponen penting sel dan cairan tubuh yang membantu mengontrol detak jantung dan tekanan darah, serta membantu proses detoksifikasi serta anti peradangan.","https://img.okezone.com/content/2018/01/19/481/1847626/manfaat-luar-biasa-minum-teh-tanpa-gula-meski-rasanya-pahit-XlDg9HjfQ6.jpg"},
            {"Anti Batuk Berdahak","Manfaat :\n1.Meredakan batuk berdahak\n2.Mengangatkan kerongkongan\n3.Meredakan gatal pada kerongkongan","https://scontent-lga3-1.cdninstagram.com/vp/2487c3e8297660f691412bb817d88af5/5D8EC053/t51.2885-15/e35/59477748_2694558130617690_2082469525265238763_n.jpg?_nc_ht=scontent-lga3-1.cdninstagram.com"},
            {"Jantung Sehat","Manfaat : \nAnti inflamasi, Meredakan sariawan, Melancarkan peredaran darah, Menurunkan kolesterol,Menjaga kesehatan jantung, Membantu masalah alergi kulit, dll inshaAllah","https://scontent.cdninstagram.com/vp/8a9cc8d2551d7bbf12eb338357dab51a/5D632783/t51.2885-15/e35/c0.72.576.576a/s480x480/57506246_1227502214067335_983421130919452684_n.jpg?_nc_ht=instagram.fotp5-1.fna.fbcdn.net"},
            {"Anti Biotik","Manfaat :\nHerbal itu ada “antibiotik” nya juga, salah satunya ya jahe dan kunyit seperti ini","https://scontent-lga3-1.cdninstagram.com/vp/0d805cad9d141986774331f2ebe036bf/5D7F1B2B/t51.2885-15/e35/61317566_2182083391839966_4766601538937795867_n.jpg?_nc_ht=scontent-lga3-1.cdninstagram.com"},
            {"Asam Urat","Manfaat : \n1.Meredakam Kolesterol\n2.Menurunkan Asam urat\n3.Melancarkan BAB\n4.Menurunkan darah tinggi ","https://instagram.flux1-1.fna.fbcdn.net/vp/be9dc339b7d158c13bf8ba9656e2d089/5DEB8106/t51.2885-15/e35/64706433_725678341199301_1253420447473944935_n.jpg?_nc_ht=instagram.flux1-1.fna.fbcdn.net&se=7&ig_cache_key=MjA4NTc4NDg3MzQ0NDMwMTM1OA%3D%3D.2"},
            {"Golden Latte","Manfaat :\nKunyit ketika ketemu bahan-bahan lain maka terjadi hal spektakuler dalam penyerapannya, mulai dari anti kanker, anti inflamasi, untuk penyakit jantung, memperkuat pencernaan.","https://scontent-lht6-1.cdninstagram.com/vp/c62af6f8961ceae8be20efdf49281bc3/5D6A1D63/t51.2885-15/e35/59539610_648625435581543_7281984465839972549_n.jpg?_nc_ht=scontent-lht6-1.cdninstagram.com&se=7&ig_cache_key=MjA0Mjg3NzU4ODEyODg1MDczOA%3D%3D.2"},
            {"Antioksidan","Manfaat :\nMinuman super kaya antioksidan yg baik untuk meningkatkan sistem kekebalan tubuh, Terutama untuk perempuan. Meredakan pegal-pegal dan kram perut pra maupun saat datang bulan, bersifat anti kanker, mencegah diabetes, menurunkan kadar kolestrol tubuh,kunyit dan kayu manis ini juga baik untuk mengurangi efek buruk PCOS","https://scontent-lga3-1.cdninstagram.com/vp/eaffc136cd378a5c96d8729bfc63c5e8/5D6A077D/t51.2885-15/sh0.08/e35/c0.80.1080.1080a/s640x640/58409760_290834835182964_392746186507951937_n.jpg?_nc_ht=scontent-lga3-1.cdninstagram.com"},
            {"Infused water apple + Kayu manis","Manfaat : \nLunturkan lemak diperut, mengatur metabolisme dan menurunkan berat badan. Apel kaya akan anti-oksidan yang dapat mengontrol kadar gula darah sedangkan Kayu Manis dapat meningkatkan insulin dan mencairkan lemak serta membantu pencernaan","https://cdn.qubicle.id/images/2016/12/06/64237e1a6485c996e30f56acaf386bfa.png"},
            {"Ultimate","Manfaat: \nDarah anda akan bersih, pencernaan anda akan lebih baik, anda kebanjiran enzim , tulang akan kuat, bakteri virus takkan mau datang ke tubuh anda dan infeksi jg bs diatasi","https://scontent-lga3-1.cdninstagram.com/vp/ce40fe0fb34f6db95140136936c5a90f/5D587ADA/t51.2885-15/sh0.08/e35/c139.0.802.802/s640x640/56883676_598568240623396_4507656834894269672_n.jpg?_nc_ht=scontent-lga3-1.cdninstagram.com"}
    };
    public static ArrayList<Obat> getListData(){
        ArrayList<Obat> list = new ArrayList<>();
        for (String[] aData : data) {
            Obat obat = new Obat();
            obat.setNama(aData[0]);
            obat.setDescripsi(aData[1]);
            obat.setFoto(aData[2]);
            list.add(obat);
        }
        return list;
    }
}