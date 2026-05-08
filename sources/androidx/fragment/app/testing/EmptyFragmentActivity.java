package androidx.fragment.app.testing;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.fragment.app.g;
import com.indeed.android.jobsearch.R;
import defpackage.ar5;
import defpackage.br5;
import defpackage.fwc;
import defpackage.grg;
import defpackage.gu5;
import defpackage.hrg;
import defpackage.irg;
import defpackage.l5;
import defpackage.p63;
import defpackage.yd8;
import defpackage.yq5;
import defpackage.zq5;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/fragment/app/testing/EmptyFragmentActivity;", "Landroidx/fragment/app/g;", "<init>", "()V", "fragment-testing-manifest_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EmptyFragmentActivity extends g {
    @Override // androidx.fragment.app.g, androidx.activity.ComponentActivity, defpackage.dg2, android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public final void onCreate(Bundle bundle) {
        setTheme(getIntent().getIntExtra("androidx.fragment.app.testing.FragmentScenario.EmptyFragmentActivity.THEME_EXTRAS_BUNDLE_KEY", R.style.FragmentScenarioEmptyFragmentActivityTheme));
        gu5 zq5Var = br5.a;
        if (zq5Var == null) {
            zq5Var = new zq5(this);
        }
        yd8 yd8VarB = fwc.a.b(yq5.class);
        a aVar = new a(this);
        ar5 ar5Var = new ar5(this);
        irg viewModelStore = aVar.$this_viewModels.getViewModelStore();
        grg.c cVar = (grg.c) zq5Var.invoke();
        p63 p63Var = (p63) ar5Var.invoke();
        cVar.getClass();
        hrg hrgVar = new hrg(viewModelStore, cVar, p63Var);
        String strP = yd8VarB.p();
        if (strP == null) {
            l5.q("Local and anonymous classes can not be ViewModels");
        } else {
            super.onCreate(bundle);
        }
    }
}
