package cn.edu.guet.xianhuo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import cn.edu.guet.xianhuo.R;

/**
 * 用户登录
 */
public class UserLogin extends AppCompatActivity {

    private EditText account_input;
    private EditText password_input;

    public static final int USER_REGISTER_START_ACTIVITY_CODE = 1;
    public static final int USER_FORGET_PASSWORD_START_ACTIVITY_CODE = 2;
    public static final int USER_LOGIN_QUICK_PHONE_START_ACTIVITY_CODE = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_login);

        /**
         * 检查token进行自动登录
         */
        account_input = findViewById(R.id.account_input);
        password_input = findViewById(R.id.password_input);

        /**
         * 登录按钮点击事件
         */
        findViewById(R.id.login_btn).setOnClickListener((v) -> {
            String account = account_input.getText().toString();
            String password = password_input.getText().toString();
            /**
             * 进行网络请求认证
             */
        });

        /**
         * 注册按钮点击将跳转到注册界面
         */
        findViewById(R.id.reg_btn).setOnClickListener((v) -> startActivityForResult(new Intent(UserLogin.this, UserRegister.class), USER_REGISTER_START_ACTIVITY_CODE));

        /**
         * 手机号码快捷登录
         */
        findViewById(R.id.phone_number_login).setOnClickListener((v) -> {
            /**
             * 跳转到手机号码认证页
             */
        });

        /**
         * 密码找回页面
         */
        findViewById(R.id.forget_password).setOnClickListener((v) -> startActivityForResult(new Intent(UserLogin.this, UserRegister.class), USER_FORGET_PASSWORD_START_ACTIVITY_CODE));

    }

}
