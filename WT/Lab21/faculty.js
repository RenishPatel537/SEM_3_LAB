const mongoose = require("mongoose");
const fac= new mongoose.Schema({
    id : Number,
    name : String,
    dept : String,
    contact : String
})
const Faculty = mongoose.model("faculty",fac)
module.exports = Faculty