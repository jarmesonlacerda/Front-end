<%-- 
    Document   : newjsp
    Created on : 24/04/2020, 16:32:50
    Author     : VINICIUS HENRIQUE
--%>

<!DOCTYPE html>
<html>
    <head>
        <title>login</title>
    </head>
    <body>
        <form method="POST" action="LoginServlets">
            <label for="user">Usuário</label>
            <input type="text" name="user"  placeholder="Digite seu usuário"/>
            
            <label for="senha">Senha</label>
            <input type="password" name="senha" placeholder="Digite Sua Senha"/>
            
            <button type="submit">enviar</button>
        </form>
    </body>
</html>
