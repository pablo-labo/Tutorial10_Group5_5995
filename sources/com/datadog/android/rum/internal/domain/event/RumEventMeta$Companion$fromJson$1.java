package com.datadog.android.rum.internal.domain.event;

import defpackage.gu5;
import defpackage.mj8;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class RumEventMeta$Companion$fromJson$1 extends mj8 implements gu5<String> {
    final /* synthetic */ String $type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RumEventMeta$Companion$fromJson$1(String str) {
        super(0);
        this.$type = str;
    }

    @Override // defpackage.gu5
    public final String invoke() {
        return String.format(Locale.US, "Unknown RUM event meta type value [%s]", Arrays.copyOf(new Object[]{this.$type}, 1));
    }
}
