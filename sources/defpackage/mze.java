package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.f;

/* JADX INFO: loaded from: classes2.dex */
public class mze extends f {
    public Dialog f0;
    public DialogInterface.OnCancelListener g0;
    public AlertDialog h0;

    @Override // androidx.fragment.app.f
    public final Dialog H(Bundle bundle) {
        Dialog dialog = this.f0;
        if (dialog != null) {
            return dialog;
        }
        this.W = false;
        if (this.h0 == null) {
            Context context = getContext();
            fib.i(context);
            this.h0 = new AlertDialog.Builder(context).create();
        }
        return this.h0;
    }

    @Override // androidx.fragment.app.f, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.g0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
