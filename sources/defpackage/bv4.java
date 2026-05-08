package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class bv4 extends mj8 implements Function1 {
    public static final bv4 b;
    public static final bv4 c;
    public final /* synthetic */ int a;

    static {
        int i = 1;
        b = new bv4(i, 0);
        c = new bv4(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bv4(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((th7) obj).getClass();
                return new th7(0L);
            default:
                pm8 pm8Var = (pm8) obj;
                if (pm8Var.d()) {
                    pm8Var.U();
                }
                return j6g.a;
        }
    }
}
