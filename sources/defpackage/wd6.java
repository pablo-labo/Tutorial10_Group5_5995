package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class wd6 extends pvf<Number> {
    @Override // defpackage.pvf
    public final Number a(nb8 nb8Var) throws IOException {
        if (nb8Var.j0() != sb8.X) {
            return Double.valueOf(nb8Var.nextDouble());
        }
        nb8Var.l1();
        return null;
    }

    @Override // defpackage.pvf
    public final void b(gc8 gc8Var, Number number) throws IOException {
        Number number2 = number;
        if (number2 == null) {
            gc8Var.Q();
            return;
        }
        double dDoubleValue = number2.doubleValue();
        ae6.a(dDoubleValue);
        gc8Var.d0(dDoubleValue);
    }
}
