package defpackage;

import android.content.Context;
import com.datadog.android.log.LogAttributes;
import com.infra.eventlogger.model.DeviceProperties;
import com.infra.eventlogger.model.EventPayload;
import com.infra.eventlogger.model.EventProperties;
import com.infra.eventlogger.model.avro.NullableString;
import defpackage.b55;
import defpackage.cwa;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class xva implements eke {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    public static final class a extends mj8 implements Function1<y3b, j6g> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(y3b y3bVar) {
            y3b y3bVar2 = y3bVar;
            y3bVar2.getClass();
            y3bVar2.b("url", xva.this.a);
            xva.this.getClass();
            y3bVar2.b("from", "");
            String str = xva.this.b;
            if (str == null) {
                str = "";
            }
            y3bVar2.b("affiliateKey", str);
            String str2 = xva.this.c;
            if (str2 == null) {
                str2 = "";
            }
            y3bVar2.b("keywords", str2);
            String str3 = xva.this.d;
            if (str3 == null) {
                str3 = "";
            }
            y3bVar2.b("newCookieValue", str3);
            String str4 = xva.this.e;
            if (str4 == null) {
                str4 = "";
            }
            y3bVar2.b("referrer", str4);
            String str5 = xva.this.f;
            if (str5 == null) {
                str5 = "";
            }
            y3bVar2.b(LogAttributes.HOST, str5);
            String str6 = xva.this.g;
            if (str6 == null) {
                str6 = "";
            }
            y3bVar2.b("refType", str6);
            String str7 = xva.this.h;
            if (str7 == null) {
                str7 = "";
            }
            y3bVar2.b("refTime", str7);
            String str8 = xva.this.i;
            if (str8 == null) {
                str8 = "";
            }
            y3bVar2.b("reqAffiliateKey", str8);
            String str9 = xva.this.j;
            if (str9 == null) {
                str9 = "";
            }
            y3bVar2.b("reqKeywords", str9);
            String str10 = xva.this.k;
            if (str10 == null) {
                str10 = "";
            }
            y3bVar2.b("reqRefType", str10);
            xva.this.getClass();
            y3bVar2.b("from", "");
            xva.this.getClass();
            y3bVar2.b("fbclid", "");
            xva.this.getClass();
            y3bVar2.b("gclid", "");
            xva.this.getClass();
            y3bVar2.b("utm_source", "");
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function1<cwa, j6g> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(cwa cwaVar) {
            cwa cwaVar2 = cwaVar;
            cwaVar2.getClass();
            cwaVar2.c = web.C(xva.this.a);
            b55.a aVar = b55.Companion;
            yva yvaVar = new yva(xva.this);
            aVar.getClass();
            b55 b55Var = new b55();
            yvaVar.invoke(b55Var);
            String str = b55Var.a;
            NullableString nullableString = str == null ? null : new NullableString(str);
            String str2 = b55Var.b;
            NullableString nullableString2 = str2 == null ? null : new NullableString(str2);
            String str3 = b55Var.c;
            NullableString nullableString3 = str3 == null ? null : new NullableString(str3);
            String str4 = b55Var.d;
            NullableString nullableString4 = str4 == null ? null : new NullableString(str4);
            String str5 = b55Var.e;
            NullableString nullableString5 = str5 == null ? null : new NullableString(str5);
            String str6 = b55Var.f;
            NullableString nullableString6 = str6 == null ? null : new NullableString(str6);
            String str7 = b55Var.g;
            NullableString nullableString7 = str7 == null ? null : new NullableString(str7);
            String str8 = b55Var.h;
            NullableString nullableString8 = str8 == null ? null : new NullableString(str8);
            String str9 = b55Var.i;
            NullableString nullableString9 = str9 == null ? null : new NullableString(str9);
            String str10 = b55Var.j;
            cwaVar2.d = new EventPayload.ReferralParams(nullableString, nullableString2, nullableString3, nullableString4, nullableString5, nullableString6, nullableString7, nullableString8, nullableString9, str10 == null ? null : new NullableString(str10), null, null, null, null);
            return j6g.a;
        }
    }

    public xva(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
    }

    @Override // defpackage.eke
    public final e5g a(gz4 gz4Var) {
        gz4Var.getClass();
        return gz4Var.a("organic_app_open", new a());
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
        cwa.a aVar = cwa.Companion;
        Context context = r87Var.a;
        aVar.getClass();
        context.getClass();
        bwa bwaVar = new bwa(hz4Var, context);
        cwa cwaVar = new cwa();
        bwaVar.invoke(cwaVar);
        bVar.invoke(cwaVar);
        DeviceProperties deviceProperties = cwaVar.a;
        if (deviceProperties == null) {
            r6.g("Required value was null.");
            return;
        }
        EventProperties eventProperties = cwaVar.b;
        if (eventProperties == null) {
            r6.g("Required value was null.");
            return;
        }
        String str = cwaVar.c;
        if (str == null) {
            r6.g("Required value was null.");
            return;
        }
        EventPayload.ReferralParams referralParams = cwaVar.d;
        if (referralParams != null) {
            r87Var.a(new EventPayload.OrganicAppOpenEvent(new EventPayload.OrganicAppOpenEvent.OrganicAppOpenEventData(deviceProperties, eventProperties, str, referralParams)));
        } else {
            r6.g("Required value was null.");
        }
    }
}
