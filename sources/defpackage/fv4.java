package defpackage;

import android.content.res.Resources;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class fv4 extends mj8 implements Function1 {
    public static final fv4 b;
    public static final fv4 c;
    public final /* synthetic */ int a;

    static {
        int i = 1;
        b = new fv4(i, 0);
        c = new fv4(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fv4(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            default:
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
        }
    }
}
