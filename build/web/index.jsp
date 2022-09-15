
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Plantilla Login</title>
    <!--JQUERY-->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    <!-- FRAMEWORK BOOTSTRAP para el estilo de la pagina-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

    <!-- Los iconos tipo Solid de Fontawesome-->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/solid.css">
    <script src="https://use.fontawesome.com/releases/v5.0.7/js/all.js"></script>
    <!-- Nuestro css-->
    <link href="css/index.css" rel="stylesheet" type="text/css"/>
</head>
<body>
    <body>
        <div class="modal-dialog text-center">
            <div class="col-sm-8 main-section">
                <div class="modal-content">
                    <div class="col-12 user-img">
                        
                        <img src="img/avatar-login.png" alt=""/>
                    </div>
                    <form class="col-12" action="Validar" method="post"  >
                        <div class="form-group" id="user-group">
                            <input type="text" class="form-control" placeholder="Nombre de usuario" name="txtUsername"/>
                        </div>
                        <div class="form-group" id="contrasena-group">
                            <input type="password" class="form-control" placeholder="Contrasena" name="txtPassword"/>
                        </div>
                        <button type="submit" class="btn btn-primary" name="accion" value="Ingresar"><i class="fas fa-sign-in-alt"></i>  Ingresar </button>
                    </form>
                    <div class="col-12 forgot">
                        <a href="#">Recordar contraseña?</a>
                    </div>
                   
                </div>
            </div>
        </div>
    </body>
</body>
</html>