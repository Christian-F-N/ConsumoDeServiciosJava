<?php
    include'../controllers/Conexion.php';
    $pdo = new Conexion();
    if ($_SERVER['REQUEST_METHOD']=='GET')
    
        if(isset($_GET['id_val_per']))
        
            $sql=$pdo->prepare("SELECT  u.ced_usu ,u.nom_usu FROM 
            activos a ,usuarios u, detalle d WHERE  a.id_act=d.id_act_per and u.ced_usu = a.ced_usu_per 
            and id_val_per=:id_val_per GROUP BY(u.ced_usu)");
            $sql->bindValue(':id_val_per',$_GET['id_val_per']);
            $sql->execute();
            $sql->setFetchMode(PDO::FETCH_ASSOC);
            header("HTTP/1.1 200 OK");
            echo json_encode($sql->fetchAll(),JSON_FORCE_OBJECT);

            exit
        

    
?>


                      
 