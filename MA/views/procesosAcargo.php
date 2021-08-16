
<?php 
include'../controllers/Conexion.php';
$pdo = new Conexion();
if ($_SERVER['REQUEST_METHOD']=='GET')
{
    if(isset($_GET['id_res_pro']))
    {                         
        $sql=$pdo->prepare("SELECT * FROM validacion where id_res_pro=:id_res_pro");
        $sql->bindValue(':id_res_pro',$_GET['id_res_pro']);
        $sql->execute();
        $sql->setFetchMode(PDO::FETCH_ASSOC);
        header("HTTP/1.1 200 OK");
        echo json_encode($sql->fetchAll(),JSON_FORCE_OBJECT);
    }  exit;
       
}

?>
