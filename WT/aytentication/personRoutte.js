const express = require('express');
const router = express.Router();
const Person = require('./personModel');
const bodyparser = require("body-parser")
const passport = require("./auth")


router.use(bodyparser.urlencoded())

router.use(passport.initialize());
const localAuthMiddleware = passport.authenticate('local', {session: false})

router.get("/", async(req,res)=>{
    const data = await Person.find()
        res.send(data);
})

router.post("/",async(req,res)=>{
    const per = new Person(req.body);
    await per.save();
    res.send("saved");
})

module.exports = router;