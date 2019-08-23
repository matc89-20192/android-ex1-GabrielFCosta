package matc89.exercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
//import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //private Button btn;
    private TextView tv;
    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //btn = (Button)findViewById(R.id.btnCumprimentar);
        tv = (TextView)findViewById(R.id.labelMensagem);
        et = (EditText)findViewById(R.id.editNome);
    }
    public void botaoClicado(View v) {
        String nome = et.getText().toString();
        tv.setText("Alô, " + nome + "!");
    }

}
