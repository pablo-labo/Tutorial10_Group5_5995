package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ey7 {
    public final hva<List<String>> a;
    public final hva<List<gy7>> b;
    public final hva<Boolean> c;
    public final hva<String> d;
    public final hva<String> e;
    public final hva<String> f;

    public ey7(hva.c cVar, int i) {
        hva<List<String>> hvaVar = (i & 1) != 0 ? hva.a.a : cVar;
        hva.a aVar = hva.a.a;
        hvaVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        this.a = hvaVar;
        this.b = aVar;
        this.c = aVar;
        this.d = aVar;
        this.e = aVar;
        this.f = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey7)) {
            return false;
        }
        ey7 ey7Var = (ey7) obj;
        return wl7.b(this.a, ey7Var.a) && wl7.b(this.b, ey7Var.b) && wl7.b(this.c, ey7Var.c) && wl7.b(this.d, ey7Var.d) && wl7.b(this.e, ey7Var.e) && wl7.b(this.f, ey7Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + b0.e(this.e, b0.e(this.d, b0.e(this.c, b0.e(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbG = v40.g("JobDataInput(jobKeys=", this.a, ", jobs=", this.b, ", useSearchlessPrice=");
        w40.o(sbG, this.c, ", placementId=", this.d, ", referrer=");
        return uz.e(sbG, this.e, ", pageTrackingKey=", this.f, ")");
    }

    public ey7() {
        this(null, 63);
    }
}
