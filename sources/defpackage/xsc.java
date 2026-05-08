package defpackage;

import android.util.Log;
import androidx.compose.runtime.ComposeRuntimeError;
import androidx.compose.runtime.i;
import defpackage.ex7;
import defpackage.wle;
import defpackage.xle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class xsc extends dm2 {
    public static final gse y = hh2.e(k9b.d);
    public static final AtomicReference<Boolean> z = new AtomicReference<>(Boolean.FALSE);
    public final on1 a;
    public final Object b;
    public ex7 c;
    public Throwable d;
    public final ArrayList e;
    public List<? extends su2> f;
    public a4a<Object> g;
    public final j4a<su2> h;
    public final ArrayList i;
    public final ArrayList j;
    public final z3a<Object, Object> k;
    public final cbe l;
    public final z3a<q0a, p0a> m;
    public final z3a<Object, Object> n;
    public ArrayList o;
    public LinkedHashSet p;
    public qw1 q;
    public b r;
    public boolean s;
    public final gse t;
    public final sme<a4a<i>> u;
    public final qy7 v;
    public final v03 w;
    public final c x;

    public static final class a {
    }

    public static final class b {
        public final Throwable a;

        public b(Throwable th) {
            this.a = th;
        }
    }

    public final class c {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        public static final /* synthetic */ d[] V;
        public static final d a;
        public static final d b;
        public static final d c;
        public static final d d;
        public static final d e;
        public static final d f;

        static {
            d dVar = new d("ShutDown", 0);
            a = dVar;
            d dVar2 = new d("ShuttingDown", 1);
            b = dVar2;
            d dVar3 = new d("Inactive", 2);
            c = dVar3;
            d dVar4 = new d("InactivePendingWork", 3);
            d = dVar4;
            d dVar5 = new d("Idle", 4);
            e = dVar5;
            d dVar6 = new d("PendingWork", 5);
            f = dVar6;
            V = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) V.clone();
        }
    }

    public xsc(v03 v03Var) {
        on1 on1Var = new on1(new n30(this, 12));
        this.a = on1Var;
        this.b = new Object();
        this.e = new ArrayList();
        this.g = new a4a<>((Object) null);
        this.h = new j4a<>(new su2[16]);
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = v1a.b();
        cbe cbeVar = new cbe();
        cbeVar.a = v1a.b();
        cbeVar.b = v1a.b();
        this.l = cbeVar;
        this.m = lnd.b();
        this.n = v1a.b();
        this.t = hh2.e(d.c);
        this.u = new sme<>();
        qy7 qy7Var = new qy7((ex7) v03Var.h1(ex7.a.a));
        qy7Var.d0(new tv(this, 20));
        this.v = qy7Var;
        this.w = v03Var.d1(on1Var).d1(qy7Var);
        this.x = new c();
    }

    public static final void E(ArrayList arrayList, xsc xscVar, su2 su2Var) {
        arrayList.clear();
        synchronized (xscVar.b) {
            try {
                Iterator it = xscVar.j.iterator();
                while (it.hasNext()) {
                    q0a q0aVar = (q0a) it.next();
                    if (q0aVar.c.equals(su2Var)) {
                        arrayList.add(q0aVar);
                        it.remove();
                    }
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void w(d4a d4aVar) {
        try {
            if (d4aVar.w() instanceof xle.a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            d4aVar.c();
        }
    }

    public static final void y(xsc xscVar, q0a q0aVar, q0a q0aVar2) {
        List<q0a> list = q0aVar2.h;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                q0a q0aVar3 = list.get(i);
                cbe cbeVar = xscVar.l;
                o0a<Object> o0aVar = q0aVar3.a;
                v1a.a((z3a) cbeVar.a, o0aVar, new oea(q0aVar3, q0aVar));
                v1a.a((z3a) cbeVar.b, q0aVar, o0aVar);
                y(xscVar, q0aVar, q0aVar3);
            }
        }
    }

    public final boolean A() {
        return !this.s && (this.a.d.get() & 134217727) > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean B() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.b
            monitor-enter(r0)
            a4a<java.lang.Object> r1 = r2.g     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L1d
            j4a<su2> r1 = r2.h     // Catch: java.lang.Throwable -> L1b
            int r1 = r1.c     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L12
            goto L1d
        L12:
            boolean r2 = r2.A()     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L19
            goto L1d
        L19:
            r2 = 0
            goto L1e
        L1b:
            r2 = move-exception
            goto L20
        L1d:
            r2 = 1
        L1e:
            monitor-exit(r0)
            return r2
        L20:
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xsc.B():boolean");
    }

    public final List<su2> C() {
        List list = this.f;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.e;
        List<su2> arrayList2 = arrayList.isEmpty() ? zr4.a : new ArrayList(arrayList);
        this.f = arrayList2;
        return arrayList2;
    }

    public final void D(su2 su2Var) {
        synchronized (this.b) {
            ArrayList arrayList = this.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((q0a) arrayList.get(i)).c.equals(su2Var)) {
                    j6g j6gVar = j6g.a;
                    ArrayList arrayList2 = new ArrayList();
                    E(arrayList2, this, su2Var);
                    while (!arrayList2.isEmpty()) {
                        F(arrayList2, null);
                        E(arrayList2, this, su2Var);
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x015a, code lost:
    
        r3 = r9.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x015f, code lost:
    
        if (r4 >= r3) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x016b, code lost:
    
        if (((kotlin.Pair) r9.get(r4)).e() == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x016d, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0170, code lost:
    
        r3 = new java.util.ArrayList(r9.size());
        r4 = r9.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x017e, code lost:
    
        if (r8 >= r4) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0180, code lost:
    
        r11 = (kotlin.Pair) r9.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x018a, code lost:
    
        if (r11.e() != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x018c, code lost:
    
        r11 = (defpackage.q0a) r11.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0195, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0196, code lost:
    
        if (r11 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0198, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x019b, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x019e, code lost:
    
        r4 = r16.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01a0, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a1, code lost:
    
        defpackage.w92.w0(r16.j, r3);
        r3 = defpackage.j6g.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01a8, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a9, code lost:
    
        r3 = new java.util.ArrayList(r9.size());
        r4 = r9.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b7, code lost:
    
        if (r8 >= r4) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b9, code lost:
    
        r11 = r9.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01c4, code lost:
    
        if (((kotlin.Pair) r11).e() == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c6, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c9, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01cc, code lost:
    
        r9 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<defpackage.su2> F(java.util.List<defpackage.q0a> r17, defpackage.a4a<java.lang.Object> r18) {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xsc.F(java.util.List, a4a):java.util.List");
    }

    public final su2 G(su2 su2Var, a4a<Object> a4aVar) {
        if (su2Var.r() || su2Var.g()) {
            return null;
        }
        LinkedHashSet linkedHashSet = this.p;
        int i = 1;
        if (linkedHashSet != null && linkedHashSet.contains(su2Var)) {
            return null;
        }
        wle.a aVar = wle.e;
        a3 a3Var = new a3(su2Var, 19);
        mm1 mm1Var = new mm1(i, su2Var, a4aVar);
        aVar.getClass();
        d4a d4aVarG = wle.a.g(a3Var, mm1Var);
        try {
            wle wleVarJ = d4aVarG.j();
            if (a4aVar != null) {
                try {
                    if (a4aVar.c()) {
                        su2Var.k(new sj4(6, a4aVar, su2Var));
                    }
                } catch (Throwable th) {
                    wle.q(wleVarJ);
                    throw th;
                }
            }
            boolean zL = su2Var.l();
            wle.q(wleVarJ);
            if (zL) {
                return su2Var;
            }
            return null;
        } finally {
            w(d4aVarG);
        }
    }

    public final void H(Throwable th, su2 su2Var) throws Throwable {
        if (!z.get().booleanValue() || (th instanceof ComposeRuntimeError)) {
            synchronized (this.b) {
                b bVar = this.r;
                if (bVar != null) {
                    throw bVar.a;
                }
                this.r = new b(th);
                j6g j6gVar = j6g.a;
            }
            throw th;
        }
        synchronized (this.b) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.i.clear();
                this.h.g();
                this.g = new a4a<>((Object) null);
                this.j.clear();
                this.k.g();
                this.m.g();
                this.r = new b(th);
                if (su2Var != null) {
                    J(su2Var);
                }
                z();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean I() {
        synchronized (this.b) {
            boolean z2 = true;
            if (this.g.b()) {
                if (this.h.c == 0 && !A() && !this.k.f()) {
                    z2 = false;
                }
                return z2;
            }
            List<su2> listC = C();
            ond ondVar = new ond(this.g);
            this.g = new a4a<>((Object) null);
            try {
                int size = listC.size();
                for (int i = 0; i < size; i++) {
                    listC.get(i).m(ondVar);
                    if (((d) this.t.getValue()).compareTo(d.b) <= 0) {
                        break;
                    }
                }
                synchronized (this.b) {
                    if (z() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    if (this.h.c == 0 && !A() && !this.k.f()) {
                        z2 = false;
                    }
                }
                return z2;
            } catch (Throwable th) {
                synchronized (this.b) {
                    a4a<Object> a4aVar = this.g;
                    a4aVar.getClass();
                    Iterator<T> it = ondVar.iterator();
                    while (it.hasNext()) {
                        a4aVar.k(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void J(su2 su2Var) {
        ArrayList arrayList = this.o;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.o = arrayList;
        }
        if (!arrayList.contains(su2Var)) {
            arrayList.add(su2Var);
        }
        if (this.e.remove(su2Var)) {
            this.f = null;
        }
    }

    @Override // defpackage.dm2
    public final void a(su2 su2Var, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2) throws Throwable {
        d dVar;
        int i;
        boolean z2;
        boolean zR = su2Var.r();
        synchronized (this.b) {
            d dVar2 = (d) this.t.getValue();
            dVar = d.b;
            i = 1;
            z2 = dVar2.compareTo(dVar) > 0 ? !C().contains(su2Var) : true;
        }
        try {
            wle.a aVar = wle.e;
            a3 a3Var = new a3(su2Var, 19);
            mm1 mm1Var = new mm1(i, su2Var, null);
            aVar.getClass();
            d4a d4aVarG = wle.a.g(a3Var, mm1Var);
            try {
                wle wleVarJ = d4aVarG.j();
                try {
                    su2Var.b(function2);
                    j6g j6gVar = j6g.a;
                    synchronized (this.b) {
                        if (((d) this.t.getValue()).compareTo(dVar) > 0 && !C().contains(su2Var)) {
                            this.e.add(su2Var);
                            this.f = null;
                        }
                    }
                    if (!zR) {
                        ame.j().m();
                    }
                    try {
                        D(su2Var);
                        try {
                            su2Var.q();
                            su2Var.e();
                            if (zR) {
                                return;
                            }
                            ame.j().m();
                        } catch (Throwable th) {
                            H(th, null);
                        }
                    } catch (Throwable th2) {
                        H(th2, su2Var);
                    }
                } finally {
                    wle.q(wleVarJ);
                }
            } finally {
                w(d4aVarG);
            }
        } catch (Throwable th3) {
            if (z2) {
                synchronized (this.b) {
                    j6g j6gVar2 = j6g.a;
                }
            }
            H(th3, su2Var);
        }
    }

    @Override // defpackage.dm2
    public final mnd<i> b(su2 su2Var, p6 p6Var, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2) {
        sme<a4a<i>> smeVar = this.u;
        try {
            p6 p6VarI = su2Var.i(p6Var);
            try {
                a(su2Var, function2);
                a4a<Object> a4aVarA = smeVar.a();
                if (a4aVarA == null) {
                    a4aVarA = nnd.a;
                    a4aVarA.getClass();
                }
                return a4aVarA;
            } finally {
                su2Var.i(p6VarI);
            }
        } finally {
            smeVar.b(null);
        }
    }

    @Override // defpackage.dm2
    public final void c(q0a q0aVar) {
        pw1<j6g> pw1VarZ;
        synchronized (this.b) {
            try {
                v1a.a(this.k, q0aVar.a, q0aVar);
                if (q0aVar.h != null) {
                    y(this, q0aVar, q0aVar);
                }
                pw1VarZ = z();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (pw1VarZ != null) {
            ((qw1) pw1VarZ).resumeWith(j6g.a);
        }
    }

    @Override // defpackage.dm2
    public final boolean e() {
        return z.get().booleanValue();
    }

    @Override // defpackage.dm2
    public final boolean f() {
        return false;
    }

    @Override // defpackage.dm2
    public final boolean g() {
        return false;
    }

    @Override // defpackage.dm2
    public final long h() {
        return 1000L;
    }

    @Override // defpackage.dm2
    public final cm2 i() {
        return null;
    }

    @Override // defpackage.dm2
    public final v03 k() {
        return this.w;
    }

    @Override // defpackage.dm2
    public final void l(su2 su2Var) {
        pw1<j6g> pw1VarZ;
        synchronized (this.b) {
            if (this.h.h(su2Var)) {
                pw1VarZ = null;
            } else {
                this.h.b(su2Var);
                pw1VarZ = z();
            }
        }
        if (pw1VarZ != null) {
            pw1VarZ.resumeWith(j6g.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    @Override // defpackage.dm2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(defpackage.q0a r18, defpackage.p0a r19, defpackage.nr0<?> r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.Object r3 = r0.b
            monitor-enter(r3)
            z3a<q0a, p0a> r4 = r0.m     // Catch: java.lang.Throwable -> L7e
            r4.m(r1, r2)     // Catch: java.lang.Throwable -> L7e
            z3a<java.lang.Object, java.lang.Object> r4 = r0.n     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r1 = r4.d(r1)     // Catch: java.lang.Throwable -> L7e
            if (r1 != 0) goto L1c
            p3a r1 = defpackage.pna.b     // Catch: java.lang.Throwable -> L7e
            r1.getClass()     // Catch: java.lang.Throwable -> L7e
            goto L2f
        L1c:
            boolean r4 = r1 instanceof defpackage.p3a     // Catch: java.lang.Throwable -> L7e
            if (r4 == 0) goto L23
            ona r1 = (defpackage.ona) r1     // Catch: java.lang.Throwable -> L7e
            goto L2f
        L23:
            java.lang.Object[] r4 = defpackage.pna.a     // Catch: java.lang.Throwable -> L7e
            p3a r4 = new p3a     // Catch: java.lang.Throwable -> L7e
            r5 = 1
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L7e
            r4.g(r1)     // Catch: java.lang.Throwable -> L7e
            r1 = r4
        L2f:
            boolean r4 = r1.e()     // Catch: java.lang.Throwable -> L7e
            if (r4 == 0) goto L8b
            r4 = r20
            z3a r1 = r2.b(r4, r1)     // Catch: java.lang.Throwable -> L7e
            java.lang.Object[] r2 = r1.b     // Catch: java.lang.Throwable -> L7e
            java.lang.Object[] r4 = r1.c     // Catch: java.lang.Throwable -> L7e
            long[] r1 = r1.a     // Catch: java.lang.Throwable -> L7e
            int r5 = r1.length     // Catch: java.lang.Throwable -> L7e
            int r5 = r5 + (-2)
            if (r5 < 0) goto L8b
            r6 = 0
            r7 = r6
        L48:
            r8 = r1[r7]     // Catch: java.lang.Throwable -> L7e
            long r10 = ~r8     // Catch: java.lang.Throwable -> L7e
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L86
            int r10 = r7 - r5
            int r10 = ~r10     // Catch: java.lang.Throwable -> L7e
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L62:
            if (r12 >= r10) goto L84
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L80
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]     // Catch: java.lang.Throwable -> L7e
            r13 = r4[r13]     // Catch: java.lang.Throwable -> L7e
            p0a r13 = (defpackage.p0a) r13     // Catch: java.lang.Throwable -> L7e
            q0a r14 = (defpackage.q0a) r14     // Catch: java.lang.Throwable -> L7e
            z3a<q0a, p0a> r15 = r0.m     // Catch: java.lang.Throwable -> L7e
            r15.m(r14, r13)     // Catch: java.lang.Throwable -> L7e
            goto L80
        L7e:
            r0 = move-exception
            goto L8f
        L80:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L62
        L84:
            if (r10 != r11) goto L8b
        L86:
            if (r7 == r5) goto L8b
            int r7 = r7 + 1
            goto L48
        L8b:
            j6g r0 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r3)
            return
        L8f:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xsc.m(q0a, p0a, nr0):void");
    }

    @Override // defpackage.dm2
    public final p0a n(q0a q0aVar) {
        p0a p0aVarK;
        synchronized (this.b) {
            p0aVarK = this.m.k(q0aVar);
        }
        return p0aVarK;
    }

    @Override // defpackage.dm2
    public final mnd<i> o(su2 su2Var, p6 p6Var, mnd<i> mndVar) {
        sme<a4a<i>> smeVar = this.u;
        try {
            I();
            su2Var.m(new ond(mndVar));
            p6 p6VarI = su2Var.i(p6Var);
            try {
                su2 su2VarG = G(su2Var, null);
                if (su2VarG != null) {
                    D(su2Var);
                    su2VarG.q();
                    su2VarG.e();
                }
                a4a<Object> a4aVarA = smeVar.a();
                if (a4aVarA == null) {
                    a4aVarA = nnd.a;
                    a4aVarA.getClass();
                }
                return a4aVarA;
            } finally {
                su2Var.i(p6VarI);
            }
        } finally {
            smeVar.b(null);
        }
    }

    @Override // defpackage.dm2
    public final void p(Set<fm2> set) {
    }

    @Override // defpackage.dm2
    public final void r(i iVar) {
        sme<a4a<i>> smeVar = this.u;
        a4a<i> a4aVarA = smeVar.a();
        if (a4aVarA == null) {
            a4aVarA = nnd.a();
            smeVar.b(a4aVarA);
        }
        a4aVarA.d(iVar);
    }

    @Override // defpackage.dm2
    public final void s(km2 km2Var) {
        synchronized (this.b) {
            try {
                LinkedHashSet linkedHashSet = this.p;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.p = linkedHashSet;
                }
                linkedHashSet.add(km2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.dm2
    public final void v(km2 km2Var) {
        synchronized (this.b) {
            if (this.e.remove(km2Var)) {
                this.f = null;
            }
            this.h.j(km2Var);
            this.i.remove(km2Var);
            j6g j6gVar = j6g.a;
        }
    }

    public final void x() {
        synchronized (this.b) {
            try {
                if (((d) this.t.getValue()).compareTo(d.e) >= 0) {
                    gse gseVar = this.t;
                    d dVar = d.b;
                    gseVar.getClass();
                    gseVar.m(null, dVar);
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.v.h(null);
    }

    public final pw1<j6g> z() {
        gse gseVar = this.t;
        int iCompareTo = ((d) gseVar.getValue()).compareTo(d.b);
        ArrayList arrayList = this.j;
        ArrayList arrayList2 = this.i;
        j4a<su2> j4aVar = this.h;
        if (iCompareTo <= 0) {
            for (su2 su2Var : C()) {
            }
            this.e.clear();
            this.f = zr4.a;
            this.g = new a4a<>((Object) null);
            j4aVar.g();
            arrayList2.clear();
            arrayList.clear();
            this.o = null;
            qw1 qw1Var = this.q;
            if (qw1Var != null) {
                qw1Var.g(null);
            }
            this.q = null;
            this.r = null;
            return null;
        }
        b bVar = this.r;
        d dVar = d.f;
        d dVar2 = d.c;
        if (bVar == null) {
            if (this.c == null) {
                this.g = new a4a<>((Object) null);
                j4aVar.g();
                if (A()) {
                    dVar2 = d.d;
                }
            } else {
                dVar2 = (j4aVar.c == 0 && !this.g.c() && arrayList2.isEmpty() && arrayList.isEmpty() && !A() && !this.k.f()) ? d.e : dVar;
            }
        }
        gseVar.m(null, dVar2);
        if (dVar2 != dVar) {
            return null;
        }
        qw1 qw1Var2 = this.q;
        this.q = null;
        return qw1Var2;
    }
}
