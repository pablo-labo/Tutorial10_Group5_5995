package defpackage;

import defpackage.xh8;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
@sy3
public final class bu8 implements xh8 {
    public static final gg1 A0;
    public static final au8 B0;
    public static final z C0;
    public static final gg1 D0;
    public static final cu8 E0;
    public static final gg1 F0;
    public static final au8 G0;
    public static final au8 H0;
    public static final au8 I0;
    public static final au8 J0;
    public static final au8 K0;
    public static final au8 L0;
    public static final rj0 V;
    public static final au8 W;
    public static final rj0 X;
    public static final rj0 Y;
    public static final au8 Z;
    public static final bu8 a;
    public static final au8 a0;
    public static final /* synthetic */ qf8<Object>[] b;
    public static final rj0 b0;
    public static final Lazy c;
    public static final rj0 c0;
    public static final rj0 d;
    public static final cu8 d0;
    public static final rj0 e;
    public static final au8 e0;
    public static final gg1 f;
    public static final au8 f0;
    public static final z g0;
    public static final z h0;
    public static final gg1 i0;
    public static final cu8 j0;
    public static final cu8 k0;
    public static final cu8 l0;
    public static final cu8 m0;
    public static final au8 n0;
    public static final cu8 o0;
    public static final cu8 p0;
    public static final rj0 q0;
    public static final cu8 r0;
    public static final z s0;
    public static final gg1 t0;
    public static final z u0;
    public static final gg1 v0;
    public static final z w0;
    public static final au8 x0;
    public static final au8 y0;
    public static final au8 z0;

    public static final class a extends mj8 implements gu5<nm0> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(bu8 bu8Var) {
            super(0);
            this.$this_inject = bu8Var;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, nm0] */
        @Override // defpackage.gu5
        public final nm0 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(nm0.class), a9cVar);
        }
    }

    static {
        w3a w3aVar = new w3a(bu8.class, "accountKey", "getAccountKey()Ljava/lang/String;", 0);
        iwc iwcVar = fwc.a;
        b = new qf8[]{iwcVar.e(w3aVar), r40.b(bu8.class, "accountId", "getAccountId()Ljava/lang/String;", 0, iwcVar), r40.b(bu8.class, "accountCreationDate", "getAccountCreationDate()J", 0, iwcVar), r40.b(bu8.class, "userEmailId", "getUserEmailId()Ljava/lang/String;", 0, iwcVar), r40.b(bu8.class, "isUserEmailVerified", "isUserEmailVerified()Z", 0, iwcVar), r40.b(bu8.class, "userFirstName", "getUserFirstName()Ljava/lang/String;", 0, iwcVar), r40.b(bu8.class, "userLastName", "getUserLastName()Ljava/lang/String;", 0, iwcVar), r40.b(bu8.class, "useNativeMetricsLogging", "getUseNativeMetricsLogging()Z", 0, iwcVar), r40.b(bu8.class, "useDatadogMonitoring", "getUseDatadogMonitoring()Z", 0, iwcVar), r40.b(bu8.class, "useDatadogRum", "getUseDatadogRum()Z", 0, iwcVar), r40.b(bu8.class, "isDeliverEventActive", "isDeliverEventActive()Z", 0, iwcVar), r40.b(bu8.class, "countryCode", "getCountryCode()Ljava/lang/String;", 0, iwcVar), r40.b(bu8.class, "languageCode", "getLanguageCode()Ljava/lang/String;", 0, iwcVar), r40.b(bu8.class, "fcmRegistrationId", "getFcmRegistrationId()Ljava/lang/String;", 0, iwcVar), r40.b(bu8.class, "requestingStoragePermissionForFirstTime", "getRequestingStoragePermissionForFirstTime()Z", 0, iwcVar), r40.b(bu8.class, "isUserLoggedIn", "isUserLoggedIn()Z", 0, iwcVar), r40.b(bu8.class, "applyCount", "getApplyCount()I", 0, iwcVar), r40.b(bu8.class, "appRatingPoints", "getAppRatingPoints()I", 0, iwcVar), r40.b(bu8.class, "lastRatingTimestamp", "getLastRatingTimestamp()J", 0, iwcVar), r40.b(bu8.class, "recentSearchCookie", "getRecentSearchCookie()Ljava/lang/String;", 0, iwcVar), r40.b(bu8.class, "lastVisitCookie", "getLastVisitCookie()Ljava/lang/String;", 0, iwcVar), r40.b(bu8.class, "newJobCountBaseUrl", "getNewJobCountBaseUrl()Ljava/lang/String;", 0, iwcVar), r40.b(bu8.class, "facebookLoginState", "getFacebookLoginState()Ljava/lang/String;", 0, iwcVar), r40.b(bu8.class, "lastIpLookupCountry", "getLastIpLookupCountry()Ljava/lang/String;", 0, iwcVar), r40.b(bu8.class, "needToSendOptOutRetargeting", "getNeedToSendOptOutRetargeting()Z", 0, iwcVar), r40.b(bu8.class, "pushNotificationLogSnapshot", "getPushNotificationLogSnapshot()Ljava/lang/String;", 0, iwcVar), r40.b(bu8.class, "appLifecycleSnapshot", "getAppLifecycleSnapshot()Ljava/lang/String;", 0, iwcVar), r40.b(bu8.class, "overrideInitialUrl", "getOverrideInitialUrl()Ljava/lang/String;", 0, iwcVar), r40.b(bu8.class, "overrideViewJobUrl", "getOverrideViewJobUrl()Ljava/lang/String;", 0, iwcVar), r40.b(bu8.class, "proctorGroupsFullLoggingString", "getProctorGroupsFullLoggingString()Ljava/lang/String;", 0, iwcVar), r40.b(bu8.class, "pushNotificationDenyCount", "getPushNotificationDenyCount()I", 0, iwcVar), r40.b(bu8.class, "lastPushPrimerTimestamp", "getLastPushPrimerTimestamp()J", 0, iwcVar), r40.b(bu8.class, "pushPrimerShownCount", "getPushPrimerShownCount()I", 0, iwcVar), r40.b(bu8.class, "unreadMessagesAndNotificationsTimestamp", "getUnreadMessagesAndNotificationsTimestamp()J", 0, iwcVar), r40.b(bu8.class, "onboardingShownCount", "getOnboardingShownCount()I", 0, iwcVar), r40.b(bu8.class, "onboardingCompleted", "getOnboardingCompleted()Z", 0, iwcVar), r40.b(bu8.class, "onboardingEligibleWhenSawRegPromo", "getOnboardingEligibleWhenSawRegPromo()Z", 0, iwcVar), r40.b(bu8.class, "onboardingPushPrimerCompleted", "getOnboardingPushPrimerCompleted()Z", 0, iwcVar), r40.b(bu8.class, "onboardingLastShownTimestamp", "getOnboardingLastShownTimestamp()J", 0, iwcVar), r40.b(bu8.class, "onboardingAllQuestionsSkipped", "getOnboardingAllQuestionsSkipped()Z", 0, iwcVar), r40.b(bu8.class, "softUpgradeShownCount", "getSoftUpgradeShownCount()I", 0, iwcVar), r40.b(bu8.class, "lastSoftUpgradeTimestamp", "getLastSoftUpgradeTimestamp()J", 0, iwcVar), r40.b(bu8.class, "lastSavedAppVersion", "getLastSavedAppVersion()Ljava/lang/String;", 0, iwcVar), r40.b(bu8.class, "lastAcknowledgedTosUpdateVersion", "getLastAcknowledgedTosUpdateVersion()J", 0, iwcVar), r40.b(bu8.class, "didUserClickSignOut", "getDidUserClickSignOut()Z", 0, iwcVar), r40.b(bu8.class, "userDataMergedSuccessfully", "getUserDataMergedSuccessfully()Z", 0, iwcVar), r40.b(bu8.class, "isViewJobShareTooltipShown", "isViewJobShareTooltipShown()Z", 0, iwcVar), r40.b(bu8.class, "shouldShowBlockingToSBanner", "getShouldShowBlockingToSBanner()Z", 0, iwcVar), r40.b(bu8.class, "isUipMessagingTestActive", "isUipMessagingTestActive()Z", 0, iwcVar), r40.b(bu8.class, "shouldShowAceInterstitialBottomSheet", "getShouldShowAceInterstitialBottomSheet()Z", 0, iwcVar)};
        bu8 bu8Var = new bu8();
        a = bu8Var;
        c = boa.E(qt8.a, new a(bu8Var));
        d = new rj0(b(), "accountKey");
        e = new rj0(b(), "accountId");
        f = new gg1(b(), "accountCreationDate");
        V = new rj0(b(), "userEmailId");
        W = new au8(b(), "isUserEmailVerified", false);
        X = new rj0(b(), "userFirstName");
        Y = new rj0(b(), "userLastName");
        b();
        Z = new au8(b(), "useDatadogMonitoring", false);
        a0 = new au8(b(), "useDatadogRum", false);
        b();
        b0 = new rj0(b(), "countryCode");
        c0 = new rj0(b(), "languageCode");
        d0 = new cu8(b(), "registrationId", "");
        e0 = new au8(b(), "requestingStoragePermissionForFirstTime", true);
        f0 = new au8(b(), "IsUserLoggedIn", false);
        g0 = new z("successfulApplyCount", b());
        h0 = new z("appRatingPoints", b());
        i0 = new gg1(b(), "lastRatingTimestamp");
        j0 = new cu8(b(), "recentSearchCookie", "");
        k0 = new cu8(b(), "lastVisitCookie", "");
        l0 = new cu8(b(), "newJobCountBaseUrl", "https://www.indeed.com/m/");
        b();
        m0 = new cu8(b(), "lastIpLookupCountry", "");
        n0 = new au8(b(), "needToSendOptOutRetargeting", false);
        o0 = new cu8(b(), "pushNotificationLogSnapshot", "");
        p0 = new cu8(b(), "appVersionSnapshot", "");
        q0 = new rj0(b(), "override_initial_url");
        b();
        r0 = new cu8(b(), "proctorGroupsFullLoggingString", "");
        s0 = new z("pushNotificationDenyCount", b());
        t0 = new gg1(b(), "lastPushPrimerTimestamp");
        u0 = new z("pushPrimerShownCount", b());
        v0 = new gg1(b(), "unreadMessagesAndNotificationsTimestamp");
        w0 = new z("onboardingShownCount", b());
        x0 = new au8(b(), "onboardingCompleted", false);
        y0 = new au8(b(), "onboardingEligibleWhenSawRegPromo", false);
        z0 = new au8(b(), "onboardingPushPrimerCompleted", false);
        A0 = new gg1(b(), "onboardingLastShownTimestamp");
        B0 = new au8(b(), "onboardingAllQuestionsSkipped", false);
        C0 = new z("softUpgradeShownCount", b());
        D0 = new gg1(b(), "lastSoftUpgradeTimestamp");
        E0 = new cu8(b(), "lastSavedAppVersion", "");
        F0 = new gg1(b(), "lastAcknowledgedTosUpdateVersion");
        G0 = new au8(b(), "didUserClickSignOut", false);
        H0 = new au8(b(), "userDataMergedSuccessfully", false);
        I0 = new au8(b(), "isViewJobShareTooltipShown", false);
        J0 = new au8(b(), "shouldShowBlockingToSBanner", false);
        K0 = new au8(b(), "isUipMessagingTestActive", false);
        L0 = new au8(b(), "shouldShowAceInterstitialBottomSheet", true);
    }

    public static nm0 b() {
        return (nm0) c.getValue();
    }

    public final String a() {
        return (String) e.b(b[1], this);
    }

    public final int c() {
        return ((Number) h0.d(b[17], this)).intValue();
    }

    public final String e() {
        return (String) b0.b(b[11], this);
    }

    public final String f() {
        return (String) c0.b(b[12], this);
    }

    public final String g() {
        return (String) m0.a(b[23], this);
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    public final boolean h() {
        return ((Boolean) K0.a(b[48], this)).booleanValue();
    }

    public final boolean i() {
        return ((Boolean) f0.a(b[15], this)).booleanValue();
    }

    public final void j(int i) {
        h0.e(b[17], this, Integer.valueOf(i));
    }

    public final void k(boolean z) {
        f0.b(b[15], this, Boolean.valueOf(z));
    }
}
