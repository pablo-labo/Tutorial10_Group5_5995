package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import defpackage.dd9;
import java.io.Serializable;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f74 implements Function2 {
    public final /* synthetic */ Object V;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Serializable e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f74(tg2 tg2Var, dd9.c cVar, String str, dd9.d dVar, String str2, int i) {
        this.b = tg2Var;
        this.c = cVar;
        this.e = str;
        this.f = dVar;
        this.V = str2;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        Object obj3 = this.V;
        Object obj4 = this.f;
        Serializable serializable = this.e;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                g74.a((Function1) obj6, (Locale) serializable, (svb) obj4, (Function2) obj3, (Function1) obj5, (b) obj, ka2.L(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL = ka2.L(113246641);
                py6.b((String) serializable, (Function1) obj6, (Function1) obj5, (e) obj4, (String) obj3, this.d, (b) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                f5f.a((tg2) obj6, (dd9.c) obj5, (String) serializable, (dd9.d) obj4, (String) obj3, (b) obj, ka2.L(i2 | 1));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ f74(String str, Function1 function1, Function1 function12, e eVar, String str2, int i, int i2) {
        this.e = str;
        this.b = function1;
        this.c = function12;
        this.f = eVar;
        this.V = str2;
        this.d = i;
    }

    public /* synthetic */ f74(Function1 function1, Locale locale, svb svbVar, Function2 function2, Function1 function12, int i) {
        this.b = function1;
        this.e = locale;
        this.f = svbVar;
        this.V = function2;
        this.c = function12;
        this.d = i;
    }
}
