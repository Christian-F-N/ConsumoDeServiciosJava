<?php
    include'../controllers/Conexion.php';
    $pdo = new Conexion();
    if ($_SERVER['REQUEST_METHOD']=='GET')
    {
        if (isset($_GET['ced_usu']))
        {
            $sql=$pdo->prepare("SELECT * FROM USUARIOS where ced_usu=:ced_usu");
            $sql->bindValue(':ced_usu',$_GET['ced_usu']);
            $sql->execute();
            $sql->setFetchMode(PDO::FETCH_ASSOC);
            header("HTTP/1.1 200 OK");
            echo json_encode($sql->fetchAll(),JSON_FORCE_OBJECT);
            exit;
        }else{
            $sql=$pdo->prepare("SELECT * FROM usuarios");
            $sql->execute();
            $sql->setFetchMode(PDO::FETCH_ASSOC);
            header("HTTP/1.1 200 OK");
            echo json_encode($sql->fetchAll(),JSON_FORCE_OBJECT);
            exit;
        }
    }

    if ($_SERVER['REQUEST_METHOD']=='POST')
    {
        $sql="INSERT INTO usuarios(ced_usu,nom_cue,cla_cue,fec_cre_cue, nom_usu, ape_usu, fec_nac_usu, est_cue)
        VALUES(:ced_usu,:nom_cue,:cla_cue,:fec_cre_cue,:nom_usu,:ape_usu,:fec_nac_usu,:est_cue)";
        $stmt=$pdo->prepare($sql);
        $stmt->bindValue(':ced_usu',$_POST['ced_usu']);
        $stmt->bindValue(':nom_cue',$_POST['nom_cue']);
        $stmt->bindValue(':cla_cue',$_POST['cla_cue']);
        $stmt->bindValue(':fec_cre_cue',$_POST['fec_cre_cue']);
        $stmt->bindValue(':nom_usu',$_POST['nom_usu']);
        $stmt->bindValue(':ape_usu',$_POST['ape_usu']);
        $stmt->bindValue(':fec_nac_usu',$_POST['fec_nac_usu']);
        $stmt->bindValue(':est_cue',$_POST['est_cue']);
        $stmt->execute();
        $est_val=$pdo->lastInsertId();
        if($est_val)
        {
            header("HTTP/1.1 200 0K");
            echo json_encode($ced_usu,JSON_FORCE_OBJECT);
            exit;
        }

    }

    if ($_SERVER['REQUEST_METHOD']=='PUT')
    {
        $sql="UPDATE usuarios SET nom_cue=:nom_cue,cla_cue=:cla_cue,fec_cre_cue=:fec_cre_cue, nom_usu=:nom_usu, ape_usu=:ape_usu, fec_nac_usu=:ape_usu, est_cue=:est_cue
        WHERE ced_usu=:ced_usu ";
        $stmt=$pdo->prepare($sql);
        $stmt->bindValue(':ced_usu',$_GET['ced_usu']);
        $stmt->bindValue(':nom_cue',$_GET['nom_cue']);
        $stmt->bindValue(':cla_cue',$_GET['cla_cue']);
        $stmt->bindValue(':fec_cre_cue',$_GET['fec_cre_cue']);
        $stmt->bindValue(':nom_usu',$_GET['nom_usu']);
        $stmt->bindValue(':ape_usu',$_GET['ape_usu']);
        $stmt->bindValue(':fec_nac_usu',$_GET['fec_nac_usu']);
        $stmt->bindValue(':est_cue',$_GET['est_cue']);
        $stmt->execute();
        header("HTTP/1.1 200 0K");    
        echo json_encode("actualizado",JSON_FORCE_OBJECT); 
        exit;
    }
    

    if ($_SERVER['REQUEST_METHOD']=='DELETE')
    {
        $sql="DELETE FROM usuarios WHERE ced_usu=:ced_usu ";
        $stmt=$pdo->prepare($sql);
        $stmt->bindValue(':ced_usu',$_GET['ced_usu']);
        $stmt->execute();
        header("HTTP/1.1 200 0K");     
        echo json_encode("eliminado",JSON_FORCE_OBJECT);  
        exit;
        

    }
?>