package defpackage;

import defpackage.js9;
import defpackage.oj9;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class er6 implements js9.a {
    public final byte[] a;
    public final String b;
    public final String c;

    public er6(byte[] bArr, String str, String str2) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override // js9.a
    public final void b(oj9.a aVar) {
        String str = this.b;
        if (str != null) {
            aVar.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || er6.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((er6) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return w20.k(u40.f("ICY: title=\"", this.b, "\", url=\"", this.c, "\", rawMetadata.length=\""), this.a.length, "\"");
    }
}
