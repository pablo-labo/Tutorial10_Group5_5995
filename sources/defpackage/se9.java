package defpackage;

import android.view.View;
import com.google.android.material.datepicker.b;

/* JADX INFO: loaded from: classes2.dex */
public final class se9 implements View.OnClickListener {
    public final /* synthetic */ b a;

    public se9(b bVar) {
        this.a = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b bVar = this.a;
        b.d dVar = bVar.f;
        b.d dVar2 = b.d.a;
        b.d dVar3 = b.d.b;
        if (dVar == dVar3) {
            bVar.F(dVar2);
        } else if (dVar == dVar2) {
            bVar.F(dVar3);
        }
    }
}
