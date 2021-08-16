<?php
    include'../controllers/Conexion.php';
    $pdo = new Conexion();
    if ($_SERVER['REQUEST_METHOD']=='GET')
    {
        if (isset($_GET['id_act_per']))
        {
            $sql=$pdo->prepare("SELECT * FROM validacion where id_pro=:id_pro");
            $sql->bindValue(':id_pro',$_GET['id_pro']);
            $sql->execute();
            $sql->setFetchMode(PDO::FETCH_ASSOC);
            header("HTTP/1.1 200 OK");
            echo json_encode($sql->fetchAll(),JSON_FORCE_OBJECT);
            exit;
        }else{
            $sql=$pdo->prepare("SELECT * FROM validacion");
            $sql->execute();
            $sql->setFetchMode(PDO::FETCH_ASSOC);
            header("HTTP/1.1 200 OK");
            echo json_encode($sql->fetchAll(),JSON_FORCE_OBJECT);
            exit;
        }
    }
    
   

    if ($_SERVER['REQUEST_METHOD']=='POST')
    {
       
        $sql="INSERT INTO validacion(id_pro,nom_pro,fec_hor_pro,est_pro,id_res_pro)
        VALUES(:id_pro,:nom_pro,'Sysdate',:est_pro,:id_res_pro)";
        $stmt=$pdo->prepare($sql);
        $stmt->bindValue(':id_pro',$_POST['id_pro']);
        $stmt->bindValue(':nom_pro',$_POST['nom_pro']);
   
        $stmt->bindValue(':est_pro',$_POST['est_pro']);
        $stmt->bindValue(':id_res_pro',$_POST['id_res_pro']);
        $stmt->execute();
        $est_val=$pdo->lastInsertId();
        if($est_val)
        {
            header("HTTP/1.1 200 0K");
            echo json_encode($id_pro);
            exit;
        }

    }

    if ($_SERVER['REQUEST_METHOD']=='PUT')
    {
        $sql="UPDATE validacion SET est_val=:est_val,id_val_per=:id_val_per
        WHERE id_act_per=:id_act_per ";
        $stmt=$pdo->prepare($sql);
        $stmt->bindValue(':est_val',$_GET['est_val']);
        $stmt->bindValue(':id_act_per',$_GET['id_act_per']);
        $stmt->bindValue(':id_val_per',$_GET['id_val_per']);
        $stmt->execute();
        header("HTTP/1.1 200 0K");    
        echo json_encode("actualizado",JSON_FORCE_OBJECT); 
        exit;
        

    }
    
    if ($_SERVER['REQUEST_METHOD']=='DELETE')
    {
        $sql="DELETE FROM validacion WHERE id_act_per=:id_act_per ";
        $stmt=$pdo->prepare($sql);
        $stmt->bindValue(':id_act_per',$_GET['id_act_per']);
        $stmt->execute();
        header("HTTP/1.1 200 0K"); 
        echo json_encode("eliminado",JSON_FORCE_OBJECT);      
        exit;
        

    }
?>