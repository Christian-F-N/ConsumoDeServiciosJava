<?php 
include'../controllers/Conexion.php';
$pdo = new Conexion();
if ($_SERVER['REQUEST_METHOD']=='GET')
{
    if(isset($_GET['id_act']))
    {                         
        $sql=$pdo->prepare("SELECT * FROM activos where id_act=:id_act");
        $sql->bindValue(':id_act',$_GET['id_act']);
        $sql->execute();
        $sql->setFetchMode(PDO::FETCH_ASSOC);
        header("HTTP/1.1 200 OK");
        echo json_encode($sql->fetchAll(),JSON_FORCE_OBJECT);
    }  exit;
       
}

?>