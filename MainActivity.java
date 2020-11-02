package test.intent.com.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.bu);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BluetoothAdapter bluetoothAdapter=BluetoothAdapter.getDefaultAdapter();

                if(!bluetoothAdapter.isEnabled()){
                    bluetoothAdapter.enable();
                    Toast.makeText(MainActivity.this,"on",Toast.LENGTH_LONG).show();
                }
                if(bluetoothAdapter.isEnabled()){
                    bluetoothAdapter.disable();
                    Toast.makeText(MainActivity.this,"off",Toast.LENGTH_LONG).show();

                }

            }
        });
    }
}
