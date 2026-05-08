package defpackage;

import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class zk2 extends mj8 implements Function1 {
    public static final zk2 b;
    public static final zk2 c;
    public static final zk2 d;
    public final /* synthetic */ int a;

    static {
        int i = 1;
        b = new zk2(i, 0);
        c = new zk2(i, 1);
        d = new zk2(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zk2(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((Number) obj).longValue();
                break;
            case 1:
                ((lx5.b) obj).getClass();
                break;
            default:
                pm8 pm8Var = (pm8) obj;
                if (pm8Var.d()) {
                    pm8Var.i0(false);
                }
                break;
        }
        return j6g.a;
    }
}
