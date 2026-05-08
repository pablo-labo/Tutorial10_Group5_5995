package defpackage;

import android.util.Pair;
import defpackage.m2a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class l2a extends pa1 {
    public final /* synthetic */ Pair a;
    public final /* synthetic */ m2a.a b;

    public l2a(m2a.a aVar, Pair pair) {
        this.b = aVar;
        this.a = pair;
    }

    @Override // defpackage.pa1, defpackage.qpb
    public final void a() {
        oa1.b(this.b.j());
    }

    @Override // defpackage.qpb
    public final void b() {
        boolean zRemove;
        ArrayList arrayList;
        oa1 oa1Var;
        ArrayList arrayListL;
        ArrayList arrayListJ;
        synchronized (this.b) {
            try {
                zRemove = this.b.b.remove(this.a);
                arrayList = null;
                if (zRemove) {
                    boolean zIsEmpty = this.b.b.isEmpty();
                    m2a.a aVar = this.b;
                    if (zIsEmpty) {
                        oa1Var = aVar.f;
                        arrayListL = null;
                    } else {
                        ArrayList arrayListK = aVar.k();
                        arrayListL = this.b.l();
                        arrayListJ = this.b.j();
                        oa1Var = null;
                        arrayList = arrayListK;
                    }
                } else {
                    oa1Var = null;
                    arrayListL = null;
                }
                arrayListJ = arrayListL;
            } catch (Throwable th) {
                throw th;
            }
        }
        oa1.c(arrayList);
        oa1.d(arrayListL);
        oa1.b(arrayListJ);
        if (oa1Var != null) {
            oa1Var.e();
        }
        if (zRemove) {
            ((xq2) this.a.first).u();
        }
    }

    @Override // defpackage.pa1, defpackage.qpb
    public final void c() {
        oa1.d(this.b.l());
    }

    @Override // defpackage.pa1, defpackage.qpb
    public final void d() {
        oa1.c(this.b.k());
    }
}
