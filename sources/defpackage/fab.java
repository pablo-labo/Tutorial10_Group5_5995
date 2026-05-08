package defpackage;

import defpackage.js9;
import defpackage.oj9;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class fab implements js9.a {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public fab(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static fab d(g4b g4bVar) {
        int iJ = g4bVar.j();
        String strP = st9.p(g4bVar.v(g4bVar.j(), StandardCharsets.US_ASCII));
        String strV = g4bVar.v(g4bVar.j(), StandardCharsets.UTF_8);
        int iJ2 = g4bVar.j();
        int iJ3 = g4bVar.j();
        int iJ4 = g4bVar.j();
        int iJ5 = g4bVar.j();
        int iJ6 = g4bVar.j();
        byte[] bArr = new byte[iJ6];
        g4bVar.h(0, bArr, iJ6);
        return new fab(iJ, strP, strV, iJ2, iJ3, iJ4, iJ5, bArr);
    }

    @Override // js9.a
    public final void b(oj9.a aVar) {
        aVar.a(this.a, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fab.class != obj.getClass()) {
            return false;
        }
        fab fabVar = (fab) obj;
        return this.a == fabVar.a && this.b.equals(fabVar.b) && this.c.equals(fabVar.c) && this.d == fabVar.d && this.e == fabVar.e && this.f == fabVar.f && this.g == fabVar.g && Arrays.equals(this.h, fabVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((akb.d(akb.d((527 + this.a) * 31, 31, this.b), 31, this.c) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }
}
