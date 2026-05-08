package defpackage;

import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class v21 extends v33.e.f {
    public final String a;

    public v21(String str) {
        this.a = str;
    }

    @Override // v33.e.f
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v33.e.f) {
            return this.a.equals(((v33.e.f) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return l6.i(new StringBuilder("User{identifier="), this.a, "}");
    }
}
