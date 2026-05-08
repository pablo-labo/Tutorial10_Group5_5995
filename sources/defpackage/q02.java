package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q02 implements Function2 {
    public final /* synthetic */ Object V;
    public final /* synthetic */ Object W;
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ q02(gu5 gu5Var, Function1 function1, s8c s8cVar, r8c r8cVar, String str, String str2, int i, int i2) {
        this.V = gu5Var;
        this.b = function1;
        this.W = s8cVar;
        this.X = r8cVar;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).intValue();
                t02.a((n97) this.V, this.c, this.d, (String) this.W, this.b, (Function2) this.X, this.e, (b) obj, ka2.L(this.f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                h8c.a((gu5) this.V, this.b, (s8c) this.W, (r8c) this.X, this.c, this.d, (b) obj, ka2.L(this.e | 1), this.f);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ q02(n97 n97Var, String str, String str2, String str3, Function1 function1, Function2 function2, int i, int i2) {
        this.V = n97Var;
        this.c = str;
        this.d = str2;
        this.W = str3;
        this.b = function1;
        this.X = function2;
        this.e = i;
        this.f = i2;
    }
}
