package defpackage;

import android.content.Context;
import android.view.Surface;
import androidx.appcompat.widget.SearchView;
import androidx.media3.session.g;
import androidx.media3.session.k;
import defpackage.gdb;
import defpackage.lz8;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ob3 implements SearchView.j, jg2, lz8.a, k.c, wq2, v84 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ob3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wq2
    public void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 5:
                ((vdb) obj).g((cdb) obj2);
                break;
            default:
                ((vdb) obj).j((Surface) obj2);
                break;
        }
    }

    @Override // androidx.appcompat.widget.SearchView.j
    public boolean b() {
        qb3 qb3Var = (qb3) this.b;
        SearchView.j jVar = qb3Var.Z0;
        boolean zB = jVar != null ? jVar.b() : false;
        tq5 tq5Var = qb3Var.b1;
        if (tq5Var.c) {
            tq5Var.b.e();
            tq5Var.c = false;
        }
        return zB;
    }

    @Override // defpackage.jg2
    public Object d(l7d l7dVar) {
        return new xn3((Context) l7dVar.get(Context.class), ((pf5) l7dVar.get(pf5.class)).d(), l7dVar.d(y8c.a(fh6.class)), l7dVar.e(bjg.class), (Executor) l7dVar.c((y8c) this.b));
    }

    @Override // defpackage.v84
    public double f(double d) {
        return nic.A(((abd) this.b).k.f(d), r7.e, r7.f);
    }

    @Override // androidx.media3.session.k.c
    public void h(g gVar, int i) {
        gVar.c1(((k) this.b).c, i);
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        ((gdb.c) obj).K((List) this.b);
    }
}
