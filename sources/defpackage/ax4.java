package defpackage;

import android.view.View;
import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import defpackage.o97;
import defpackage.xzg;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ax4 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ax4(Function1 function1, String str, gu5 gu5Var, int i) {
        this.a = 4;
        this.c = function1;
        this.b = str;
        this.d = gu5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        Object obj4 = this.b;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                cx4.b(ka2.L(1), (gu5) obj3, (b) obj, (String) obj4, (String) obj5);
                break;
            case 1:
                ((Integer) obj2).getClass();
                vu6.b((ArrayList) obj4, (e) obj5, (wu6) obj3, (b) obj, ka2.L(1));
                break;
            case 2:
                o97 o97Var = (o97) obj4;
                twg twgVar = (twg) obj5;
                gu5 gu5Var = (gu5) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 2;
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    WeakHashMap<View, xzg> weakHashMap = xzg.v;
                    plg plgVar = xzg.a.c(bVar).j;
                    o97.a aVar = o97Var.c;
                    qi0.c(bh2.c(-350653693, new lb(twgVar, 10), bVar), f.j(e.a.b, 0.0f, 10.0f, 0.0f, 0.0f, 13), null, bh2.c(2124301560, new op6(gu5Var, i2), bVar), 0.0f, plgVar, tnf.a(aVar.b.g.a, 0L, 0L, aVar.a.c, 0L, bVar, 22), bVar, 3126, 148);
                } else {
                    bVar.D();
                }
                break;
            case 3:
                iuc iucVar = (iuc) obj4;
                xsd xsdVar = (xsd) obj5;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                iucVar.element += xsdVar.d(xsdVar.g(((afa) obj3).a(xsdVar.h(xsdVar.d(fFloatValue - iucVar.element)))));
                break;
            default:
                ((Integer) obj2).getClass();
                r8g.a((Function1) obj5, (String) obj4, (gu5) obj3, (b) obj, ka2.L(55));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ ax4(Serializable serializable, Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = serializable;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ ax4(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
