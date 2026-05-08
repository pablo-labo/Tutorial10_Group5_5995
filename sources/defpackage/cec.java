package defpackage;

import android.os.Bundle;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class cec implements oec {
    public final e9a a;
    public final String b;
    public final String c;
    public final Bundle d;
    public final Boolean e;
    public final String f;
    public final String g;

    public cec(e9a e9aVar, String str, String str2, Bundle bundle, Boolean bool, String str3, String str4) {
        this.a = e9aVar;
        this.b = str;
        this.c = str2;
        this.d = bundle;
        this.e = bool;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cec)) {
            return false;
        }
        cec cecVar = (cec) obj;
        return this.a.equals(cecVar.a) && this.b.equals(cecVar.b) && wl7.b(this.c, cecVar.c) && this.d.equals(cecVar.d) && this.e.equals(cecVar.e) && wl7.b(this.f, cecVar.f) && wl7.b(this.g, cecVar.g);
    }

    public final int hashCode() {
        int iD = akb.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // defpackage.oec
    public final Bundle toBundle() {
        return aq1.a(new Pair("nativeContext", this.a.toBundle()), new Pair("onCompleteCallbackId", this.b), new Pair("experienceKey", this.c), new Pair("experienceData", this.d), new Pair("skipExempt", this.e), new Pair("origin", this.f), new Pair("from", this.g));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RNOnboardingProps(nativeContext=");
        sb.append(this.a);
        sb.append(", onCompleteCallbackId=");
        sb.append(this.b);
        sb.append(", experienceKey=");
        sb.append(this.c);
        sb.append(", experienceData=");
        sb.append(this.d);
        sb.append(", skipExempt=");
        sb.append(this.e);
        sb.append(", origin=");
        sb.append(this.f);
        sb.append(", from=");
        return l6.i(sb, this.g, ")");
    }
}
