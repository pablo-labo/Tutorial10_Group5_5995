package defpackage;

import android.os.Bundle;
import androidx.compose.runtime.n;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.indeed.android.jsmappservices.bridge.ModalPresentationMode;
import com.indeed.android.jsmappservices.bridge.ShowModalWithWebviewData;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vq7 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vq7(gu5 gu5Var, g4a g4aVar, Function1 function1) {
        this.a = 2;
        this.b = gu5Var;
        this.d = function1;
        this.c = g4aVar;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ShowModalWithWebviewData showModalWithWebviewData = (ShowModalWithWebviewData) obj3;
                FragmentManager fragmentManager = (FragmentManager) obj;
                ar7 ar7Var = new ar7((Function1) obj2, 0);
                fragmentManager.getClass();
                jk7 jk7Var = new jk7();
                Bundle bundle = new Bundle();
                bundle.putString("MODAL_SHEET_URL", showModalWithWebviewData.a);
                bundle.putString("MODAL_SHEET_TITLE", showModalWithWebviewData.b);
                bundle.putBoolean("MODAL_SHEET_FULLSCREEN", ModalPresentationMode.c == showModalWithWebviewData.c);
                jk7Var.setArguments(bundle);
                jk7Var.t0 = ar7Var;
                jk7Var.K(new a(fragmentManager), "WebViewBottomSheetModalFragment");
                return j6g.a;
            case 1:
                x20 x20Var = (x20) obj3;
                n nVar = (n) obj;
                tua tuaVar = (tua) obj2;
                if (x20Var != null) {
                    nVar.a(nVar.c(x20Var) - nVar.t);
                }
                List listA = el2.a(nVar, null, nVar.t, null);
                fl2 fl2Var = (fl2) z92.Z0(listA);
                Integer num = fl2Var != null ? fl2Var.a : null;
                List<fl2> listB = tuaVar.b(num);
                if (num != null && !listB.isEmpty()) {
                    fl2 fl2Var2 = (fl2) z92.O0(listB);
                    List listJ0 = z92.J0(listB, 1);
                    fl2Var2.getClass();
                    listB = z92.h1(u63.Z(new fl2(null, num)), listJ0);
                }
                return z92.h1(listA, listB);
            default:
                vje.f((gu5) obj3, (g4a) obj, (Function1) obj2);
                return j6g.a;
        }
    }

    public /* synthetic */ vq7(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
