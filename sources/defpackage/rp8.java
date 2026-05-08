package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class rp8 implements Function1 {
    public static final rp8 b = new rp8(0);
    public static final rp8 c = new rp8(1);
    public final /* synthetic */ int a;

    public /* synthetic */ rp8(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                gv7 gv7Var = (gv7) obj;
                int i = up8.p;
                gv7Var.getClass();
                return Boolean.valueOf(gv7Var.b());
            default:
                hv1 hv1Var = (hv1) obj;
                hv1Var.getClass();
                hsc hscVarO = hv1Var.O();
                hscVarO.getClass();
                ui8 type = hscVarO.getType();
                type.getClass();
                return type;
        }
    }
}
