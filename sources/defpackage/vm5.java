package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class vm5 extends mj8 implements Function1 {
    public static final vm5 b;
    public static final vm5 c;
    public static final vm5 d;
    public final /* synthetic */ int a;

    static {
        int i = 1;
        b = new vm5(i, 0);
        c = new vm5(i, 1);
        d = new vm5(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vm5(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((FocusTargetNode) obj).A(7));
            case 1:
                return String.valueOf(((Number) obj).longValue());
            default:
                ph7 ph7Var = ((ord) obj).c;
                return Integer.valueOf(ph7Var.d - ph7Var.b);
        }
    }
}
