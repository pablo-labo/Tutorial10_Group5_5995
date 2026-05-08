package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.c;

/* JADX INFO: loaded from: classes.dex */
public final class onf implements View.OnClickListener {
    public final h7 a;
    public final /* synthetic */ c b;

    public onf(c cVar) {
        this.b = cVar;
        Context context = cVar.a.getContext();
        CharSequence charSequence = cVar.h;
        h7 h7Var = new h7();
        h7Var.e = 4096;
        h7Var.g = 4096;
        h7Var.l = null;
        h7Var.m = null;
        h7Var.n = false;
        h7Var.o = false;
        h7Var.p = 16;
        h7Var.i = context;
        h7Var.a = charSequence;
        this.a = h7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        c cVar = this.b;
        Window.Callback callback = cVar.k;
        if (callback == null || !cVar.l) {
            return;
        }
        callback.onMenuItemSelected(0, this.a);
    }
}
