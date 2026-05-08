package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum oub {
    DATA("DataError"),
    FILE_UPLOAD("FileUploadError"),
    SAVE("SaveError"),
    FILE_PREVIEW("FilePreviewError"),
    PRIVACY_TOGGLE("PrivacyToggleError");

    private final String value;

    oub(String str) {
        this.value = str;
    }

    public final String a() {
        return this.value;
    }
}
