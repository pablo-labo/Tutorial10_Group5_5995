package defpackage;

import defpackage.ao2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class vn2 {
    public static final vn2 y1;
    public final HashMap A;
    public final boolean A0;
    public final BitSet B;
    public final HashMap B0;
    public final BitSet C;
    public final boolean C0;
    public final boolean D;
    public final boolean D0;
    public final boolean E;
    public final boolean E0;
    public final boolean F;
    public final float F0;
    public final boolean G;
    public final long G0;
    public final LinkedHashMap H;
    public final String H0;
    public final LinkedHashMap I;
    public final boolean I0;
    public final boolean J;
    public final boolean J0;
    public final boolean K;
    public final boolean K0;
    public final boolean L;
    public final HashSet L0;
    public final boolean M;
    public final boolean M0;
    public final boolean N;
    public final boolean N0;
    public final boolean O;
    public final HashSet O0;
    public final HashSet P;
    public final HashSet P0;
    public final int Q;
    public final boolean Q0;
    public final boolean R;
    public final HashSet R0;
    public final boolean S;
    public final HashSet S0;
    public final int T;
    public final boolean T0;
    public final int U;
    public final boolean U0;
    public final boolean V;
    public final boolean V0;
    public final Set<u3c> W;
    public final boolean W0;
    public final Set<u3c> X;
    public final boolean X0;
    public final Set<npf> Y;
    public final boolean Y0;
    public final Set<npf> Z;
    public final int Z0;
    public final og7 a;
    public final boolean a0;
    public final boolean a1;
    public final boolean b;
    public final int b0;
    public final boolean b1;
    public final String c;
    public final boolean c0;
    public final boolean c1;
    public final String d;
    public final boolean d0;
    public final boolean d1;
    public final String e;
    public final boolean e0;
    public final String e1;
    public final String f;
    public final boolean f0;
    public final kr6 f1;
    public final boolean g;
    public final boolean g0;
    public final boolean g1;
    public final String h;
    public final int h0;
    public final HashSet h1;
    public final boolean i;
    public final int i0;
    public final HashSet i1;
    public final boolean j;
    public final boolean j0;
    public final BitSet j1;
    public final String k;
    public final boolean k0;
    public final BitSet k1;
    public final String l;
    public final HashMap l0;
    public final boolean l1;
    public final int m;
    public final HashMap m0;
    public final List<String> m1;
    public final int n;
    public final int n0;
    public final List<String> n1;
    public final HashSet o;
    public final boolean o0;
    public final ao2 o1;
    public final boolean p;
    public final HashMap p0;
    public final boolean p1;
    public final boolean q;
    public final int q0;
    public final long q1;
    public final int r;
    public final boolean r0;
    public final boolean r1;
    public final boolean s;
    public final int s0;
    public final boolean s1;
    public final HashMap t;
    public final int t0;
    public final boolean t1;
    public final boolean u;
    public final String u0;
    public final boolean u1;
    public final HashMap v;
    public final int v0;
    public final boolean v1;
    public final Map<String, String> w;
    public final int w0;
    public final float w1;
    public final HashMap x;
    public final int x0;
    public final boolean x1;
    public final HashMap y;
    public final int y0;
    public final Map<String, String> z;
    public final boolean z0;

    public static class a {
        public static final String a;

        static {
            String hostName;
            vn2 vn2Var = vn2.y1;
            String line = System.getenv("HOSTNAME");
            if (line != null) {
                wn2.b.a("HOSTNAME", 1, line);
            }
            if (line == null || line.isEmpty()) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("hostname").getInputStream()));
                    try {
                        line = bufferedReader.readLine();
                        bufferedReader.close();
                    } finally {
                    }
                } catch (Throwable unused) {
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
            a = hostName;
        }
    }

    public static class b {
        public static final String a = UUID.randomUUID().toString();
    }

    static {
        Pattern.compile(":");
        y1 = new vn2(ao2.a.a, og7.z);
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0603  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public vn2(defpackage.ao2 r14, defpackage.og7 r15) {
        /*
            Method dump skipped, instruction units count: 2352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vn2.<init>(ao2, og7):void");
    }

    public static Set b(boolean z) {
        return Collections.unmodifiableSet(new LinkedHashSet());
    }

    public final boolean a(String... strArr) {
        return this.o1.k(Arrays.asList(strArr), "", ".propagation.enabled", true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Config{instrumenterConfig=");
        sb.append(this.a);
        sb.append(", runtimeId='");
        sb.append(this.b ? b.a : "");
        sb.append("', runtimeVersion='");
        sb.append(this.c);
        sb.append(", site='");
        sb.append(this.d);
        sb.append("', hostName='");
        sb.append(a.a);
        sb.append("', serviceName='");
        sb.append(this.e);
        sb.append("', serviceNameSetByUser=false, rootContextServiceName=");
        sb.append(this.f);
        sb.append(", integrationSynapseLegacyOperationName=");
        sb.append(this.g);
        sb.append(", writerType='");
        sb.append(this.h);
        sb.append("', agentConfiguredUsingDefault=");
        sb.append(this.j);
        sb.append(", agentUrl='");
        sb.append(this.k);
        sb.append("', agentHost='");
        sb.append(this.l);
        sb.append("', agentPort=");
        sb.append(this.m);
        sb.append("', agentTimeout=");
        sb.append(this.n);
        sb.append(", noProxyHosts=");
        sb.append(this.o);
        sb.append(", prioritySamplingEnabled=");
        sb.append(this.p);
        sb.append(", prioritySamplingForce='null', traceResolverEnabled=");
        sb.append(this.q);
        sb.append(", serviceMapping=");
        sb.append(this.v);
        sb.append(", tags=");
        sb.append(this.w);
        sb.append(", spanTags=");
        sb.append(this.x);
        sb.append(", requestHeaderTags=");
        sb.append(this.y);
        sb.append(", responseHeaderTags=");
        sb.append(this.z);
        sb.append(", baggageMapping=");
        sb.append(this.A);
        sb.append(", httpServerErrorStatuses=");
        sb.append(this.B);
        sb.append(", httpClientErrorStatuses=");
        sb.append(this.C);
        sb.append(", httpServerTagQueryString=");
        sb.append(this.D);
        sb.append(", httpServerRawQueryString=");
        sb.append(this.E);
        sb.append(", httpServerRawResource=");
        sb.append(this.F);
        sb.append(", httpServerRouteBasedNaming=");
        sb.append(this.G);
        sb.append(", httpServerPathResourceNameMapping=");
        sb.append(this.H);
        sb.append(", httpClientPathResourceNameMapping=");
        sb.append(this.I);
        sb.append(", httpClientTagQueryString=");
        sb.append(this.K);
        sb.append(", httpClientSplitByDomain=");
        sb.append(this.L);
        sb.append(", httpResourceRemoveTrailingSlash");
        sb.append(this.J);
        sb.append(", dbClientSplitByInstance=");
        sb.append(this.M);
        sb.append(", dbClientSplitByInstanceTypeSuffix=");
        sb.append(this.N);
        sb.append(", dbClientSplitByHost=");
        sb.append(this.O);
        sb.append(", DBMPropagationMode=");
        sb.append(this.H0);
        sb.append(", splitByTags=");
        sb.append(this.P);
        sb.append(", scopeDepthLimit=");
        sb.append(this.Q);
        sb.append(", scopeStrictMode=");
        sb.append(this.R);
        sb.append(", scopeInheritAsyncPropagation=");
        sb.append(this.S);
        sb.append(", scopeIterationKeepAlive=");
        sb.append(this.T);
        sb.append(", partialFlushMinSpans=");
        sb.append(this.U);
        sb.append(", traceStrictWritesEnabled=");
        sb.append(this.V);
        sb.append(", tracePropagationStylesToExtract=");
        sb.append(this.Y);
        sb.append(", tracePropagationStylesToInject=");
        sb.append(this.Z);
        sb.append(", tracePropagationExtractFirst=");
        sb.append(this.a0);
        sb.append(", clockSyncPeriod=");
        sb.append(this.b0);
        sb.append(", healthMetricsEnabled=");
        sb.append(this.d0);
        sb.append(", healthMetricsStatsdHost='null', healthMetricsStatsdPort=null, perfMetricsEnabled=");
        sb.append(this.e0);
        sb.append(", tracerMetricsEnabled=");
        sb.append(this.f0);
        sb.append(", tracerMetricsBufferingEnabled=");
        sb.append(this.g0);
        sb.append(", tracerMetricsMaxAggregates=");
        sb.append(this.h0);
        sb.append(", tracerMetricsMaxPending=");
        sb.append(this.i0);
        sb.append(", reportHostName=");
        sb.append(this.j0);
        sb.append(", traceAnalyticsEnabled=");
        sb.append(this.k0);
        sb.append(", traceSamplingServiceRules=");
        sb.append(this.l0);
        sb.append(", traceSamplingOperationRules=");
        sb.append(this.m0);
        sb.append(", traceSamplingJsonRules=null, traceSampleRate=null, traceRateLimit=");
        sb.append(this.n0);
        sb.append(", spanSamplingRules=null, spanSamplingRulesFile=null, profilingAgentless=");
        sb.append(this.o0);
        sb.append(", profilingUrl='null', profilingTags=");
        sb.append(this.p0);
        sb.append(", profilingStartDelay=");
        sb.append(this.q0);
        sb.append(", profilingStartForceFirst=");
        sb.append(this.r0);
        sb.append(", profilingUploadPeriod=");
        sb.append(this.s0);
        sb.append(", profilingTemplateOverrideFile='null', profilingUploadTimeout=");
        sb.append(this.t0);
        sb.append(", profilingUploadCompression='");
        sb.append(this.u0);
        sb.append("', profilingProxyHost='null', profilingProxyPort=");
        sb.append(this.v0);
        sb.append(", profilingProxyUsername='null', profilingProxyPassword=null, profilingExceptionSampleLimit=");
        sb.append(this.w0);
        sb.append(", profilingExceptionHistogramTopItems=");
        sb.append(this.x0);
        sb.append(", profilingExceptionHistogramMaxCollectionSize=");
        sb.append(this.y0);
        sb.append(", profilingExcludeAgentThreads=");
        sb.append(this.z0);
        sb.append(", crashTrackingTags=");
        sb.append(this.B0);
        sb.append(", crashTrackingAgentless=");
        sb.append(this.A0);
        sb.append(", remoteConfigEnabled=");
        sb.append(this.D0);
        sb.append(", remoteConfigUrl=null, remoteConfigPollIntervalSeconds=");
        sb.append(this.F0);
        sb.append(", remoteConfigMaxPayloadSize=");
        sb.append(this.G0);
        sb.append(", remoteConfigIntegrityCheckEnabled=");
        sb.append(this.E0);
        sb.append(", awsPropagationEnabled=");
        sb.append(this.I0);
        sb.append(", sqsPropagationEnabled=");
        sb.append(this.J0);
        sb.append(", kafkaClientPropagationEnabled=");
        sb.append(this.K0);
        sb.append(", kafkaClientPropagationDisabledTopics=");
        sb.append(this.L0);
        sb.append(", kafkaClientBase64DecodingEnabled=");
        sb.append(this.M0);
        sb.append(", jmsPropagationEnabled=");
        sb.append(this.N0);
        sb.append(", jmsPropagationDisabledTopics=");
        sb.append(this.O0);
        sb.append(", jmsPropagationDisabledQueues=");
        sb.append(this.P0);
        sb.append(", rabbitPropagationEnabled=");
        sb.append(this.Q0);
        sb.append(", rabbitPropagationDisabledQueues=");
        sb.append(this.R0);
        sb.append(", rabbitPropagationDisabledExchanges=");
        sb.append(this.S0);
        sb.append(", messageBrokerSplitByDestination=");
        sb.append(this.T0);
        sb.append(", hystrixTagsEnabled=");
        sb.append(this.U0);
        sb.append(", hystrixMeasuredEnabled=");
        sb.append(this.V0);
        sb.append(", igniteCacheIncludeKeys=");
        sb.append(this.W0);
        sb.append(", servletPrincipalEnabled=");
        sb.append(this.X0);
        sb.append(", servletAsyncTimeoutError=");
        sb.append(this.Y0);
        sb.append(", datadogTagsLimit=");
        sb.append(this.Z0);
        sb.append(", traceAgentV05Enabled=");
        sb.append(this.a1);
        sb.append(", debugEnabled=");
        sb.append(this.b1);
        sb.append(", triageEnabled=");
        sb.append(this.c1);
        sb.append(", startLogsEnabled=");
        sb.append(this.d1);
        sb.append(", configFile='");
        sb.append(this.e1);
        sb.append("', idGenerationStrategy=");
        sb.append(this.f1);
        sb.append(", trace128bitTraceIdGenerationEnabled=");
        sb.append(this.g1);
        sb.append(", grpcIgnoredInboundMethods=");
        sb.append(this.h1);
        sb.append(", grpcIgnoredOutboundMethods=");
        sb.append(this.i1);
        sb.append(", grpcServerErrorStatuses=");
        sb.append(this.j1);
        sb.append(", grpcClientErrorStatuses=");
        sb.append(this.k1);
        sb.append(", clientIpEnabled=");
        sb.append(this.C0);
        sb.append(", longRunningTraceEnabled=");
        sb.append(this.p1);
        sb.append(", longRunningTraceFlushInterval=");
        sb.append(this.q1);
        sb.append(", elasticsearchBodyEnabled=");
        sb.append(this.r1);
        sb.append(", elasticsearchParamsEnabled=");
        sb.append(this.s1);
        sb.append(", elasticsearchBodyAndParamsEnabled=");
        sb.append(this.t1);
        sb.append(", traceFlushInterval=");
        sb.append(this.w1);
        sb.append(", injectBaggageAsTagsEnabled=");
        sb.append(this.i);
        sb.append(", logsInjectionEnabled=");
        sb.append(this.c0);
        sb.append(", sparkTaskHistogramEnabled=");
        sb.append(this.u1);
        sb.append(", jaxRsExceptionAsErrorsEnabled=");
        sb.append(this.v1);
        sb.append(", peerServiceDefaultsEnabled=");
        sb.append(this.s);
        sb.append(", peerServiceComponentOverrides=");
        sb.append(this.t);
        sb.append(", removeIntegrationServiceNamesEnabled=");
        sb.append(this.u);
        sb.append(", spanAttributeSchemaVersion=");
        sb.append(this.r);
        sb.append(", telemetryDebugRequestsEnabled=");
        sb.append(this.x1);
        sb.append(", telemetryMetricsEnabled=");
        return m6.i(sb, this.l1, '}');
    }
}
