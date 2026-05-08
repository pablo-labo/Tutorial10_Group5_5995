package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class uv5 implements Function1 {
    public static final uv5 b = new uv5(0);
    public static final uv5 c = new uv5(1);
    public static final uv5 d = new uv5(2);
    public final /* synthetic */ int a;

    public /* synthetic */ uv5(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.TRUE;
            case 1:
                ui8 ui8Var = (ui8) obj;
                ui8Var.getClass();
                return ui8Var.toString();
            default:
                fv1 fv1Var = (fv1) obj;
                fv1Var.getClass();
                return fv1Var;
        }
    }
}
