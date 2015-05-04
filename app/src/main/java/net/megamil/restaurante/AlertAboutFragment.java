package net.megamil.restaurante;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;

public class AlertAboutFragment extends DialogFragment implements DialogInterface.OnClickListener {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder alerta = new AlertDialog.Builder(getActivity());

        alerta.setTitle("Sobre o APP")
                .setMessage("Restaurante: Nome \n" +
                        "Endereço: Rua tal, Número X \n" +
                        "Telefone (11) 12345-6789 \n\n" +
                        "Desenvolvido por: app.megamil.net \n" +
                        "Contato: Eduardo \n" +
                        "Telefone: (11) 96278-2329")
                .setNeutralButton("Voltar", this);



        return alerta.create();

    }

    @Override
    public void onClick(DialogInterface dialog, int which) {


    }
}