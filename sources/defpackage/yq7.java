package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.g;
import androidx.navigation.e;
import androidx.navigation.k;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.bottomnav.IanInitialState;
import com.indeed.android.jobsearch.tare.nav.a;
import defpackage.nq7;
import defpackage.os7;
import defpackage.sp7;
import defpackage.ur7;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yq7 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yq7(String str, String str2, gu5 gu5Var) {
        this.a = 2;
        this.c = str;
        this.b = str2;
        this.d = gu5Var;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        String str;
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                e eVar = (e) obj3;
                String str2 = (String) obj2;
                a aVar = (a) obj;
                k kVarI = eVar.i();
                if (kVarI == null || kVarI.W != R.id.ianMainFragment) {
                    Serializable ianInitialState = new IanInitialState(xj1.V, null, str2, 2);
                    Bundle bundle = new Bundle();
                    if (Parcelable.class.isAssignableFrom(IanInitialState.class)) {
                        bundle.putParcelable("initialState", (Parcelable) ianInitialState);
                    } else if (Serializable.class.isAssignableFrom(IanInitialState.class)) {
                        bundle.putSerializable("initialState", ianInitialState);
                    }
                    bundle.putBoolean("fromOnboarding", false);
                    bundle.putBoolean("fromRegPromo", false);
                    eVar.n(R.id.navActionDirectlyBottomNav, bundle);
                } else {
                    aVar.V.k(new jz2<>(str2));
                }
                break;
            case 1:
                FragmentManager fragmentManager = (FragmentManager) obj3;
                boolean z = ((nq7.f) ((nq7) obj2)).a.c;
                ze zeVar = new ze((Function1) obj, 2);
                fragmentManager.getClass();
                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(fragmentManager);
                Fragment fragmentD = fragmentManager.D("PassportSignInWebViewFragment");
                if (fragmentD != null) {
                    ((h5b) fragmentD).E();
                }
                h5b h5bVar = new h5b();
                h5bVar.setArguments(aq1.a(new Pair("passport_is_continue_with_google", Boolean.valueOf(z))));
                h5bVar.z0 = zeVar;
                h5bVar.L(fragmentManager, "PassportSignInWebViewFragment");
                aVar2.h(false);
                break;
            case 2:
                String str3 = (String) obj2;
                String str4 = (String) obj3;
                str3.getClass();
                str4.getClass();
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("rich-profile-home-screen", "richProfileMissingDetailsAlertClose", null, new xq9(str3, str4, 1), 4));
                ((gu5) obj).invoke();
                break;
            default:
                vr7 vr7Var = (vr7) cr8.p(vr7.class);
                lr5 lr5VarU = ((g) obj3).u();
                lr5VarU.getClass();
                os7.d dVar = new os7.d(null, new d0c((wu5) obj, 1));
                zie zieVar = (zie) z92.Q0(((svb) obj2).Q);
                if (zieVar == null || (str = zieVar.a) == null) {
                    str = "";
                }
                vr7Var.b(lr5VarU, dVar, new ur7.c(str));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ yq7(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
