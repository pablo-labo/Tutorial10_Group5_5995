package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import defpackage.pgd;
import defpackage.xh8;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public final class e2g implements v1g, xh8 {
    public final Lazy a = boa.E(qt8.a, new a(this));

    public static final class a extends mj8 implements gu5<p87> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e2g e2gVar) {
            super(0);
            this.$this_inject = e2gVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, p87] */
        @Override // defpackage.gu5
        public final p87 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(p87.class), a9cVar);
        }
    }

    @Override // defpackage.v1g
    public final String a() {
        return ((p87) this.a.getValue()).e();
    }

    @Override // defpackage.v1g
    public final void b(FragmentManager fragmentManager, String str) {
        str.getClass();
        fragmentManager.getClass();
        pgd pgdVarB = yhg.a.b(str, str);
        if (pgdVarB instanceof pgd.t) {
            kqg.a(str, fragmentManager, false, "messaging");
            return;
        }
        if (pgdVarB instanceof pgd.m) {
            qr0 qr0Var = new qr0(16);
            ym0 ym0Var = new ym0(16);
            IndeedApplyWebViewFragment indeedApplyWebViewFragment = new IndeedApplyWebViewFragment();
            Bundle bundle = new Bundle();
            bundle.putString("KEY_APPLY_URL", str);
            indeedApplyWebViewFragment.setArguments(bundle);
            indeedApplyWebViewFragment.G0 = qr0Var;
            indeedApplyWebViewFragment.H0 = ym0Var;
            indeedApplyWebViewFragment.L(fragmentManager, "IndeedApplyWebViewFragment");
            return;
        }
        if (!(pgdVarB instanceof pgd.m0)) {
            ka2.H(str, false, false, fragmentManager);
            return;
        }
        List<Fragment> listF = fragmentManager.c.f();
        listF.getClass();
        Fragment fragment = (Fragment) z92.Q0(listF);
        Context context = fragment != null ? fragment.getContext() : null;
        if (context == null) {
            ArrayList arrayList = lz2.a;
            lz2.c("openTELNavigationAction", "Failed to redirect to external browser, Fragment is not attached to an activity", false, null, 8);
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
            return;
        }
        Exception exc = new Exception("package manager returned null");
        ArrayList arrayList2 = lz2.a;
        lz2.b("openTELNavigationAction", "no supported app found on the device to open the Url", false, exc);
    }

    @Override // defpackage.v1g
    public final OkHttpClient c() {
        epa epaVar = epa.a;
        return (OkHttpClient) epa.b0.getValue();
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
