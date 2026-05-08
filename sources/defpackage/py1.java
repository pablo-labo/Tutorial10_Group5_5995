package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class py1 {
    public final oy1 a;

    public py1(oy1 oy1Var) {
        this.a = oy1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof py1) && this.a.equals(((py1) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "CategoricalOQVTGenericAttributesInput(filter=" + this.a + ")";
    }
}
