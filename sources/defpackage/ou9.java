package defpackage;

import com.indeed.android.jobsearch.BuildConfig;
import defpackage.hva;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ou9 {
    public final qu9 a;
    public final String b;
    public final String c;
    public final hva<String> d;
    public final boolean e;
    public final mu9 f;
    public final ArrayList g;
    public final List<String> h;
    public final hva<String> i;
    public final hva<gx0> j;
    public final hva<jx0> k;
    public final hva<List<String>> l;

    public ou9() {
        throw null;
    }

    public ou9(String str, hva hvaVar, boolean z, mu9 mu9Var, ArrayList arrayList, List list, hva hvaVar2, hva hvaVar3, hva hvaVar4) {
        qu9 qu9Var = qu9.ANDROID;
        hva.a aVar = hva.a.a;
        hvaVar.getClass();
        hvaVar2.getClass();
        hvaVar3.getClass();
        aVar.getClass();
        hvaVar4.getClass();
        this.a = qu9Var;
        this.b = BuildConfig.VERSION_NAME;
        this.c = str;
        this.d = hvaVar;
        this.e = z;
        this.f = mu9Var;
        this.g = arrayList;
        this.h = list;
        this.i = hvaVar2;
        this.j = hvaVar3;
        this.k = aVar;
        this.l = hvaVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou9)) {
            return false;
        }
        ou9 ou9Var = (ou9) obj;
        return this.a == ou9Var.a && wl7.b(this.b, ou9Var.b) && wl7.b(this.c, ou9Var.c) && wl7.b(this.d, ou9Var.d) && this.e == ou9Var.e && this.f == ou9Var.f && wl7.b(this.g, ou9Var.g) && wl7.b(this.h, ou9Var.h) && wl7.b(this.i, ou9Var.i) && wl7.b(this.j, ou9Var.j) && wl7.b(this.k, ou9Var.k) && wl7.b(this.l, ou9Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + b0.e(this.k, b0.e(this.j, b0.e(this.i, ia.g(this.h, z3.d(this.g, (this.f.hashCode() + ia.f(b0.e(this.d, akb.d(akb.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e)) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MobileAppInitPayloadInput(platform=");
        sb.append(this.a);
        sb.append(", appVersion=");
        sb.append(this.b);
        sb.append(", osVersion=");
        sb.append(this.c);
        sb.append(", deviceId=");
        sb.append(this.d);
        sb.append(", isTablet=");
        sb.append(this.e);
        sb.append(", countrySelectionMethod=");
        sb.append(this.f);
        sb.append(", proctorTestNames=");
        sb.append(this.g);
        sb.append(", services=");
        sb.append(this.h);
        sb.append(", employerKey=");
        w40.o(sb, this.i, ", attributionParametersInput=", this.j, ", attributionParams=");
        return uz.e(sb, this.k, ", dynamicProctorMetatags=", this.l, ")");
    }
}
