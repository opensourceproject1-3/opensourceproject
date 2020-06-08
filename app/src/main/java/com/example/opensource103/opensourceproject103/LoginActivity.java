package com.example.opensource103.opensourceproject103;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity {

    private EditText et_id, et_pass;
    private Button btn_login, btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // 아이디 값 찾아주기
        et_id=findViewById(R.id.et_id);
        et_pass=findViewById(R.id.et_pass);

        et_pass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD );
        et_pass.setTransformationMethod(PasswordTransformationMethod.getInstance());

        btn_login=findViewById(R.id.btn_login);
        btn_register=findViewById(R.id.btn_register);


        btn_register.setOnClickListener(new View.OnClickListener() { // 회원가입 버튼 클릭시 회원가입 액티비티로 넘어감
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() { // 회원가입 버튼 클릭시 회원가입 액티비티로 넘어감
            @Override
            public void onClick(View view) {
                //EditText에 현재 입력되어 있는 값을 가져온다.ㅠ
                String userID = et_id.getText().toString();
                String userPass = et_pass.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            boolean success = jsonObject.getBoolean("success");
                            // Register.php 에 성공시 response["success"] = true
                            if (success){ // 로그인 성공
                                String userID = jsonObject.getString("userID");
                                String userPass = jsonObject.getString("userPassword");

                                Toast.makeText(getApplicationContext(),"직지장터 로그인에 성공하셨습니다.",Toast.LENGTH_SHORT).show();

                                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                                intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);

                                intent.putExtra("userID",userID);
                                intent.putExtra("userPass",userPass);
                                startActivity(intent);
                            }
                            else { // 로그인 실패
                                Toast.makeText(getApplicationContext(),"직지장터 로그인에 실패하셨습니다.",Toast.LENGTH_SHORT).show();
                                return;
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };

                LoginRequest loginRequest = new LoginRequest(userID, userPass, responseListener);
                RequestQueue queue = Volley.newRequestQueue(LoginActivity.this);
                queue.add(loginRequest);
            }
        });




    }
}
