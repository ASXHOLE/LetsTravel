package com.LetsTrav;

import com.letstravel.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends Activity implements OnClickListener {
	private EditText newLogName;
	private EditText newLogPsw;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.signup);

		Button btnSign = (Button) findViewById(R.id.btnSign);
		btnSign.setOnClickListener(this);
		Button btnClear = (Button) findViewById(R.id.btnClear);
		btnClear.setOnClickListener(this);
		newLogName = (EditText) findViewById(R.id.newLogName);
		newLogPsw = (EditText) findViewById(R.id.newLogPsw);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btnSign:
			Log.d("SignUpAct", "sign");
			String logname=newLogName.getText().toString();
			String logpsw=newLogPsw.getText().toString();
			Toast.makeText(this, logname+","+logpsw, Toast.LENGTH_SHORT).show();
			break;
		case R.id.btnClear:
			Log.d("SignUpAct", "clear");
			newLogName.setText("");
			newLogPsw.setText("");
			break;
		}

	}
}
