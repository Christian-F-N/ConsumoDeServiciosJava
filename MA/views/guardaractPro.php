
   <?php
    include'../controllers/Conexion.php';
    $pdo = new Conexion();
    if ($_SERVER['REQUEST_METHOD']=='GET')
    {
        $sql="INSERT INTO DETALLE(est_val,id_act_per,id_val_per)
        VALUES('R',:id_act_per,:id_val_per)";
        $stmt=$pdo->prepare($sql);
        $stmt->bindValue(':id_act_per',$_GET['id_act_per']);
        $stmt->bindValue(':id_val_per',$_GET['id_val_per']);
        $stmt->execute();
        $est_val=$pdo->lastInsertId();
        header("HTTP/1.1 200 0K");
        echo json_encode($est_val);
        exit;
        

    }
?>