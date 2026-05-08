package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum ic2 {
    /* JADX INFO: Fake field, exist only in values array */
    ShareContent("shareContent"),
    /* JADX INFO: Fake field, exist only in values array */
    ActionOverflow("showActionOverflowMenu"),
    /* JADX INFO: Fake field, exist only in values array */
    ShareDiagnostics("openShareDiagnosticsInfoDialog"),
    /* JADX INFO: Fake field, exist only in values array */
    StartIndeedApply("startIndeedApply"),
    /* JADX INFO: Fake field, exist only in values array */
    IndeedApplyDidComplete("indeedApplyDidComplete"),
    /* JADX INFO: Fake field, exist only in values array */
    GetAvailableMethods("getAvailableMethods"),
    /* JADX INFO: Fake field, exist only in values array */
    GetNativeAppInfo("getNativeAppInfo"),
    /* JADX INFO: Fake field, exist only in values array */
    CallPhoneNumber("callPhoneNumber"),
    /* JADX INFO: Fake field, exist only in values array */
    DisplayToast("displayToast"),
    /* JADX INFO: Fake field, exist only in values array */
    ShowSearchOverlay("showSearchOverlay"),
    /* JADX INFO: Fake field, exist only in values array */
    IsGeolocationGranted("isGeolocationGranted"),
    /* JADX INFO: Fake field, exist only in values array */
    OpenAndroidAppInfo("openAndroidAppInfo"),
    /* JADX INFO: Fake field, exist only in values array */
    ShowModalWithWebView("showModalWithWebView"),
    /* JADX INFO: Fake field, exist only in values array */
    ShowModalWithWebViewAndWaitForResult("showModalWithWebViewAndWaitForResult"),
    /* JADX INFO: Fake field, exist only in values array */
    DismissModalWithWebView("dismissModalWithWebView"),
    /* JADX INFO: Fake field, exist only in values array */
    AppConsoleLog("appConsoleLog"),
    /* JADX INFO: Fake field, exist only in values array */
    DismissApplyWebView("dismissApplyWebView"),
    /* JADX INFO: Fake field, exist only in values array */
    SetViewJobNavBarSaveButtonState("setViewJobNavBarSaveButtonState"),
    /* JADX INFO: Fake field, exist only in values array */
    RegisterViewJobNavBarSaveButtonClickHandler("registerViewJobNavBarSaveButtonClickHandler"),
    /* JADX INFO: Fake field, exist only in values array */
    WebOnboardingOnComplete("webOnboardingOnComplete"),
    /* JADX INFO: Fake field, exist only in values array */
    NavigateToLogin("navigateToLogin"),
    /* JADX INFO: Fake field, exist only in values array */
    GetCachedValue("getCachedValue"),
    /* JADX INFO: Fake field, exist only in values array */
    SetCachedValue("setCachedValue"),
    /* JADX INFO: Fake field, exist only in values array */
    AceNewConversation("aceNewConversation"),
    /* JADX INFO: Fake field, exist only in values array */
    AceOpenConversationWithId("aceOpenConversationWithId"),
    /* JADX INFO: Fake field, exist only in values array */
    MarkHomePageReady("markHomePageReady"),
    /* JADX INFO: Fake field, exist only in values array */
    OpenOnboardingModal("openOnboardingModal"),
    /* JADX INFO: Fake field, exist only in values array */
    NavigateToInterviewPrep("navigateToInterviewPrep"),
    /* JADX INFO: Fake field, exist only in values array */
    NavigateToResumeCoach("navigateToResumeCoach"),
    /* JADX INFO: Fake field, exist only in values array */
    CanShowPushPrompt("canShowPushPrompt"),
    /* JADX INFO: Fake field, exist only in values array */
    GetPushAuthorizationStatus("getPushAuthorizationStatus"),
    /* JADX INFO: Fake field, exist only in values array */
    RequestSystemPushAuthWithPrimer("requestSystemPushAuthWithPrimer"),
    /* JADX INFO: Fake field, exist only in values array */
    RequestPushReengagementModal("requestPushReengagementModal"),
    /* JADX INFO: Fake field, exist only in values array */
    RequestImmediateSystemPushAuthorization("requestImmediateSystemPushAuthorization"),
    /* JADX INFO: Fake field, exist only in values array */
    OpenPushNotificationAuthorizationSettings("openPushNotificationAuthorizationSettings"),
    /* JADX INFO: Fake field, exist only in values array */
    ResetPushPromptCooldownTimeout("resetPushPromptCooldownTimeout"),
    /* JADX INFO: Fake field, exist only in values array */
    IncrementPushSignificantEvent("incrementPushSignificantEvent");

    private final String commandName;

    ic2(String str) {
        this.commandName = str;
    }

    public final String a() {
        return this.commandName;
    }
}
