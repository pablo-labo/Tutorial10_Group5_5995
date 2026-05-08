package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum nxg {
    Internal("internal"),
    External("external"),
    ViewJob("viewJob"),
    ModalView("modalView"),
    IndeedApply("indeedApply"),
    PassportSignIn("PassportSignIn"),
    /* JADX INFO: Fake field, exist only in values array */
    OnboardingWebView("OnboardingWebView");

    private final String value;

    nxg(String str) {
        this.value = str;
    }

    public final String a() {
        return this.value;
    }
}
