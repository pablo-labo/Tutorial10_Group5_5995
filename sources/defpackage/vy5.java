package defpackage;

import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class vy5 extends mj8 implements Function1 {
    public static final vy5 b;
    public static final vy5 c;
    public final /* synthetic */ int a;

    static {
        int i = 1;
        b = new vy5(i, 0);
        c = new vy5(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vy5(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((lx5.b) obj).getClass();
                return j6g.a;
            default:
                obj.getClass();
                return Boolean.valueOf(!((sxa) obj).W0());
        }
    }
}
