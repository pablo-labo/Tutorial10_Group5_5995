package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w80 implements ueb {
    public final int b;

    public w80(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!w80.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.b == ((w80) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return k6.h(new StringBuilder("AndroidPointerIcon(type="), this.b, ')');
    }
}
