package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w3<T> extends u1<T> {
    public final gbe h;
    public final bj7 i;

    public w3(opb opbVar, gbe gbeVar, bj7 bj7Var) {
        opbVar.getClass();
        HashMap map = gbeVar.f;
        this.h = gbeVar;
        this.i = bj7Var;
        it5.a();
        this.a = map;
        it5.a();
        bj7Var.g(gbeVar);
        it5.a();
        opbVar.a(new v3(this), gbeVar);
    }

    @Override // defpackage.u1, defpackage.ye3
    public final boolean close() {
        if (!super.close()) {
            return false;
        }
        if (d()) {
            return true;
        }
        bj7 bj7Var = this.i;
        gbe gbeVar = this.h;
        bj7Var.i(gbeVar);
        gbeVar.e();
        return true;
    }

    public void m(T t, int i, ppb ppbVar) {
        ppbVar.getClass();
        boolean zA = w81.a(i);
        if (k(t, zA, ppbVar.getExtras()) && zA) {
            this.i.e(this.h);
        }
    }
}
