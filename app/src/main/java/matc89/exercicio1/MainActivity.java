package matc89.exercicio1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

//import android.widget.Button;

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

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);

        outState.putString("texto",tv.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);

        tv.setText(savedInstanceState.getString("texto"));
    }

}
