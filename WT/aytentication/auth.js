// sets up Passport with a local authentication strategy, using a Person model for user data. - Auth.js file

const passport = require('passport');   // aa npm valo passport che
const LocalStrategy = require('passport-local').Strategy;   // aanthi authentication thay
const Person = require('./personModel'); // Adjust the path as needed



// avi rite authentication nu logic lakhvanu
passport.use(new LocalStrategy(async (username, password, done) => {
    try {
        // console.log('Received credentials:', username, password);
        const user = await Person.findOne({ username });
        if (!user)
            return done(null, false, { message: 'Incorrect username.' });
        
        const isPasswordMatch = await user.password === password ? true:false;
        if (isPasswordMatch)
            return done(null, user);
        else
            return done(null, false, { message: 'Incorrect password.' })
    } catch (error) {
        return done(error);
    }
}));

module.exports = passport; // Export configured passport