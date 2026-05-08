package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ovf extends pvf<Object> {
    public final /* synthetic */ pvf a;

    public ovf(pvf pvfVar) {
        this.a = pvfVar;
    }

    @Override // defpackage.pvf
    public final Object a(nb8 nb8Var) throws IOException {
        if (nb8Var.j0() != sb8.X) {
            return this.a.a(nb8Var);
        }
        nb8Var.l1();
        return null;
    }

    @Override // defpackage.pvf
    public final void b(gc8 gc8Var, Object obj) throws IOException {
        if (obj == null) {
            gc8Var.Q();
        } else {
            this.a.b(gc8Var, obj);
        }
    }
}
