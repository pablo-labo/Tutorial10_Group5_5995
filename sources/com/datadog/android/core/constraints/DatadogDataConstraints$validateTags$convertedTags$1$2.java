package com.datadog.android.core.constraints;

import defpackage.akb;
import defpackage.gu5;
import defpackage.mj8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class DatadogDataConstraints$validateTags$convertedTags$1$2 extends mj8 implements gu5<String> {
    final /* synthetic */ String $it;
    final /* synthetic */ String $tag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatadogDataConstraints$validateTags$convertedTags$1$2(String str, String str2) {
        super(0);
        this.$it = str;
        this.$tag = str2;
    }

    @Override // defpackage.gu5
    public final String invoke() {
        return akb.k("tag \"", this.$it, "\" was modified to \"", this.$tag, "\" to match our constraints.");
    }
}
