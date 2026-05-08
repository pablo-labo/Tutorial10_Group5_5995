package defpackage;

import defpackage.v33;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class b21 extends v33.d.a {
    public final String a;
    public final byte[] b;

    public b21(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    @Override // v33.d.a
    public final byte[] a() {
        return this.b;
    }

    @Override // v33.d.a
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v33.d.a)) {
            return false;
        }
        v33.d.a aVar = (v33.d.a) obj;
        if (this.a.equals(aVar.b())) {
            return Arrays.equals(this.b, aVar instanceof b21 ? ((b21) aVar).b : aVar.a());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }
}
