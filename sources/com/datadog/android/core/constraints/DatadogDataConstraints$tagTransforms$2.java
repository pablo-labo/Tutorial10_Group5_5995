package com.datadog.android.core.constraints;

import defpackage.awe;
import defpackage.mj8;
import defpackage.v22;
import defpackage.wl7;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class DatadogDataConstraints$tagTransforms$2 extends mj8 implements Function1<String, String> {
    public static final DatadogDataConstraints$tagTransforms$2 INSTANCE = new DatadogDataConstraints$tagTransforms$2();

    public DatadogDataConstraints$tagTransforms$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(String str) {
        str.getClass();
        v22 v22Var = new v22('a', 'z');
        Character chY0 = awe.y0(str, 0);
        if (chY0 == null) {
            return null;
        }
        char cCharValue = chY0.charValue();
        if (wl7.c(97, cCharValue) > 0 || wl7.c(cCharValue, v22Var.b) > 0) {
            return null;
        }
        return str;
    }
}
