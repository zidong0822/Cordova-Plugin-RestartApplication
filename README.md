Cordova-Plugin-RestartApplication
==============================

Restart your Application.  Cordova / PhoneGap plugin.

Installation:
-------------
1. Install using Cordova CLI:
    `cordova plugin add https://github.com/RodrigoGontijo/Cordova-Plugin-RestartApplication.git`

__Example of usage ()__

  	<!DOCTYPE html>
    <html>
      <head>
        <script type="text/javascript" charset="utf-8" src="cordova-X.X.X.js"></script>
        <script type="text/javascript" charset="utf-8" src="jquery.js"></script>
        <script type="text/javascript" charset="utf-8" src="RestartApplication.js"></script>
        <script type="text/javascript" charset="utf-8">
         
          $('#restartApplication').bind('click',function(){
              RestartApplication.restartApplication(onRestartSuccess, onRestartError);
          });
         
          //Callbacks
          function onRestartSuccess(){
              console.log("Works");
          }
          function onRestartError(){
              //Manage Error
          }
         
        </script>
      </head>
      <body>
        <input type="button" id="restartApplication" value="Restart your application"/>
      </body>
    </html>
