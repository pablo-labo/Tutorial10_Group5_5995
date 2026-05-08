package defpackage;

import defpackage.f09;

/* JADX INFO: loaded from: classes.dex */
public class c09<D> {
    public f09.a a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    public final void a() {
        uv0 uv0Var = (uv0) this;
        if (uv0Var.g != null) {
            if (!uv0Var.b) {
                uv0Var.e = true;
            }
            uv0<D>.a aVar = uv0Var.h;
            uv0<D>.a aVar2 = uv0Var.g;
            if (aVar != null) {
                aVar2.getClass();
                uv0Var.g = null;
                return;
            }
            aVar2.getClass();
            uv0<D>.a aVar3 = uv0Var.g;
            aVar3.d.set(true);
            if (aVar3.b.cancel(false)) {
                uv0Var.h = uv0Var.g;
            }
            uv0Var.g = null;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        hh2.i(sb, this);
        sb.append(" id=");
        sb.append(0);
        sb.append("}");
        return sb.toString();
    }
}
