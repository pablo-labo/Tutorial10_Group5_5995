package defpackage;

import androidx.compose.runtime.b;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kz1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Locale c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ kz1(Function1 function1, Object obj, Locale locale, int i, int i2) {
        this.a = i2;
        this.b = function1;
        this.e = obj;
        this.c = locale;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        Locale locale = this.c;
        Object obj3 = this.e;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                mz1.a(function1, (svb) obj3, locale, (b) obj, ka2.L(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ot9.a(function1, (List) obj3, locale, (b) obj, ka2.L(i2 | 1));
                break;
        }
        return j6g.a;
    }
}
