package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.g;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lija;", "Liw8;", "Lf8b;", "Lpmc;", "<init>", "()V", "reactnative_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class ija extends iw8 implements f8b, pmc {
    public ekc a;
    public hja b;
    public boolean c;

    public final void E() {
        ekc ekcVar = this.a;
        if (ekcVar != null) {
            ekcVar.f();
        } else {
            wl7.g("reactDelegate");
            throw null;
        }
    }

    public final boolean F() {
        boolean z = isResumed() && isVisible();
        View view = getView();
        return z && (view != null && view.getVisibility() == 0);
    }

    @Override // defpackage.iw8
    public final String getViewName() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("arg_component_name")) == null) ? "NonDestructiveReactFragment_unknown" : string;
    }

    @Override // defpackage.pmc
    public final void i() {
        hja hjaVar;
        hja hjaVar2 = this.b;
        if (hjaVar2 != null) {
            hjaVar2.f(false);
        }
        ((np7) cr8.p(np7.class)).e("NonDestructiveReactFragment", getViewName().concat(" pass the back press handling to next handler"));
        requireActivity().r().d();
        if (this.c || (hjaVar = this.b) == null) {
            return;
        }
        hjaVar.f(F());
    }

    @Override // androidx.fragment.app.Fragment
    @sy3
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ekc ekcVar = this.a;
        if (ekcVar != null) {
            ekcVar.e(i, i2, intent, false);
        } else {
            wl7.g("reactDelegate");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
        } catch (Throwable unused) {
            ((np7) cr8.p(np7.class)).e("NonDestructiveReactFragment", "RN Fragment shouldn't be restored on Android, see https://link.indeed.tech/GLYXRZD6Y. We can't prevent this in LaunchActivity and we have to call super.create(...) so we catch the exception here and log it. This should not be a cause for concern.");
        }
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("arg_component_name") : null;
        Bundle arguments2 = getArguments();
        Bundle bundle2 = arguments2 != null ? arguments2.getBundle("arg_launch_options") : null;
        if (string == null) {
            r6.g("Cannot loadApp if component name is null");
            return;
        }
        g gVarRequireActivity = requireActivity();
        gVarRequireActivity.getClass();
        ComponentCallbacks2 application = requireActivity().getApplication();
        application.getClass();
        this.a = new ekc(gVarRequireActivity, ((pjc) application).b(), string, bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ekc ekcVar = this.a;
        if (ekcVar == null) {
            wl7.g("reactDelegate");
            throw null;
        }
        String str = ekcVar.c;
        if (str == null) {
            l5.q("Cannot loadApp without a main component name.");
            return null;
        }
        ekcVar.d(str);
        ekc ekcVar2 = this.a;
        if (ekcVar2 == null) {
            wl7.g("reactDelegate");
            throw null;
        }
        if (!ie7.g0.enableBridgelessArchitecture()) {
            return ekcVar2.b;
        }
        poc pocVar = ekcVar2.h;
        if (pocVar != null) {
            return (wnc) pocVar.b();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ekc ekcVar = this.a;
        if (ekcVar != null) {
            ekcVar.h();
        } else {
            wl7.g("reactDelegate");
            throw null;
        }
    }

    @Override // defpackage.iw8, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        hja hjaVar = this.b;
        if (hjaVar != null) {
            hjaVar.f(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @sy3
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // defpackage.iw8, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.c) {
            return;
        }
        boolean zF = F();
        hja hjaVar = this.b;
        if (hjaVar != null) {
            hjaVar.f(zF);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        this.b = new hja(this);
        dqa dqaVarR = requireActivity().r();
        zv8 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        hja hjaVar = this.b;
        hjaVar.getClass();
        dqaVarR.a(viewLifecycleOwner, hjaVar);
    }

    @Override // defpackage.f8b
    @sy3
    public final void x(String[] strArr, int i, g8b g8bVar) throws Exception {
        strArr.getClass();
        requestPermissions(strArr, i);
    }
}
