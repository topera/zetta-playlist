/**
 * class Controller
 */
function Controller(){

    /**
     * Load playlists and update screen
     * @param musicClientType
     */
    this.loadPlaylists = function(musicClientType) {
        UTIL.log("Loading playlists from " + musicClientType);
        var url = "http://localhost:8080/zp/api/playlist/" + musicClientType;

        $.getJSON(url, function(data) {
            UTIL.log("Received");
            UTIL.log(data, false);
            $("#playlists").html($("#playlists-template").tmpl(data))
            UTIL.log("Template Updated");
        });
    }

}

// create globals
window.CONTROLLER = new Controller();
window.UTIL = new Util();

// start
CONTROLLER.loadPlaylists('deezer');
