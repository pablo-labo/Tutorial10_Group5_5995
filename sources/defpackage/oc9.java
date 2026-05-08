package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class oc9 {
    public final int a;

    public oc9(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oc9) && this.a == ((oc9) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return k6.h(new StringBuilder("MarginsViewModel(marginTop="), this.a, ')');
    }
}
