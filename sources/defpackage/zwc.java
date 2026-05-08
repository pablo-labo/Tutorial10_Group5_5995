package defpackage;

import android.net.Uri;
import defpackage.xh8;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class zwc implements xh8 {
    public static final Lazy a = boa.E(qt8.a, new a(new zwc()));

    public static final class a extends mj8 implements gu5<p87> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zwc zwcVar) {
            super(0);
            this.$this_inject = zwcVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, p87] */
        @Override // defpackage.gu5
        public final p87 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(p87.class), a9cVar);
        }
    }

    public static String a(String str) {
        String strE = d93.e();
        Uri.Builder builderBuildUpon = Uri.parse("https://hrtechprivacy.com").buildUpon();
        if (strE.equals("en")) {
            builderBuildUpon.path("brands/indeed");
        } else {
            builderBuildUpon.path(strE.concat("/brands/about-indeed"));
        }
        builderBuildUpon.fragment(str);
        String string = builderBuildUpon.toString();
        string.getClass();
        return string;
    }

    public static String b() {
        String strG = ((p87) a.getValue()).g();
        String strE = d93.e();
        Uri.Builder builderBuildUpon = Uri.parse(strG).buildUpon();
        builderBuildUpon.path("legal");
        builderBuildUpon.appendQueryParameter("hl", strE);
        String string = builderBuildUpon.toString();
        string.getClass();
        return string;
    }

    public static boolean c(String str) {
        str.getClass();
        Uri uri = Uri.parse(str);
        if (uri != null && wl7.b(uri.getScheme(), "https")) {
            return wl7.b(uri.getHost(), "hrtechprivacy.com");
        }
        return false;
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
