package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a31 extends jh6 {
    public final String a;
    public final ArrayList b;

    public a31(String str, ArrayList arrayList) {
        if (str == null) {
            ja.k("Null userAgent");
            throw null;
        }
        this.a = str;
        this.b = arrayList;
    }

    @Override // defpackage.jh6
    public final List<String> a() {
        return this.b;
    }

    @Override // defpackage.jh6
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jh6)) {
            return false;
        }
        jh6 jh6Var = (jh6) obj;
        return this.a.equals(jh6Var.b()) && this.b.equals(jh6Var.a());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b + "}";
    }
}
