<?php
    class Conexion extends PDO
    {
        private $servername="localhost";
        private  $username="root";
        private $password="";
        private  $dbname="proyecto";
        public function __construct()
        {
            try
            {
                parent::__construct('mysql:host='.$this->servername.';dbname='.$this->
                dbname . '; charset=utf8',$this->username,$this->password,array(PDO::
                ATTR_ERRMODE=>PDO::ERRMODE_EXCEPTION));
            } catch(PDOException $e){
                echo 'Error: '. $e->getMessage();
                exit;
            }
        }
       
    }
?>