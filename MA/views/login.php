<?php 
include'../controllers/Conexion.php';
$pdo = new Conexion();
if ($_SERVER['REQUEST_METHOD']=='GET')
{
    if(isset($_GET['ced_usu']) && isset($_GET['cla_cue'])&& isset($_GET['cla_cue']))
    {
        $sql=$pdo->prepare("SELECT * FROM usuarios where ced_usu=:ced_usu	and cla_cue=:cla_cue and est_cue='A'");
        $sql->bindValue(':ced_usu',$_GET['ced_usu']);
        $sql->bindValue(':cla_cue',$_GET['cla_cue']);
        $sql->execute();
        $sql->setFetchMode(PDO::FETCH_ASSOC);
        header("HTTP/1.1 200 OK");
        echo json_encode($sql->fetchAll(),JSON_FORCE_OBJECT);
        exit;
    }
    
}
?>
