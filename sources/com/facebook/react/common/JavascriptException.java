package com.facebook.react.common;

import defpackage.f84;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0017\u0018\u00002\u00060\u0001j\u0002`\u0002R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/facebook/react/common/JavascriptException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "extraDataAsJson", "Ljava/lang/String;", "getExtraDataAsJson", "()Ljava/lang/String;", "a", "(Ljava/lang/String;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@f84
public class JavascriptException extends RuntimeException {
    private String extraDataAsJson;

    public final void a(String str) {
        this.extraDataAsJson = str;
    }
}
