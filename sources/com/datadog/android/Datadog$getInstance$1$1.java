package com.datadog.android;

import com.datadog.android.internal.utils.ThrowableExtKt;
import defpackage.gu5;
import defpackage.mj8;
import defpackage.z92;
import defpackage.zve;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class Datadog$getInstance$1$1 extends mj8 implements gu5<String> {
    final /* synthetic */ String $sdkInstanceName;
    final /* synthetic */ Throwable $stackCapture;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Datadog$getInstance$1$1(String str, Throwable th) {
        super(0);
        this.$sdkInstanceName = str;
        this.$stackCapture = th;
    }

    @Override // defpackage.gu5
    public final String invoke() {
        Locale locale = Locale.US;
        String str = this.$sdkInstanceName;
        Throwable th = this.$stackCapture;
        th.getClass();
        return String.format(locale, Datadog.MESSAGE_SDK_NOT_INITIALIZED, Arrays.copyOf(new Object[]{str, z92.W0(z92.J0(zve.X(ThrowableExtKt.loggableStackTrace(th)), 1), "\n", null, null, null, 62)}, 2));
    }
}
