package com.datadog.android.core.internal.system;

import defpackage.gu5;
import defpackage.mj8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class DefaultAndroidInfoProvider$architecture$2 extends mj8 implements gu5<String> {
    public static final DefaultAndroidInfoProvider$architecture$2 INSTANCE = new DefaultAndroidInfoProvider$architecture$2();

    public DefaultAndroidInfoProvider$architecture$2() {
        super(0);
    }

    @Override // defpackage.gu5
    public final String invoke() {
        String property = System.getProperty("os.arch");
        return property == null ? "unknown" : property;
    }
}
