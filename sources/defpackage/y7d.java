package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum y7d {
    REPLACE_SUCCESS("resume_file_replace_success"),
    REPLACE_ERROR("resume_file_replace_error"),
    UPLOAD_SUCCESS("resume_file_upload_success"),
    UPLOAD_ERROR("resume_file_upload_error"),
    DELETE_SUCCESS("resume_file_delete_success"),
    DELETE_ERROR("resume_file_delete_error");

    private final String actionName;

    y7d(String str) {
        this.actionName = str;
    }

    public final String a() {
        return this.actionName;
    }
}
