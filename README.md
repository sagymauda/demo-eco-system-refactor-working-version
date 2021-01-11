In order to run the project :

1.docker-compose up

2.Send User to 8081/create/user

3.user details are

{ 
        "name": "SagiMauda",
        "age": 35,
        "height": 178,
        "address": "Hashomer 10 Tel Aviv",
        "birthDate": "1985-03-09T00:00:00.000+00:00"
}  



4. in order to see the object saved in the Db go to
           8083/user/getAll
           
           
MsReciverUserInfo - get the user info and pass it to MsConsumerAndTransfer.


MsConsumerAndTransfer - receive the User Details via RabbiitMq and activate MsSaveUserToDb.


MsSaveUserToDb - get called by MsConsumerAndTransfer , and Save the Object in MongoDB.
          
   
