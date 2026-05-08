package defpackage;

import com.google.gson.JsonSyntaxException;
import defpackage.xmf;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class xma extends pvf<Number> {
    public static final wma b = new wma(new xma());
    public final xmf.b a = xmf.b;

    @Override // defpackage.pvf
    public final Number a(nb8 nb8Var) throws IOException {
        sb8 sb8VarJ0 = nb8Var.j0();
        int iOrdinal = sb8VarJ0.ordinal();
        if (iOrdinal == 5 || iOrdinal == 6) {
            this.a.getClass();
            return new bn8(nb8Var.I0());
        }
        if (iOrdinal == 8) {
            nb8Var.l1();
            return null;
        }
        StringBuilder sb = new StringBuilder("Expecting number, got: ");
        sb.append(sb8VarJ0);
        String strC = nb8Var.c();
        sb.append("; at path ");
        sb.append(strC);
        throw new JsonSyntaxException(sb.toString());
    }

    @Override // defpackage.pvf
    public final void b(gc8 gc8Var, Number number) throws IOException {
        gc8Var.h0(number);
    }
}
