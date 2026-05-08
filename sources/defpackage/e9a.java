package defpackage;

import android.os.Bundle;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class e9a implements oec {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;

    public static final class a {
        public static e9a a(String str, String str2) {
            String str3;
            int iOrdinal = ((ep7) cr8.p(ep7.class)).a().ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                str3 = fw4.a.c;
            } else {
                if (iOrdinal != 2) {
                    l.g();
                    return null;
                }
                str3 = fw4.b.c;
            }
            String str4 = str3;
            h97 h97VarB = ((ep7) cr8.p(ep7.class)).b();
            String str5 = h97VarB.a;
            String strM = h97VarB.b;
            if (strM.length() == 0) {
                strM = "en";
            } else if (str5.length() != 0) {
                strM = z3.m(strM, "_", str5);
            }
            return new e9a(str4, strM, str, str2, ((bp7) cr8.p(bp7.class)).c(), ((pp7) cr8.p(pp7.class)).e(), System.currentTimeMillis());
        }
    }

    public e9a(String str, String str2, String str3, String str4, String str5, String str6, long j) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9a)) {
            return false;
        }
        e9a e9aVar = (e9a) obj;
        return wl7.b(this.a, e9aVar.a) && this.b.equals(e9aVar.b) && wl7.b(this.c, e9aVar.c) && wl7.b(this.d, e9aVar.d) && wl7.b(this.e, e9aVar.e) && wl7.b(this.f, e9aVar.f) && this.g == e9aVar.g;
    }

    public final int hashCode() {
        int iD = akb.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return Long.hashCode(this.g) + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    @Override // defpackage.oec
    public final Bundle toBundle() {
        return aq1.a(new Pair("loggingUrl", this.a), new Pair("locale", this.b), new Pair("prforceGroups", this.c), new Pair("proctorGroups", this.d), new Pair("accountId", this.e), new Pair("ctk", this.f), new Pair("navigationStartTimeMs", Long.valueOf(this.g)));
    }

    public final String toString() {
        StringBuilder sbF = u40.f("NativeContextRNProps(loggingUrl=", this.a, ", locale=", this.b, ", prforceGroups=");
        ia.r(sbF, this.c, ", proctorGroups=", this.d, ", accountId=");
        ia.r(sbF, this.e, ", ctk=", this.f, ", navigationStartTimeMs=");
        return r6.d(this.g, ")", sbF);
    }
}
