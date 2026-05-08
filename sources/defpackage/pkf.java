package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.c;
import com.indeed.android.jobsearch.R;
import defpackage.xh8;
import java.net.URISyntaxException;
import java.util.ArrayList;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class pkf implements xh8 {
    public static final Lazy a = boa.E(qt8.a, new a(new pkf()));

    public static final class a extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pkf pkfVar) {
            super(0);
            this.$this_inject = pkfVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    public static void a(Activity activity, Intent intent) {
        String action;
        activity.getClass();
        if (activity.isFinishing()) {
            return;
        }
        try {
            activity.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            ArrayList arrayList = lz2.a;
            lz2.c("ThirdPartyActivityLauncher", l5.l("failed to open intent: ", intent.toUri(1)), false, e, 4);
            Uri data = intent.getData();
            if (data == null || (action = data.toString()) == null) {
                action = intent.getAction();
            }
            c.a aVar = new c.a(activity);
            aVar.a.f = z3.m(activity.getString(R.string.activity_not_found), "\n\n", action);
            aVar.setPositiveButton(android.R.string.ok, null).b();
        }
    }

    public static boolean b(Activity activity, Uri uri) {
        activity.getClass();
        if (activity.isFinishing()) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        try {
            activity.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            ArrayList arrayList = lz2.a;
            lz2.c("ThirdPartyActivityLauncher", p6.d(uri, "failed to load unknown scheme/app: "), false, e, 4);
            c.a aVar = new c.a(activity);
            aVar.a.f = activity.getString(R.string.activity_not_found) + "\n\n" + uri;
            aVar.setPositiveButton(android.R.string.ok, null).b();
            return false;
        }
    }

    public static void c(Activity activity, boolean z, String str, String str2) throws URISyntaxException {
        activity.getClass();
        if (!z) {
            e(str, str2, "no_user_gesture");
            return;
        }
        Intent uri = Intent.parseUri(str2, 1);
        Uri data = uri.getData();
        if (wl7.b(data != null ? data.toString() : null, str2)) {
            e(str, str2, "parse_intent_uri_fail");
            return;
        }
        uri.addCategory("android.intent.category.BROWSABLE");
        try {
            activity.startActivity(uri);
            e(str, str2, null);
        } catch (ActivityNotFoundException unused) {
            ArrayList arrayList = lz2.a;
            lz2.c("ThirdPartyActivityLauncher", "failed to start intent uri: ".concat(str2), false, null, 12);
            c.a aVar = new c.a(activity);
            aVar.a.f = z3.m(activity.getString(R.string.activity_not_found), "\n\n", str2);
            aVar.setPositiveButton(android.R.string.ok, null).b();
            e(str, str2, "activity_not_found");
        }
    }

    public static final void e(String str, String str2, String str3) {
        ((gz4) a.getValue()).a("launch_intent_uri", new ad1(5, str, str2, str3));
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
