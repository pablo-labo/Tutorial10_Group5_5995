package defpackage;

import android.util.Pair;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m2a<K, T extends Closeable> implements opb<T> {
    public final HashMap a = new HashMap();
    public final opb<T> b;
    public final String c;
    public final String d;

    public class a {
        public final K a;
        public final CopyOnWriteArraySet<Pair<xq2<T>, ppb>> b = new CopyOnWriteArraySet<>();
        public T c;
        public float d;
        public int e;
        public oa1 f;
        public m2a<K, T>.a.C0312a g;

        /* JADX INFO: renamed from: m2a$a$a, reason: collision with other inner class name */
        public class C0312a extends w81<T> {
            public C0312a() {
            }

            @Override // defpackage.w81
            public final void c() {
                try {
                    it5.a();
                    a aVar = a.this;
                    synchronized (aVar) {
                        try {
                            if (aVar.g == this) {
                                aVar.g = null;
                                aVar.f = null;
                                a.b(aVar.c);
                                aVar.c = null;
                                aVar.i(ptf.c);
                            }
                        } finally {
                        }
                    }
                } finally {
                    it5.a();
                }
            }

            @Override // defpackage.w81
            public final void d(Throwable th) {
                try {
                    it5.a();
                    a.this.f(this, th);
                } finally {
                    it5.a();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.w81
            public final void e(int i, Object obj) {
                Closeable closeable = (Closeable) obj;
                try {
                    it5.a();
                    a.this.g(this, closeable, i);
                } finally {
                    it5.a();
                }
            }

            @Override // defpackage.w81
            public final void f(float f) {
                try {
                    it5.a();
                    a.this.h(this, f);
                } finally {
                    it5.a();
                }
            }
        }

        public a(K k) {
            this.a = k;
        }

        public static void b(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    l5.r(e);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean a(xq2<T> xq2Var, ppb ppbVar) {
            a aVar;
            Pair<xq2<T>, ppb> pairCreate = Pair.create(xq2Var, ppbVar);
            synchronized (this) {
                try {
                    m2a m2aVar = m2a.this;
                    K k = this.a;
                    synchronized (m2aVar) {
                        aVar = (a) m2aVar.a.get(k);
                    }
                    if (aVar != this) {
                        return false;
                    }
                    this.b.add(pairCreate);
                    ArrayList arrayListK = k();
                    ArrayList arrayListL = l();
                    ArrayList arrayListJ = j();
                    Closeable closeableC = this.c;
                    float f = this.d;
                    int i = this.e;
                    oa1.c(arrayListK);
                    oa1.d(arrayListL);
                    oa1.b(arrayListJ);
                    synchronized (pairCreate) {
                        try {
                            synchronized (this) {
                                if (closeableC != this.c) {
                                    closeableC = null;
                                } else if (closeableC != null) {
                                    closeableC = m2a.this.c(closeableC);
                                }
                            }
                            if (closeableC != null) {
                                if (f > 0.0f) {
                                    xq2Var.w(f);
                                }
                                xq2Var.v(i, closeableC);
                                b(closeableC);
                            }
                        } catch (Throwable th) {
                            throw th;
                        } finally {
                        }
                    }
                    ppbVar.v(new l2a(this, pairCreate));
                    return true;
                } finally {
                }
            }
        }

        public final synchronized boolean c() {
            Iterator<Pair<xq2<T>, ppb>> it = this.b.iterator();
            while (it.hasNext()) {
                if (((ppb) it.next().second).N()) {
                    return true;
                }
            }
            return false;
        }

        public final synchronized boolean d() {
            Iterator<Pair<xq2<T>, ppb>> it = this.b.iterator();
            while (it.hasNext()) {
                if (!((ppb) it.next().second).b0()) {
                    return false;
                }
            }
            return true;
        }

        public final synchronized inb e() {
            inb inbVar;
            inbVar = inb.b;
            Iterator<Pair<xq2<T>, ppb>> it = this.b.iterator();
            while (it.hasNext()) {
                inb inbVarP = ((ppb) it.next().second).P();
                inb.a.getClass();
                inbVarP.getClass();
                if (inbVar.ordinal() <= inbVarP.ordinal()) {
                    inbVar = inbVarP;
                }
            }
            return inbVar;
        }

        public final void f(m2a<K, T>.a.C0312a c0312a, Throwable th) {
            synchronized (this) {
                try {
                    if (this.g != c0312a) {
                        return;
                    }
                    this.b.clear();
                    m2a.this.e(this.a, this);
                    b(this.c);
                    this.c = null;
                    for (Pair<xq2<T>, ppb> pair : this.b) {
                        synchronized (pair) {
                            try {
                                ((ppb) pair.second).G().h((ppb) pair.second, m2a.this.c, th, null);
                                oa1 oa1Var = this.f;
                                if (oa1Var != null) {
                                    ((ppb) pair.second).W(oa1Var.f);
                                }
                                ((xq2) pair.first).t(th);
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public final void g(m2a<K, T>.a.C0312a c0312a, T t, int i) {
            synchronized (this) {
                try {
                    if (this.g != c0312a) {
                        return;
                    }
                    b(this.c);
                    this.c = null;
                    int size = this.b.size();
                    if (w81.b(i)) {
                        this.c = (T) m2a.this.c(t);
                        this.e = i;
                    } else {
                        this.b.clear();
                        m2a.this.e(this.a, this);
                    }
                    for (Pair<xq2<T>, ppb> pair : this.b) {
                        synchronized (pair) {
                            try {
                                if (w81.a(i)) {
                                    ((ppb) pair.second).G().a((ppb) pair.second, m2a.this.c, null);
                                    oa1 oa1Var = this.f;
                                    if (oa1Var != null) {
                                        ((ppb) pair.second).W(oa1Var.f);
                                    }
                                    ((ppb) pair.second).f0(Integer.valueOf(size), m2a.this.d);
                                }
                                ((xq2) pair.first).v(i, t);
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public final void h(m2a<K, T>.a.C0312a c0312a, float f) {
            synchronized (this) {
                try {
                    if (this.g != c0312a) {
                        return;
                    }
                    this.d = f;
                    for (Pair<xq2<T>, ppb> pair : this.b) {
                        synchronized (pair) {
                            ((xq2) pair.first).w(f);
                        }
                    }
                } finally {
                }
            }
        }

        public final void i(ptf ptfVar) {
            synchronized (this) {
                try {
                    boolean z = false;
                    web.e(Boolean.valueOf(this.f == null));
                    web.e(Boolean.valueOf(this.g == null));
                    if (this.b.isEmpty()) {
                        m2a.this.e(this.a, this);
                        return;
                    }
                    ppb ppbVar = (ppb) this.b.iterator().next().second;
                    oa1 oa1Var = new oa1(ppbVar.Q(), ppbVar.getId(), null, ppbVar.G(), ppbVar.a(), ppbVar.h0(), d(), c(), e(), ppbVar.h());
                    this.f = oa1Var;
                    oa1Var.W(ppbVar.getExtras());
                    if (ptfVar != ptf.c) {
                        oa1 oa1Var2 = this.f;
                        int iOrdinal = ptfVar.ordinal();
                        if (iOrdinal == 0) {
                            z = true;
                        } else if (iOrdinal != 1) {
                            if (iOrdinal == 2) {
                                throw new IllegalStateException("No boolean equivalent for UNSET");
                            }
                            throw new IllegalStateException("Unrecognized TriState value: " + ptfVar);
                        }
                        oa1Var2.f0(Boolean.valueOf(z), "started_as_prefetch");
                    }
                    m2a<K, T>.a.C0312a c0312a = new C0312a();
                    this.g = c0312a;
                    m2a.this.b.a(c0312a, this.f);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final synchronized ArrayList j() {
            oa1 oa1Var = this.f;
            ArrayList arrayList = null;
            if (oa1Var == null) {
                return null;
            }
            boolean zC = c();
            synchronized (oa1Var) {
                if (zC != oa1Var.X) {
                    oa1Var.X = zC;
                    arrayList = new ArrayList(oa1Var.Z);
                }
            }
            return arrayList;
        }

        public final synchronized ArrayList k() {
            oa1 oa1Var = this.f;
            ArrayList arrayList = null;
            if (oa1Var == null) {
                return null;
            }
            boolean zD = d();
            synchronized (oa1Var) {
                if (zD != oa1Var.V) {
                    oa1Var.V = zD;
                    arrayList = new ArrayList(oa1Var.Z);
                }
            }
            return arrayList;
        }

        public final synchronized ArrayList l() {
            oa1 oa1Var = this.f;
            ArrayList arrayList = null;
            if (oa1Var == null) {
                return null;
            }
            inb inbVarE = e();
            synchronized (oa1Var) {
                if (inbVarE != oa1Var.W) {
                    oa1Var.W = inbVarE;
                    arrayList = new ArrayList(oa1Var.Z);
                }
            }
            return arrayList;
        }
    }

    public m2a(opb opbVar, String str, String str2) {
        this.b = opbVar;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.opb
    public final void a(xq2<T> xq2Var, ppb ppbVar) {
        a aVar;
        boolean z;
        try {
            it5.a();
            ppbVar.G().k(ppbVar, this.c);
            Pair pairD = d(ppbVar);
            do {
                synchronized (this) {
                    synchronized (this) {
                        aVar = (a) this.a.get(pairD);
                    }
                }
                if (aVar == null) {
                    synchronized (this) {
                        aVar = new a(pairD);
                        this.a.put(pairD, aVar);
                        z = true;
                    }
                } else {
                    z = false;
                }
            } while (!aVar.a(xq2Var, ppbVar));
            if (z) {
                aVar.i(ppbVar.b0() ? ptf.a : ptf.b);
            }
        } finally {
            it5.a();
        }
    }

    public abstract T c(T t);

    public abstract Pair d(ppb ppbVar);

    public final synchronized void e(K k, m2a<K, T>.a aVar) {
        if (this.a.get(k) == aVar) {
            this.a.remove(k);
        }
    }
}
