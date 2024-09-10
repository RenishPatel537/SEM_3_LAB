const mongoose = require("mongoose");
const fac= new mongoose.Schema({
    id : Number,
    name : String,
    dept : String,
    contact : String
})
const Faculty = mongoose.model("faculty",fac)
module.exports = Faculty


// const fac= new mongoose.Schema({       => aa ek apne schema banavi atle ke object nu lay out
//     id : Number,
//     name : String,
//     dept : String,
//     contact : String
// })

// const Faculty = mongoose.model("faculty",fac)  => ama model atle collection bane mongo ma atle ke ek prakar
                                                   //  nu table  te collection nu nam faculty che pan tya plural thai jase ane aa model ni schema {fac} che ane tene Faculty naman variable ma store karyo che tenii madad thi mongo sathe interact karsu