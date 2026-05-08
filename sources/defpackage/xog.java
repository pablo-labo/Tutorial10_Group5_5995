package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class xog {
    public static final kr3 c = new kr3(1);
    public final int a;
    public final int b;

    public xog(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass().equals(xog.class)) {
            xog xogVar = (xog) obj;
            if (this.b == xogVar.b && this.a == xogVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b));
    }

    public final String toString() {
        return w40.e("[", this.a, ", ", this.b, "]");
    }
}
