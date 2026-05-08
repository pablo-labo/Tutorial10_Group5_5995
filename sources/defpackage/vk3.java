package defpackage;

import androidx.media3.session.g;
import androidx.media3.session.k;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.t;
import androidx.media3.session.x;
import defpackage.gdb;
import defpackage.lz8;
import defpackage.v20;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vk3 implements lz8.a, k.c, t.g, x.e, wq2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vk3(v20.a aVar, ak3 ak3Var) {
        this.a = 0;
        this.b = ak3Var;
    }

    @Override // defpackage.wq2
    public void accept(Object obj) {
        ((vdb) obj).G((oj9) this.b);
    }

    @Override // androidx.media3.session.t.g
    public void d(r.d dVar) {
        ((t) this.b).g.t.z();
    }

    @Override // androidx.media3.session.x.e
    public Object g(s sVar, r.d dVar, int i) {
        return sVar.m(dVar, (List) this.b);
    }

    @Override // androidx.media3.session.k.c
    public void h(g gVar, int i) {
        gVar.U(((k) this.b).c, i);
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((v20) obj).b((ak3) obj2);
                break;
            default:
                ((gdb.c) obj).S((ox0) obj2);
                break;
        }
    }

    public /* synthetic */ vk3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
