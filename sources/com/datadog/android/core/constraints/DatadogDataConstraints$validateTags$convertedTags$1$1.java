package com.datadog.android.core.constraints;

import defpackage.gu5;
import defpackage.l5;
import defpackage.mj8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class DatadogDataConstraints$validateTags$convertedTags$1$1 extends mj8 implements gu5<String> {
    final /* synthetic */ String $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatadogDataConstraints$validateTags$convertedTags$1$1(String str) {
        super(0);
        this.$it = str;
    }

    @Override // defpackage.gu5
    public final String invoke() {
        return l5.m("\"", this.$it, "\" is an invalid tag, and was ignored.");
    }
}
