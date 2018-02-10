package com.example.fjponce.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tvDesNombre, tvDesTelefono, tvDesDNI, tvListRol, tvListEmpresa, tvListNombre;
    ImageView ivDesIMG, ivListIMG;
    ListView lvEmpleados;
    ArrayList<Empleado> empleados = new ArrayList<>();
    LinearLayout lyDes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        tvDesNombre = (TextView)findViewById(R.id.tvDesNombre);
        tvDesTelefono = (TextView)findViewById(R.id.tvDesTelefono);
        tvDesDNI = (TextView)findViewById(R.id.tvDesDNI);
        tvListRol = (TextView)findViewById(R.id.tvListRol);
        tvListEmpresa = (TextView)findViewById(R.id.tvListEmpresa);
        tvListNombre = (TextView)findViewById(R.id.tvListNombre);
        ivDesIMG = (ImageView)findViewById(R.id.ivDesIMG);
        ivListIMG = (ImageView)findViewById(R.id.ivListIMG);
        lvEmpleados = (ListView)findViewById(R.id.lvEmpleados);
        lyDes = (LinearLayout)findViewById(R.id.lyDes);

        cargarEmpleados();

        AdaptadorEmpleado adaptadorEmpleado = new AdaptadorEmpleado( this, empleados );
        lvEmpleados.setAdapter( adaptadorEmpleado );

        lyDes.setVisibility(LinearLayout.GONE);

    }// FIN onCreate

    public void clickEmpleado(View view){
        lvEmpleados.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view,int position, long arg3) {

                if ( lyDes.getVisibility() == LinearLayout.GONE ){
                    lyDes.setVisibility(LinearLayout.VISIBLE);
                }

                return true;

            }
        });
    }

    private void cargarEmpleados() {
        empleados.add( new Empleado(
                "Administrativa",
                "girl5",
                "Melania",
                "AndroidStudio",
                "123456789A",
                666778899
        ) );
        empleados.add( new Empleado(
                "Informático",
                "boy5",
                "Francisco",
                "AndroidStudio",
                "123456744F",
                666778899
        ) );
        empleados.add( new Empleado(
                "Recepcionista",
                "girl4",
                "Ana",
                "AndroidStudio",
                "123456793P",
                666778899
        ) );
        empleados.add( new Empleado(
                "Tecnico",
                "boy4",
                "Andres",
                "AndroidStudio",
                "123456785K",
                666778899
        ) );
        empleados.add( new Empleado(
                "Administrativa",
                "girl3",
                "Maite",
                "AndroidStudio",
                "123456723D",
                666778899
        ) );
        empleados.add( new Empleado(
                "Secretario",
                "boy3",
                "Antonio",
                "AndroidStudio",
                "123456786U",
                666778899
        ) );
        empleados.add( new Empleado(
                "Secretaria",
                "girl2",
                "Maria",
                "AndroidStudio",
                "123456753B",
                666778899
        ) );
        empleados.add( new Empleado(
                "Técnico",
                "boy2",
                "Alberto",
                "AndroidStudio",
                "123456779M",
                666778899
        ) );
        empleados.add( new Empleado(
                "Recepcionista",
                "girl1",
                "Rocio",
                "AndroidStudio",
                "123456745G",
                666778899
        ) );
        empleados.add( new Empleado(
                "Informático",
                "boy1",
                "Luis",
                "AndroidStudio",
                "123456718I",
                666778899
        ) );
    }
}
