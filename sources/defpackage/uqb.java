package defpackage;

import android.graphics.Bitmap;
import androidx.compose.runtime.b;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uqb implements Function2 {
    public final /* synthetic */ Object V;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ gu5 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ uqb(String str, Bitmap bitmap, String str2, gu5 gu5Var, boolean z, Integer num, int i) {
        this.d = str;
        this.e = bitmap;
        this.f = str2;
        this.b = gu5Var;
        this.c = z;
        this.V = num;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.V;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = ka2.L(1);
                yqb.f((List) obj6, this.c, this.b, (xu5) obj5, (xu5) obj4, (Function2) obj3, (b) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = ka2.L(1);
                b4g.c((String) obj6, (Bitmap) obj5, (String) obj4, this.b, this.c, (Integer) obj3, (b) obj, iL2);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ uqb(List list, boolean z, gu5 gu5Var, xu5 xu5Var, xu5 xu5Var2, Function2 function2, int i) {
        this.d = list;
        this.c = z;
        this.b = gu5Var;
        this.e = xu5Var;
        this.f = xu5Var2;
        this.V = function2;
    }
}
