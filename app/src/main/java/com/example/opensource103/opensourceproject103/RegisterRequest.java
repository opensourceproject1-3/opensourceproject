package com.example.opensource103.opensourceproject103;

import android.support.annotation.Nullable;
import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {


    //서버 url 설정 ( PHP파일 연동 )

    final static private String URL = "http://sehwa98.dothome.co.kR/Register.php";

    private Map<String,String> map;

    public RegisterRequest(String userID,String userPassword,String userName, Response.Listener<String> listener) {
        super(Method.POST,URL, listener,null);

        map=new HashMap<>();

        map.put("userID",userID);
        map.put("userPassword",userPassword);
        map.put("userName",userName);

    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}
