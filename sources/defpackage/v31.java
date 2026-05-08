package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class v31 extends atf {
    public final String a;
    public final byte[] b;
    public final jnb c;

    public v31(String str, byte[] bArr, jnb jnbVar) {
        this.a = str;
        this.b = bArr;
        this.c = jnbVar;
    }

    @Override // defpackage.atf
    public final String a() {
        return this.a;
    }

    @Override // defpackage.atf
    public final byte[] b() {
        return this.b;
    }

    @Override // defpackage.atf
    public final jnb c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof atf)) {
            return false;
        }
        atf atfVar = (atf) obj;
        if (this.a.equals(atfVar.a())) {
            return Arrays.equals(this.b, atfVar instanceof v31 ? ((v31) atfVar).b : atfVar.b()) && this.c.equals(atfVar.c());
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }
}
