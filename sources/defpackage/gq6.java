package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum gq6 {
    HOME("droid-ian-home"),
    RESET_ON_NAV("droid-reset-on-nav"),
    SIGN_IN_RELOAD("droid-ian-sign-in-reload"),
    /* JADX INFO: Fake field, exist only in values array */
    SIGN_OUT_RELOAD("droid-ian-sign-out-reload"),
    BOTTOM_NAV_TAP_REFRESH("droid-ian-bottom-nav-tap-refresh"),
    /* JADX INFO: Fake field, exist only in values array */
    SWIPE_REFRESH("droid-ian-swipe-refresh"),
    IDV_CLOSE("droid-ian-idv-close"),
    IDV_BACK("droid-ian-idv-back"),
    SYSTEM_BACK_RESET("droid-ian-system-back-reset"),
    ERROR_RETRY("droid-ian-error-retry"),
    /* JADX INFO: Fake field, exist only in values array */
    BACK("droid-ian-back"),
    FSDV_INITIAL_LOAD("droid-ian-fsdv-initial"),
    /* JADX INFO: Fake field, exist only in values array */
    FSDV_LOAD("droid-ian-fsdv-load"),
    /* JADX INFO: Fake field, exist only in values array */
    FSDV_SERP_WIDGET("droid-ian-fsdv-serp-widget"),
    /* JADX INFO: Fake field, exist only in values array */
    FSDV_LINK_CLICK("droid-ian-fsdv-link-click"),
    /* JADX INFO: Fake field, exist only in values array */
    FSDV_NOTIFICATION("droid-ian-fsdv-notification"),
    /* JADX INFO: Fake field, exist only in values array */
    FSDV_SIGN_IN("droid-ian-fsdv-sign-in"),
    MAG_ONBOARDING("magonboarding"),
    /* JADX INFO: Fake field, exist only in values array */
    MAG_JTBD("droid-mag-jtbd");

    private final String fromValue;

    gq6(String str) {
        this.fromValue = str;
    }

    public final String a() {
        return this.fromValue;
    }
}
