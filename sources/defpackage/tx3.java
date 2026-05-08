package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tx3 implements qh4 {
    public final int a;
    public final int b;

    public tx3(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        be7.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.qh4
    public final void a(co4 co4Var) {
        int i = co4Var.c;
        t4b t4bVar = co4Var.a;
        int i2 = this.b;
        int iA = i + i2;
        if (((i ^ iA) & (i2 ^ iA)) < 0) {
            iA = t4bVar.a();
        }
        co4Var.a(co4Var.c, Math.min(iA, t4bVar.a()));
        int i3 = co4Var.b;
        int i4 = this.a;
        int i5 = i3 - i4;
        if (((i4 ^ i3) & (i3 ^ i5)) < 0) {
            i5 = 0;
        }
        co4Var.a(Math.max(0, i5), co4Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx3)) {
            return false;
        }
        tx3 tx3Var = (tx3) obj;
        return this.a == tx3Var.a && this.b == tx3Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return k6.h(sb, this.b, ')');
    }
}
