package defpackage;

import androidx.compose.ui.layout.w;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import com.indeed.android.profile.screens.sheets.profilesubtab.skills.a;
import defpackage.m7e;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class na implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ na(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 0;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ra raVar = (ra) obj2;
                av8 av8Var = (av8) obj;
                av8Var.getClass();
                ((yvb) raVar.i0.getValue()).h(av8Var, new qa(raVar, i2));
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                ((f51) obj2).i(str);
                break;
            case 2:
                p91 p91Var = (p91) obj2;
                qf8<Object>[] qf8VarArr = p91.i0;
                if (((ik3) p91Var.e0.getValue()).b && p91Var.getR0() != xj1.b) {
                    ArrayList arrayList = lz2.a;
                    lz2.d("BaseIanTabWebViewFragment", "UIPContext.deeplink.notifyDeepLinkLoadCompleted()", false, null);
                    ((c1g) cr8.p(c1g.class)).a();
                }
                break;
            case 3:
                gu5 gu5Var = (gu5) obj2;
                mif mifVar = (mif) obj;
                mifVar.getClass();
                if (mifVar.b.f > 1) {
                    gu5Var.invoke();
                }
                break;
            case 4:
                ljg ljgVar = (ljg) obj;
                ljgVar.getClass();
                ((Function1) obj2).invoke(ljgVar);
                break;
            case 5:
                rh4 rh4Var = (rh4) obj2;
                av8 av8Var2 = (av8) obj;
                av8Var2.getClass();
                rh4Var.Q().q(av8Var2, new cq0(rh4Var, 4));
                break;
            case 6:
                a aVar = (a) obj2;
                zie zieVar = (zie) obj;
                zieVar.getClass();
                aVar.Q().Q(aVar.j0, zieVar);
                break;
            case 7:
                ((String) obj).getClass();
                d9f d9fVarN = ((IanMainFragment) obj2).N();
                d9fVarN.g("reengagementModal", "skip-for-now");
                Function1<? super zs7, j6g> function1 = d9fVarN.W;
                d9fVarN.W = null;
                if (function1 != null) {
                    function1.invoke(zs7.c);
                }
                break;
            case 8:
                cd6 cd6Var = (cd6) obj;
                cd6Var.getClass();
                cd6Var.b(((Number) ((ese) obj2).getValue()).floatValue());
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                et7 et7Var = (et7) obj;
                et7Var.getClass();
                ((mhb) obj2).getClass();
                mhb.i(et7Var);
                break;
            case 10:
                wqd wqdVar = (wqd) obj;
                wqdVar.getClass();
                break;
            case 11:
                atd atdVar = (atd) obj2;
                j62 j62Var = (j62) obj;
                j62Var.getClass();
                j62.a(j62Var, "type", mve.b);
                j62.a(j62Var, "value", i7e.b("kotlinx.serialization.Sealed<" + atdVar.a.r() + '>', m7e.a.a, new SerialDescriptor[0], new m91(atdVar, 12)));
                List<? extends Annotation> list = atdVar.b;
                list.getClass();
                j62Var.b = list;
                break;
            case 12:
                mud mudVar = (mud) obj2;
                int i3 = mud.t0;
                a09 a09Var = (a09) ((jz2) obj).a();
                if (a09Var != null) {
                    mudVar.c0();
                    mudVar.U(a09Var.a, false, true);
                    mudVar.k0 = true;
                }
                break;
            case 13:
                m6f m6fVar = (m6f) obj2;
                u4d u4dVar = (u4d) ((jz2) obj).a();
                if (u4dVar != null) {
                    m6fVar.M(u4dVar.a);
                }
                break;
            default:
                w.a.y((w.a) obj, (w) obj2, 0, 0);
                break;
        }
        return j6g.a;
    }
}
