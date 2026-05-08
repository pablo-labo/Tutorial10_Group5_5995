package defpackage;

import androidx.paging.SingleRunner;
import defpackage.kza;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class n2b<T> {
    public final v03 a;
    public bi6 b;
    public u0b<T> c;
    public final t2a d;
    public final CopyOnWriteArrayList<gu5<j6g>> e;
    public final SingleRunner f;
    public volatile boolean g;
    public volatile int h;
    public final gse i;
    public final rqc j;
    public final nde k;

    public static final class a extends mj8 implements gu5<j6g> {
        final /* synthetic */ n2b<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n2b<T> n2bVar) {
            super(0);
            this.this$0 = n2bVar;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            nde ndeVar = this.this$0.k;
            j6g j6gVar = j6g.a;
            ndeVar.b(j6gVar);
            return j6gVar;
        }
    }

    public n2b(v03 v03Var, l2b<T> l2bVar) {
        u0b<T> u0bVar;
        kza.b<T> bVarInvoke;
        v03Var.getClass();
        this.a = v03Var;
        u0b<Object> u0bVar2 = u0b.e;
        kza.b<T> bVarInvoke2 = l2bVar != null ? l2bVar.d.invoke() : null;
        if (bVarInvoke2 != null) {
            u0bVar = new u0b<>(bVarInvoke2);
        } else {
            u0bVar = (u0b<T>) u0b.e;
            u0bVar.getClass();
        }
        this.c = u0bVar;
        t2a t2aVar = new t2a();
        if (l2bVar != null && (bVarInvoke = l2bVar.d.invoke()) != null) {
            yz8 yz8Var = bVarInvoke.e;
            yz8 yz8Var2 = bVarInvoke.f;
            yz8Var.getClass();
            t2aVar.c(new r2a(t2aVar, yz8Var, yz8Var2));
        }
        this.d = t2aVar;
        CopyOnWriteArrayList<gu5<j6g>> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.e = copyOnWriteArrayList;
        this.f = new SingleRunner(true);
        this.i = hh2.e(Boolean.FALSE);
        this.j = t2aVar.c;
        this.k = wg2.c(0, 64, eo1.b);
        copyOnWriteArrayList.add(new a(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.n2b r6, java.util.List r7, int r8, int r9, boolean r10, defpackage.yz8 r11, defpackage.yz8 r12, lza.b r13, defpackage.pu2 r14) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n2b.a(n2b, java.util.List, int, int, boolean, yz8, yz8, lza$b, pu2):java.lang.Object");
    }

    public abstract j6g b();

    public final go7<T> c() {
        u0b<T> u0bVar = this.c;
        int i = u0bVar.c;
        int i2 = u0bVar.d;
        ArrayList arrayList = u0bVar.a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w92.w0(arrayList2, ((nrf) it.next()).b);
        }
        return new go7<>(arrayList2, i, i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n2b() {
        this(m89.a, null);
        eq3 eq3Var = a74.a;
    }
}
