package defpackage;

import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.t;
import androidx.media3.session.x;
import androidx.media3.session.z;
import defpackage.c2f;
import defpackage.e75;
import defpackage.gdb;
import defpackage.lz8;
import org.apache.avro.f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z25 implements lz8.a, e75.e, t.g, x.e, c2f.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z25(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // c2f.a
    public Object b() {
        ((ihg) this.b).i.a();
        return null;
    }

    @Override // androidx.media3.session.t.g
    public void d(r.d dVar) {
        vdb vdbVar = ((t) this.b).g.t;
        String str = vjg.a;
        if (vdbVar == null || !vdbVar.O0(1)) {
            return;
        }
        vdbVar.c();
    }

    @Override // androidx.media3.session.x.e
    public Object g(s sVar, r.d dVar, int i) {
        return sVar.m(dVar, e47.n((ij9) this.b));
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((gdb.c) obj).f0((wqf) ((adb) obj2).i.d);
                break;
            default:
                ((gdb.c) obj).f0(((z) obj2).D);
                break;
        }
    }

    @Override // defpackage.wg3
    public Object j(Object obj, ka6 ka6Var) {
        f.d dVar = (f.d) this.b;
        int iR0 = ka6Var.R0();
        Object obj2 = dVar.e[iR0];
        if (obj2 != null) {
            return obj2;
        }
        r40.l(l5.l("No match for ", dVar.a.A().get(iR0)));
        return null;
    }
}
