package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yt2 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ vu5 e;

    public /* synthetic */ yt2(Function1 function1, ig3 ig3Var, Function1 function12, int i) {
        this.a = 2;
        this.d = function1;
        this.b = ig3Var;
        this.e = function12;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        vu5 vu5Var = this.e;
        Object obj3 = this.b;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                au2.a((st2) obj4, (e) obj3, (ah2) vu5Var, (b) obj, ka2.L(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                zke.b((ale) obj4, (e) obj3, (wu5) vu5Var, (b) obj, ka2.L(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                e9g.a((Function1) obj4, (ig3) obj3, (Function1) vu5Var, (b) obj, ka2.L(i2 | 1));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ yt2(Object obj, e eVar, wu5 wu5Var, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = eVar;
        this.e = wu5Var;
        this.c = i;
    }
}
