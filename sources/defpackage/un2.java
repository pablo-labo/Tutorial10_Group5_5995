package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class un2 {
    public static Properties u0;
    public final boolean A;
    public final Set<a> B;
    public final Set<a> C;
    public final boolean D;
    public final String E;
    public final List<String> F;

    @Deprecated
    public final List<String> G;
    public final Integer H;
    public final Integer I;
    public final String J;
    public final Integer K;
    public final boolean L;
    public final String M;
    public final Integer N;
    public final boolean O;
    public final boolean P;
    public final String Q;
    public final String R;
    public final boolean S;
    public final List<String> T;
    public final boolean U;
    public final Map<String, String> V;
    public final Map<String, String> W;
    public final Double X;
    public final Double Y;
    public final boolean Z;
    public final String a;

    @Deprecated
    public final String a0;
    public final String b;
    public final Map<String, String> b0;
    public final String c;
    public final int c0;
    public final boolean d;
    public final boolean d0;
    public final boolean e;
    public final int e0;
    public final String f;
    public final String f0;
    public final String g;
    public final int g0;
    public final int h;
    public final String h0;
    public final String i;
    public final String i0;
    public final boolean j;
    public final int j0;
    public final boolean k;
    public final String k0;
    public final Map<String, String> l;
    public final String l0;
    public final Map<String, String> m;
    public final int m0;
    public final Map<String, String> n;
    public final int n0;
    public final Map<String, String> o;
    public final int o0;
    public final List<String> p;
    public final Map<String, String> q;
    public final Set<Integer> r;
    public final Set<Integer> s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final Set<String> x;
    public final Integer y;
    public final Integer z;
    public static final Pattern p0 = Pattern.compile("[^a-zA-Z0-9_]");
    public static final Set<Integer> q0 = j("500-599");
    public static final Set<Integer> r0 = j("400-499");
    public static final String s0 = "DATADOG";
    public static final String t0 = "DATADOG";
    public static final un2 v0 = new un2();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final /* synthetic */ a[] f;

        static {
            a aVar = new a("DATADOG", 0);
            a = aVar;
            a aVar2 = new a("B3", 1);
            b = aVar2;
            a aVar3 = new a("B3MULTI", 2);
            c = aVar3;
            a aVar4 = new a("TRACECONTEXT", 3);
            d = aVar4;
            a aVar5 = new a("HAYSTACK", 4);
            e = aVar5;
            f = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f.clone();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public un2(java.util.Properties r6, defpackage.un2 r7) {
        /*
            Method dump skipped, instruction units count: 1003
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.un2.<init>(java.util.Properties, un2):void");
    }

    public static Set<a> a(Set<String> set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            try {
                linkedHashSet.add(a.valueOf(it.next().toUpperCase(Locale.US)));
            } catch (IllegalArgumentException unused) {
            }
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    @Deprecated
    public static Boolean b(String str, Boolean bool) {
        try {
            bool = o(Boolean.class, bool, i(str, null));
        } catch (NumberFormatException unused) {
        }
        return (Boolean) bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public static Integer c(Integer num, String str) {
        try {
            num = o(Integer.class, num, i(str, null));
        } catch (NumberFormatException unused) {
        }
        return (Integer) num;
    }

    @Deprecated
    public static Map d(String str) {
        String strI = i(str, null);
        n(str);
        return l(strI);
    }

    public static Boolean e(Properties properties, String str, Boolean bool) {
        return (Boolean) o(Boolean.class, bool, properties.getProperty(str));
    }

    public static Integer f(Properties properties, String str, Integer num) {
        return (Integer) o(Integer.class, num, properties.getProperty(str));
    }

    public static List<String> g(Properties properties, String str, List<String> list) {
        String property = properties.getProperty(str);
        return (property == null || property.trim().isEmpty()) ? list : k(property);
    }

    public static Map<String, String> h(Properties properties, String str, Map<String, String> map) {
        String property = properties.getProperty(str);
        return (property == null || property.trim().isEmpty()) ? map : l(property);
    }

    @Deprecated
    public static String i(String str, String str2) {
        String strN = n(str);
        String property = System.getProperties().getProperty(strN);
        if (property != null) {
            return property;
        }
        String str3 = System.getenv(p0.matcher(n(str).toUpperCase(Locale.US)).replaceAll("_"));
        if (str3 != null) {
            return str3;
        }
        String property2 = u0.getProperty(strN);
        return property2 != null ? property2 : str2;
    }

    public static Set j(String str) {
        String strReplaceAll = str.replaceAll("\\s", "");
        if (!strReplaceAll.matches("\\d{3}(?:-\\d{3})?(?:,\\d{3}(?:-\\d{3})?)*")) {
            throw new NumberFormatException();
        }
        String[] strArrSplit = strReplaceAll.split(",", -1);
        HashSet hashSet = new HashSet();
        for (String str2 : strArrSplit) {
            String[] strArrSplit2 = str2.split("-", -1);
            if (strArrSplit2.length == 1) {
                hashSet.add(Integer.valueOf(Integer.parseInt(strArrSplit2[0])));
            } else if (strArrSplit2.length == 2) {
                int i = Integer.parseInt(strArrSplit2[0]);
                int i2 = Integer.parseInt(strArrSplit2[1]);
                int iMax = Math.max(i, i2);
                for (int iMin = Math.min(i, i2); iMin <= iMax; iMin++) {
                    hashSet.add(Integer.valueOf(iMin));
                }
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static List<String> k(String str) {
        if (str == null || str.trim().isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        String[] strArrSplit = str.split(",", -1);
        for (int i = 0; i < strArrSplit.length; i++) {
            strArrSplit[i] = strArrSplit[i].trim();
        }
        return Collections.unmodifiableList(Arrays.asList(strArrSplit));
    }

    public static Map l(String str) {
        if (str == null || str.trim().isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        if (!str.matches("(([^,:]+:[^,:]*,)*([^,:]+:[^,:]*),?)?")) {
            return Collections.EMPTY_MAP;
        }
        String[] strArrSplit = str.split(",", -1);
        HashMap map = new HashMap(strArrSplit.length + 1, 1.0f);
        for (String str2 : strArrSplit) {
            String[] strArrSplit2 = str2.split(":", -1);
            if (strArrSplit2.length == 2) {
                String strTrim = strArrSplit2[0].trim();
                String strTrim2 = strArrSplit2[1].trim();
                if (strTrim2.length() > 0) {
                    map.put(strTrim, strTrim2);
                }
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public static Set<String> m(String str) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : str.split("[,\\s]+")) {
            if (!str2.isEmpty()) {
                linkedHashSet.add(str2);
            }
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public static String n(String str) {
        return l5.l("dd.", str);
    }

    public static Object o(Class cls, Object obj, String str) {
        if (str == null || str.trim().isEmpty()) {
            return obj;
        }
        try {
            return cls.getMethod("valueOf", String.class).invoke(null, str);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new NumberFormatException(e.toString());
        } catch (NumberFormatException e2) {
            throw e2;
        } catch (Throwable th) {
            throw new NumberFormatException(th.toString());
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Config{runtimeId='");
        sb.append(this.a);
        sb.append("', site='");
        sb.append(this.b);
        sb.append("', serviceName='");
        sb.append(this.c);
        sb.append("', traceEnabled=");
        sb.append(this.d);
        sb.append(", integrationsEnabled=");
        sb.append(this.e);
        sb.append(", writerType='");
        sb.append(this.f);
        sb.append("', agentHost='");
        sb.append(this.g);
        sb.append("', agentPort=");
        sb.append(this.h);
        sb.append(", agentUnixDomainSocket='");
        sb.append(this.i);
        sb.append("', prioritySamplingEnabled=");
        sb.append(this.j);
        sb.append(", traceResolverEnabled=");
        sb.append(this.k);
        sb.append(", serviceMapping=");
        sb.append(this.l);
        sb.append(", tags=");
        sb.append(this.m);
        sb.append(", spanTags=");
        sb.append(this.n);
        sb.append(", jmxTags=");
        sb.append(this.o);
        sb.append(", excludedClasses=");
        sb.append(this.p);
        sb.append(", headerTags=");
        sb.append(this.q);
        sb.append(", httpServerErrorStatuses=");
        sb.append(this.r);
        sb.append(", httpClientErrorStatuses=");
        sb.append(this.s);
        sb.append(", httpServerTagQueryString=");
        sb.append(this.t);
        sb.append(", httpClientTagQueryString=");
        sb.append(this.u);
        sb.append(", httpClientSplitByDomain=");
        sb.append(this.v);
        sb.append(", dbClientSplitByInstance=");
        sb.append(this.w);
        sb.append(", splitByTags=");
        sb.append(this.x);
        sb.append(", scopeDepthLimit=");
        sb.append(this.y);
        sb.append(", partialFlushMinSpans=");
        sb.append(this.z);
        sb.append(", runtimeContextFieldInjection=");
        sb.append(this.A);
        sb.append(", propagationStylesToExtract=");
        sb.append(this.B);
        sb.append(", propagationStylesToInject=");
        sb.append(this.C);
        sb.append(", jmxFetchEnabled=");
        sb.append(this.D);
        sb.append(", jmxFetchConfigDir='");
        sb.append(this.E);
        sb.append("', jmxFetchConfigs=");
        sb.append(this.F);
        sb.append(", jmxFetchMetricsConfigs=");
        sb.append(this.G);
        sb.append(", jmxFetchCheckPeriod=");
        sb.append(this.H);
        sb.append(", jmxFetchRefreshBeansPeriod=");
        sb.append(this.I);
        sb.append(", jmxFetchStatsdHost='");
        sb.append(this.J);
        sb.append("', jmxFetchStatsdPort=");
        sb.append(this.K);
        sb.append(", healthMetricsEnabled=");
        sb.append(this.L);
        sb.append(", healthMetricsStatsdHost='");
        sb.append(this.M);
        sb.append("', healthMetricsStatsdPort=");
        sb.append(this.N);
        sb.append(", logsInjectionEnabled=");
        sb.append(this.O);
        sb.append(", reportHostName=");
        sb.append(this.P);
        sb.append(", traceAnnotations='");
        sb.append(this.Q);
        sb.append("', traceMethods='");
        sb.append(this.R);
        sb.append("', traceExecutorsAll=");
        sb.append(this.S);
        sb.append(", traceExecutors=");
        sb.append(this.T);
        sb.append(", traceAnalyticsEnabled=");
        sb.append(this.U);
        sb.append(", traceSamplingServiceRules=");
        sb.append(this.V);
        sb.append(", traceSamplingOperationRules=");
        sb.append(this.W);
        sb.append(", traceSampleRate=");
        sb.append(this.X);
        sb.append(", traceRateLimit=");
        sb.append(this.Y);
        sb.append(", profilingEnabled=");
        sb.append(this.Z);
        sb.append(", profilingUrl='");
        sb.append(this.a0);
        sb.append("', profilingTags=");
        sb.append(this.b0);
        sb.append(", profilingStartDelay=");
        sb.append(this.c0);
        sb.append(", profilingStartForceFirst=");
        sb.append(this.d0);
        sb.append(", profilingUploadPeriod=");
        sb.append(this.e0);
        sb.append(", profilingTemplateOverrideFile='");
        sb.append(this.f0);
        sb.append("', profilingUploadTimeout=");
        sb.append(this.g0);
        sb.append(", profilingUploadCompression='");
        sb.append(this.h0);
        sb.append("', profilingProxyHost='");
        sb.append(this.i0);
        sb.append("', profilingProxyPort=");
        sb.append(this.j0);
        sb.append(", profilingProxyUsername='");
        sb.append(this.k0);
        sb.append("', profilingProxyPassword='");
        sb.append(this.l0);
        sb.append("', profilingExceptionSampleLimit=");
        sb.append(this.m0);
        sb.append(", profilingExceptionHistogramTopItems=");
        sb.append(this.n0);
        sb.append(", profilingExceptionHistogramMaxCollectionSize=");
        return k6.h(sb, this.o0, '}');
    }

    public un2() {
        Object objO;
        Properties properties = new Properties();
        String property = System.getProperty(n("trace.config"));
        property = property == null ? System.getenv(p0.matcher(n("trace.config").toUpperCase(Locale.US)).replaceAll("_")) : property;
        if (property != null) {
            File file = new File(property.replaceFirst("^~", System.getProperty("user.home")));
            if (file.exists()) {
                try {
                    FileReader fileReader = new FileReader(file);
                    try {
                        properties.load(fileReader);
                        fileReader.close();
                    } catch (Throwable th) {
                        try {
                            fileReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (FileNotFoundException | IOException unused) {
                }
            }
        }
        u0 = properties;
        this.a = UUID.randomUUID().toString();
        this.b = i("site", "datadoghq.com");
        this.c = i("service", i("service.name", "unnamed-java-app"));
        Boolean bool = Boolean.TRUE;
        this.d = b("trace.enabled", bool).booleanValue();
        this.e = b("integrations.enabled", bool).booleanValue();
        this.f = i("writer.type", "DDAgentWriter");
        this.g = i("agent.host", "localhost");
        this.h = c(c(8126, "agent.port"), "trace.agent.port").intValue();
        this.i = i("trace.agent.unix.domain.socket", null);
        this.j = b("priority.sampling", bool).booleanValue();
        this.k = b("trace.resolver.enabled", bool).booleanValue();
        this.l = d("service.mapping");
        HashMap map = new HashMap(d("trace.global.tags"));
        map.putAll(d("tags"));
        String[] strArr = {"env", "version"};
        HashMap map2 = new HashMap(map);
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            String strI = i(str, null);
            if (strI != null) {
                map2.put(str, strI);
            }
        }
        this.m = Collections.unmodifiableMap(map2);
        this.n = d("trace.span.tags");
        this.o = d("trace.jmx.tags");
        this.p = k(i("trace.classes.exclude", null));
        this.q = d("trace.header.tags");
        String strI2 = i("http.server.error.statuses", null);
        Set<Integer> setJ = q0;
        if (strI2 != null) {
            try {
                setJ = j(strI2);
            } catch (NumberFormatException unused2) {
            }
        }
        this.r = setJ;
        String strI3 = i("http.client.error.statuses", null);
        Set<Integer> setJ2 = r0;
        if (strI3 != null) {
            try {
                setJ2 = j(strI3);
            } catch (NumberFormatException unused3) {
            }
        }
        this.s = setJ2;
        Boolean bool2 = Boolean.FALSE;
        this.t = b("http.server.tag.query-string", bool2).booleanValue();
        this.u = b("http.client.tag.query-string", bool2).booleanValue();
        this.v = b("trace.http.client.split-by-domain", bool2).booleanValue();
        this.w = b("trace.db.client.split-by-instance", bool2).booleanValue();
        this.x = Collections.unmodifiableSet(new LinkedHashSet(k(i("trace.split-by-tags", ""))));
        this.y = c(100, "trace.scope.depth.limit");
        this.z = c(1000, "trace.partial.flush.min.spans");
        Boolean bool3 = Boolean.TRUE;
        this.A = b("trace.runtime.context.field.injection", bool3).booleanValue();
        String str2 = s0;
        Set<a> setA = a(m(i("propagation.style.extract", str2)));
        this.B = setA.isEmpty() ? a(m(str2)) : setA;
        String str3 = t0;
        Set<a> setA2 = a(m(i("propagation.style.inject", str3)));
        this.C = setA2.isEmpty() ? a(m(str3)) : setA2;
        this.D = b("jmxfetch.enabled", bool3).booleanValue();
        this.E = i("jmxfetch.config.dir", null);
        this.F = k(i("jmxfetch.config", null));
        this.G = k(i("jmxfetch.metrics-configs", null));
        this.H = c(null, "jmxfetch.check-period");
        this.I = c(null, "jmxfetch.refresh-beans-period");
        this.J = i("jmxfetch.statsd.host", null);
        this.K = c(8125, "jmxfetch.statsd.port");
        this.L = b("trace.health.metrics.enabled", bool2).booleanValue();
        this.M = i("trace.health.metrics.statsd.host", null);
        this.N = c(null, "trace.health.metrics.statsd.port");
        this.O = b("logs.injection", bool2).booleanValue();
        this.P = b("trace.report-hostname", bool2).booleanValue();
        this.Q = i("trace.annotations", null);
        this.R = i("trace.methods", null);
        this.S = b("trace.executors.all", bool2).booleanValue();
        this.T = k(i("trace.executors", ""));
        this.U = b("trace.analytics.enabled", bool2).booleanValue();
        this.V = d("trace.sampling.service.rules");
        this.W = d("trace.sampling.operation.rules");
        try {
            objO = o(Double.class, null, i("trace.sample.rate", null));
        } catch (NumberFormatException unused4) {
            objO = null;
        }
        this.X = (Double) objO;
        Object objValueOf = Double.valueOf(100.0d);
        try {
            objValueOf = o(Double.class, objValueOf, i("trace.rate.limit", null));
        } catch (NumberFormatException unused5) {
        }
        this.Y = (Double) objValueOf;
        this.Z = b("profiling.enabled", bool2).booleanValue();
        this.a0 = i("profiling.url", null);
        this.b0 = d("profiling.tags");
        this.c0 = c(10, "profiling.start-delay").intValue();
        this.d0 = b("profiling.experimental.start-force-first", bool2).booleanValue();
        this.e0 = c(60, "profiling.upload.period").intValue();
        this.f0 = i("profiling.jfr-template-override-file", null);
        this.g0 = c(30, "profiling.upload.timeout").intValue();
        this.h0 = i("profiling.upload.compression", "on");
        this.i0 = i("profiling.proxy.host", null);
        this.j0 = c(8080, "profiling.proxy.port").intValue();
        this.k0 = i("profiling.proxy.username", null);
        this.l0 = i("profiling.proxy.password", null);
        this.m0 = c(10000, "profiling.exception.sample.limit").intValue();
        this.n0 = c(50, "profiling.exception.histogram.top-items").intValue();
        this.o0 = c(10000, "profiling.exception.histogram.max-collection-size").intValue();
    }
}
