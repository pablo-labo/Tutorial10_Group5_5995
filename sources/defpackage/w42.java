package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w42<E> {
    public E[] a;
    public int b;
    public int c;
    public int d;

    public final void a(ap2 ap2Var) {
        E[] eArr = this.a;
        int i = this.c;
        eArr[i] = ap2Var;
        int i2 = this.d & (i + 1);
        this.c = i2;
        int i3 = this.b;
        if (i2 == i3) {
            int length = eArr.length;
            int i4 = length - i3;
            int i5 = length << 1;
            if (i5 < 0) {
                b0.o("Max array capacity exceeded");
                return;
            }
            E[] eArr2 = (E[]) new Object[i5];
            pyd.j(eArr, 0, eArr2, i3, length);
            pyd.j(this.a, i4, eArr2, 0, this.b);
            this.a = eArr2;
            this.b = 0;
            this.c = length;
            this.d = i5 - 1;
        }
    }
}
