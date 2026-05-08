package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gge implements j3c {

    public static class a {
    }

    @Override // defpackage.j3c
    public final int a(int i) {
        List list = Collections.EMPTY_LIST;
        if (list == null || list.isEmpty()) {
            return i + 1;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (((Integer) list.get(i2)).intValue() > i) {
                return ((Integer) list.get(i2)).intValue();
            }
        }
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.j3c
    public final h47 b(int i) {
        boolean z = i >= 0;
        h47 h47Var = new h47();
        h47Var.a = i;
        h47Var.b = z;
        h47Var.c = false;
        return h47Var;
    }
}
