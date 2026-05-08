package com.indeed.android.jobsearch.forcedupgrade;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import defpackage.a9c;
import defpackage.ah2;
import defpackage.an0;
import defpackage.boa;
import defpackage.fwc;
import defpackage.gu5;
import defpackage.hn0;
import defpackage.mj8;
import defpackage.pj;
import defpackage.pnb;
import defpackage.qt8;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jobsearch/forcedupgrade/ForcedUpgradeFragment;", "Lan0;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ForcedUpgradeFragment extends an0 {
    public final Lazy a = boa.E(qt8.a, new a(this));

    public static final class a extends mj8 implements gu5<hn0> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ForcedUpgradeFragment forcedUpgradeFragment) {
            super(0);
            this.$this_inject = forcedUpgradeFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [hn0, java.lang.Object] */
        @Override // defpackage.gu5
        public final hn0 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(hn0.class), a9cVar);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6);
        composeView.setContent(new ah2(-25529901, new pj(this, 4), true));
        return composeView;
    }
}
