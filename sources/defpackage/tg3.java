package defpackage;

import defpackage.g15;

/* JADX INFO: loaded from: classes3.dex */
public final class tg3 implements g15.a {
    public final Boolean a;
    public final s38 b;
    public final Integer c;

    public tg3(Boolean bool, s38 s38Var, Integer num) {
        this.a = bool;
        this.b = s38Var;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg3)) {
            return false;
        }
        tg3 tg3Var = (tg3) obj;
        return wl7.b(this.a, tg3Var.a) && this.b == tg3Var.b && wl7.b(this.c, tg3Var.c);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        s38 s38Var = this.b;
        int iHashCode2 = (iHashCode + (s38Var == null ? 0 : s38Var.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "DateTypeForMobileRichProfile(isCurrent=" + this.a + ", month=" + this.b + ", year=" + this.c + ")";
    }
}
