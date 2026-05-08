package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ux3 implements qh4 {
    public final int a;
    public final int b;

    public ux3(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        be7.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.qh4
    public final void a(co4 co4Var) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.a) {
                int i4 = i3 + 1;
                int i5 = co4Var.b;
                if (i5 <= i4) {
                    i3 = i5;
                    break;
                } else {
                    i3 = (Character.isHighSurrogate(co4Var.b((i5 - i4) + (-1))) && Character.isLowSurrogate(co4Var.b(co4Var.b - i4))) ? i3 + 2 : i4;
                    i2++;
                }
            } else {
                break;
            }
        }
        int iA = 0;
        while (true) {
            if (i >= this.b) {
                break;
            }
            int i6 = iA + 1;
            int i7 = co4Var.c;
            t4b t4bVar = co4Var.a;
            if (i7 + i6 >= t4bVar.a()) {
                iA = t4bVar.a() - co4Var.c;
                break;
            } else {
                iA = (Character.isHighSurrogate(co4Var.b((co4Var.c + i6) + (-1))) && Character.isLowSurrogate(co4Var.b(co4Var.c + i6))) ? iA + 2 : i6;
                i++;
            }
        }
        int i8 = co4Var.c;
        co4Var.a(i8, iA + i8);
        int i9 = co4Var.b;
        co4Var.a(i9 - i3, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux3)) {
            return false;
        }
        ux3 ux3Var = (ux3) obj;
        return this.a == ux3Var.a && this.b == ux3Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return k6.h(sb, this.b, ')');
    }
}
