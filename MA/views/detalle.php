<?php
    include'../controllers/Conexion.php';
    $pdo = new Conexion();
    if ($_SERVER['REQUEST_METHOD']=='GET')
    {
        if (isset($_GET['id_act_per']))
        {
            $sql=$pdo->prepare("SELECT * FROM DETALLE where id_act_per=:id_act_per");
            $sql->bindValue(':id_act_per',$_GET['id_act_per']);
            $sql->execute();
            $sql->setFetchMode(PDO::FETCH_ASSOC);
            header("HTTP/1.1 200 OK");
            echo json_encode($sql->fetchAll(),JSON_FORCE_OBJECT);
            exit;
        }else{
            $sql=$pdo->prepare("SELECT * FROM DETALLE");
            $sql->execute();
            $sql->setFetchMode(PDO::FETCH_ASSOC);
            header("HTTP/1.1 200 OK");
            echo json_encode($sql->fetchAll(),JSON_FORCE_OBJECT);
            exit;
        }
    }
    

    if ($_SERVER['REQUEST_METHOD']=='POST')
    {
        $sql="INSERT INTO DETALLE(est_val,id_act_per,id_val_per)
        VALUES(:est_val,:id_act_per,:id_val_per)";
        $stmt=$pdo->prepare($sql);
        $stmt->bindValue(':est_val',$_POST['est_val']);
        $stmt->bindValue(':id_act_per',$_POST['id_act_per']);
        $stmt->bindValue(':id_val_per',$_POST['id_val_per']);
        $stmt->execute();
        $est_val=$pdo->lastInsertId();
        if($est_val)
        {
            header("HTTP/1.1 200 0K");
            echo json_encode($est_val);
            exit;
        }

    }

    if ($_SERVER['REQUEST_METHOD']=='PUT')
    {
        $sql="UPDATE DETALLE SET est_val=:est_val,id_val_per=:id_val_per
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
        $sql="DELETE FROM DETALLE WHERE id_act_per=:id_act_per ";
        $stmt=$pdo->prepare($sql);
        $stmt->bindValue(':id_act_per',$_GET['id_act_per']);
        $stmt->execute();
        header("HTTP/1.1 200 0K");  
        echo json_encode("eliminado",JSON_FORCE_OBJECT);     
        exit;
        

    }
?>