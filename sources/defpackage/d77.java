package defpackage;

import defpackage.wna;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class d77<T> implements gze<ye3<T>> {
    public final ArrayList a;

    public class a extends u1<T> {
        public ArrayList<ye3<T>> h;
        public int i;
        public int j;
        public AtomicInteger k;
        public Throwable l;
        public Map<String, Object> m;

        /* JADX INFO: renamed from: d77$a$a, reason: collision with other inner class name */
        public class C0205a implements lf3<T> {
            public final int a;

            public C0205a(int i) {
                this.a = i;
            }

            @Override // defpackage.lf3
            public final void a(ye3<T> ye3Var) {
                a.m(a.this, this.a, ye3Var);
            }

            @Override // defpackage.lf3
            public final void b(ye3<T> ye3Var) {
                Throwable th;
                int i;
                if (!ye3Var.c()) {
                    if (ye3Var.d()) {
                        a.m(a.this, this.a, ye3Var);
                        return;
                    }
                    return;
                }
                a aVar = a.this;
                int i2 = this.a;
                boolean zD = ye3Var.d();
                synchronized (aVar) {
                    try {
                        int i3 = aVar.i;
                        if (ye3Var == aVar.o(i2) && i2 != aVar.i) {
                            if (aVar.p() == null || (zD && i2 < aVar.i)) {
                                aVar.i = i2;
                                i = i2;
                            } else {
                                i = i3;
                            }
                            while (i3 > i) {
                                ye3<T> ye3VarN = aVar.n(i3);
                                if (ye3VarN != null) {
                                    ye3VarN.close();
                                }
                                i3--;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (ye3Var == aVar.p()) {
                    aVar.k(null, i2 == 0 && ye3Var.d(), ye3Var.getExtras());
                }
                if (aVar.k.incrementAndGet() != aVar.j || (th = aVar.l) == null) {
                    return;
                }
                aVar.i(th, aVar.m);
            }

            @Override // defpackage.lf3
            public final void c(ye3<T> ye3Var) {
                if (this.a == 0) {
                    a.this.j(ye3Var.b());
                }
            }
        }

        public a() {
            if (this.k != null) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.k == null) {
                        this.k = new AtomicInteger(0);
                        int size = d77.this.a.size();
                        this.j = size;
                        this.i = size;
                        this.h = new ArrayList<>(size);
                        for (int i = 0; i < size; i++) {
                            ye3<T> ye3Var = (ye3) ((gze) d77.this.a.get(i)).get();
                            this.h.add(ye3Var);
                            ye3Var.f(new C0205a(i), rv1.a);
                            if (!ye3Var.c()) {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public static void m(a aVar, int i, ye3 ye3Var) {
            ye3 ye3VarN;
            Throwable th;
            synchronized (aVar) {
                ye3VarN = ye3Var == aVar.p() ? null : ye3Var == aVar.o(i) ? aVar.n(i) : ye3Var;
            }
            if (ye3VarN != null) {
                ye3VarN.close();
            }
            if (i == 0) {
                aVar.l = ye3Var.e();
                aVar.m = ye3Var.getExtras();
            }
            if (aVar.k.incrementAndGet() != aVar.j || (th = aVar.l) == null) {
                return;
            }
            aVar.i(th, aVar.m);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
        @Override // defpackage.u1, defpackage.ye3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final synchronized boolean c() {
            /*
                r1 = this;
                monitor-enter(r1)
                ye3 r0 = r1.p()     // Catch: java.lang.Throwable -> Lf
                if (r0 == 0) goto L11
                boolean r0 = r0.c()     // Catch: java.lang.Throwable -> Lf
                if (r0 == 0) goto L11
                r0 = 1
                goto L12
            Lf:
                r0 = move-exception
                goto L14
            L11:
                r0 = 0
            L12:
                monitor-exit(r1)
                return r0
            L14:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: d77.a.c():boolean");
        }

        @Override // defpackage.u1, defpackage.ye3
        public final boolean close() {
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    ArrayList<ye3<T>> arrayList = this.h;
                    this.h = null;
                    if (arrayList == null) {
                        return true;
                    }
                    for (int i = 0; i < arrayList.size(); i++) {
                        ye3<T> ye3Var = arrayList.get(i);
                        if (ye3Var != null) {
                            ye3Var.close();
                        }
                    }
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // defpackage.u1, defpackage.ye3
        public final synchronized T getResult() {
            ye3<T> ye3VarP;
            ye3VarP = p();
            return ye3VarP != null ? ye3VarP.getResult() : null;
        }

        public final synchronized ye3<T> n(int i) {
            ye3<T> ye3Var;
            ArrayList<ye3<T>> arrayList = this.h;
            ye3Var = null;
            if (arrayList != null && i < arrayList.size()) {
                ye3Var = this.h.set(i, null);
            }
            return ye3Var;
        }

        public final synchronized ye3<T> o(int i) {
            ArrayList<ye3<T>> arrayList;
            arrayList = this.h;
            return (arrayList == null || i >= arrayList.size()) ? null : this.h.get(i);
        }

        public final synchronized ye3<T> p() {
            return o(this.i);
        }
    }

    public d77(ArrayList arrayList) {
        web.f("List of suppliers is empty!", !arrayList.isEmpty());
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d77) {
            return wna.a(this.a, ((d77) obj).a);
        }
        return false;
    }

    @Override // defpackage.gze
    public final Object get() {
        return new a();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        wna.a aVarB = wna.b(this);
        aVarB.b(this.a, "list");
        return aVarB.toString();
    }
}
