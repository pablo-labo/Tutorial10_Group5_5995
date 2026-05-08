package defpackage;

import androidx.fragment.app.FragmentManager;
import com.indeed.android.jobsearch.tare.nav.a;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w93 implements gu5 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ w93(gu5 gu5Var, fw9 fw9Var, e13 e13Var, hee heeVar, gu5 gu5Var2) {
        this.b = gu5Var;
        this.d = fw9Var;
        this.e = e13Var;
        this.f = heeVar;
        this.c = gu5Var2;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                fw9 fw9Var = (fw9) obj3;
                e13 e13Var = (e13) obj2;
                hee heeVar = (hee) obj;
                gu5 gu5Var = (gu5) obj4;
                if (!((Boolean) ((gu5) obj5).invoke()).booleanValue() && fw9Var.b) {
                    u63.Y(e13Var, null, null, new y93(heeVar, null), 3).d0(new cu(gu5Var, 3));
                }
                break;
            default:
                FragmentManager fragmentManager = (FragmentManager) obj2;
                Function1 function1 = (Function1) obj;
                try {
                    aec.a((er7) obj5, fragmentManager, (String) obj4, (String) obj3, function1).L(fragmentManager, "RnOnboardingBottomSheet");
                } catch (Exception e) {
                    ((np7) cr8.p(np7.class)).c("JSTNavigatorImpl", bg.e(e, "Error opening onboarding modal: "), false, e);
                    function1.invoke(rra.b);
                }
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ w93(er7 er7Var, String str, String str2, FragmentManager fragmentManager, Function1 function1, a aVar) {
        this.b = er7Var;
        this.c = str;
        this.d = str2;
        this.e = fragmentManager;
        this.f = function1;
    }
}
