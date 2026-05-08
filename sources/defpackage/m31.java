package defpackage;

import defpackage.hod;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class m31 extends hod {
    public final b82 a;
    public final HashMap b;

    public m31(b82 b82Var, HashMap map) {
        this.a = b82Var;
        this.b = map;
    }

    @Override // defpackage.hod
    public final b82 a() {
        return this.a;
    }

    @Override // defpackage.hod
    public final Map<jnb, hod.a> c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hod)) {
            return false;
        }
        hod hodVar = (hod) obj;
        return this.a.equals(hodVar.a()) && this.b.equals(hodVar.c());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
