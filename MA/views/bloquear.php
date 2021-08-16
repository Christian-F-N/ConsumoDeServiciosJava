
<?php 
include'../controllers/Conexion.php';
$pdo = new Conexion();
if ($_SERVER['REQUEST_METHOD']=='GET')
{
    $sql="UPDATE USUARIOS SET est_cue='B'
    WHERE ced_usu=:ced_usu ";
    $stmt=$pdo->prepare($sql);
    $stmt->bindValue(':ced_usu',$_GET['ced_usu']);
    $stmt->execute();
    header("HTTP/1.1 200 0K");  
    echo json_encode("actualizado",JSON_FORCE_OBJECT);   
    exit;
}

?> 