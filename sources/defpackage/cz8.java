package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class cz8 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ dz8 a;

    public cz8(dz8 dz8Var) {
        this.a = dz8Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        fd4 fd4Var;
        if (i == -1 || (fd4Var = this.a.c) == null) {
            return;
        }
        fd4Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
