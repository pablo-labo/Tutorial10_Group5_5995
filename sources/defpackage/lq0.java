package defpackage;

import androidx.compose.runtime.b;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lq0 implements Function2 {
    public final /* synthetic */ Object V;
    public final /* synthetic */ Object W;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lq0(int i, Function2 function2, ah2 ah2Var, ah2 ah2Var2, Function2 function22, mzg mzgVar, Function2 function23, int i2) {
        this.b = i;
        this.c = function2;
        this.d = ah2Var;
        this.e = ah2Var2;
        this.f = function22;
        this.V = mzgVar;
        this.W = function23;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.W;
        Object obj4 = this.V;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                qq0.e((List) obj8, (e8a) obj6, (List) obj7, (fr0) obj5, (kjg) obj4, (ss8) obj3, (b) obj, ka2.L(this.b | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iL = ka2.L(24577);
                pmd.c(this.b, (Function2) obj8, (ah2) obj7, (ah2) obj6, (Function2) obj5, (mzg) obj4, (Function2) obj3, (b) obj, iL);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ lq0(List list, e8a e8aVar, List list2, fr0 fr0Var, kjg kjgVar, ss8 ss8Var, int i) {
        this.c = list;
        this.e = e8aVar;
        this.d = list2;
        this.f = fr0Var;
        this.V = kjgVar;
        this.W = ss8Var;
        this.b = i;
    }
}
