package defpackage;

/* JADX INFO: loaded from: classes.dex */
@fd8
public final class ifb {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof ifb) {
            return this.a == ((ifb) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return bg.c(')', this.a, "PointerKeyboardModifiers(packedValue=");
    }
}
