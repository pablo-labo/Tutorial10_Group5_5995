package defpackage;

import defpackage.v33;

/* JADX INFO: loaded from: classes2.dex */
public final class q21 extends v33.e.d.AbstractC0447d {
    public final String a;

    public q21(String str) {
        this.a = str;
    }

    @Override // v33.e.d.AbstractC0447d
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v33.e.d.AbstractC0447d) {
            return this.a.equals(((v33.e.d.AbstractC0447d) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return l6.i(new StringBuilder("Log{content="), this.a, "}");
    }
}
