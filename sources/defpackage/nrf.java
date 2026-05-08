package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nrf<T> {
    public static final nrf<Object> d = new nrf<>(0, zr4.a);
    public final int[] a;
    public final List<T> b;
    public final int c;

    public nrf() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nrf(int i, List<? extends T> list) {
        list.getClass();
        this.a = new int[]{i};
        this.b = list;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nrf.class != obj.getClass()) {
            return false;
        }
        nrf nrfVar = (nrf) obj;
        return Arrays.equals(this.a, nrfVar.a) && wl7.b(this.b, nrfVar.b) && this.c == nrfVar.c;
    }

    public final int hashCode() {
        return (ia.g(this.b, Arrays.hashCode(this.a) * 31, 31) + this.c) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformablePage(originalPageOffsets=");
        sb.append(Arrays.toString(this.a));
        sb.append(", data=");
        sb.append(this.b);
        sb.append(", hintOriginalPageOffset=");
        return w20.k(sb, this.c, ", hintOriginalIndices=null)");
    }
}
