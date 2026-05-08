package com.indeed.android.rnonboarding;

import android.os.Bundle;
import defpackage.a9c;
import defpackage.ai8;
import defpackage.aq1;
import defpackage.b24;
import defpackage.bn0;
import defpackage.boa;
import defpackage.e9a;
import defpackage.fwc;
import defpackage.gu5;
import defpackage.l6;
import defpackage.m19;
import defpackage.mj8;
import defpackage.ned;
import defpackage.qpd;
import defpackage.qt8;
import defpackage.u8;
import defpackage.u91;
import defpackage.vh8;
import defpackage.xh8;
import defpackage.z8;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/indeed/android/rnonboarding/RnOnboardingFragment;", "Lbn0;", "Lxh8;", "Lm19;", "<init>", "()V", "rnonboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RnOnboardingFragment extends bn0 implements xh8, m19 {
    public final Lazy d;
    public final Lazy e;
    public final z8<String[]> f;

    public static final class a extends mj8 implements gu5<ned> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RnOnboardingFragment rnOnboardingFragment) {
            super(0);
            this.$this_inject = rnOnboardingFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, ned] */
        @Override // defpackage.gu5
        public final ned invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(ned.class), a9cVar);
        }
    }

    public static final class b extends mj8 implements gu5<b24> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RnOnboardingFragment rnOnboardingFragment) {
            super(0);
            this.$this_inject = rnOnboardingFragment;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [b24, java.lang.Object] */
        @Override // defpackage.gu5
        public final b24 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(b24.class), a9cVar);
        }
    }

    public RnOnboardingFragment() {
        a aVar = new a(this);
        qt8 qt8Var = qt8.a;
        this.d = boa.E(qt8Var, aVar);
        this.e = boa.E(qt8Var, new b(this));
        z8<String[]> z8VarRegisterForActivityResult = registerForActivityResult(new u8(), new u91(this, 12));
        z8VarRegisterForActivityResult.getClass();
        this.f = z8VarRegisterForActivityResult;
    }

    @Override // defpackage.m19
    public final void A() {
        this.f.a(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // defpackage.m19
    public final boolean j() {
        return ((b24) this.e.getValue()).a.c();
    }

    @Override // defpackage.bn0, defpackage.ija, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Lazy lazy = this.d;
        e9a e9aVarA = e9a.a.a((String) ((ned) lazy.getValue()).b.invoke(), (String) ((ned) lazy.getValue()).a.invoke());
        Bundle bundleE = l6.e("arg_component_name", "Onboarding");
        bundleE.putBundle("arg_launch_options", aq1.a(new Pair("nativeContext", e9aVarA.toBundle()), new Pair("onCompleteCallbackId", null), new Pair("experienceKey", null), new Pair("experienceData", null), new Pair("skipExempt", null), new Pair("origin", null), new Pair("from", null)));
        bundleE.putBoolean("arg_fabric_enabled", false);
        setArguments(bundleE);
        super.onCreate(bundle);
    }
}
