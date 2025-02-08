package com.example.lalana;

import java.util.ArrayList;

public interface Donnee {
    ArrayList<Destination> destinations=new ArrayList<>();
    ArrayList<String> donnee=new ArrayList<>();
    public static  void addDestination(String dest,String axe, String frais,String dis){
        destinations.add(new Destination(dest, axe, frais, dis));
    }

    public static void addAllDestination(){
        addDestination("Ambatolampy","Sud","50000 Ar","250 km");
        addDestination("Ambositra","Sud","22000","270 km");
        addDestination("Antsirabe","Sud","50000 Ar","250 km");
        addDestination("Fianarantsoa","Sud","38000 Ar","400 km");
        addDestination("Ihosy","Sud","50000 Ar","500 km");
        addDestination("Ankaramena","Sud","50000 Ar","600 km");
        addDestination("Toliara","Sud","100000 Ar","1000 km");
//SUD EST
        addDestination("Ifanadiana","Sud-Est","50000 Ar","250 km");
        addDestination("Rondro","Sud-Est","22000","270 km");
        addDestination("Mananjary","Sud-Est","50000 Ar","250 km");
        addDestination("Manakara","Sud-Est","38000 Ar","400 km");
        addDestination("Vohipeo","Sud-Est","50000 Ar","500 km");
        addDestination("Farafangana","Sud-Est","50000 Ar","600 km");
        addDestination("Vangaindrano","Sud-Est","100000 Ar","1000 km");
//SUD OUEST
        addDestination("Miandrivazo","Sud-Ouest","25000 Ar","145 km");
        addDestination("Morondava","Sud-Ouest","22000","225 km");

//OUEST
        addDestination("Mianarivo","Ouest","95000","150 km");
        addDestination("Arivonimama","Ouest","25000 Ar","40 km");
        addDestination("Ampefy","Ouest","5000","75 km");
        addDestination("Tsiorimandidy","Ouest","25000 Ar","100 km");

        //NORD OUEST
        addDestination("Maevatanana","Nord-Ouest","95000","300 km");
        addDestination("Mahanjanga","Nord-Ouest","25000 Ar","600 km");
        addDestination("Ambondromamy","Nord-Ouest","5000","400 km");
        //NORD
        addDestination("Antsohihy","Nord","95000","850 km");
        addDestination("Ambanja","Nord","25000 Ar","875 km");
        addDestination("Ambilobe","Nord","5000","650 km");
        addDestination("Antsiranana","Nord","5000","1000 km");
        //NORD EST
        addDestination("Vohemar","Nord-Est","95000","550 km");
        addDestination("Antalahy","Nord-Est","25000 Ar","885 km");
        addDestination("Sambava","Nord-Est","5000","650 km");
        //EST
        addDestination("Moramanga","Est","15000","150 km");
        addDestination("Brickaville","Est","75000 Ar","300 km");
        addDestination("Toamasina","Est","25000","400 km");
        addDestination("Fenerive Est","Est","55000","460 km");




    }
}
