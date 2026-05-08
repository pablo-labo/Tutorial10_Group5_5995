package defpackage;

import androidx.compose.ui.layout.w;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ks8 extends r5i {
    public final as8 b;
    public final ar8 c;
    public final long d;

    public ks8(long j, boolean z, as8 as8Var, ar8 ar8Var) {
        super(2);
        this.b = as8Var;
        this.c = ar8Var;
        this.d = mq2.b(z ? iq2.h(j) : Integer.MAX_VALUE, z ? Integer.MAX_VALUE : iq2.g(j), 5);
    }

    public static js8 m(ds8 ds8Var, int i) {
        long j = ds8Var.d;
        as8 as8Var = ds8Var.b;
        return ds8Var.l(i, as8Var.g(i), as8Var.e(i), ds8Var.b(ds8Var.c, i, j), j);
    }

    @Override // defpackage.r5i
    public final br8 a(int i, int i2, int i3, long j) {
        as8 as8Var = this.b;
        return l(i, as8Var.g(i), as8Var.e(i), b(this.c, i, j), j);
    }

    public abstract js8 l(int i, Object obj, Object obj2, List<? extends w> list, long j);
}
