package defpackage;

import android.os.StrictMode;
import com.datadog.android.api.InternalLogger;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.pk6;
import defpackage.ppf;
import defpackage.stg;
import defpackage.un2;
import defpackage.x61;
import defpackage.x7b;
import defpackage.y61;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;

/* JADX INFO: loaded from: classes2.dex */
public class uc3 implements ppf, Closeable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final BigInteger TRACE_ID_128_BITS_MAX;
    public static final BigInteger TRACE_ID_64_BITS_MAX;
    public static final BigInteger TRACE_ID_MIN;
    private final Map<String, String> defaultSpanTags;
    private final pk6.c extractor;
    private final kr6 idGenerationStrategy;
    private final pk6.d injector;
    private final SortedSet<mpf> interceptors;
    private final Map<String, String> localRootSpanTags;
    private final int partialFlushMinSpans;
    private final Random random;
    final sjd sampler;
    final xpd scopeManager;
    final String serviceName;
    private final Map<String, String> serviceNameMappings;
    private final Thread shutdownCallback;
    private final Map<String, List<w1>> spanContextDecorators;
    final h5h writer;

    public class a implements Comparator<mpf> {
        public a() {
        }

        @Override // java.util.Comparator
        public final int compare(mpf mpfVar, mpf mpfVar2) {
            return Integer.compare(mpfVar.a(), mpfVar2.a());
        }
    }

    public class b implements ppf.a {
        public final xpd b;
        public final String c;
        public final LinkedHashMap d;
        public eoe e;
        public String f;
        public String g;
        public g39 h = new hh1(12);
        public InternalLogger i = InternalLogger.INSTANCE.getUNBOUND();

        public b(String str, xpd xpdVar) {
            this.d = new LinkedHashMap(uc3.this.defaultSpanTags);
            this.c = str;
            this.b = xpdVar;
        }

        @Override // ppf.a
        public final ppf.a a(eoe eoeVar) {
            this.e = eoeVar;
            return this;
        }

        public final void b(String str, String str2) {
            LinkedHashMap linkedHashMap = this.d;
            if (str2 == null || str2.isEmpty()) {
                linkedHashMap.remove(str);
            } else {
                linkedHashMap.put(str, str2);
            }
        }

        @Override // ppf.a
        public final doe start() {
            bve bveVar;
            BigInteger bigInteger;
            BigInteger bigInteger2;
            BigInteger bigInteger3;
            Map<String, String> map;
            String str;
            x7b x7bVar;
            String str2;
            doe doeVarActiveSpan;
            do {
                synchronized (uc3.this.random) {
                    bveVar = new bve(63, uc3.this.random);
                }
            } while (bveVar.signum() == 0);
            eoe eoeVarF = this.e;
            if (eoeVarF == null && (doeVarActiveSpan = this.b.activeSpan()) != null) {
                eoeVarF = doeVarActiveSpan.f();
            }
            int i = Integer.MIN_VALUE;
            if (eoeVarF instanceof sc3) {
                sc3 sc3Var = (sc3) eoeVarF;
                bigInteger3 = sc3Var.d;
                bigInteger2 = sc3Var.e;
                map = sc3Var.c;
                x7bVar = sc3Var.b;
                if (this.f == null) {
                    this.f = sc3Var.h;
                }
                str2 = null;
            } else {
                if (eoeVarF instanceof l55) {
                    l55 l55Var = (l55) eoeVarF;
                    BigInteger bigInteger4 = l55Var.c;
                    bigInteger2 = l55Var.d;
                    int i2 = l55Var.e;
                    map = l55Var.f;
                    bigInteger3 = bigInteger4;
                    i = i2;
                } else {
                    do {
                        synchronized (uc3.this.idGenerationStrategy) {
                            bigInteger = new BigInteger(uc3.this.idGenerationStrategy.b().a(), 16);
                        }
                    } while (bigInteger.signum() == 0);
                    bigInteger2 = BigInteger.ZERO;
                    bigInteger3 = bigInteger;
                    map = null;
                }
                if (eoeVarF instanceof a8f) {
                    a8f a8fVar = (a8f) eoeVarF;
                    this.d.putAll(a8fVar.b);
                    str = a8fVar.a;
                } else {
                    str = this.g;
                }
                this.d.putAll(uc3.this.localRootSpanTags);
                x7bVar = new x7b(uc3.this, bigInteger3, this.i);
                str2 = str;
            }
            Map<String, String> map2 = map;
            x7b x7bVar2 = x7bVar;
            int i3 = i;
            BigInteger bigInteger5 = bigInteger3;
            if (this.f == null) {
                this.f = uc3.this.serviceName;
            }
            String str3 = this.c;
            String str4 = str3 != null ? str3 : null;
            BigInteger bigInteger6 = bigInteger2;
            String str5 = this.f;
            LinkedHashMap linkedHashMap = this.d;
            uc3 uc3Var = uc3.this;
            sc3 sc3Var2 = new sc3(bigInteger5, bveVar, bigInteger6, str5, str4, i3, str2, map2, linkedHashMap, x7bVar2, uc3Var, uc3Var.serviceNameMappings, this.i);
            for (Map.Entry entry : this.d.entrySet()) {
                if (entry.getValue() == null) {
                    sc3Var2.h(null, (String) entry.getKey());
                } else {
                    List<w1> spanContextDecorators = uc3.this.getSpanContextDecorators((String) entry.getKey());
                    boolean zA = true;
                    if (spanContextDecorators != null) {
                        Iterator<w1> it = spanContextDecorators.iterator();
                        while (it.hasNext()) {
                            try {
                                zA &= it.next().a(sc3Var2, (String) entry.getKey(), entry.getValue());
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    if (!zA) {
                        sc3Var2.h(null, (String) entry.getKey());
                    }
                }
            }
            return new rc3(sc3Var2, this.h, this.i);
        }
    }

    public static class c extends Thread {
        public final WeakReference<uc3> a;

        public c(uc3 uc3Var) {
            super("dd-tracer-shutdown-hook");
            this.a = new WeakReference<>(uc3Var);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() throws IOException {
            uc3 uc3Var = this.a.get();
            if (uc3Var != null) {
                uc3Var.close();
            }
        }
    }

    static {
        BigInteger bigIntegerPow = BigInteger.valueOf(2L).pow(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        BigInteger bigInteger = BigInteger.ONE;
        TRACE_ID_128_BITS_MAX = bigIntegerPow.subtract(bigInteger);
        TRACE_ID_64_BITS_MAX = BigInteger.valueOf(2L).pow(64).subtract(bigInteger);
        TRACE_ID_MIN = BigInteger.ZERO;
    }

    public uc3(un2 un2Var, h5h h5hVar, Random random) {
        sjd oicVar;
        un2.a aVar;
        un2.a aVar2;
        un2.a aVar3;
        un2.a aVar4;
        un2.a aVar5;
        String hostName;
        String str = un2Var.c;
        if (un2Var.j) {
            Double d = un2Var.X;
            oicVar = d != null ? new oic(d) : new oic(Double.valueOf(1.0d));
        } else {
            i20 i20Var = new i20();
            i20Var.a = new HashMap();
            oicVar = i20Var;
        }
        sjd sjdVar = oicVar;
        ArrayList arrayList = new ArrayList();
        Iterator<un2.a> it = un2Var.C.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            aVar = un2.a.e;
            aVar2 = un2.a.d;
            aVar3 = un2.a.c;
            aVar4 = un2.a.b;
            aVar5 = un2.a.a;
            if (!zHasNext) {
                break;
            }
            un2.a next = it.next();
            if (next == aVar5) {
                arrayList.add(new vf3());
            } else if (next == aVar4) {
                arrayList.add(new x61.b());
            } else if (next == aVar3) {
                arrayList.add(new y61.b());
            } else if (next == aVar2) {
                arrayList.add(new stg.b());
            } else if (next == aVar) {
                arrayList.add(new ng6());
            }
        }
        pk6.b bVar = new pk6.b(arrayList);
        Map<String, String> map = un2Var.q;
        ArrayList arrayList2 = new ArrayList();
        for (un2.a aVar6 : un2Var.B) {
            if (aVar6 == aVar5) {
                arrayList2.add(new uf3(map));
            } else if (aVar6 == aVar4) {
                arrayList2.add(new x61.a(map));
            } else if (aVar6 == aVar3) {
                arrayList2.add(new y61.a(map));
            } else if (aVar6 == aVar2) {
                arrayList2.add(new stg.a(map));
            } else if (aVar6 == aVar) {
                arrayList2.add(new mg6(map));
            }
        }
        pk6.a aVar7 = new pk6.a(arrayList2);
        hu2 hu2Var = new hu2(un2.v0.y.intValue(), createScopeEventFactory());
        HashMap map2 = new HashMap(3, 1.0f);
        map2.put("runtime-id", un2Var.a);
        HashMap map3 = new HashMap(Collections.unmodifiableMap(map2));
        map3.put("language", "jvm");
        if (un2Var.P) {
            String line = System.getProperty("os.name").startsWith("Windows") ? System.getenv("COMPUTERNAME") : System.getenv("HOSTNAME");
            if (line == null || line.isEmpty()) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("hostname").getInputStream()));
                    try {
                        line = bufferedReader.readLine();
                        bufferedReader.close();
                    } finally {
                    }
                } catch (Exception unused) {
                }
                if (line == null || line.isEmpty()) {
                    try {
                        hostName = InetAddress.getLocalHost().getHostName();
                    } catch (UnknownHostException unused2) {
                        hostName = null;
                    }
                } else {
                    hostName = line.trim();
                }
            } else {
                hostName = line.trim();
            }
            if (hostName != null && !hostName.isEmpty()) {
                map3.put("_dd.hostname", hostName);
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map3);
        Map<String, String> map4 = un2Var.m;
        int size = map4.size();
        Map<String, String> map5 = un2Var.n;
        HashMap map6 = new HashMap(map5.size() + size + 1, 1.0f);
        map6.putAll(map4);
        map6.putAll(map5);
        this(str, h5hVar, sjdVar, bVar, aVar7, hu2Var, random, mapUnmodifiableMap, Collections.unmodifiableMap(map6), un2Var.l, un2Var.q, un2Var.z.intValue());
    }

    private static pc3 createScopeEventFactory() {
        try {
            return (pc3) Class.forName("com.datadog.opentracing.jfr.openjdk.ScopeEventFactory").newInstance();
        } catch (ClassFormatError | NoClassDefFoundError | ReflectiveOperationException unused) {
            return new nc3();
        }
    }

    @Deprecated
    private static Map<String, String> customRuntimeTags(String str, Map<String, String> map) {
        HashMap map2 = new HashMap(map);
        map2.put("runtime-id", str);
        return Collections.unmodifiableMap(map2);
    }

    public spd activateSpan(doe doeVar) {
        return this.scopeManager.b(doeVar);
    }

    @Override // defpackage.ppf
    public doe activeSpan() {
        return this.scopeManager.activeSpan();
    }

    public void addDecorator(w1 w1Var) {
        List<w1> arrayList = this.spanContextDecorators.get(w1Var.a);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(w1Var);
        this.spanContextDecorators.put(w1Var.a, arrayList);
    }

    @Deprecated
    public void addScopeContext(upd updVar) {
        xpd xpdVar = this.scopeManager;
        if (xpdVar instanceof hu2) {
            hu2 hu2Var = (hu2) xpdVar;
            synchronized (hu2Var.b) {
                hu2Var.b.addFirst(updVar);
            }
        }
    }

    public void addScopeListener(wpd wpdVar) {
        xpd xpdVar = this.scopeManager;
        if (xpdVar instanceof hu2) {
            ((hu2) xpdVar).c.add(wpdVar);
        }
    }

    public boolean addTraceInterceptor(mpf mpfVar) {
        return this.interceptors.add(mpfVar);
    }

    @Override // defpackage.ppf
    public ppf.a buildSpan(String str) {
        return new b(str, this.scopeManager);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        x7b.a andSet = x7b.a.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
        this.writer.close();
    }

    @Override // defpackage.ppf
    public <T> eoe extract(np5<T> np5Var, T t) {
        if (t instanceof sif) {
            return this.extractor.a((sif) t);
        }
        return null;
    }

    public void finalize() {
        try {
            Runtime.getRuntime().removeShutdownHook(this.shutdownCallback);
            this.shutdownCallback.run();
        } catch (Exception unused) {
        }
    }

    public int getPartialFlushMinSpans() {
        return this.partialFlushMinSpans;
    }

    public List<w1> getSpanContextDecorators(String str) {
        return this.spanContextDecorators.get(str);
    }

    public String getSpanId() {
        doe doeVarActiveSpan = activeSpan();
        return doeVarActiveSpan instanceof rc3 ? ((rc3) doeVarActiveSpan).b.e.toString() : "0";
    }

    public String getTraceId() {
        doe doeVarActiveSpan = activeSpan();
        return doeVarActiveSpan instanceof rc3 ? ((rc3) doeVarActiveSpan).b.d.toString() : "0";
    }

    public void incrementTraceCount() {
        this.writer.incrementTraceCount();
    }

    @Override // defpackage.ppf
    public <T> void inject(eoe eoeVar, np5<T> np5Var, T t) {
        if (t instanceof uif) {
            sc3 sc3Var = (sc3) eoeVar;
            setSamplingPriorityIfNecessary(sc3Var.b.w());
            this.injector.a(sc3Var, (uif) t);
        }
    }

    public void registerClassLoader(ClassLoader classLoader) {
        try {
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            Iterator it = ServiceLoader.load(mpf.class, classLoader).iterator();
            while (it.hasNext()) {
                addTraceInterceptor((mpf) it.next());
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        } catch (ServiceConfigurationError unused) {
        }
    }

    public xpd scopeManager() {
        return this.scopeManager;
    }

    public void setSamplingPriorityIfNecessary(rc3 rc3Var) {
        if ((this.sampler instanceof onb) && rc3Var != null && rc3Var.b.c() == Integer.MIN_VALUE) {
            ((onb) this.sampler).b(rc3Var);
        }
    }

    public String toString() {
        return "DDTracer-" + Integer.toHexString(hashCode()) + "{ serviceName=" + this.serviceName + ", writer=" + this.writer + ", sampler=" + this.sampler + ", defaultSpanTags=" + this.defaultSpanTags + '}';
    }

    public void write(Collection<rc3> collection) {
        ArrayList arrayList;
        if (collection.isEmpty()) {
            return;
        }
        if (this.interceptors.isEmpty()) {
            arrayList = new ArrayList(collection);
        } else {
            Collection<f4a> arrayList2 = new ArrayList(collection);
            Iterator<mpf> it = this.interceptors.iterator();
            while (it.hasNext()) {
                arrayList2 = it.next().b();
            }
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            for (f4a f4aVar : arrayList2) {
                if (f4aVar instanceof rc3) {
                    arrayList3.add((rc3) f4aVar);
                }
            }
            arrayList = arrayList3;
        }
        incrementTraceCount();
        if (arrayList.isEmpty()) {
            return;
        }
        rc3 rc3VarW = ((rc3) arrayList.get(0)).b.b.w();
        setSamplingPriorityIfNecessary(rc3VarW);
        if (rc3VarW == null) {
            rc3VarW = (rc3) arrayList.get(0);
        }
        if (this.sampler.a(rc3VarW)) {
            this.writer.write(arrayList);
        }
    }

    private uc3(String str, h5h h5hVar, sjd sjdVar, pk6.d dVar, pk6.c cVar, xpd xpdVar, Random random, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4, int i) {
        this.spanContextDecorators = new ConcurrentHashMap();
        this.interceptors = new ConcurrentSkipListSet(new a());
        this.idGenerationStrategy = kr6.a("SECURE_RANDOM", true);
        this.random = random;
        this.serviceName = str;
        if (h5hVar == null) {
            this.writer = new n49();
        } else {
            this.writer = h5hVar;
        }
        this.sampler = sjdVar;
        this.injector = dVar;
        this.extractor = cVar;
        this.scopeManager = xpdVar;
        this.localRootSpanTags = map;
        this.defaultSpanTags = map2;
        this.serviceNameMappings = map3;
        this.partialFlushMinSpans = i;
        this.writer.start();
        c cVar2 = new c(this);
        this.shutdownCallback = cVar2;
        try {
            Runtime.getRuntime().addShutdownHook(cVar2);
        } catch (IllegalStateException unused) {
        }
        ArrayList arrayList = new ArrayList();
        bp5 bp5Var = new bp5();
        bp5Var.a = "manual.drop";
        cp5 cp5Var = new cp5();
        cp5Var.a = "manual.keep";
        p7b p7bVar = new p7b();
        p7bVar.a = "peer.service";
        for (w1 w1Var : Arrays.asList(bp5Var, cp5Var, p7bVar, new n8e("service.name", false), new n8e("service", false))) {
            un2 un2Var = un2.v0;
            String simpleName = w1Var.getClass().getSimpleName();
            un2Var.getClass();
            String strM = l5.m("trace.", simpleName, ".enabled");
            Boolean bool = Boolean.TRUE;
            if (un2.b(strM, bool).booleanValue()) {
                if (un2.b("trace." + simpleName.toLowerCase(Locale.US) + ".enabled", bool).booleanValue()) {
                    arrayList.add(w1Var);
                }
            }
        }
        Iterator<String> it = un2.v0.x.iterator();
        while (it.hasNext()) {
            arrayList.add(new n8e(it.next(), true));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            addDecorator((w1) it2.next());
        }
        registerClassLoader(ClassLoader.getSystemClassLoader());
        x7b.a andSet = x7b.a.getAndSet(new x7b.a());
        if (andSet != null) {
            andSet.run();
        }
    }
}
