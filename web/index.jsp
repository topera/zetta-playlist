<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Zetta Playlist</title>
    <script src="js/lib/jquery-3.2.1.min.js"></script>
    <script src="js/lib/jquery.tmpl.min.js"></script>
    <script src="js/zp/Util.js"></script>
    <script src="js/zp/Controller.js"></script>

    <link href="css/main.css" rel="stylesheet" />

    <script id="playlists-template" type="text/x-jquery-tmpl">
    <ul>
    {{each(i, playlist) data}}
      <li>
         \${i+1} {{html playlist.title}}
      </li>
    {{/each}}
    </ul>
    </script>
  </head>
  <body>
    <div id="header">
        <div class="left">
            <div id="zetta-logo"></div>
        </div>
        <div class="right">
            <em>Powered by</em>
            <div id="deezer-logo"></div>
        </div>
    </div>

    <br/>Top Brazilian Playlists:
    <div id="playlists"></div>

  </body>
</html>
