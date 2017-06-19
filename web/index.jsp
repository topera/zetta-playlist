<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Zetta Playlist</title>
    <script src="js/lib/jquery-3.2.1.min.js"></script>
    <script src="js/lib/jquery.tmpl.min.js"></script>
    <script src="js/zp/Util.js"></script>
    <script src="js/zp/Controller.js"></script>
    <link href="css/reset.css" rel="stylesheet" />
    <link href="css/main.css" rel="stylesheet" />
  </head>
  <body>
    <script id="playlists-template" type="text/x-jquery-tmpl">
    {{each(i, playlist) data}}
      <li>
         \${i+1}. {{html playlist.title}}
      </li>
    {{/each}}
    </script>
    <header>Zetta Playlist</header>

    <div id="playlists"></div>


    <footer>Zetta Playlist ®</footer>
  </body>
</html>
