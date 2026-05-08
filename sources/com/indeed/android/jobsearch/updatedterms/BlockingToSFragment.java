package com.indeed.android.jobsearch.updatedterms;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.datadog.android.trace.AndroidTracer;
import defpackage.ah2;
import defpackage.an0;
import defpackage.bu8;
import defpackage.c1f;
import defpackage.cr8;
import defpackage.e13;
import defpackage.frg;
import defpackage.fwc;
import defpackage.g13;
import defpackage.g4a;
import defpackage.gme;
import defpackage.grg;
import defpackage.gu5;
import defpackage.irg;
import defpackage.iwc;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.m99;
import defpackage.mca;
import defpackage.mj8;
import defpackage.o6;
import defpackage.os5;
import defpackage.p63;
import defpackage.r6;
import defpackage.r7d;
import defpackage.sp7;
import defpackage.tn0;
import defpackage.tp7;
import defpackage.uh3;
import defpackage.vgg;
import defpackage.xgg;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/indeed/android/jobsearch/updatedterms/BlockingToSFragment;", "Lan0;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BlockingToSFragment extends an0 {
    public final frg a;
    public final frg b;

    @uh3(c = "com.indeed.android.jobsearch.updatedterms.BlockingToSFragment$onCreateView$1$1$1$2$1$1", f = "BlockingToSFragment.kt", l = {AndroidTracer.SPAN_ID_BIT_SIZE}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ ComposeView $this_apply;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ComposeView composeView, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$this_apply = composeView;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return BlockingToSFragment.this.new a(this.$this_apply, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                g4a g4aVar = ((xgg) BlockingToSFragment.this.a.getValue()).b;
                ((gme) g4aVar).setValue(vgg.a((vgg) ((gme) g4aVar).getValue(), false));
                xgg xggVar = (xgg) BlockingToSFragment.this.a.getValue();
                this.label = 1;
                obj = xggVar.g(this);
                g13 g13Var = g13.a;
                if (obj == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                bu8 bu8Var = bu8.a;
                bu8Var.getClass();
                bu8.J0.b(bu8.b[47], bu8Var, Boolean.FALSE);
                ((m99) BlockingToSFragment.this.b.getValue()).d0 = false;
                m99 m99Var = (m99) BlockingToSFragment.this.b.getValue();
                ComposeView composeView = this.$this_apply;
                composeView.getClass();
                androidx.navigation.e eVarB = mca.b(composeView);
                androidx.fragment.app.g gVarRequireActivity = BlockingToSFragment.this.requireActivity();
                gVarRequireActivity.getClass();
                m99Var.h(gVarRequireActivity, eVarB);
            } else {
                ((tp7) cr8.p(tp7.class)).b(new sp7.c("BlockingToSFragment", "error-ui-saving-response", sp7.c.a.b, null, null, 24));
                g4a g4aVar2 = ((xgg) BlockingToSFragment.this.a.getValue()).b;
                ((gme) g4aVar2).setValue(vgg.a((vgg) ((gme) g4aVar2).getValue(), true));
            }
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BlockingToSFragment blockingToSFragment) {
            super(0);
            this.$this_activityViewModels = blockingToSFragment;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class c extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BlockingToSFragment blockingToSFragment) {
            super(0);
            this.$this_activityViewModels = blockingToSFragment;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class d extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(BlockingToSFragment blockingToSFragment) {
            super(0);
            this.$this_activityViewModels = blockingToSFragment;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class e extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(BlockingToSFragment blockingToSFragment) {
            super(0);
            this.$this_activityViewModels = blockingToSFragment;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class f extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(BlockingToSFragment blockingToSFragment) {
            super(0);
            this.$this_activityViewModels = blockingToSFragment;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class g extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(BlockingToSFragment blockingToSFragment) {
            super(0);
            this.$this_activityViewModels = blockingToSFragment;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public BlockingToSFragment() {
        iwc iwcVar = fwc.a;
        this.a = os5.a(this, iwcVar.b(xgg.class), new b(this), new c(this), new d(this));
        this.b = os5.a(this, iwcVar.b(m99.class), new e(this), new f(this), new g(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ((tp7) cr8.p(tp7.class)).b(new sp7.f(6, "BlockingToSFragment", null, null));
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6);
        composeView.setContent(new ah2(99543240, new tn0(2, this, composeView), true));
        return composeView;
    }
}
