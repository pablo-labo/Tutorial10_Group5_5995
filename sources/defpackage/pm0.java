package defpackage;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.f;
import androidx.fragment.app.g;
import defpackage.s87;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpm0;", "Landroidx/fragment/app/f;", "<init>", "()V", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class pm0 extends f {
    public final Lazy f0;
    public final tx5 g0;
    public final Lazy h0;

    public static final class a extends mj8 implements gu5<gz4> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pm0 pm0Var) {
            super(0);
            this.$this_inject = pm0Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    public static final class b extends mj8 implements gu5<hn0> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(pm0 pm0Var) {
            super(0);
            this.$this_inject = pm0Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [hn0, java.lang.Object] */
        @Override // defpackage.gu5
        public final hn0 invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(hn0.class), a9cVar);
        }
    }

    public pm0() {
        a aVar = new a(this);
        qt8 qt8Var = qt8.a;
        this.f0 = boa.E(qt8Var, aVar);
        this.g0 = new tx5();
        this.h0 = boa.E(qt8Var, new b(this));
    }

    @Override // androidx.fragment.app.f
    public final Dialog H(Bundle bundle) {
        g gVarRequireActivity = requireActivity();
        gVarRequireActivity.getClass();
        ArrayList arrayList = lz2.a;
        lz2.d("AppRatingMultiPromptFragment", "Creating app rating prompt", false, null);
        Lazy<s87> lazy = s87.f;
        s87.a.a(M(), tx5.g(this.g0, "app_rating_multi_prompt_base", null, 6));
        bu8.a.j(0);
        ComposeView composeView = new ComposeView(gVarRequireActivity, null, 6);
        composeView.setContent(new ah2(68352293, new nu(1, this, gVarRequireActivity), true));
        return new le9(gVarRequireActivity, 0).g(composeView).create();
    }

    public final gz4 M() {
        return (gz4) this.f0.getValue();
    }
}
