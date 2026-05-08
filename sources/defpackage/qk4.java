package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.a;
import androidx.navigation.e;
import androidx.navigation.k;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.bottomnav.IanInitialState;
import com.indeed.android.jsmappservices.bridge.ModalPresentationMode;
import com.indeed.android.jsmappservices.bridge.ShowModalWithWebviewData;
import defpackage.sp7;
import java.io.Serializable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qk4 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qk4(g4a g4aVar, String str, Function1 function1) {
        this.a = 3;
        this.c = str;
        this.b = function1;
        this.d = g4aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj2;
                av8 av8Var = (av8) obj3;
                ((g4a) obj).setValue(Boolean.FALSE);
                function1.invoke(av8Var != null ? av8Var.a : null);
                break;
            case 1:
                Function1<? super ms7, j6g> function12 = (Function1) obj2;
                ShowModalWithWebviewData showModalWithWebviewData = (ShowModalWithWebviewData) obj3;
                lr5 lr5Var = (lr5) obj;
                qub qubVar = new qub();
                Bundle bundle = new Bundle();
                bundle.putString("MODAL_SHEET_URL", showModalWithWebviewData.a);
                bundle.putString("MODAL_SHEET_TITLE", showModalWithWebviewData.b);
                bundle.putBoolean("MODAL_SHEET_FULLSCREEN", ModalPresentationMode.c == showModalWithWebviewData.c);
                qubVar.setArguments(bundle);
                qubVar.t0 = function12;
                qubVar.K(new a(lr5Var), "WebViewBottomSheetModalFragment");
                break;
            case 2:
                e eVar = (e) obj2;
                String str = (String) obj3;
                com.indeed.android.jobsearch.tare.nav.a aVar = (com.indeed.android.jobsearch.tare.nav.a) obj;
                k kVarI = eVar.i();
                if (kVarI == null || kVarI.W != R.id.ianMainFragment) {
                    dd4 dd4Var = dd4.a;
                    Serializable ianInitialState = !dd4.f() ? new IanInitialState(xj1.d, null, str, 2) : (!dd4.f() || dd4.g()) ? new IanInitialState(xj1.b0, null, str, 2) : new IanInitialState(null, gxa.a, str, 1);
                    Bundle bundle2 = new Bundle();
                    if (Parcelable.class.isAssignableFrom(IanInitialState.class)) {
                        bundle2.putParcelable("initialState", (Parcelable) ianInitialState);
                    } else if (Serializable.class.isAssignableFrom(IanInitialState.class)) {
                        bundle2.putSerializable("initialState", ianInitialState);
                    }
                    bundle2.putBoolean("fromOnboarding", false);
                    bundle2.putBoolean("fromRegPromo", false);
                    eVar.n(R.id.navActionDirectlyBottomNav, bundle2);
                } else {
                    aVar.e.k(new jz2<>(str));
                }
                break;
            default:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g((String) obj3, "save", null, null, 12));
                ((Function1) obj2).invoke(((jhf) ((g4a) obj).getValue()).a.b);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ qk4(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
