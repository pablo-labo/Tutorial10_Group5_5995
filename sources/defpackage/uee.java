package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class uee {
    public final gt7 a;
    public final ht7 b;
    public final String c;
    public final Function1<zs7, j6g> d;

    /* JADX WARN: Multi-variable type inference failed */
    public uee(gt7 gt7Var, ht7 ht7Var, String str, Function1<? super zs7, j6g> function1) {
        this.a = gt7Var;
        this.b = ht7Var;
        this.c = str;
        this.d = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uee)) {
            return false;
        }
        uee ueeVar = (uee) obj;
        return wl7.b(this.a, ueeVar.a) && this.b == ueeVar.b && wl7.b(this.c, ueeVar.c) && wl7.b(this.d, ueeVar.d);
    }

    public final int hashCode() {
        gt7 gt7Var = this.a;
        int iHashCode = (gt7Var == null ? 0 : gt7Var.hashCode()) * 31;
        ht7 ht7Var = this.b;
        int iHashCode2 = (iHashCode + (ht7Var == null ? 0 : ht7Var.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Function1<zs7, j6g> function1 = this.d;
        return iHashCode3 + (function1 != null ? function1.hashCode() : 0);
    }

    public final String toString() {
        return "ShowReengagementModalEvent(pushModalConfig=" + this.a + ", pushModalPresentationType=" + this.b + ", from=" + this.c + ", callback=" + this.d + ")";
    }

    public uee() {
        this(null, null, null, null);
    }
}
