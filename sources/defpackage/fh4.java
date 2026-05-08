package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.fragment.app.FragmentManager;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fh4 implements Function2 {
    public final /* synthetic */ Object V;
    public final /* synthetic */ Object W;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ gu5 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fh4(x1e x1eVar, at8 at8Var, Function1 function1, Function2 function2, e eVar, FragmentManager fragmentManager, androidx.navigation.e eVar2, Function2 function22, gu5 gu5Var, hza hzaVar, int i) {
        this.d = x1eVar;
        this.e = at8Var;
        this.b = function1;
        this.f = function2;
        this.V = eVar;
        this.W = fragmentManager;
        this.X = eVar2;
        this.Y = function22;
        this.c = gu5Var;
        this.Z = hzaVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.Z;
        Object obj4 = this.Y;
        Object obj5 = this.X;
        Object obj6 = this.W;
        Object obj7 = this.V;
        Object obj8 = this.f;
        Object obj9 = this.e;
        Object obj10 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = ka2.L(134217729);
                oh4.a((String) obj10, (List) obj9, (List) obj8, this.b, (Function1) obj7, this.c, (Function1) obj6, (b5g) obj5, (hw9) obj4, (hz1) obj3, (b) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = ka2.L(65);
                yy4.a((x1e) obj10, (at8) obj9, this.b, (Function2) obj8, (e) obj7, (FragmentManager) obj6, (androidx.navigation.e) obj5, (Function2) obj4, this.c, (hza) obj3, (b) obj, iL2);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ fh4(String str, List list, List list2, Function1 function1, Function1 function12, gu5 gu5Var, Function1 function13, b5g b5gVar, hw9 hw9Var, hz1 hz1Var, int i) {
        this.d = str;
        this.e = list;
        this.f = list2;
        this.b = function1;
        this.V = function12;
        this.c = gu5Var;
        this.W = function13;
        this.X = b5gVar;
        this.Y = hw9Var;
        this.Z = hz1Var;
    }
}
