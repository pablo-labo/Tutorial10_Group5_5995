package defpackage;

import com.datadog.android.api.InternalLogger;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class sc3 implements eoe {
    public static final Map<String, Number> q = Collections.EMPTY_MAP;
    public final uc3 a;
    public final x7b b;
    public final ConcurrentHashMap c;
    public final BigInteger d;
    public final bve e;
    public final BigInteger f;
    public final ConcurrentHashMap g;
    public volatile String h;
    public volatile String i;
    public volatile String j;
    public volatile boolean k;
    public boolean l;
    public final String m;
    public final AtomicReference<Map<String, Number>> n;
    public final Map<String, String> o;
    public final InternalLogger p;

    public sc3(BigInteger bigInteger, bve bveVar, BigInteger bigInteger2, String str, String str2, int i, String str3, Map map, LinkedHashMap linkedHashMap, x7b x7bVar, uc3 uc3Var, Map map2, InternalLogger internalLogger) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.g = concurrentHashMap;
        this.l = false;
        this.n = new AtomicReference<>();
        String name = Thread.currentThread().getName();
        long id = Thread.currentThread().getId();
        this.a = uc3Var;
        this.b = x7bVar;
        this.d = bigInteger;
        this.e = bveVar;
        this.f = bigInteger2;
        if (map == null) {
            this.c = new ConcurrentHashMap(0);
        } else {
            this.c = new ConcurrentHashMap(map);
        }
        if (linkedHashMap != null) {
            concurrentHashMap.putAll(linkedHashMap);
        }
        this.o = map2;
        g(str);
        this.j = str2;
        this.i = null;
        this.k = false;
        this.m = str3;
        if (i != Integer.MIN_VALUE) {
            f(i);
        }
        if (str3 != null) {
            concurrentHashMap.put("_dd.origin", str3);
        }
        concurrentHashMap.put("thread.name", name);
        concurrentHashMap.put("thread.id", Long.valueOf(id));
        this.p = internalLogger;
    }

    @Override // defpackage.eoe
    public final String a() {
        return this.d.toString();
    }

    @Override // defpackage.eoe
    public final String b() {
        return this.e.toString();
    }

    public final int c() {
        sc3 sc3Var;
        rc3 rc3VarW = this.b.w();
        if (rc3VarW != null && (sc3Var = rc3VarW.b) != this) {
            return sc3Var.c();
        }
        Map<String, Number> map = this.n.get();
        if (map == null) {
            map = q;
        }
        Number number = map.get("_sampling_priority_v1");
        if (number == null) {
            return Integer.MIN_VALUE;
        }
        return number.intValue();
    }

    public final boolean d() {
        boolean z;
        sc3 sc3Var;
        rc3 rc3VarW = this.b.w();
        if (rc3VarW != null && (sc3Var = rc3VarW.b) != this) {
            return sc3Var.d();
        }
        synchronized (this) {
            try {
                Map<String, Number> map = this.n.get();
                if (map == null) {
                    map = q;
                }
                int i = 1;
                if (map.get("_sampling_priority_v1") == null) {
                    this.p.log(InternalLogger.Level.INFO, InternalLogger.Target.USER, (gu5<String>) new k7(i), (Throwable) null, false, (Map<String, ? extends Object>) new HashMap());
                } else if (!this.l) {
                    this.l = true;
                }
                z = this.l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final void e(Number number, String str) {
        AtomicReference<Map<String, Number>> atomicReference = this.n;
        if (atomicReference.get() == null) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            while (!atomicReference.compareAndSet(null, concurrentHashMap) && atomicReference.get() == null) {
            }
        }
        if (number instanceof Float) {
            atomicReference.get().put(str, Double.valueOf(number.doubleValue()));
        } else {
            atomicReference.get().put(str, number);
        }
    }

    public final boolean f(int i) {
        rc3 rc3VarW;
        sc3 sc3Var;
        int i2 = 1;
        if (i == Integer.MIN_VALUE) {
            this.p.log(InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5<String>) new j7(i2), (Throwable) null, false, (Map<String, ? extends Object>) new HashMap());
            return false;
        }
        x7b x7bVar = this.b;
        if (x7bVar != null && (rc3VarW = x7bVar.w()) != null && (sc3Var = rc3VarW.b) != this) {
            return sc3Var.f(i);
        }
        synchronized (this) {
            try {
                if (this.l) {
                    return false;
                }
                e(Integer.valueOf(i), "_sampling_priority_v1");
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(String str) {
        if (this.o.containsKey(str)) {
            this.h = this.o.get(str);
        } else {
            this.h = str;
        }
    }

    public final synchronized void h(Object obj, String str) {
        if (obj != null) {
            try {
                if (!(obj instanceof String) || !((String) obj).isEmpty()) {
                    List<w1> spanContextDecorators = this.a.getSpanContextDecorators(str);
                    boolean zA = true;
                    if (spanContextDecorators != null) {
                        Iterator<w1> it = spanContextDecorators.iterator();
                        while (it.hasNext()) {
                            try {
                                zA &= it.next().a(this, str, obj);
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    if (zA) {
                        this.g.put(str, obj);
                    }
                    return;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.g.remove(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DDSpan [ t_id=");
        sb.append(this.d);
        sb.append(", s_id=");
        sb.append(this.e);
        sb.append(", p_id=");
        sb.append(this.f);
        sb.append("] trace=");
        sb.append(this.h);
        sb.append("/");
        sb.append(this.j);
        sb.append("/");
        sb.append((this.i == null || this.i.isEmpty()) ? this.j : this.i);
        sb.append(" metrics=");
        Map<String, Number> map = this.n.get();
        if (map == null) {
            map = q;
        }
        sb.append(new TreeMap(map));
        if (this.k) {
            sb.append(" *errored*");
        }
        sb.append(" tags=");
        sb.append(new TreeMap(this.g));
        return sb.toString();
    }
}
