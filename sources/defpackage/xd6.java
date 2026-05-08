package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class xd6 extends pvf<Number> {
    @Override // defpackage.pvf
    public final Number a(nb8 nb8Var) throws IOException {
        if (nb8Var.j0() != sb8.X) {
            return Float.valueOf((float) nb8Var.nextDouble());
        }
        nb8Var.l1();
        return null;
    }

    @Override // defpackage.pvf
    public final void b(gc8 gc8Var, Number number) throws IOException {
        Number numberValueOf = number;
        if (numberValueOf == null) {
            gc8Var.Q();
            return;
        }
        float fFloatValue = numberValueOf.floatValue();
        ae6.a(fFloatValue);
        if (!(numberValueOf instanceof Float)) {
            numberValueOf = Float.valueOf(fFloatValue);
        }
        gc8Var.h0(numberValueOf);
    }
}
