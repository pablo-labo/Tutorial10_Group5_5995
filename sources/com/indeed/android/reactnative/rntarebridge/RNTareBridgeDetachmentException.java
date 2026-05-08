package com.indeed.android.reactnative.rntarebridge;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/indeed/android/reactnative/rntarebridge/RNTareBridgeDetachmentException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "reactnative_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RNTareBridgeDetachmentException extends Exception {
    public RNTareBridgeDetachmentException() {
        super("RNTareBridge is detached from NavHostFragment");
    }
}
