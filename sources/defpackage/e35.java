package defpackage;

import androidx.media3.session.r;
import androidx.media3.session.x;
import defpackage.gdb;
import defpackage.lz8;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e35 implements lz8.a, x.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e35(Object obj, int i) {
        this.b = obj;
        this.a = i;
    }

    @Override // androidx.media3.session.x.c
    public void c(vdb vdbVar, r.d dVar, List list) {
        vdbVar.q0(((x) this.b).k1(dVar, vdbVar, this.a), list);
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        ((gdb.c) obj).j0(((adb) this.b).a, this.a);
    }
}
