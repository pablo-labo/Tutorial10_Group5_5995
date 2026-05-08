package defpackage;

import defpackage.kv8;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class wl2 implements uv8 {
    public final pw5[] a;

    public wl2(pw5[] pw5VarArr) {
        this.a = pw5VarArr;
    }

    @Override // defpackage.uv8
    public final void G(zv8 zv8Var, kv8.a aVar) {
        new HashMap();
        pw5[] pw5VarArr = this.a;
        for (pw5 pw5Var : pw5VarArr) {
            pw5Var.a();
        }
        for (pw5 pw5Var2 : pw5VarArr) {
            pw5Var2.a();
        }
    }
}
