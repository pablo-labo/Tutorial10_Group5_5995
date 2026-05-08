package defpackage;

import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class nh3 extends mj8 implements Function1 {
    public static final nh3 b;
    public static final nh3 c;
    public final /* synthetic */ int a;

    static {
        int i = 1;
        b = new nh3(i, 0);
        c = new nh3(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nh3(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return null;
            default:
                ((lx5.b) obj).getClass();
                return j6g.a;
        }
    }
}
