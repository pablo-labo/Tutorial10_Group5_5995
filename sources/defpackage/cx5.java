package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.ax5;
import defpackage.e75;
import defpackage.x1f;
import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import org.apache.avro.AvroRuntimeException;
import org.apache.avro.f;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public class cx5<D> implements wg3<D> {
    public static final wkf W = new wkf(new nf1(1));
    public final ax5 a;
    public final g b;
    public final g c;
    public e75.b d = null;
    public d5d e = null;
    public final b V = new b(new bx5(this));
    public final Thread f = Thread.currentThread();

    public static final class a {
        public final g a;
        public final int b;

        public a(g gVar) {
            this.a = gVar;
            this.b = System.identityHashCode(gVar);
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this == aVar || this.a == aVar.a;
        }

        public final int hashCode() {
            return this.b;
        }
    }

    public static class b {
        public final ConcurrentHashMap a = new ConcurrentHashMap();
        public final ConcurrentHashMap b = new ConcurrentHashMap();
        public final bx5 c;

        public b(bx5 bx5Var) {
            this.c = bx5Var;
        }
    }

    public cx5(g gVar, g gVar2, ax5 ax5Var) {
        this.a = ax5Var;
        this.b = gVar;
        this.c = gVar2;
    }

    public static void h(g gVar, ka6 ka6Var) {
        switch (gVar.K().ordinal()) {
            case 0:
                Iterator<g.f> it = gVar.C().iterator();
                while (it.hasNext()) {
                    h(it.next().d, ka6Var);
                }
                break;
            case 1:
                ka6Var.R0();
                break;
            case 2:
                g gVarX = gVar.x();
                while (true) {
                    long jE1 = ka6Var.e1();
                    if (jE1 > 0) {
                        for (long j = 0; j < jE1; j++) {
                            h(gVarX, ka6Var);
                        }
                    }
                    break;
                }
                break;
            case 3:
                g gVarM = gVar.M();
                while (true) {
                    long jH1 = ka6Var.h1();
                    if (jH1 > 0) {
                        for (long j2 = 0; j2 < jH1; j2++) {
                            ka6Var.i1();
                            h(gVarM, ka6Var);
                        }
                    }
                    break;
                }
                break;
            case 4:
                h(gVar.L().get(ka6Var.U0()), ka6Var);
                break;
            case 5:
                ka6Var.g1(gVar.D());
                break;
            case 6:
                ka6Var.i1();
                break;
            case 7:
                ka6Var.f1();
                break;
            case 8:
                ka6Var.V0();
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                ka6Var.W0();
                break;
            case 10:
                ka6Var.T0();
                break;
            case 11:
                ka6Var.Q0();
                break;
            case 12:
                ka6Var.O0();
                break;
            case 13:
                ka6Var.Y0();
                break;
            default:
                b0.o("Unknown type: ".concat(String.valueOf(gVar)));
                break;
        }
    }

    public Class b(g gVar) {
        String strE = gVar.e("avro.java.string");
        return (strE != null && ax5.h.valueOf(strE).ordinal() == 1) ? String.class : CharSequence.class;
    }

    public final Object c(Object obj, g gVar, d5d d5dVar) {
        xy2 xy2VarI;
        Object objG = g(obj, gVar, d5dVar);
        p49 p49VarG = gVar.G();
        return (p49VarG == null || (xy2VarI = this.a.i(p49VarG)) == null) ? objG : org.apache.avro.a.a(objG, gVar, p49VarG, xy2VarI);
    }

    public void d(Object obj, g.f fVar, Object obj2, d5d d5dVar) {
        int i = fVar.c;
        Object objC = c(obj2, fVar.d, d5dVar);
        this.a.getClass();
        ((la7) obj).c(i, objC);
    }

    public Object e(Object obj, g gVar, d5d d5dVar) {
        Object objP = this.a.p(obj, gVar);
        for (g.f fVar : ((x1f.f) d5dVar.d.a(x1f.h0)).l0) {
            d(objP, fVar, obj != null ? ((la7) objP).get(fVar.c) : null, d5dVar);
        }
        return objP;
    }

    public final Object f(Object obj, g gVar, d5d d5dVar) {
        final b bVar = this.V;
        bVar.getClass();
        Class cls = (Class) bVar.a.computeIfAbsent(new a(gVar), new dx5(bVar, 0));
        if (cls == String.class) {
            return d5dVar.a1();
        }
        if (cls == CharSequence.class) {
            return d5dVar.Z0(obj instanceof rjg ? (rjg) obj : null);
        }
        return ((Function) bVar.b.computeIfAbsent(cls, new Function() { // from class: ex5
            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                Class cls2 = (Class) obj2;
                bVar.getClass();
                try {
                    final Constructor declaredConstructor = cls2.getDeclaredConstructor(String.class);
                    declaredConstructor.setAccessible(true);
                    return new Function() { // from class: fx5
                        @Override // java.util.function.Function
                        public final Object apply(Object obj3) {
                            try {
                                return declaredConstructor.newInstance((String) obj3);
                            } catch (ReflectiveOperationException e) {
                                throw new AvroRuntimeException(e);
                            }
                        }
                    };
                } catch (NoSuchMethodException e) {
                    throw new AvroRuntimeException(e);
                }
            }
        })).apply(d5dVar.a1());
    }

    public final Object g(Object obj, g gVar, d5d d5dVar) {
        Map map;
        long j;
        int iOrdinal = gVar.K().ordinal();
        long j2 = 0;
        ax5 ax5Var = this.a;
        switch (iOrdinal) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                g gVarX = gVar.x();
                long jN0 = d5dVar.N0();
                if (jN0 > 0) {
                    p49 p49VarG = gVarX.G();
                    xy2 xy2VarI = ax5Var.i(p49VarG);
                    Collection collectionO = ax5.o(obj, (int) jN0, gVar);
                    do {
                        if (p49VarG == null || xy2VarI == null) {
                            for (long j3 = 0; j3 < jN0; j3++) {
                                Collection collection = collectionO;
                                collection.add(g(collection instanceof vw5 ? ((vw5) collection).peek() : null, gVarX, d5dVar));
                            }
                        } else {
                            for (long j4 = 0; j4 < jN0; j4++) {
                                Collection collection2 = collectionO;
                                collection2.add(org.apache.avro.a.a(g(collection2 instanceof vw5 ? ((vw5) collection2).peek() : null, gVarX, d5dVar), gVarX, p49VarG, xy2VarI));
                            }
                        }
                        jN0 = d5dVar.S();
                    } while (jN0 > 0);
                    Collection collection3 = collectionO;
                    if (collection3 instanceof vw5) {
                        ((vw5) collection3).r0();
                    }
                } else {
                    ax5Var.getClass();
                    Collection collectionO2 = ax5.o(obj, 0, gVar);
                    Collection collection4 = collectionO2;
                    if (collection4 instanceof vw5) {
                        ((vw5) collection4).r0();
                    }
                }
                break;
            case 3:
                g gVarM = gVar.M();
                long jX0 = d5dVar.X0();
                p49 p49VarG2 = gVarM.G();
                xy2 xy2VarI2 = ax5Var.i(p49VarG2);
                int i = (int) jX0;
                if (obj instanceof Map) {
                    map = (Map) obj;
                    map.clear();
                } else {
                    map = new HashMap(i);
                }
                if (jX0 > 0) {
                    while (true) {
                        if (p49VarG2 == null || xy2VarI2 == null) {
                            j = j2;
                            for (int i2 = 0; i2 < jX0; i2++) {
                                map.put(f(null, gVar, d5dVar), g(null, gVarM, d5dVar));
                            }
                        } else {
                            int i3 = 0;
                            while (i3 < jX0) {
                                map.put(f(null, gVar, d5dVar), org.apache.avro.a.a(g(null, gVarM, d5dVar), gVarM, p49VarG2, xy2VarI2));
                                i3++;
                                j2 = j2;
                            }
                            j = j2;
                        }
                        jX0 = d5dVar.F0();
                        if (jX0 > j) {
                            j2 = j;
                        }
                    }
                }
                break;
            case 4:
                break;
            case 5:
                cz5 cz5Var = (cz5) ax5Var.e(obj, gVar);
                d5dVar.S0(gVar.D(), cz5Var.e());
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                d5dVar.Y0();
                break;
            default:
                r40.m("Unknown type: ".concat(String.valueOf(gVar)));
                break;
        }
        return null;
    }

    @Override // defpackage.wg3
    public final D j(D d, ka6 ka6Var) {
        d5d d5dVar;
        ax5 ax5Var = this.a;
        boolean z = ax5Var.d;
        g gVar = this.b;
        g gVar2 = this.c;
        if (z && (ax5Var.getClass() == ax5.class || ax5Var.getClass() == zoe.class)) {
            if (this.d == null) {
                if (ax5Var.e == null) {
                    ax5Var.e = new e75(ax5Var);
                }
                this.d = ax5Var.e.a(gVar, gVar2);
            }
            return (D) this.d.j(d, ka6Var);
        }
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f;
        if (threadCurrentThread != thread || (d5dVar = this.e) == null) {
            wkf wkfVar = W;
            Map lugVar = (Map) ((Map) wkfVar.get()).get(gVar);
            if (lugVar == null) {
                lugVar = new lug();
                ((Map) wkfVar.get()).put(gVar, lugVar);
            }
            d5dVar = (d5d) lugVar.get(gVar2);
            if (d5dVar == null) {
                g gVarQ = g.q(gVar, gVar2);
                Objects.requireNonNull(gVarQ, "Writer schema cannot be null");
                Objects.requireNonNull(gVar2, "Reader schema cannot be null");
                new e5d();
                x1f[] x1fVarArr = {e5d.b(f.a(g.q(gVarQ, gVar2), gVar2, ax5.g, new HashMap()), new HashMap())};
                x1f.o oVar = x1f.c;
                x1f[] x1fVarArr2 = new x1f[x1f.c(x1fVarArr, 0) + 1];
                x1f.b(x1fVarArr, 0, x1fVarArr2, 1, new HashMap(), new HashMap());
                x1f.m mVar = new x1f.m(x1f.j.b, x1fVarArr2);
                x1fVarArr2[0] = mVar;
                d5dVar = new d5d(mVar);
                d5dVar.d.c = 1;
                d5dVar.e = null;
                lugVar.put(gVar2, d5dVar);
            }
            if (threadCurrentThread == thread) {
                this.e = d5dVar;
            }
        }
        zje zjeVar = d5dVar.d;
        zjeVar.c = 1;
        d5dVar.e = (pf1) ka6Var;
        D d2 = (D) c(d, gVar2, d5dVar);
        while (true) {
            int i = zjeVar.c;
            if (i > 1) {
                int i2 = i - 1;
                x1f x1fVar = zjeVar.b[i2];
                x1f.j jVar = x1fVar.a;
                if (jVar != x1f.j.f) {
                    if (jVar == x1f.j.a) {
                        break;
                    }
                    zjeVar.c = i2;
                    zjeVar.d(x1fVar);
                } else {
                    zjeVar.c = i2;
                    ((d5d) zjeVar.a).K1(null, x1fVar);
                }
            } else {
                break;
            }
        }
        return d2;
    }
}
