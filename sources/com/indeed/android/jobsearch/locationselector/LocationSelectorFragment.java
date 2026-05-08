package com.indeed.android.jobsearch.locationselector;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.indeed.android.jobsearch.R;
import defpackage.a9c;
import defpackage.ah2;
import defpackage.an0;
import defpackage.boa;
import defpackage.cr8;
import defpackage.fr5;
import defpackage.frg;
import defpackage.fwc;
import defpackage.g99;
import defpackage.gu5;
import defpackage.gz4;
import defpackage.h19;
import defpackage.h99;
import defpackage.i99;
import defpackage.iwc;
import defpackage.j19;
import defpackage.ja;
import defpackage.kpg;
import defpackage.m99;
import defpackage.mj8;
import defpackage.n19;
import defpackage.naa;
import defpackage.os5;
import defpackage.pnb;
import defpackage.q19;
import defpackage.q6;
import defpackage.qf8;
import defpackage.qt8;
import defpackage.tp7;
import defpackage.tx5;
import defpackage.w3a;
import defpackage.wm2;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jobsearch/locationselector/LocationSelectorFragment;", "Lan0;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LocationSelectorFragment extends an0 {
    public static final /* synthetic */ qf8<Object>[] f = {fwc.a.e(new w3a(LocationSelectorFragment.class, "binding", "getBinding()Lcom/indeed/android/jobsearch/databinding/FragmentLocationSelectorBinding;", 0))};
    public final wm2 a = new wm2();
    public final frg b;
    public final naa c;
    public final Lazy d;
    public final tx5 e;

    public static final class a extends mj8 implements gu5<gz4> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LocationSelectorFragment locationSelectorFragment) {
            super(0);
            this.$this_inject = locationSelectorFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    public static final class b extends mj8 implements gu5<Bundle> {
        final /* synthetic */ Fragment $this_navArgs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LocationSelectorFragment locationSelectorFragment) {
            super(0);
            this.$this_navArgs = locationSelectorFragment;
        }

        @Override // defpackage.gu5
        public final Bundle invoke() {
            Bundle arguments = this.$this_navArgs.getArguments();
            if (arguments != null) {
                return arguments;
            }
            ja.q("Fragment ", this.$this_navArgs, " has null arguments");
            return null;
        }
    }

    public LocationSelectorFragment() {
        iwc iwcVar = fwc.a;
        this.b = os5.a(this, iwcVar.b(m99.class), new g99(this), new h99(this), new i99(this));
        this.c = new naa(iwcVar.b(q19.class), new b(this));
        this.d = boa.E(qt8.a, new a(this));
        this.e = new tx5();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final q19 E() {
        return (q19) this.c.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_location_selector, viewGroup, false);
        if (viewInflate == null) {
            ja.k("rootView");
            return null;
        }
        ComposeView composeView = (ComposeView) viewInflate;
        fr5 fr5Var = new fr5(composeView, composeView);
        qf8<Object>[] qf8VarArr = f;
        qf8<Object> qf8Var = qf8VarArr[0];
        wm2 wm2Var = this.a;
        wm2Var.d(qf8Var, this, fr5Var);
        com.indeed.android.jobsearch.locationselector.a aVar = com.indeed.android.jobsearch.locationselector.a.a;
        List listA = com.indeed.android.jobsearch.locationselector.a.a(E().a);
        List listA2 = com.indeed.android.jobsearch.locationselector.a.a(E().b);
        q6.n("country-selector", null, null, 6, (tp7) cr8.p(tp7.class));
        j19.b((gz4) this.d.getValue(), h19.IP_COUNTRY_MISMATCH, E().b, false, null, null, 24);
        ComposeView composeView2 = ((fr5) wm2Var.b(qf8VarArr[0], this)).b;
        composeView2.setViewCompositionStrategy(kpg.a.a);
        composeView2.setContent(new ah2(1616174900, new n19(i, this, listA, listA2), true));
        return ((fr5) wm2Var.b(qf8VarArr[0], this)).a;
    }
}
