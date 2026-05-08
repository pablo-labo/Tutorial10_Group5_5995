package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f;
import defpackage.grg;
import defpackage.p63;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw0g;", "Landroidx/fragment/app/f;", "<init>", "()V", "uiplugin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class w0g extends f {
    public final frg f0;

    public static final class a extends mj8 implements gu5<Fragment> {
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w0g w0gVar) {
            super(0);
            this.$this_viewModels = w0gVar;
        }

        @Override // defpackage.gu5
        public final Fragment invoke() {
            return this.$this_viewModels;
        }
    }

    public static final class b extends mj8 implements gu5<jrg> {
        final /* synthetic */ gu5 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.$ownerProducer = aVar;
        }

        @Override // defpackage.gu5
        public final jrg invoke() {
            return (jrg) this.$ownerProducer.invoke();
        }
    }

    public static final class c extends mj8 implements gu5<irg> {
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            irg viewModelStore = ((jrg) this.$owner$delegate.getValue()).getViewModelStore();
            viewModelStore.getClass();
            return viewModelStore;
        }
    }

    public static final class d extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Lazy $owner$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Lazy lazy) {
            super(0);
            this.$owner$delegate = lazy;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            if (gu5Var != null && (p63Var = (p63) gu5Var.invoke()) != null) {
                return p63Var;
            }
            jrg jrgVar = (jrg) this.$owner$delegate.getValue();
            hg6 hg6Var = jrgVar instanceof hg6 ? (hg6) jrgVar : null;
            p63 defaultViewModelCreationExtras = hg6Var != null ? hg6Var.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? p63.a.b : defaultViewModelCreationExtras;
        }
    }

    public static final class e extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Lazy $owner$delegate;
        final /* synthetic */ Fragment $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w0g w0gVar, Lazy lazy) {
            super(0);
            this.$this_viewModels = w0gVar;
            this.$owner$delegate = lazy;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            grg.c defaultViewModelProviderFactory;
            jrg jrgVar = (jrg) this.$owner$delegate.getValue();
            hg6 hg6Var = jrgVar instanceof hg6 ? (hg6) jrgVar : null;
            if (hg6Var == null || (defaultViewModelProviderFactory = hg6Var.getDefaultViewModelProviderFactory()) == null) {
                defaultViewModelProviderFactory = this.$this_viewModels.getDefaultViewModelProviderFactory();
            }
            defaultViewModelProviderFactory.getClass();
            return defaultViewModelProviderFactory;
        }
    }

    public w0g() {
        Lazy lazyE = boa.E(qt8.c, new b(new a(this)));
        this.f0 = os5.a(this, fwc.a.b(xk1.class), new c(lazyE), new d(lazyE), new e(this, lazyE));
    }

    public abstract void M(int i, androidx.compose.runtime.b bVar);

    public final xk1 N() {
        return (xk1) this.f0.getValue();
    }

    public void O() {
    }

    public final void P(boolean z) {
        xk1 xk1VarN = N();
        eq3 eq3Var = a74.a;
        k89 k89Var = m89.a;
        k89Var.getClass();
        u63.Y(f13.a(k89Var), null, null, new wk1(xk1VarN, z, null), 3);
    }

    public final void close() {
        synchronized (this) {
            try {
                if (N().d) {
                    ArrayList arrayList = lz2.a;
                    lz2.d("UIPCustomBottomSheetModal", "close(): already closing", false, null);
                } else {
                    xk1 xk1VarN = N();
                    u63.Y(ee3.p(xk1VarN), null, null, new vk1(xk1VarN, null), 3);
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        N().e.e(getViewLifecycleOwner(), new cq9(new q3(this, 6), 2));
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6);
        composeView.setContent(new ah2(-1128293392, new he4(this, 11), true));
        return composeView;
    }

    @Override // androidx.fragment.app.f, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        O();
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        Window window2;
        super.onStart();
        Dialog dialog = this.a0;
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog2 = this.a0;
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
    }
}
