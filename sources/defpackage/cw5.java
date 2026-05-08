package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cw5 {
    public final int[] a;

    public cw5(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        this.a = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cw5) {
            return st0.b(this.a, ((cw5) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.a;
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ iArr[length];
        }
    }
}
