package defpackage;

import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class bi3 extends mj8 implements Function1 {
    public static final bi3 b;
    public static final bi3 c;
    public static final bi3 d;
    public final /* synthetic */ int a;

    static {
        int i = 1;
        b = new bi3(i, 0);
        c = new bi3(i, 1);
        d = new bi3(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bi3(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                ((lx5.b) obj).getClass();
                break;
            default:
                qgb qgbVar = (qgb) obj;
                qgbVar.getClass();
                qgbVar.a = true;
                break;
        }
        return j6g.a;
    }
}
