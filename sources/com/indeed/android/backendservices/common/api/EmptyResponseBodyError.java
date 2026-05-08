package com.indeed.android.backendservices.common.api;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/indeed/android/backendservices/common/api/EmptyResponseBodyError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "backendservices_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EmptyResponseBodyError extends Exception {
    public EmptyResponseBodyError() {
        super("HTTP response body is empty");
    }
}
