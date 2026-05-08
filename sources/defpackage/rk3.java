package defpackage;

import android.content.Context;
import defpackage.e75;
import defpackage.lz8;
import defpackage.v20;
import defpackage.zu8;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rk3 implements lz8.b, e75.e, jg2 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rk3(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.jg2
    public Object d(l7d l7dVar) {
        return new e31((String) this.a, ((zu8.a) this.b).d((Context) l7dVar.get(Context.class)));
    }

    @Override // lz8.b
    public void i(Object obj, bh5 bh5Var) {
        v20 v20Var = (v20) obj;
        v20Var.m((gdb) this.b, new v20.b(bh5Var, ((al3) this.a).e));
    }

    @Override // defpackage.wg3
    public Object j(Object obj, ka6 ka6Var) {
        return ((wg3) this.a).j(obj, bk3.a((byte[]) this.b));
    }
}
