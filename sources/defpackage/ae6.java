package defpackage;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.MalformedJsonException;
import defpackage.svf;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes2.dex */
public final class ae6 {
    public final ThreadLocal<Map<iyf<?>, pvf<?>>> a;
    public final ConcurrentHashMap b;
    public final pq2 c;
    public final v98 d;
    public final List<qvf> e;
    public final Map<Type, gg7<?>> f;
    public final boolean g;
    public final List<qvf> h;
    public final List<qvf> i;
    public final List<gwc> j;

    public static class a<T> extends q7e<T> {
        public pvf<T> a;

        @Override // defpackage.pvf
        public final T a(nb8 nb8Var) {
            pvf<T> pvfVar = this.a;
            if (pvfVar != null) {
                return pvfVar.a(nb8Var);
            }
            r6.g("Adapter for type with cyclic dependency has been used before dependency has been resolved");
            return null;
        }

        @Override // defpackage.pvf
        public final void b(gc8 gc8Var, T t) {
            pvf<T> pvfVar = this.a;
            if (pvfVar != null) {
                pvfVar.b(gc8Var, t);
            } else {
                r6.g("Adapter for type with cyclic dependency has been used before dependency has been resolved");
            }
        }

        @Override // defpackage.q7e
        public final pvf<T> c() {
            pvf<T> pvfVar = this.a;
            if (pvfVar != null) {
                return pvfVar;
            }
            r6.g("Adapter for type with cyclic dependency has been used before dependency has been resolved");
            return null;
        }
    }

    public ae6() {
        d15 d15Var = d15.c;
        Map<Type, gg7<?>> map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        this.a = new ThreadLocal<>();
        this.b = new ConcurrentHashMap();
        this.f = map;
        pq2 pq2Var = new pq2();
        this.c = pq2Var;
        this.g = true;
        this.h = list;
        this.i = list;
        this.j = list;
        ArrayList arrayList = new ArrayList();
        arrayList.add(svf.A);
        arrayList.add(una.c);
        arrayList.add(d15Var);
        arrayList.addAll(list);
        arrayList.add(svf.p);
        arrayList.add(svf.g);
        arrayList.add(svf.d);
        arrayList.add(svf.e);
        arrayList.add(svf.f);
        svf.b bVar = svf.k;
        arrayList.add(new uvf(Long.TYPE, Long.class, bVar));
        arrayList.add(new uvf(Double.TYPE, Double.class, new wd6()));
        arrayList.add(new uvf(Float.TYPE, Float.class, new xd6()));
        arrayList.add(xma.b);
        arrayList.add(svf.h);
        arrayList.add(svf.i);
        arrayList.add(new tvf(AtomicLong.class, new ovf(new yd6(bVar))));
        arrayList.add(new tvf(AtomicLongArray.class, new ovf(new zd6(bVar))));
        arrayList.add(svf.j);
        arrayList.add(svf.l);
        arrayList.add(svf.q);
        arrayList.add(svf.r);
        arrayList.add(new tvf(BigDecimal.class, svf.m));
        arrayList.add(new tvf(BigInteger.class, svf.n));
        arrayList.add(new tvf(bn8.class, svf.o));
        arrayList.add(svf.s);
        arrayList.add(svf.t);
        arrayList.add(svf.v);
        arrayList.add(svf.w);
        arrayList.add(svf.y);
        arrayList.add(svf.u);
        arrayList.add(svf.b);
        arrayList.add(rg3.b);
        arrayList.add(svf.x);
        if (eqe.a) {
            arrayList.add(eqe.c);
            arrayList.add(eqe.b);
            arrayList.add(eqe.d);
        }
        arrayList.add(pt0.c);
        arrayList.add(svf.a);
        arrayList.add(new r92(pq2Var));
        arrayList.add(new yb9(pq2Var));
        v98 v98Var = new v98(pq2Var);
        this.d = v98Var;
        arrayList.add(v98Var);
        arrayList.add(svf.B);
        arrayList.add(new pwc(pq2Var, d15Var, v98Var));
        this.e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final <T> T b(String str, Type type) {
        iyf<T> iyfVar = new iyf<>(type);
        T tA = null;
        if (str == null) {
            return null;
        }
        nb8 nb8Var = new nb8(new StringReader(str));
        boolean z = true;
        nb8Var.b = true;
        try {
            try {
                try {
                    try {
                        nb8Var.j0();
                        try {
                            tA = c(iyfVar).a(nb8Var);
                        } catch (EOFException e) {
                            e = e;
                            z = false;
                            if (!z) {
                                throw new JsonSyntaxException(e);
                            }
                        }
                    } catch (IOException e2) {
                        throw new JsonSyntaxException(e2);
                    } catch (AssertionError e3) {
                        throw new AssertionError("AssertionError (GSON 2.10.1): " + e3.getMessage(), e3);
                    }
                } catch (IllegalStateException e4) {
                    throw new JsonSyntaxException(e4);
                }
            } catch (EOFException e5) {
                e = e5;
            }
            if (tA != null) {
                try {
                    if (nb8Var.j0() != sb8.Y) {
                        throw new JsonSyntaxException("JSON document was not fully consumed.");
                    }
                } catch (MalformedJsonException e6) {
                    throw new JsonSyntaxException(e6);
                } catch (IOException e7) {
                    throw new JsonIOException(e7);
                }
            }
            return tA;
        } finally {
            nb8Var.b = false;
        }
    }

    public final <T> pvf<T> c(iyf<T> iyfVar) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.b;
        pvf<T> pvfVar = (pvf) concurrentHashMap.get(iyfVar);
        if (pvfVar != null) {
            return pvfVar;
        }
        ThreadLocal<Map<iyf<?>, pvf<?>>> threadLocal = this.a;
        Map map = threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set((Map<iyf<?>, pvf<?>>) map);
            z = true;
        } else {
            pvf<T> pvfVar2 = (pvf) map.get(iyfVar);
            if (pvfVar2 != null) {
                return pvfVar2;
            }
            z = false;
        }
        try {
            a aVar = new a();
            aVar.a = null;
            map.put(iyfVar, aVar);
            Iterator<qvf> it = this.e.iterator();
            pvf<T> pvfVarC = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                pvfVarC = it.next().c(this, iyfVar);
                if (pvfVarC != null) {
                    if (aVar.a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    aVar.a = pvfVarC;
                    map.put(iyfVar, pvfVarC);
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (pvfVarC == null) {
                akb.o(iyfVar, "GSON (2.10.1) cannot handle ");
                return null;
            }
            if (z) {
                concurrentHashMap.putAll(map);
            }
            return pvfVarC;
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final <T> pvf<T> d(qvf qvfVar, iyf<T> iyfVar) {
        List<qvf> list = this.e;
        if (!list.contains(qvfVar)) {
            qvfVar = this.d;
        }
        boolean z = false;
        for (qvf qvfVar2 : list) {
            if (z) {
                pvf<T> pvfVarC = qvfVar2.c(this, iyfVar);
                if (pvfVarC != null) {
                    return pvfVarC;
                }
            } else if (qvfVar2 == qvfVar) {
                z = true;
            }
        }
        akb.o(iyfVar, "GSON cannot serialize ");
        return null;
    }

    public final gc8 e(Writer writer) {
        gc8 gc8Var = new gc8(writer);
        gc8Var.f = this.g;
        gc8Var.e = false;
        gc8Var.W = false;
        return gc8Var;
    }

    public final String f(Object obj) {
        if (obj == null) {
            ka8 ka8Var = xa8.a;
            StringWriter stringWriter = new StringWriter();
            try {
                g(ka8Var, e(stringWriter));
                return stringWriter.toString();
            } catch (IOException e) {
                throw new JsonIOException(e);
            }
        }
        Class cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            h(obj, cls, e(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e2) {
            throw new JsonIOException(e2);
        }
    }

    public final void g(ka8 ka8Var, gc8 gc8Var) {
        boolean z = gc8Var.e;
        gc8Var.e = true;
        boolean z2 = gc8Var.f;
        gc8Var.f = this.g;
        boolean z3 = gc8Var.W;
        gc8Var.W = false;
        try {
            try {
                svf.z.getClass();
                svf.t.d(ka8Var, gc8Var);
                gc8Var.e = z;
                gc8Var.f = z2;
                gc8Var.W = z3;
            } catch (IOException e) {
                throw new JsonIOException(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            gc8Var.e = z;
            gc8Var.f = z2;
            gc8Var.W = z3;
            throw th;
        }
    }

    public final void h(Object obj, Class cls, gc8 gc8Var) {
        pvf pvfVarC = c(new iyf(cls));
        boolean z = gc8Var.e;
        gc8Var.e = true;
        boolean z2 = gc8Var.f;
        gc8Var.f = this.g;
        boolean z3 = gc8Var.W;
        gc8Var.W = false;
        try {
            try {
                try {
                    pvfVarC.b(gc8Var, obj);
                } catch (AssertionError e) {
                    throw new AssertionError("AssertionError (GSON 2.10.1): " + e.getMessage(), e);
                }
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            }
        } finally {
            gc8Var.e = z;
            gc8Var.f = z2;
            gc8Var.W = z3;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }
}
