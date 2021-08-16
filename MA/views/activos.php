<?php
    include'../controllers/Conexion.php';
    $pdo = new Conexion();
    if ($_SERVER['REQUEST_METHOD']=='GET')
    {
        if (isset($_GET['id_act']))
        {
            $sql=$pdo->prepare("SELECT * FROM ACTIVOS where id_act=:id_act");
            $sql->bindValue(':id_act',$_GET['id_act']);
            $sql->execute();
            $sql->setFetchMode(PDO::FETCH_ASSOC);
            header("HTTP/1.1 200 OK");
            echo json_encode($sql->fetchAll(),JSON_FORCE_OBJECT);
            exit;
        }else{
            $sql=$pdo->prepare("SELECT * FROM ACTIVOS");
            $sql->execute();
            $sql->setFetchMode(PDO::FETCH_ASSOC);
            header("HTTP/1.1 200 OK");
            echo json_encode($sql->fetchAll(),JSON_FORCE_OBJECT);
            exit;
        }
    }
   
    if ($_SERVER['REQUEST_METHOD']=='POST')
    {
        $sql="INSERT INTO DETALLE(id_act,nom_act,est_act,cod_bar_act,des_act,ced_usu_per)
        VALUES(:id_act,:nom_act,:est_act,:cod_bar_act,:des_act,ced_usu_per)";
        $stmt=$pdo->prepare($sql);
        $stmt->bindValue(':id_act',$_POST['id_act']);
        $stmt->bindValue(':nom_act',$_POST['nom_act']);
        $stmt->bindValue(':est_act',$_POST['est_act']);
        $stmt->bindValue(':cod_bar_act',$_POST['cod_bar_act']);
        $stmt->bindValue(':des_act',$_POST['des_act']);
        $stmt->bindValue(':ced_usu_per',$_POST['ced_usu_per']);
        $stmt->execute();
        $est_val=$pdo->lastInsertId();
        if($est_val)
        {
            header("HTTP/1.1 200 0K");
            echo json_encode($est_val,JSON_FORCE_OBJECT);
            exit;
        }

    }

    if ($_SERVER['REQUEST_METHOD']=='PUT')
    {
        $sql="UPDATE DETALLE SET nom_act=:nom_act,est_act=:est_act,cod_bar_act=:cod_bar_act,des_act=:des_act,ced_usu_per=:ced_usu_per
        WHERE id_act=:id_act ";
        $stmt=$pdo->prepare($sql);
        $stmt->bindValue(':id_act',$_GET['id_act']);
        $stmt->bindValue(':nom_act',$_GET['nom_act']);
        $stmt->bindValue(':est_act',$_GET['est_act']);
        $stmt->bindValue(':cod_bar_act',$_GET['cod_bar_act']);
        $stmt->bindValue(':des_act',$_GET['des_act']);
        $stmt->bindValue(':ced_usu_per',$_GET['ced_usu_per']);
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