package com.salondethe;

import com.mongodb.client.MongoDatabase;
import com.salondethe.utils.MongoDBConnection;

public class Main {
    public static void main(String[] args) {
        // Obtenir la base de données
        MongoDatabase database = MongoDBConnection.getDatabase();
        System.out.println("Connecté à la base de données : " + database.getName());

        // Fermer la connexion
        MongoDBConnection.closeConnection();
    }
}