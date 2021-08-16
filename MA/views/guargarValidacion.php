<?php
    include'../controllers/Conexion.php';
    $pdo = new Conexion();
    if ($_SERVER['REQUEST_METHOD']=='GET')
    {
        $sql="INSERT INTO validacion(id_pro,nom_pro,fec_hor_pro,est_pro,id_res_pro)
        VALUES(:id_pro,:nom_pro,'Sysdate','P',:id_res_pro)";
        $stmt=$pdo->prepare($sql);
        $stmt->bindValue(':id_pro',$_GET['id_pro']);
        $stmt->bindValue(':nom_pro',$_GET['nom_pro']);
        $stmt->bindValue(':id_res_pro',$_GET['id_res_pro']);
        $stmt->execute();
        $est_val=$pdo->lastInsertId();
        if($est_val)
        {
            header("HTTP/1.1 200 0K");
            echo json_encode($id_pro);
            exit;
        }

    }
?>