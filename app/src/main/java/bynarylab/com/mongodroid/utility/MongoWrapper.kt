package bynarylab.com.mongodroid.utility

import bynarylab.com.mongodroid.model.MongoConnection
import com.mongodb.async.client.MongoClientSettings
import com.mongodb.ServerAddress
import com.mongodb.connection.ClusterSettings
import com.mongodb.ConnectionString
import com.mongodb.async.client.MongoClients


/**
 * Created by beast on 12/7/17.
 */
class MongoWrapper(var mongoConnection: MongoConnection) {

    var dbName = ""
    var connectionname = ""
    var dbhost = ""
    var dbPort = ""
    var dbUsername = ""
    var dbPassword = ""

    class MongoWrapper constructor(mongoConnection: MongoConnection) {
        var dbName = mongoConnection.dbName
        var connectionname = mongoConnection.connectionName
        var dbhost = mongoConnection.dbHost
        var dbPort = mongoConnection.dbPort
        var dbUsername = mongoConnection.dbUsername
        var dbPassword = mongoConnection.dbPassword
    }

    open fun connectDb() {
        // or provide custom MongoClientSettings
//        val clusterSettings = ClusterSettings.builder().hosts(asList(ServerAddress("localhost"))).build()
//        val settings = MongoClientSettings.builder().clusterSettings(clusterSettings).build()
//        val mongoClient = MongoClients.create(settings)
    }
}