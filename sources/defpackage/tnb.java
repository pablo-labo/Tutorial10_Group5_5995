package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum tnb {
    TOGGLE_ON_SUCCESS("privacy_toggle_on_success"),
    TOGGLE_ON_ERROR("privacy_toggle_on_error"),
    TOGGLE_OFF_SUCCESS("privacy_toggle_off_success"),
    TOGGLE_OFF_ERROR("privacy_toggle_off_error");

    private final String actionName;

    tnb(String str) {
        this.actionName = str;
    }

    public final String a() {
        return this.actionName;
    }
}
