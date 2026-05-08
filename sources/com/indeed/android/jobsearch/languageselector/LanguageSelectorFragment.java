package com.indeed.android.jobsearch.languageselector;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.indeed.android.jobsearch.R;
import defpackage.a9c;
import defpackage.ah2;
import defpackage.an0;
import defpackage.boa;
import defpackage.cr8;
import defpackage.er5;
import defpackage.fwc;
import defpackage.gu5;
import defpackage.gz4;
import defpackage.ja;
import defpackage.kpg;
import defpackage.mj8;
import defpackage.pnb;
import defpackage.q6;
import defpackage.qf8;
import defpackage.qt8;
import defpackage.t5;
import defpackage.tp7;
import defpackage.tx5;
import defpackage.w3a;
import defpackage.wm2;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jobsearch/languageselector/LanguageSelectorFragment;", "Lan0;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LanguageSelectorFragment extends an0 {
    public static final /* synthetic */ qf8<Object>[] d = {fwc.a.e(new w3a(LanguageSelectorFragment.class, "binding", "getBinding()Lcom/indeed/android/jobsearch/databinding/FragmentLanguageSelectorBinding;", 0))};
    public final wm2 a = new wm2();
    public final Lazy b = boa.E(qt8.a, new a(this));
    public final tx5 c = new tx5();

    public static final class a extends mj8 implements gu5<gz4> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LanguageSelectorFragment languageSelectorFragment) {
            super(0);
            this.$this_inject = languageSelectorFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        q6.n("language-selector", null, null, 6, (tp7) cr8.p(tp7.class));
        View viewInflate = layoutInflater.inflate(R.layout.fragment_language_selector, viewGroup, false);
        if (viewInflate == null) {
            ja.k("rootView");
            return null;
        }
        ComposeView composeView = (ComposeView) viewInflate;
        er5 er5Var = new er5(composeView, composeView);
        qf8<Object>[] qf8VarArr = d;
        qf8<Object> qf8Var = qf8VarArr[0];
        wm2 wm2Var = this.a;
        wm2Var.d(qf8Var, this, er5Var);
        ComposeView composeView2 = ((er5) wm2Var.b(qf8VarArr[0], this)).b;
        composeView2.setViewCompositionStrategy(kpg.a.a);
        composeView2.setContent(new ah2(-1708362773, new t5(this, 3), true));
        return ((er5) wm2Var.b(qf8VarArr[0], this)).a;
    }
}
