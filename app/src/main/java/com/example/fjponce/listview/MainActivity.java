package com.example.fjponce.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tvDesNombre, tvDesTelefono, tvDesDNI, tvListRol, tvListEmpresa, tvListNombre;
    ImageView ivDesIMG, ivListIMG;
    ListView lvEmpleados;
    ArrayList<Empleado> empleados = new ArrayList<>();

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

        cargarEmpleados();

        AdaptadorEmpleado adaptadorEmpleado = new AdaptadorEmpleado( this, empleados );
        lvEmpleados.setAdapter( adaptadorEmpleado );

    }

    private void cargarEmpleados() {
        empleados.add( new Empleado(
                "admin",
                "img1",
                "Melania",
                "AndroidStudio",
                "123456789A",
                666778899
        ) );
        empleados.add( new Empleado(
                "admin",
                "img1",
                "Melania",
                "AndroidStudio",
                "123456789A",
                666778899
        ) );
        empleados.add( new Empleado(
                "admin",
                "img1",
                "Melania",
                "AndroidStudio",
                "123456789A",
                666778899
        ) );
        empleados.add( new Empleado(
                "admin",
                "img1",
                "Melania",
                "AndroidStudio",
                "123456789A",
                666778899
        ) );
        empleados.add( new Empleado(
                "admin",
                "img1",
                "Melania",
                "AndroidStudio",
                "123456789A",
                666778899
        ) );
        empleados.add( new Empleado(
                "admin",
                "img1",
                "Melania",
                "AndroidStudio",
                "123456789A",
                666778899
        ) );
        empleados.add( new Empleado(
                "admin",
                "img1",
                "Melania",
                "AndroidStudio",
                "123456789A",
                666778899
        ) );
        empleados.add( new Empleado(
                "admin",
                "img1",
                "Melania",
                "AndroidStudio",
                "123456789A",
                666778899
        ) );
        empleados.add( new Empleado(
                "admin",
                "img1",
                "Melania",
                "AndroidStudio",
                "123456789A",
                666778899
        ) );
    }
}
