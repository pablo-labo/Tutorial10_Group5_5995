package defpackage;

import androidx.media3.session.k;
import androidx.media3.session.r;
import androidx.media3.session.x;
import defpackage.gdb;
import defpackage.lz8;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oh9 implements lz8.a, x.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oh9(Object obj, int i) {
        this.b = obj;
        this.a = i;
    }

    @Override // androidx.media3.session.x.c
    public void c(vdb vdbVar, r.d dVar, List list) {
        x xVar = (x) this.b;
        int size = list.size();
        int i = this.a;
        if (size == 1) {
            vdbVar.N(xVar.k1(dVar, vdbVar, i), (ij9) list.get(0));
        } else {
            vdbVar.K(list, xVar.k1(dVar, vdbVar, i), xVar.k1(dVar, vdbVar, i + 1));
        }
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        ((gdb.c) obj).z(this.a, ((k) this.b).p.s);
    }
}
