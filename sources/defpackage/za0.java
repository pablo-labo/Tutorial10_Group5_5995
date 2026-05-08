package defpackage;

import android.view.ActionMode;

/* JADX INFO: loaded from: classes.dex */
public final class za0 implements l74 {
    public final /* synthetic */ sa0 a;

    public za0(sa0 sa0Var) {
        this.a = sa0Var;
    }

    @Override // defpackage.l74
    public final void dispose() {
        sa0 sa0Var = this.a;
        qme qmeVar = sa0Var.e;
        vle vleVar = qmeVar.h;
        if (vleVar != null) {
            vleVar.dispose();
        }
        qmeVar.a();
        ActionMode actionMode = sa0Var.h;
        if (actionMode != null) {
            actionMode.finish();
        }
        sa0Var.h = null;
    }
}
