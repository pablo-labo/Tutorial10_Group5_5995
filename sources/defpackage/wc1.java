package defpackage;

import defpackage.rc1;

/* JADX INFO: loaded from: classes.dex */
public final class wc1 implements l74 {
    public final /* synthetic */ rc1 a;

    public wc1(rc1 rc1Var) {
        this.a = rc1Var;
    }

    @Override // defpackage.l74
    public final void dispose() {
        rc1.a aVar = (rc1.a) ((gme) this.a.c).getValue();
        if (aVar != null) {
            aVar.close();
        }
    }
}
