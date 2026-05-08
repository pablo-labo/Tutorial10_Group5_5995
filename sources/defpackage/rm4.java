package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rm4 implements Function2 {
    public final /* synthetic */ Object V;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rm4(e eVar, o97 o97Var, zie zieVar, Function1 function1, int i, int i2) {
        this.e = eVar;
        this.f = o97Var;
        this.V = zieVar;
        this.b = function1;
        this.c = i;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                hn4.d((e) this.e, (o97) this.f, (zie) this.V, this.b, (b) obj, ka2.L(this.c | 1), this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                ngg.a(this.b, (ig3) this.e, (gza) this.f, (Function1) this.V, (b) obj, ka2.L(this.c | 1), this.d);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ rm4(Function1 function1, ig3 ig3Var, gza gzaVar, Function1 function12, int i, int i2) {
        this.b = function1;
        this.e = ig3Var;
        this.f = gzaVar;
        this.V = function12;
        this.c = i;
        this.d = i2;
    }
}
