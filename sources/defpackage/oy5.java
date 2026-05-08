package defpackage;

import android.view.View;
import android.view.ViewGroup;
import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class oy5 extends mj8 implements Function1 {
    public static final oy5 b;
    public static final oy5 c;
    public static final oy5 d;
    public final /* synthetic */ int a;

    static {
        int i = 1;
        b = new oy5(i, 0);
        c = new oy5(i, 1);
        d = new oy5(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oy5(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((lx5.b) obj).getClass();
                return j6g.a;
            case 1:
                wb0 wb0Var = (wb0) obj;
                wb0Var.getClass();
                wb0Var.a = 0;
                wb0Var.b = 0;
                return j6g.a;
            default:
                View view = (View) obj;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null) {
                    return new knc(viewGroup, 1);
                }
                return null;
        }
    }
}
