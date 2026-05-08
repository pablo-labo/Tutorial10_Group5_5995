package com.wlproctor.loader.jsonmodels;

import defpackage.l6;
import defpackage.u40;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/wlproctor/loader/jsonmodels/UnexpectedPayloadException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "testName", "Ljava/lang/String;", "getTestName", "()Ljava/lang/String;", "type", "getType", "value", "getValue", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UnexpectedPayloadException extends Exception {
    private final String testName;
    private final String type;
    private final String value;

    public UnexpectedPayloadException(String str, String str2, String str3) {
        super(l6.i(u40.f("Unexpected Payload in '", str, "': type = '", str2, "', value = '"), str3, "'"));
        this.testName = str;
        this.type = str2;
        this.value = str3;
    }
}
