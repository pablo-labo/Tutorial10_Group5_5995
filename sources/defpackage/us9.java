package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class us9 extends xf1 {
    public static final us9 g;
    public static final us9 h;
    public final boolean f;

    static {
        us9 us9Var = new us9(new int[]{2, 1, 0}, false);
        g = us9Var;
        int i = us9Var.c;
        int i2 = us9Var.b;
        h = (i2 == 1 && i == 9) ? new us9(new int[]{2, 0, 0}, false) : new us9(new int[]{i2, i + 1, 0}, false);
        new us9(new int[0], false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us9(int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        iArr.getClass();
        this.f = z;
    }

    public final boolean b(us9 us9Var) {
        us9Var.getClass();
        us9 us9Var2 = this.f ? g : h;
        int i = us9Var2.b;
        int i2 = us9Var.b;
        if (i > i2 || (i >= i2 && us9Var2.c > us9Var.c)) {
            us9Var = us9Var2;
        }
        int i3 = this.c;
        boolean z = false;
        int i4 = this.b;
        if ((i4 == 1 && i3 == 0) || i4 == 0) {
            return false;
        }
        int i5 = us9Var.b;
        if (i4 > i5 || (i4 >= i5 && i3 > us9Var.c)) {
            z = true;
        }
        return !z;
    }
}
