package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import defpackage.grg;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lahc;", "Lbn0;", "<init>", "()V", "reactnative_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ahc extends bn0 {
    public final frg d = os5.a(this, fwc.a.b(c6f.class), new a(this), new b(this), new c(this));

    public static final class a extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ahc ahcVar) {
            super(0);
            this.$this_activityViewModels = ahcVar;
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
        public b(ahc ahcVar) {
            super(0);
            this.$this_activityViewModels = ahcVar;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class c extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ahc ahcVar) {
            super(0);
            this.$this_activityViewModels = ahcVar;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public abstract xj1 G();

    @Override // defpackage.ija, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        if (((h2g) cr8.p(h2g.class)).f()) {
            ((c6f) this.d.getValue()).l(G()).g.e(getViewLifecycleOwner(), new fq6(new pe0(this, 11), 1));
        }
    }
}
