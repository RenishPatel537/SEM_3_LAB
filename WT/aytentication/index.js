const express = require('express')
const passport = require("./auth");
const personroute = require("./personRoutte");
const mongoose = require("mongoose")
const bodyparser = require("body-parser")


const app = express()
app.use(bodyparser.urlencoded())
const port = 3000

mongoose.connect("mongodb+srv://Renish:renish123@cluster0.jkj9k.mongodb.net/hotel1").then(() => {
    console.log("connect") // ama connect ma connectionString nakhya pachi /databasenu name nakhvanu atle
                           // mongo ma db bani jay je upar ma university che
})


app.use(passport.initialize());
const localAuthMiddleware = passport.authenticate('local', {session: false})

app.use("/prson",localAuthMiddleware,personroute);

app.get('/', (req, res) => res.send('Hello World!'))




app.listen(port, () => console.log(`Example app listening on port ${port}!`))