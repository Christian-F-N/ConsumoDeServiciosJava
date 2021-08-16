<?php
    include'../controllers/Conexion.php';
    $pdo = new Conexion();
    if ($_SERVER['REQUEST_METHOD']=='GET')
    
            $sql=$pdo->prepare("SELECT u.ced_usu ,u.nom_usu, u.ape_usu, count(a.id_act) FROM 
            usuarios u, activos a WHERE u.ced_usu = a.ced_usu_per GROUP BY(a.ced_usu_per)");
            $sql->execute();
            $sql->setFetchMode(PDO::FETCH_ASSOC);
            header("HTTP/1.1 200 OK");
            echo json_encode($sql->fetchAll(),JSON_FORCE_OBJECT);
            exit
    

?> 