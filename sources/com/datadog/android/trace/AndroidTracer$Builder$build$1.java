package com.datadog.android.trace;

import defpackage.gu5;
import defpackage.mj8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class AndroidTracer$Builder$build$1 extends mj8 implements gu5<String> {
    public static final AndroidTracer$Builder$build$1 INSTANCE = new AndroidTracer$Builder$build$1();

    public AndroidTracer$Builder$build$1() {
        super(0);
    }

    @Override // defpackage.gu5
    public final String invoke() {
        return AndroidTracer.TRACING_NOT_ENABLED_ERROR_MESSAGE;
    }
}
