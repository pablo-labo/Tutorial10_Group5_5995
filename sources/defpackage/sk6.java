package defpackage;

import android.content.Context;
import com.infra.eventlogger.model.DeviceProperties;
import com.infra.eventlogger.model.EventPayload;
import com.infra.eventlogger.model.EventProperties;
import com.infra.eventlogger.model.avro.NullableString;
import defpackage.am6;
import defpackage.em6;
import defpackage.yk6;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class sk6 implements eke {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;
    public final long g;
    public final long h;
    public final long i;
    public final String j;
    public final long k;
    public final long l;
    public final String m;

    public static final class a extends mj8 implements Function1<y3b, j6g> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(y3b y3bVar) {
            y3b y3bVar2 = y3bVar;
            y3bVar2.getClass();
            y3bVar2.b("url", sk6.this.a);
            y3bVar2.b("method", sk6.this.b);
            y3bVar2.a(sk6.this.c, "requestTimestamp");
            y3bVar2.a(sk6.this.d, "requestHeaderLength");
            y3bVar2.a(sk6.this.e, "requestCookiesLength");
            String str = sk6.this.f;
            if (str != null) {
                y3bVar2.b("requestReferrer", str);
            }
            y3bVar2.a(sk6.this.g, "responseTimestamp");
            y3bVar2.a(sk6.this.h, "responseHeaderLength");
            y3bVar2.a(sk6.this.i, "responseContentLength");
            y3bVar2.b("responseContentType", sk6.this.j);
            y3bVar2.a(sk6.this.k, "responseSetCookiesLength");
            y3bVar2.a(sk6.this.l, "responseStatusCode");
            y3bVar2.b("message", sk6.this.m);
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function1<yk6, j6g> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(yk6 yk6Var) {
            NullableString nullableString;
            yk6 yk6Var2 = yk6Var;
            yk6Var2.getClass();
            yk6Var2.c = web.C(sk6.this.a);
            yk6Var2.d = web.C(sk6.this.b);
            am6.a aVar = am6.Companion;
            tk6 tk6Var = new tk6(sk6.this);
            aVar.getClass();
            am6 am6Var = new am6();
            tk6Var.invoke(am6Var);
            Long l = am6Var.a;
            if (l == null) {
                r6.g("Required value was null.");
                return null;
            }
            long jLongValue = l.longValue();
            Long l2 = am6Var.b;
            if (l2 == null) {
                r6.g("Required value was null.");
                return null;
            }
            long jLongValue2 = l2.longValue();
            Long l3 = am6Var.c;
            if (l3 == null) {
                r6.g("Required value was null.");
                return null;
            }
            long jLongValue3 = l3.longValue();
            if (am6Var.d == null) {
                nullableString = null;
            } else {
                String str = am6Var.d;
                str.getClass();
                nullableString = new NullableString(str);
            }
            yk6Var2.e = new EventPayload.HttpErrorEvent.HttpRequestDebug(jLongValue, jLongValue2, jLongValue3, nullableString, null, null);
            em6.a aVar2 = em6.Companion;
            uk6 uk6Var = new uk6(sk6.this);
            aVar2.getClass();
            em6 em6Var = new em6();
            uk6Var.invoke(em6Var);
            Long l4 = em6Var.a;
            if (l4 == null) {
                r6.g("Required value was null.");
                return null;
            }
            long jLongValue4 = l4.longValue();
            Long l5 = em6Var.b;
            if (l5 == null) {
                r6.g("Required value was null.");
                return null;
            }
            long jLongValue5 = l5.longValue();
            Long l6 = em6Var.c;
            if (l6 == null) {
                r6.g("Required value was null.");
                return null;
            }
            long jLongValue6 = l6.longValue();
            String str2 = em6Var.d;
            if (str2 == null) {
                r6.g("Required value was null.");
                return null;
            }
            Long l7 = em6Var.e;
            if (l7 == null) {
                r6.g("Required value was null.");
                return null;
            }
            long jLongValue7 = l7.longValue();
            Long l8 = em6Var.f;
            if (l8 == null) {
                r6.g("Required value was null.");
                return null;
            }
            yk6Var2.f = new EventPayload.HttpErrorEvent.HttpResponseDebug(jLongValue4, jLongValue5, jLongValue6, str2, jLongValue7, l8.longValue(), null, null);
            yk6Var2.g = web.C(sk6.this.m);
            return j6g.a;
        }
    }

    public sk6(String str, String str2, long j, long j2, long j3, String str3, long j4, long j5, long j6, String str4, long j7, long j8, String str5) {
        str5.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = str3;
        this.g = j4;
        this.h = j5;
        this.i = j6;
        this.j = str4;
        this.k = j7;
        this.l = j8;
        this.m = str5;
    }

    @Override // defpackage.eke
    public final e5g a(gz4 gz4Var) {
        gz4Var.getClass();
        return gz4Var.a("http_error", new a());
    }

    @Override // defpackage.eke
    public final void b(r87 r87Var) {
        r87Var.getClass();
        b bVar = new b();
        hz4 hz4Var = r87Var.c;
        if (hz4Var == null) {
            r6.g("Required value was null.");
            return;
        }
        yk6.a aVar = yk6.Companion;
        Context context = r87Var.a;
        aVar.getClass();
        context.getClass();
        xk6 xk6Var = new xk6(hz4Var, context);
        yk6 yk6Var = new yk6();
        xk6Var.invoke(yk6Var);
        bVar.invoke(yk6Var);
        DeviceProperties deviceProperties = yk6Var.a;
        if (deviceProperties == null) {
            r6.g("Required value was null.");
            return;
        }
        EventProperties eventProperties = yk6Var.b;
        if (eventProperties == null) {
            r6.g("Required value was null.");
            return;
        }
        String str = yk6Var.c;
        if (str == null) {
            r6.g("Required value was null.");
            return;
        }
        String str2 = yk6Var.d;
        if (str2 == null) {
            r6.g("Required value was null.");
            return;
        }
        EventPayload.HttpErrorEvent.HttpRequestDebug httpRequestDebug = yk6Var.e;
        if (httpRequestDebug == null) {
            r6.g("Required value was null.");
            return;
        }
        EventPayload.HttpErrorEvent.NullableHttpResponseDebug nullableHttpResponseDebug = yk6Var.f == null ? null : new EventPayload.HttpErrorEvent.NullableHttpResponseDebug(yk6Var.f);
        String str3 = yk6Var.g;
        if (str3 != null) {
            r87Var.a(new EventPayload.HttpErrorEvent(new EventPayload.HttpErrorEvent.HttpErrorEventData(deviceProperties, eventProperties, str, str2, httpRequestDebug, nullableHttpResponseDebug, str3)));
        } else {
            r6.g("Required value was null.");
        }
    }
}
