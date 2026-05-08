package com.indeed.android.jobsearch.deeplink;

import android.net.Uri;
import android.os.Bundle;
import defpackage.a55;
import defpackage.cr8;
import defpackage.d2f;
import defpackage.dc;
import defpackage.fc2;
import defpackage.he;
import defpackage.htc;
import defpackage.ia;
import defpackage.is4;
import defpackage.jr;
import defpackage.kc9;
import defpackage.kr;
import defpackage.l6;
import defpackage.lx5;
import defpackage.me;
import defpackage.na0;
import defpackage.np7;
import defpackage.or;
import defpackage.pe0;
import defpackage.pq;
import defpackage.r98;
import defpackage.suc;
import defpackage.t92;
import defpackage.tx5;
import defpackage.u40;
import defpackage.w20;
import defpackage.wea;
import defpackage.wl7;
import defpackage.wve;
import defpackage.z3;
import defpackage.z92;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public final d2f a = new d2f(new jr(6));
    public final d2f b = new d2f(new kr(2));
    public final d2f c = new d2f(new fc2(1));
    public final tx5 d = new tx5();
    public a e;

    public static final class a {
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

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
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
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return wl7.b(this.a, aVar.a) && wl7.b(this.b, aVar.b) && wl7.b(this.c, aVar.c) && wl7.b(this.d, aVar.d) && wl7.b(this.e, aVar.e) && wl7.b(this.f, aVar.f) && wl7.b(this.g, aVar.g) && wl7.b(this.h, aVar.h) && wl7.b(this.i, aVar.i) && wl7.b(this.j, aVar.j);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.e;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.g;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.h;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.i;
            int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.j;
            return iHashCode9 + (str10 != null ? str10.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbF = u40.f("AttributionComputedParams(affiliateKey=", this.a, ", keywords=", this.b, ", newCookieValue=");
            ia.r(sbF, this.c, ", referrer=", this.d, ", host=");
            ia.r(sbF, this.e, ", refType=", this.f, ", refTime=");
            ia.r(sbF, this.g, ", reqAffiliateKey=", this.h, ", reqKeywords=");
            return z3.n(sbF, this.i, ", reqRefType=", this.j, ")");
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.jobsearch.deeplink.b$b, reason: collision with other inner class name */
    public static final class C0167b {
        public final String a;
        public final String b;
        public final String c;

        public C0167b(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0167b)) {
                return false;
            }
            C0167b c0167b = (C0167b) obj;
            return wl7.b(this.a, c0167b.a) && wl7.b(this.b, c0167b.b) && wl7.b(this.c, c0167b.c);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return l6.i(u40.f("AttributionInputParams(sid=", this.a, ", kw=", this.b, ", pub="), this.c, ")");
        }
    }

    public static final class c extends b {
        public final Uri f;
        public final Uri g;

        public c(Uri uri, Uri uri2) {
            uri.getClass();
            this.f = uri;
            this.g = uri2;
        }

        @Override // com.indeed.android.jobsearch.deeplink.b
        public final lx5 a() {
            String strI = wea.i(true, this.f);
            Uri uri = this.g;
            return this.d.c("link_click", strI, uri != null ? uri.toString() : null, new pq(this, 5));
        }

        @Override // com.indeed.android.jobsearch.deeplink.b
        public final Uri c() {
            return this.g;
        }

        @Override // com.indeed.android.jobsearch.deeplink.b
        public final Uri d() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return wl7.b(this.f, cVar.f) && wl7.b(this.g, cVar.g);
        }

        public final int hashCode() {
            int iHashCode = this.f.hashCode() * 31;
            Uri uri = this.g;
            return iHashCode + (uri == null ? 0 : uri.hashCode());
        }

        public final String toString() {
            return "LinkClick(uri=" + this.f + ", referrer=" + this.g + ")";
        }
    }

    public static final class d extends b {
        public final Uri f;
        public final Uri g;

        public d(Uri uri, Uri uri2) {
            this.f = uri;
            this.g = uri2;
        }

        @Override // com.indeed.android.jobsearch.deeplink.b
        public final lx5 a() {
            return tx5.d(this.d, "non_jsma_passport_verify_click", wea.i(true, this.f), null, 12);
        }

        @Override // com.indeed.android.jobsearch.deeplink.b
        public final Uri c() {
            return this.g;
        }

        @Override // com.indeed.android.jobsearch.deeplink.b
        public final Uri d() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return wl7.b(this.f, dVar.f) && wl7.b(this.g, dVar.g);
        }

        public final int hashCode() {
            int iHashCode = this.f.hashCode() * 31;
            Uri uri = this.g;
            return iHashCode + (uri == null ? 0 : uri.hashCode());
        }

        public final String toString() {
            return "NonJsmaPassportVerifyClick(uri=" + this.f + ", referrer=" + this.g + ")";
        }
    }

    public static final class e extends b {
        public final Uri f;
        public final String g;
        public final int h;
        public final Uri i = (Uri) this.a.getValue();

        public e(Uri uri, String str, int i) {
            this.f = uri;
            this.g = str;
            this.h = i;
        }

        @Override // com.indeed.android.jobsearch.deeplink.b
        public final lx5 a() {
            Uri uri = this.f;
            return tx5.d(this.d, "notification_click", uri != null ? wea.i(true, uri) : "", new or(this, 4), 4);
        }

        @Override // com.indeed.android.jobsearch.deeplink.b
        public final Uri c() {
            return this.i;
        }

        @Override // com.indeed.android.jobsearch.deeplink.b
        public final Uri d() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return wl7.b(this.f, eVar.f) && wl7.b(this.g, eVar.g) && this.h == eVar.h;
        }

        public final int hashCode() {
            Uri uri = this.f;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.g;
            return Integer.hashCode(this.h) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationClick(uri=");
            sb.append(this.f);
            sb.append(", cancelNotificationTag=");
            sb.append(this.g);
            sb.append(", cancelNotificationId=");
            return w20.k(sb, this.h, ")");
        }
    }

    public static final class f extends b {
        public static final f f;
        public static final Uri g;

        static {
            f fVar = new f();
            f = fVar;
            g = (Uri) fVar.c.getValue();
        }

        @Override // com.indeed.android.jobsearch.deeplink.b
        public final lx5 a() {
            return tx5.k(this.d, "recent-search-widget", "widgetShowHomepage", new he(4), 4);
        }

        @Override // com.indeed.android.jobsearch.deeplink.b
        public final Uri c() {
            return g;
        }

        @Override // com.indeed.android.jobsearch.deeplink.b
        public final /* bridge */ /* synthetic */ Uri d() {
            return null;
        }
    }

    public static final class g extends b {
        public final Uri f;
        public final Bundle g;
        public final Uri h = (Uri) this.c.getValue();

        public g(Uri uri, Bundle bundle) {
            this.f = uri;
            this.g = bundle;
        }

        @Override // com.indeed.android.jobsearch.deeplink.b
        public final lx5 a() {
            return tx5.k(this.d, "recent-search-widget", "widgetShowSerp", new pe0(this, 3), 4);
        }

        @Override // com.indeed.android.jobsearch.deeplink.b
        public final Uri c() {
            return this.h;
        }

        @Override // com.indeed.android.jobsearch.deeplink.b
        public final Uri d() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return wl7.b(this.f, gVar.f) && wl7.b(this.g, gVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + (this.f.hashCode() * 31);
        }

        public final String toString() {
            return "RecentSearchesAppWidgetItemClick(uri=" + this.f + ", extras=" + this.g + ")";
        }
    }

    public static final class h extends b {
        public static final h f;
        public static final Uri g;

        static {
            h hVar = new h();
            f = hVar;
            g = (Uri) hVar.b.getValue();
        }

        @Override // com.indeed.android.jobsearch.deeplink.b
        public final lx5 a() {
            return tx5.k(this.d, "job-feed-widget", "widgetShowHomepage", new dc(8), 4);
        }

        @Override // com.indeed.android.jobsearch.deeplink.b
        public final Uri c() {
            return g;
        }

        @Override // com.indeed.android.jobsearch.deeplink.b
        public final /* bridge */ /* synthetic */ Uri d() {
            return null;
        }
    }

    public static final class i extends b {
        public final Uri f;
        public final Bundle g;
        public final Uri h = (Uri) this.b.getValue();

        public i(Uri uri, Bundle bundle) {
            this.f = uri;
            this.g = bundle;
        }

        @Override // com.indeed.android.jobsearch.deeplink.b
        public final lx5 a() {
            return tx5.k(this.d, "job-feed-widget", "widgetShowViewJob", new na0(this, 6), 4);
        }

        @Override // com.indeed.android.jobsearch.deeplink.b
        public final Uri c() {
            return this.h;
        }

        @Override // com.indeed.android.jobsearch.deeplink.b
        public final Uri d() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return wl7.b(this.f, iVar.f) && wl7.b(this.g, iVar.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + (this.f.hashCode() * 31);
        }

        public final String toString() {
            return "RelevantJobsAppWidgetItemClick(uri=" + this.f + ", extras=" + this.g + ")";
        }
    }

    public static final class j extends b {
        public final Uri f;
        public final Uri g;

        public j(Uri uri, Uri uri2) {
            this.f = uri;
            this.g = uri2;
        }

        @Override // com.indeed.android.jobsearch.deeplink.b
        public final lx5 a() {
            return tx5.d(this.d, "storybook_deeplink", wea.i(true, this.f), null, 12);
        }

        @Override // com.indeed.android.jobsearch.deeplink.b
        public final Uri c() {
            return this.g;
        }

        @Override // com.indeed.android.jobsearch.deeplink.b
        public final Uri d() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return wl7.b(this.f, jVar.f) && wl7.b(this.g, jVar.g);
        }

        public final int hashCode() {
            int iHashCode = this.f.hashCode() * 31;
            Uri uri = this.g;
            return iHashCode + (uri == null ? 0 : uri.hashCode());
        }

        public final String toString() {
            return "StorybookClick(uri=" + this.f + ", referrer=" + this.g + ")";
        }
    }

    public static final class k extends b {
        public final Uri f;
        public final Uri g;

        public k(Uri uri, Uri uri2) {
            this.f = uri;
            this.g = uri2;
        }

        @Override // com.indeed.android.jobsearch.deeplink.b
        public final lx5 a() {
            return tx5.d(this.d, "view_job", wea.i(true, this.f), new me(this, 5), 4);
        }

        @Override // com.indeed.android.jobsearch.deeplink.b
        public final Uri c() {
            return this.g;
        }

        @Override // com.indeed.android.jobsearch.deeplink.b
        public final Uri d() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return wl7.b(this.f, kVar.f) && wl7.b(this.g, kVar.g);
        }

        public final int hashCode() {
            int iHashCode = this.f.hashCode() * 31;
            Uri uri = this.g;
            return iHashCode + (uri == null ? 0 : uri.hashCode());
        }

        public final String toString() {
            return "ViewJobClick(uri=" + this.f + ", referrer=" + this.g + ")";
        }
    }

    public abstract lx5 a();

    public final a55 b() {
        a55 a55Var;
        Set<String> queryParameterNames;
        try {
            a55.a aVar = new a55.a(a55.a, a55.b);
            boolean[] zArr = aVar.c;
            g.f[] fVarArr = aVar.b;
            String strValueOf = String.valueOf(d());
            g.f fVar = fVarArr[2];
            aVar.e = strValueOf;
            zArr[2] = true;
            suc.a aVar2 = new suc.a(suc.a, suc.b);
            boolean[] zArr2 = aVar2.c;
            g.f[] fVarArr2 = aVar2.b;
            a aVar3 = this.e;
            String str = aVar3 != null ? aVar3.a : null;
            htc.b(fVarArr2[0], str);
            aVar2.e = str;
            zArr2[0] = true;
            a aVar4 = this.e;
            String str2 = aVar4 != null ? aVar4.b : null;
            htc.b(fVarArr2[1], str2);
            aVar2.f = str2;
            zArr2[1] = true;
            a aVar5 = this.e;
            String str3 = aVar5 != null ? aVar5.c : null;
            htc.b(fVarArr2[2], str3);
            aVar2.g = str3;
            zArr2[2] = true;
            a aVar6 = this.e;
            String str4 = aVar6 != null ? aVar6.d : null;
            htc.b(fVarArr2[3], str4);
            aVar2.h = str4;
            zArr2[3] = true;
            a aVar7 = this.e;
            String str5 = aVar7 != null ? aVar7.e : null;
            htc.b(fVarArr2[4], str5);
            aVar2.i = str5;
            zArr2[4] = true;
            a aVar8 = this.e;
            String str6 = aVar8 != null ? aVar8.f : null;
            htc.b(fVarArr2[5], str6);
            aVar2.j = str6;
            zArr2[5] = true;
            a aVar9 = this.e;
            String str7 = aVar9 != null ? aVar9.g : null;
            htc.b(fVarArr2[6], str7);
            aVar2.k = str7;
            zArr2[6] = true;
            a aVar10 = this.e;
            String str8 = aVar10 != null ? aVar10.h : null;
            htc.b(fVarArr2[7], str8);
            aVar2.l = str8;
            zArr2[7] = true;
            a aVar11 = this.e;
            String str9 = aVar11 != null ? aVar11.i : null;
            htc.b(fVarArr2[8], str9);
            aVar2.m = str9;
            zArr2[8] = true;
            a aVar12 = this.e;
            String str10 = aVar12 != null ? aVar12.j : null;
            htc.b(fVarArr2[9], str10);
            aVar2.n = str10;
            zArr2[9] = true;
            Uri uriD = d();
            String queryParameter = uriD != null ? uriD.getQueryParameter("from") : null;
            htc.b(fVarArr2[10], queryParameter);
            aVar2.o = queryParameter;
            zArr2[10] = true;
            Uri uriD2 = d();
            String queryParameter2 = uriD2 != null ? uriD2.getQueryParameter("fbclid") : null;
            htc.b(fVarArr2[11], queryParameter2);
            aVar2.p = queryParameter2;
            zArr2[11] = true;
            Uri uriD3 = d();
            String queryParameter3 = uriD3 != null ? uriD3.getQueryParameter("gclid") : null;
            htc.b(fVarArr2[12], queryParameter3);
            aVar2.q = queryParameter3;
            zArr2[12] = true;
            Uri uriD4 = d();
            if (uriD4 == null || (queryParameterNames = uriD4.getQueryParameterNames()) == null) {
                queryParameterNames = is4.a;
            }
            List listZ1 = z92.z1(queryParameterNames);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listZ1) {
                String str11 = (String) obj;
                str11.getClass();
                a55Var = null;
                try {
                    if (wve.K(str11, "utm_", false)) {
                        arrayList.add(obj);
                    }
                } catch (Exception e2) {
                    e = e2;
                    ((np7) cr8.p(np7.class)).c("DeeplinkRequest", "Failed to build ExternalAppOpen event", false, e);
                    return a55Var;
                }
            }
            a55Var = null;
            int iV = kc9.V(t92.r0(arrayList, 10));
            if (iV < 16) {
                iV = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iV);
            for (Object obj2 : arrayList) {
                linkedHashMap.put((String) obj2, obj2);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(kc9.V(linkedHashMap.size()));
            for (Object obj3 : linkedHashMap.entrySet()) {
                Object key = ((Map.Entry) obj3).getKey();
                Map.Entry entry = (Map.Entry) obj3;
                Uri uriD5 = d();
                linkedHashMap2.put(key, new r98(uriD5 != null ? uriD5.getQueryParameter((String) entry.getKey()) : null));
            }
            g.f fVar2 = fVarArr2[13];
            aVar2.r = linkedHashMap2;
            zArr2[13] = true;
            suc sucVarC = aVar2.c();
            g.f fVar3 = fVarArr[3];
            aVar.f = sucVarC;
            zArr[3] = true;
            return aVar.c();
        } catch (Exception e3) {
            e = e3;
            a55Var = null;
        }
    }

    public abstract Uri c();

    public abstract Uri d();

    public final String e() {
        Uri uriD = d();
        if (uriD != null) {
            return uriD.toString();
        }
        return null;
    }
}
