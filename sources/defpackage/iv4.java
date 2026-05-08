package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class iv4 extends mj8 implements Function1 {
    public static final iv4 b;
    public static final iv4 c;
    public final /* synthetic */ int a;

    static {
        int i = 1;
        b = new iv4(i, 0);
        c = new iv4(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iv4(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            default:
                return j6g.a;
        }
    }
}
