package com.indeed.android.profile.services;

import defpackage.p6;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/indeed/android/profile/services/ResumeS3UploadHttpException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "httpCode", "I", "a", "()I", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ResumeS3UploadHttpException extends Exception {
    private final int httpCode;

    public ResumeS3UploadHttpException(int i, String str) {
        super(str == null ? p6.c(i, "S3 resume upload failed with HTTP ") : str);
        this.httpCode = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getHttpCode() {
        return this.httpCode;
    }
}
