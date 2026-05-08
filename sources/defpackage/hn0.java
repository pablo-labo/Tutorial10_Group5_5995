package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.indeed.android.jobsearch.BuildConfig;
import defpackage.xh8;
import java.util.ArrayList;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class hn0 implements xh8 {
    public final Lazy a = boa.E(qt8.a, new a(this));

    public static final class a extends mj8 implements gu5<Context> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(hn0 hn0Var) {
            super(0);
            this.$this_inject = hn0Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [android.content.Context, java.lang.Object] */
        @Override // defpackage.gu5
        public final Context invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(Context.class), a9cVar);
        }
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder("utm_source=android_app");
        if (str != null) {
            sb.append("&utm_medium=");
            sb.append(Uri.encode(str));
        }
        sb.append("&utm_content=v");
        sb.append(Uri.encode(BuildConfig.VERSION_NAME));
        return sb.toString();
    }

    public final void b(String str) {
        Lazy lazy = this.a;
        try {
            Uri uriBuild = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.indeed.android.jobsearch").appendQueryParameter("referrer", a(str)).build();
            ArrayList arrayList = lz2.a;
            lz2.d("AppStoreHelper", "Opening play market URI: " + uriBuild, false, null);
            uriBuild.getClass();
            Intent intent = new Intent("android.intent.action.VIEW", uriBuild);
            intent.addFlags(268435456);
            ((Context) lazy.getValue()).startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Uri uriBuild2 = Uri.parse("https://play.google.com/store/apps/details").buildUpon().appendQueryParameter("id", "com.indeed.android.jobsearch").appendQueryParameter("hl", d93.e()).appendQueryParameter("referrer", a(str)).build();
            ArrayList arrayList2 = lz2.a;
            lz2.d("AppStoreHelper", "Opening play https URI: " + uriBuild2, false, null);
            uriBuild2.getClass();
            Intent intent2 = new Intent("android.intent.action.VIEW", uriBuild2);
            intent2.addFlags(268435456);
            ((Context) lazy.getValue()).startActivity(intent2);
        }
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
