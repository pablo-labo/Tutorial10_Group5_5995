package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public final class i6a {
    public static final ra8 a = sa8.a(new uz7(3));

    public static lr7 a() {
        return ((kr7) cr8.p(kr7.class)).e("droid_native_myjobs_application_insights_tst");
    }

    public static lr7 b() {
        return ((kr7) cr8.p(kr7.class)).e("droid_native_myjobs_ghosted_application_signals_tst");
    }

    public static lr7 c() {
        return ((kr7) cr8.p(kr7.class)).e("droid_native_myjobs_event_logging");
    }

    public static lr7 d() {
        return ((kr7) cr8.p(kr7.class)).e("droid_native_myjobs_nonia");
    }

    public static lr7 e() {
        return ((kr7) cr8.p(kr7.class)).e("droid_expMj1_invited_in_myjobs");
    }

    public static boolean f() {
        return ((kr7) cr8.p(kr7.class)).e("droid_native_myjobs_better_sorting_tst").a >= 1;
    }

    public static boolean g() {
        return ((kr7) cr8.p(kr7.class)).e("droid_native_myjobs_buttons_api_migration").a >= 1;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 29 && ((kr7) cr8.p(kr7.class)).e("droid_myjobs_shared_hire_tst").a >= 1;
    }

    public static boolean i() {
        return e().a >= 1;
    }

    public static boolean j() {
        int i = ((kr7) cr8.p(kr7.class)).e("droid_native_myjobs").a;
        return i == 1 || i == 2;
    }

    public static boolean k() {
        return ((kr7) cr8.p(kr7.class)).e("eba_myjobs_android_toggle").a >= 1;
    }

    public static boolean l() {
        return b().a == 4;
    }

    public static boolean m() {
        return b().a == 5;
    }

    public static boolean n() {
        return b().a == 6;
    }

    public static boolean o() {
        return ((kr7) cr8.p(kr7.class)).e("droid_native_myjobs_mads").a >= 1;
    }

    public static boolean p() {
        return ((kr7) cr8.p(kr7.class)).e("droid_native_myjobs_primary_subtab_tst").a == 1;
    }

    public static boolean q() {
        return e().a >= 2;
    }
}
