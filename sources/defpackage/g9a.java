package defpackage;

import android.content.Context;
import com.infra.eventlogger.model.DeviceProperties;
import com.infra.eventlogger.model.EventPayload;
import com.infra.eventlogger.model.EventProperties;
import com.infra.eventlogger.model.avro.NullableString;
import defpackage.m9a;
import defpackage.o9a;
import defpackage.p9a;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class g9a implements eke {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final String e;
    public final long f;
    public final long g;
    public final long h;
    public final String i;
    public final long j;
    public final long k;
    public final long l;
    public final String m;
    public final String n;
    public final String o;

    public static final class a extends mj8 implements Function1<y3b, j6g> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(y3b y3bVar) {
            y3b y3bVar2 = y3bVar;
            y3bVar2.getClass();
            y3bVar2.b("url", g9a.this.a);
            y3bVar2.b("method", g9a.this.b);
            y3bVar2.a(g9a.this.c, "requestTimestamp");
            y3bVar2.a(g9a.this.d, "requestHeaderLength");
            g9a.this.getClass();
            y3bVar2.a(0L, "requestCookiesLength");
            String str = g9a.this.e;
            if (str != null) {
                y3bVar2.b("requestReferrer", str);
            }
            y3bVar2.a(g9a.this.f, "responseTimestamp");
            y3bVar2.a(g9a.this.g, "responseHeaderLength");
            y3bVar2.a(g9a.this.h, "responseContentLength");
            y3bVar2.b("responseContentType", g9a.this.i);
            y3bVar2.a(g9a.this.j, "responseSetCookiesLength");
            y3bVar2.a(g9a.this.k, "responseStatusCode");
            y3bVar2.a(g9a.this.l, "responseLatencyMs");
            y3bVar2.b("message", g9a.this.m);
            String str2 = g9a.this.n;
            if (str2 != null) {
                y3bVar2.b("urlType", str2);
            }
            y3bVar2.b("graphQLOperation", g9a.this.o);
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function1<m9a, j6g> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(m9a m9aVar) {
            NullableString nullableString;
            m9a m9aVar2 = m9aVar;
            m9aVar2.getClass();
            m9aVar2.c = web.C(g9a.this.a);
            m9aVar2.d = web.C(g9a.this.b);
            o9a.a aVar = o9a.Companion;
            h9a h9aVar = new h9a(g9a.this);
            aVar.getClass();
            o9a o9aVar = new o9a();
            h9aVar.invoke(o9aVar);
            Long l = o9aVar.a;
            if (l == null) {
                r6.g("Required value was null.");
                return null;
            }
            long jLongValue = l.longValue();
            Long l2 = o9aVar.b;
            if (l2 == null) {
                r6.g("Required value was null.");
                return null;
            }
            long jLongValue2 = l2.longValue();
            Long l3 = o9aVar.c;
            if (l3 == null) {
                r6.g("Required value was null.");
                return null;
            }
            long jLongValue3 = l3.longValue();
            if (o9aVar.d == null) {
                nullableString = null;
            } else {
                String str = o9aVar.d;
                str.getClass();
                nullableString = new NullableString(str);
            }
            m9aVar2.e = new EventPayload.NativeHttpMetricsEvent.NativeHttpRequestDebug(jLongValue, jLongValue2, jLongValue3, nullableString, null, null);
            p9a.a aVar2 = p9a.Companion;
            i9a i9aVar = new i9a(g9a.this);
            aVar2.getClass();
            p9a p9aVar = new p9a();
            i9aVar.invoke(p9aVar);
            Long l4 = p9aVar.a;
            if (l4 == null) {
                r6.g("Required value was null.");
                return null;
            }
            long jLongValue4 = l4.longValue();
            Long l5 = p9aVar.b;
            if (l5 == null) {
                r6.g("Required value was null.");
                return null;
            }
            long jLongValue5 = l5.longValue();
            Long l6 = p9aVar.c;
            if (l6 == null) {
                r6.g("Required value was null.");
                return null;
            }
            long jLongValue6 = l6.longValue();
            String str2 = p9aVar.d;
            if (str2 == null) {
                r6.g("Required value was null.");
                return null;
            }
            Long l7 = p9aVar.e;
            if (l7 == null) {
                r6.g("Required value was null.");
                return null;
            }
            long jLongValue7 = l7.longValue();
            Long l8 = p9aVar.f;
            if (l8 == null) {
                r6.g("Required value was null.");
                return null;
            }
            String strC = null;
            m9aVar2.f = new EventPayload.NativeHttpMetricsEvent.NativeHttpResponseDebug(jLongValue4, jLongValue5, jLongValue6, str2, jLongValue7, l8.longValue(), null, null);
            m9aVar2.g = Long.valueOf(g9a.this.l);
            m9aVar2.h = web.C(g9a.this.m);
            String str3 = g9a.this.n;
            if (str3 != null) {
                strC = web.C(str3);
            }
            m9aVar2.i = strC;
            m9aVar2.j = web.C(g9a.this.o);
            return j6g.a;
        }
    }

    public g9a(String str, String str2, long j, long j2, String str3, long j3, long j4, long j5, String str4, long j6, long j7, long j8, String str5, String str6, String str7) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = str3;
        this.f = j3;
        this.g = j4;
        this.h = j5;
        this.i = str4;
        this.j = j6;
        this.k = j7;
        this.l = j8;
        this.m = str5;
        this.n = str6;
        this.o = str7;
    }

    @Override // defpackage.eke
    public final e5g a(gz4 gz4Var) {
        gz4Var.getClass();
        return gz4Var.a("jsma_native_http_metrics", new a());
    }

    @Override // defpackage.eke
    public final void b(r87 r87Var) {
        NullableString nullableString;
        r87Var.getClass();
        b bVar = new b();
        hz4 hz4Var = r87Var.c;
        if (hz4Var == null) {
            r6.g("Required value was null.");
            return;
        }
        m9a.a aVar = m9a.Companion;
        Context context = r87Var.a;
        aVar.getClass();
        context.getClass();
        l9a l9aVar = new l9a(hz4Var, context);
        m9a m9aVar = new m9a();
        l9aVar.invoke(m9aVar);
        bVar.invoke(m9aVar);
        DeviceProperties deviceProperties = m9aVar.a;
        if (deviceProperties == null) {
            r6.g("Required value was null.");
            return;
        }
        EventProperties eventProperties = m9aVar.b;
        if (eventProperties == null) {
            r6.g("Required value was null.");
            return;
        }
        String str = m9aVar.c;
        if (str == null) {
            r6.g("Required value was null.");
            return;
        }
        String str2 = m9aVar.d;
        if (str2 == null) {
            r6.g("Required value was null.");
            return;
        }
        EventPayload.NativeHttpMetricsEvent.NativeHttpRequestDebug nativeHttpRequestDebug = m9aVar.e;
        if (nativeHttpRequestDebug == null) {
            r6.g("Required value was null.");
            return;
        }
        NullableString nullableString2 = null;
        EventPayload.NativeHttpMetricsEvent.NullableNativeHttpResponseDebug nullableNativeHttpResponseDebug = m9aVar.f == null ? null : new EventPayload.NativeHttpMetricsEvent.NullableNativeHttpResponseDebug(m9aVar.f);
        Long l = m9aVar.g;
        if (l == null) {
            r6.g("Required value was null.");
            return;
        }
        long jLongValue = l.longValue();
        String str3 = m9aVar.h;
        if (str3 == null) {
            r6.g("Required value was null.");
            return;
        }
        if (m9aVar.i == null) {
            nullableString = null;
        } else {
            String str4 = m9aVar.i;
            str4.getClass();
            nullableString = new NullableString(str4);
        }
        if (m9aVar.j != null) {
            String str5 = m9aVar.j;
            str5.getClass();
            nullableString2 = new NullableString(str5);
        }
        r87Var.a(new EventPayload.NativeHttpMetricsEvent(new EventPayload.NativeHttpMetricsEvent.NativeHttpMetricsEventData(deviceProperties, eventProperties, str, str2, nativeHttpRequestDebug, nullableNativeHttpResponseDebug, jLongValue, str3, nullableString, nullableString2)));
    }
}
