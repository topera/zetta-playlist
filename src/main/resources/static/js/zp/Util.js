/*
 * Copyright (c) 2017 - Terahorse
 */

/**
 * class Util
 */
function Util(){

    this.log = function(message, addPrefix) {
        if (addPrefix) {
            console.log("[ZP] " + message);
        } else {
            console.log(message);
        }
    }

}