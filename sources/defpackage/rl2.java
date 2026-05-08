package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class rl2 implements Function1 {
    public static final rl2 b = new rl2(0);
    public static final rl2 c = new rl2(1);
    public static final rl2 d = new rl2(2);
    public final /* synthetic */ int a;

    public /* synthetic */ rl2(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                lf0 lf0Var = (lf0) obj;
                lf0Var.getClass();
                return new y92(lf0Var);
            case 1:
                ui8 ui8Var = (ui8) obj;
                int i = pz3.f;
                ui8Var.getClass();
                if (ui8Var instanceof iwe) {
                    return null;
                }
                return ui8Var;
            default:
                Class cls = (Class) obj;
                cls.getClass();
                return wuc.b(cls);
        }
    }
}
