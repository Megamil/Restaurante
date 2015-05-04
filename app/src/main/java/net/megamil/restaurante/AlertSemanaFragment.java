package net.megamil.restaurante;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class AlertSemanaFragment extends DialogFragment implements DialogInterface.OnClickListener {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder alerta = new AlertDialog.Builder(getActivity());

        alerta.setTitle("Selecione um dia da Semana")
                .setItems(R.array.semana, this);

        return alerta.create();

    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        String[] semanarray = getActivity().getResources().getStringArray(R.array.semana);
        String semana = semanarray[which];

        String[] idarray = getActivity().getResources().getStringArray(R.array.id_semana);
        Integer id = Integer.parseInt(idarray[which]);

        if(id != 0) {
            Toast.makeText(getActivity(), "Você escolheu: " + semana + " ID " + id, Toast.LENGTH_SHORT).show();
        }


    }
}