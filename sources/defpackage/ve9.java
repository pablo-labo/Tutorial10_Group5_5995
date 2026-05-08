package defpackage;

import android.view.View;
import com.google.android.material.datepicker.g;

/* JADX INFO: loaded from: classes2.dex */
public final class ve9 implements View.OnClickListener {
    public final /* synthetic */ g a;

    public ve9(g gVar) {
        this.a = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        g gVar = this.a;
        gVar.v0.setEnabled(gVar.M().v1());
        gVar.t0.toggle();
        gVar.R(gVar.t0);
        gVar.P();
    }
}
