package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class a7b extends mj8 implements Function1 {
    public static final a7b b;
    public static final a7b c;
    public static final a7b d;
    public final /* synthetic */ int a;

    static {
        int i = 1;
        b = new a7b(i, 0);
        c = new a7b(i, 1);
        d = new a7b(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a7b(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return String.valueOf(((Number) obj).doubleValue());
            case 1:
                ((Context) obj).getClass();
                return zr4.a;
            default:
                return Integer.valueOf(((ord) obj).b);
        }
    }
}
