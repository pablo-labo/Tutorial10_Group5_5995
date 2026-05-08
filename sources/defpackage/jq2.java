package defpackage;

import android.net.Uri;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class jq2 {
    public static final jq2 i = new jq2(0);
    public final dha a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long g;
    public final Set<a> h;

    public static final class a {
        public final Uri a;
        public final boolean b;

        public a(boolean z, Uri uri) {
            this.a = uri;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!a.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            obj.getClass();
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }
    }

    public jq2(dha dhaVar, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set<a> set) {
        dhaVar.getClass();
        set.getClass();
        this.a = dhaVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = j;
        this.g = j2;
        this.h = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !jq2.class.equals(obj.getClass())) {
            return false;
        }
        jq2 jq2Var = (jq2) obj;
        if (this.b == jq2Var.b && this.c == jq2Var.c && this.d == jq2Var.d && this.e == jq2Var.e && this.f == jq2Var.f && this.g == jq2Var.g && this.a == jq2Var.a) {
            return wl7.b(this.h, jq2Var.h);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        long j = this.f;
        int i2 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.g;
        return this.h.hashCode() + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public jq2() {
        this(0);
    }

    public /* synthetic */ jq2(int i2) {
        this(dha.a, false, false, false, false, -1L, -1L, is4.a);
    }
}
