package defpackage;

import androidx.media3.common.a;
import defpackage.js9;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class g05 implements js9.a {
    public static final a g;
    public static final a h;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;

    static {
        a.C0036a c0036a = new a.C0036a();
        c0036a.m = st9.p("application/id3");
        g = new a(c0036a);
        a.C0036a c0036a2 = new a.C0036a();
        c0036a2.m = st9.p("application/x-scte35");
        h = new a(c0036a2);
    }

    public g05(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    @Override // js9.a
    public final a a() {
        String str = this.a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return g;
            default:
                return null;
        }
    }

    @Override // js9.a
    public final byte[] c() {
        if (a() != null) {
            return this.e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g05.class != obj.getClass()) {
            return false;
        }
        g05 g05Var = (g05) obj;
        return this.c == g05Var.c && this.d == g05Var.d && Objects.equals(this.a, g05Var.a) && this.b.equals(g05Var.b) && Arrays.equals(this.e, g05Var.e);
    }

    public final int hashCode() {
        if (this.f == 0) {
            String str = this.a;
            int iD = akb.d((527 + (str != null ? str.hashCode() : 0)) * 31, 31, this.b);
            long j = this.c;
            int i = (iD + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.d;
            this.f = Arrays.hashCode(this.e) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }
}
