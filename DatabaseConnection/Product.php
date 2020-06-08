<?php

$con = mysqli_connect("localhost", "sehwa98", "chltpghk33!", "sehwa98");


if(mysqli_connect_errno($con))
{
    echo "Failed to connect to MySQL : " . mysqli_connect_errno();
}

mysqli_set_charset($con,"utf8");

$res = mysqli_query($con,"SELECT * FROM PRODUCT");

$result = array();

while($row = mysqli_fetch_array($res)){

    array_push($result,
    array('productID'=>$row[0],'productName'=>$row[1],'productPrice'=>$row[2], 'productImage'=>$row[3],'storeID'=>$row[4],'categoryID'=>$row[5],'productUnit'=>$row[6]));
}

echo json_encode(array("result"=>$result));


mysqli_close($con);

?>