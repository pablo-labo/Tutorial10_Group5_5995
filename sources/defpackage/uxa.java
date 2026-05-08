package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class uxa extends mj8 implements Function1 {
    public static final uxa b;
    public static final uxa c;
    public final /* synthetic */ int a;

    static {
        int i = 1;
        b = new uxa(i, 0);
        c = new uxa(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uxa(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                pm8 pm8Var = (pm8) obj;
                if (pm8Var.d()) {
                    pm8.h0(pm8Var, false, 7);
                }
                break;
            default:
                int i = ((s37) obj).a;
                break;
        }
        return j6g.a;
    }
}
