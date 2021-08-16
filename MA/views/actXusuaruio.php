
<?php 
include'../controllers/Conexion.php';
$pdo = new Conexion();
if ($_SERVER['REQUEST_METHOD']=='GET')
{
    if(isset($_GET['ced_usu_per']))
    {                         
        $sql=$pdo->prepare("SELECT * FROM activos where ced_usu_per=:ced_usu_per");
        $sql->bindValue(':ced_usu_per',$_GET['ced_usu_per']);
        $sql->execute();
        $sql->setFetchMode(PDO::FETCH_ASSOC);
        header("HTTP/1.1 200 OK");
        echo json_encode($sql->fetchAll(),JSON_FORCE_OBJECT);
    }  exit;
       
}

?>

    