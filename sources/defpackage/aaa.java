package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class aaa {
    public final ArrayList a;
    public final int b;
    public final String c;
    public final String d;
    public final boolean e;

    public aaa(ArrayList arrayList, int i, String str, String str2, boolean z) {
        str.getClass();
        this.a = arrayList;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaa)) {
            return false;
        }
        aaa aaaVar = (aaa) obj;
        return this.a.equals(aaaVar.a) && this.b == aaaVar.b && wl7.b(this.c, aaaVar.c) && this.d.equals(aaaVar.d) && this.e == aaaVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + akb.d(akb.d(w40.c(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NativeResponseInit(headers=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", statusText=");
        ia.r(sb, this.c, ", url=", this.d, ", redirected=");
        return z3.o(sb, this.e, ")");
    }
}
