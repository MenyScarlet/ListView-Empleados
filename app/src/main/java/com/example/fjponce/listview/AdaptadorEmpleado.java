package com.example.fjponce.listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by fjponce on 10/02/18.
 */

public class AdaptadorEmpleado extends ArrayAdapter<Empleado> {

    ArrayList<Empleado> empleados;
    Context c;

    public AdaptadorEmpleado(Context c, ArrayList<Empleado> empleados){
        super(c, R.layout.empleado, empleados);
        this.c = c;
        this.empleados = empleados;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.empleado,null);

        //TextView Rol
        TextView tvListRol=(TextView)item.findViewById(R.id.tvListRol);
        tvListRol.setText(empleados.get(position).getRol());

        //TextView Nombre
        TextView tvListNombre=(TextView)item.findViewById(R.id.tvListNombre);
        tvListNombre.setText(empleados.get(position).getNombre());

        //TextView Empresa
        TextView tvListEmpresa=(TextView)item.findViewById(R.id.tvListEmpresa);
        tvListEmpresa.setText(empleados.get(position).getEmpresa());

        //ImagenView
        String imagen = empleados.get(position).getImagen();

        int idImagen = c.getResources().getIdentifier(imagen,"mipmap",c.getPackageName());

        ImageView ivListIMG = (ImageView)item.findViewById(R.id.ivListIMG);

        ivListIMG.setImageResource(idImagen);

        return item;
    }


}
