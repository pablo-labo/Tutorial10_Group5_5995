package com.indeed.android.uiplugin.api;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/indeed/android/uiplugin/api/UIPRecentSearchCountException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "code", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "uiplugin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UIPRecentSearchCountException extends Exception {
    private final String code;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UIPRecentSearchCountException(String str, String str2, Exception exc) {
        super(str2, exc);
        str2.getClass();
        this.code = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }
}
