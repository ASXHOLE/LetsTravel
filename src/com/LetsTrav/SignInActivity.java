package com.LetsTrav;

import com.letstravel.R;
import com.bean.*;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignInActivity extends Activity implements OnClickListener{
	private EditText logName;
	private EditText logPsw;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		
		Button btnLogin = (Button) findViewById(R.id.btnLogin);
		btnLogin.setOnClickListener(this);
		Button btnSignup = (Button) findViewById(R.id.btnSignup);
		btnSignup.setOnClickListener(this);
		
		logName = (EditText) findViewById(R.id.logName);
		logPsw = (EditText) findViewById(R.id.logPsw);
		
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()){
		case R.id.btnLogin:
			Log.d("SignInAct", "login");
			String logname=logName.getText().toString();
			String logpsw=logPsw.getText().toString();
			LoginVerification lv=new LoginVerification();
			if(lv.LoginVerify(logname, logpsw)){//-----------------------------�˴�Ϊ��֤�û�������
				Log.d("SignInAct", "loginsuccess");
			}else{
				Log.d("SignInAct", "loginfaile");
				Toast.makeText(this, "�û�������������󣬵�¼ʧ��Ŷ:-(", Toast.LENGTH_SHORT).show();
			}
			break;
		case R.id.btnSignup:
			Log.d("SignInAct", "signup");
			Intent processIntent = new Intent(this,SignUpActivity.class);
			startActivity(processIntent);
			break;
		}
		
	}
}
