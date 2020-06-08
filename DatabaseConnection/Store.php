<?php

$con = mysqli_connect("localhost", "sehwa98", "chltpghk33!", "sehwa98");


if(mysqli_connect_errno($con))
{
    echo "Failed to connect to MySQL : " . mysqli_connect_errno();
}

mysqli_set_charset($con,"utf8");

$res = mysqli_query($con,"SELECT * FROM STORE");

$result = array();

while($row = mysqli_fetch_array($res)){

    array_push($result,
    array('storeID'=>$row[0],'storeName'=>$row[1],'storeTime'=>$row[2], 'categoryID'=>$row[3]));
}

echo json_encode(array("result"=>$result));


mysqli_close($con);

?>