package com.indeed.android.jobsearch.tare.debug;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import defpackage.a1;
import defpackage.ah2;
import defpackage.an0;
import defpackage.aub;
import defpackage.frg;
import defpackage.fwc;
import defpackage.grg;
import defpackage.gu5;
import defpackage.irg;
import defpackage.iwc;
import defpackage.mj8;
import defpackage.o6;
import defpackage.ok4;
import defpackage.os5;
import defpackage.p63;
import defpackage.vh8;
import defpackage.xh8;
import defpackage.yvb;
import defpackage.zcd;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/indeed/android/jobsearch/tare/debug/ProfileUIPlatformDebugFragment;", "Lan0;", "Lxh8;", "<init>", "()V", "", "showIdlFeedbackToast", "", "toastMessage", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProfileUIPlatformDebugFragment extends an0 implements xh8 {
    public final zcd a = new zcd();
    public final frg b;
    public final frg c;

    public static final class a extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ProfileUIPlatformDebugFragment profileUIPlatformDebugFragment) {
            super(0);
            this.$this_activityViewModels = profileUIPlatformDebugFragment;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class b extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ProfileUIPlatformDebugFragment profileUIPlatformDebugFragment) {
            super(0);
            this.$this_activityViewModels = profileUIPlatformDebugFragment;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class c extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ProfileUIPlatformDebugFragment profileUIPlatformDebugFragment) {
            super(0);
            this.$this_activityViewModels = profileUIPlatformDebugFragment;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class d extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ProfileUIPlatformDebugFragment profileUIPlatformDebugFragment) {
            super(0);
            this.$this_activityViewModels = profileUIPlatformDebugFragment;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class e extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ProfileUIPlatformDebugFragment profileUIPlatformDebugFragment) {
            super(0);
            this.$this_activityViewModels = profileUIPlatformDebugFragment;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public ProfileUIPlatformDebugFragment() {
        a1 a1Var = new a1(this, 20);
        iwc iwcVar = fwc.a;
        this.b = os5.a(this, iwcVar.b(yvb.class), new a(this), new b(this), a1Var);
        this.c = os5.a(this, iwcVar.b(aub.class), new c(this), new d(this), new e(this));
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6);
        composeView.setContent(new ah2(330832133, new ok4(this, 5), true));
        return composeView;
    }
}
