package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.h;
import androidx.compose.ui.e;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tc1 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tc1(e eVar, h hVar, ah2 ah2Var, int i) {
        ah2 ah2Var2 = ei2.a;
        this.d = eVar;
        this.e = hVar;
        this.b = ah2Var;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                ah2 ah2Var = ei2.a;
                ((Integer) obj2).getClass();
                xc1.a((e) obj5, (h) obj4, (ah2) obj3, (b) obj, ka2.L(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((ah2) obj3).d(obj5, obj4, (b) obj, ka2.L(i2) | 1);
                break;
            default:
                ((Integer) obj2).getClass();
                vd6.a((Function1) obj5, (svb) obj4, (Locale) obj3, (b) obj, ka2.L(i2 | 1));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ tc1(ah2 ah2Var, Object obj, Object obj2, int i) {
        this.b = ah2Var;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    public /* synthetic */ tc1(Function1 function1, svb svbVar, Locale locale, int i) {
        this.d = function1;
        this.e = svbVar;
        this.b = locale;
        this.c = i;
    }
}
