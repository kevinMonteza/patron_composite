<%-- 
    Document   : Index
    Created on : 20-jun-2018, 15:54:28
    Author     : LABO08
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .boton{
                margin: 10px;
                width: 95px;
            }


        </style>
        <script type="text/javascript">
            function main() {
                var bton = document.getElementById("reset");
                bton.onclick = function () {
                    var ele = document.getElementsByName("servicio");
                    var ele2 = document.getElementsByName("Tinstalacion");
                    var ele3 = document.getElementsByName("Tedificada");
                    var ele4 = document.getElementsByName("mobiliario");
                    for(var i = 0; i<ele.length; i++){
                        ele[i].checked = false;}
                    for(var i = 0; i<ele2.length; i++){
                        ele2[i].checked = false;}
                    for(var i = 0; i<ele3.length; i++){
                        ele3[i].checked = false;}
                    for(var i = 0; i<ele4.length; i++){
                        ele4[i].checked = false;}
                };
            }

        </script>
    </head>
    <body onload="main()">
        <div style="border:blue ridge ;margin:2% 15%; width: 35%; height: 40%;">
            <div style="margin: 30px; ">
                <h1>Construcciones.S.A.C</h1>
                <form action="Controlador" method="GET">
                    <fieldset>
                        <legend>Elige servicio:</legend>
                        <label>
                            <fieldset>
                                <legend> <input type="radio" name="servicio" value="Instalacion"> Instalacion</legend>
                                <label>
                                    <fieldset>
                                        <legend> <input type="radio" name="Tinstalacion" value="edificada"> Edificada</legend>
                                        <label>
                                            <input type="radio" name="Tedificada" value="techo"> Techo
                                        </label>
                                        <label>
                                            <input type="radio" name="Tedificada" value="pared"> Pared
                                        </label>
                                    </fieldset>
                                </label>
                                <label>
                                    <fieldset>
                                        <legend><input type="radio" name="Tinstalacion" value="empotrada"> Empotrada</legend>
                                    </fieldset>
                                </label>
                            </fieldset>
                        </label>

                        <label>
                            <fieldset>
                                <legend> <input type="radio" name="servicio" value="mobiliario"> Mobiliario</legend>
                                <label>
                                    <input type="radio" name="mobiliario" value="mueble"> Muebles
                                </label>
                                <label>
                                    <input type="radio" name="mobiliario" value="silla"> Sillas
                                </label>
                                <label>
                                    <input type="radio" name="mobiliario" value="mesa"> Mesa
                                </label>
                                <label>
                                    <input type="radio" name="mobiliario" value="tele"> Television
                                </label>
                            </fieldset>
                        </label>
                    </fieldset>
                    <input type='submit' value='Enviar' style="display:inline;margin:0 6em; width: 6em;font-size: 16px;"/>
                    <input type='button' id='reset' value='Reset' style="display:inline;width: 6em;font-size: 16px;"/>
                </form>
                
            </div>
        </div>
    </body>
</html>
