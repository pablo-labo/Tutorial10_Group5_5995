package defpackage;

import androidx.media3.session.k;
import androidx.media3.session.r;
import androidx.media3.session.x;
import defpackage.gdb;
import defpackage.lz8;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gi9 implements lz8.a, x.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gi9(Object obj, int i) {
        this.b = obj;
        this.a = i;
    }

    @Override // androidx.media3.session.x.b
    public void a(vdb vdbVar, r.d dVar) {
        vdbVar.w(((x) this.b).k1(dVar, vdbVar, this.a));
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        ((gdb.c) obj).z(this.a, ((k) this.b).p.s);
    }
}
