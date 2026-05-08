package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ic8 {
    public final v2d a;
    public final v2d b;
    public final Map<mq5, v2d> c = bs4.a;
    public final boolean d;

    public ic8(v2d v2dVar, v2d v2dVar2) {
        this.a = v2dVar;
        this.b = v2dVar2;
        new d2f(new q04(this, 1));
        v2d v2dVar3 = v2d.IGNORE;
        this.d = v2dVar == v2dVar3 && v2dVar2 == v2dVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic8)) {
            return false;
        }
        ic8 ic8Var = (ic8) obj;
        return this.a == ic8Var.a && this.b == ic8Var.b && wl7.b(this.c, ic8Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        v2d v2dVar = this.b;
        return this.c.hashCode() + ((iHashCode + (v2dVar == null ? 0 : v2dVar.hashCode())) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.a + ", migrationLevel=" + this.b + ", userDefinedLevelForSpecificAnnotation=" + this.c + ')';
    }
}
