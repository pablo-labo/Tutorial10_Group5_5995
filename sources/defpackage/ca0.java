package defpackage;

import android.view.View;
import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ca0 extends mj8 implements Function1 {
    public static final ca0 b;
    public static final ca0 c;
    public static final ca0 d;
    public final /* synthetic */ int a;

    static {
        int i = 1;
        b = new ca0(i, 0);
        c = new ca0(i, 1);
        d = new ca0(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ca0(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ga0 ga0Var = (ga0) obj;
                ga0Var.getClass();
                return Long.valueOf(ga0Var.b());
            case 1:
                ((lx5.b) obj).getClass();
                return j6g.a;
            default:
                View view = (View) obj;
                view.getClass();
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
        }
    }
}
