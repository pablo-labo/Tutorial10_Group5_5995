package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class oh7 extends mh7 {
    public static final oh7 d = new oh7(1, 0, 1);

    @Override // defpackage.mh7
    public final boolean equals(Object obj) {
        if (!(obj instanceof oh7)) {
            return false;
        }
        if (isEmpty() && ((oh7) obj).isEmpty()) {
            return true;
        }
        oh7 oh7Var = (oh7) obj;
        return this.a == oh7Var.a && this.b == oh7Var.b;
    }

    @Override // defpackage.mh7
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.mh7
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // defpackage.mh7
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
