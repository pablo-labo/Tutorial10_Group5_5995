package defpackage;

import defpackage.ere;
import java.util.EnumSet;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class tz3 implements Function1 {
    public static final tz3 b = new tz3(0);
    public static final tz3 c = new tz3(1);
    public static final tz3 d = new tz3(2);
    public final /* synthetic */ int a;

    public /* synthetic */ tz3(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ui8 type;
        switch (this.a) {
            case 0:
                qf8<Object>[] qf8VarArr = vz3.Y;
                ((rlg) obj).getClass();
                return "...";
            case 1:
                xx9 xx9Var = (xx9) obj;
                Map<String, EnumSet<ti8>> map = lu7.a;
                xx9Var.getClass();
                rlg rlgVarK = ygg.k(ju7.b, xx9Var.l().j(ere.a.t));
                return (rlgVarK == null || (type = rlgVarK.getType()) == null) ? lx4.c(kx4.p0, new String[0]) : type;
            case 2:
                sfe sfeVar = (sfe) obj;
                sfeVar.getClass();
                return sfeVar;
            default:
                return (hv1) obj;
        }
    }
}
