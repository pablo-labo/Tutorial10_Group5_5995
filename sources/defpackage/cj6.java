package defpackage;

import android.text.TextUtils;
import defpackage.js9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cj6 implements js9.a {
    public final String a;
    public final String b;
    public final List<a> c;

    public static final class a {
        public final int a;
        public final int b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public a(int i, int i2, String str, String str2, String str3, String str4) {
            this.a = i;
            this.b = i2;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.a == aVar.a && this.b == aVar.b && TextUtils.equals(this.c, aVar.c) && TextUtils.equals(this.d, aVar.d) && TextUtils.equals(this.e, aVar.e) && TextUtils.equals(this.f, aVar.f)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = ((this.a * 31) + this.b) * 31;
            String str = this.c;
            int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.d;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.e;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    public cj6(String str, String str2, List<a> list) {
        this.a = str;
        this.b = str2;
        this.c = Collections.unmodifiableList(new ArrayList(list));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cj6.class == obj.getClass()) {
            cj6 cj6Var = (cj6) obj;
            if (TextUtils.equals(this.a, cj6Var.a) && TextUtils.equals(this.b, cj6Var.b) && this.c.equals(cj6Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.a;
        return "HlsTrackMetadataEntry".concat(str != null ? l6.i(akb.m(" [", str, ", "), this.b, "]") : "");
    }
}
