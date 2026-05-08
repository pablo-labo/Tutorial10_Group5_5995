package defpackage;

import androidx.compose.runtime.r;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class p4e implements n4e {
    public static final ko2 l = new ko2(new cm0(15), new ju(11));
    public boolean a;
    public final ArrayList b;
    public final k3a<uzd> c;
    public final AtomicLong d;
    public se e;
    public b4e f;
    public c4e g;
    public i30 h;
    public fj i;
    public pe0 j;
    public final g4a k;

    public p4e(long j) {
        this.b = new ArrayList();
        k3a k3aVar = j59.a;
        this.c = new k3a<>();
        this.d = new AtomicLong(j);
        k3a k3aVar2 = j59.a;
        k3aVar2.getClass();
        this.k = r.f(k3aVar2);
    }

    @Override // defpackage.n4e
    public final long a() {
        AtomicLong atomicLong = this.d;
        long andIncrement = atomicLong.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = atomicLong.getAndIncrement();
        }
        return andIncrement;
    }

    @Override // defpackage.n4e
    public final i59<p2e> b() {
        return (i59) ((gme) this.k).getValue();
    }

    @Override // defpackage.n4e
    public final void c(long j) {
        this.a = false;
        se seVar = this.e;
        if (seVar != null) {
            seVar.invoke(Long.valueOf(j));
        }
    }

    @Override // defpackage.n4e
    public final void d(uzd uzdVar) {
        long jI = uzdVar.i();
        k3a<uzd> k3aVar = this.c;
        if (k3aVar.a(jI)) {
            this.b.remove(uzdVar);
            k3aVar.g(uzdVar.i());
            pe0 pe0Var = this.j;
            if (pe0Var != null) {
                pe0Var.invoke(Long.valueOf(uzdVar.i()));
            }
        }
    }

    @Override // defpackage.n4e
    public final void e(long j) {
        fj fjVar = this.i;
        if (fjVar != null) {
            fjVar.invoke(Long.valueOf(j));
        }
    }

    @Override // defpackage.n4e
    public final uzd f(w1a w1aVar) {
        long j = w1aVar.a;
        if (j == 0) {
            de7.a("The selectable contains an invalid id: " + j);
        }
        k3a<uzd> k3aVar = this.c;
        if (k3aVar.a(j)) {
            de7.a("Another selectable with the id: " + w1aVar + ".selectableId has already subscribed.");
        }
        k3aVar.h(w1aVar, j);
        this.b.add(w1aVar);
        this.a = false;
        return w1aVar;
    }

    @Override // defpackage.n4e
    public final void g(sl8 sl8Var, long j, u2e u2eVar, boolean z) {
        b4e b4eVar = this.f;
        if (b4eVar != null) {
            b4eVar.j(Boolean.valueOf(z), sl8Var, new ooa(j), u2eVar);
        }
    }

    @Override // defpackage.n4e
    public final void h() {
        i30 i30Var = this.h;
        if (i30Var != null) {
            i30Var.invoke();
        }
    }

    @Override // defpackage.n4e
    public final boolean i(sl8 sl8Var, long j, long j2, u2e u2eVar, boolean z) {
        c4e c4eVar = this.g;
        if (c4eVar == null) {
            return true;
        }
        j4e j4eVar = c4eVar.a;
        long jB = j4eVar.b(sl8Var, j);
        long jB2 = j4eVar.b(sl8Var, j2);
        j4eVar.l(z);
        return j4eVar.o(jB, jB2, false, u2eVar);
    }

    public final ArrayList j(sl8 sl8Var) {
        boolean z = this.a;
        ArrayList arrayList = this.b;
        if (!z) {
            final ct ctVar = new ct(sl8Var, 12);
            w92.E0(new Comparator() { // from class: o4e
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((Number) ctVar.invoke(obj, obj2)).intValue();
                }
            }, arrayList);
            this.a = true;
        }
        return arrayList;
    }

    public p4e() {
        this(1L);
    }
}
