package defpackage;

import com.indeed.android.jobsearch.bottomnav.NullPostApplyConfirmUrlException;
import defpackage.s87;
import defpackage.sp7;
import defpackage.xh8;
import java.util.ArrayList;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class bp6 implements xh8 {
    public final Lazy a = boa.E(qt8.a, new a(this));
    public final tx5 b = new tx5();

    public static final class a extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(bp6 bp6Var) {
            super(0);
            this.$this_inject = bp6Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    public static void b(String str) {
        str.getClass();
        ((tp7) cr8.p(tp7.class)).b(new sp7.f(2, "ian-file-chooser", null, new yz4(str, 1)));
    }

    public final gz4 a() {
        return (gz4) this.a.getValue();
    }

    public final void c(String str, String str2) {
        str2.getClass();
        Lazy<s87> lazy = s87.f;
        s87.a.a(a(), this.b.o(str, str2));
    }

    public final void e(String str, String str2, boolean z) {
        Lazy<s87> lazy = s87.f;
        s87.a.a(a(), new lx5("navigation_forward", "navigation", "navigationForward", 1, this.b.a, new iy5(str, str2, Boolean.valueOf(z), null)));
    }

    public final void f(boolean z, nhb nhbVar) {
        Object obj;
        nhbVar.getClass();
        String str = nhbVar.a;
        if (str == null || (obj = yhg.a.b(str, str).a) == null) {
            obj = "nullUrl";
        }
        String strI = z ? t40.i(obj, "fsdv_webview_") : t40.i(obj, "indeed_webview_");
        Lazy<s87> lazy = s87.f;
        gz4 gz4VarA = a();
        String str2 = nhbVar.b;
        if (str2 == null) {
            str2 = "null";
        }
        String str3 = nhbVar.c;
        tx5 tx5Var = this.b;
        tx5Var.getClass();
        s87.a.a(gz4VarA, new lx5("impression_alert_view", "impression", "alertView", 1, tx5Var.a, new yx5(strI, str2, str3)));
    }

    public final void g(String str, boolean z) {
        Lazy<s87> lazy = s87.f;
        s87.a.a(a(), tx5.k(this.b, z ? "ian-post-apply-banner-fsdv" : "ian-post-apply-banner", "view-my-applications", new zz4(str, 1), 4));
        if (str == null) {
            ArrayList arrayList = lz2.a;
            lz2.b("IanLogger", "Null confirmUrl error", false, new NullPostApplyConfirmUrlException());
        }
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    public final void h(String str) {
        Lazy<s87> lazy = s87.f;
        s87.a.a(a(), tx5.k(this.b, str, "system-back", null, 12));
    }

    public final void i(String str) {
        Lazy<s87> lazy = s87.f;
        s87.a.a(a(), tx5.k(this.b, str, "top-nav-back", null, 12));
    }

    public final void j(String str) {
        Lazy<s87> lazy = s87.f;
        s87.a.a(a(), tx5.k(this.b, str, "top-nav-close", null, 12));
    }

    public final void k(String str, String str2, String str3) {
        str.getClass();
        Lazy<s87> lazy = s87.f;
        gz4 gz4VarA = a();
        zk2 zk2Var = zk2.c;
        tx5 tx5Var = this.b;
        tx5Var.getClass();
        zk2Var.getClass();
        s87.a.a(gz4VarA, new lx5("webview_will_appear", "impression", "webviewWillAppear", 1, tx5Var.a, new xy5(str, str2, str3, zk2Var)));
    }
}
