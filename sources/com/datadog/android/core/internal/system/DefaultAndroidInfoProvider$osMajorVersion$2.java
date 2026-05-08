package com.datadog.android.core.internal.system;

import defpackage.gu5;
import defpackage.mj8;
import defpackage.z92;
import defpackage.zve;
import io.jsonwebtoken.JwtParser;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class DefaultAndroidInfoProvider$osMajorVersion$2 extends mj8 implements gu5<String> {
    final /* synthetic */ DefaultAndroidInfoProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultAndroidInfoProvider$osMajorVersion$2(DefaultAndroidInfoProvider defaultAndroidInfoProvider) {
        super(0);
        this.this$0 = defaultAndroidInfoProvider;
    }

    @Override // defpackage.gu5
    public final String invoke() {
        return (String) z92.O0(zve.j0(this.this$0.getOsVersion(), new char[]{JwtParser.SEPARATOR_CHAR}));
    }
}
