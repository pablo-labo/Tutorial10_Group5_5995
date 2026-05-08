package defpackage;

import android.location.Address;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class r34 {
    public final double a;
    public final double b;
    public final List<Address> c;
    public final e29 d;

    /* JADX WARN: Multi-variable type inference failed */
    public r34(double d, double d2, List<? extends Address> list, e29 e29Var) {
        list.getClass();
        this.a = d;
        this.b = d2;
        this.c = list;
        this.d = e29Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r34)) {
            return false;
        }
        r34 r34Var = (r34) obj;
        return Double.compare(this.a, r34Var.a) == 0 && Double.compare(this.b, r34Var.b) == 0 && wl7.b(this.c, r34Var.c) && this.d == r34Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ia.g(this.c, (Double.hashCode(this.b) + (Double.hashCode(this.a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DeviceGeoLocation(latitude=" + this.a + ", longitude=" + this.b + ", addresses=" + this.c + ", source=" + this.d + ")";
    }
}
