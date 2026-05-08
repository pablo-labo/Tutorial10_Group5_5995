package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* JADX INFO: loaded from: classes.dex */
public final class b implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AlertController a;
    public final /* synthetic */ AlertController.b b;

    public b(AlertController.b bVar, AlertController alertController) {
        this.b = bVar;
        this.a = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        AlertController.b bVar = this.b;
        DialogInterface.OnClickListener onClickListener = bVar.r;
        AlertController alertController = this.a;
        onClickListener.onClick(alertController.b, i);
        if (bVar.t) {
            return;
        }
        alertController.b.dismiss();
    }
}
