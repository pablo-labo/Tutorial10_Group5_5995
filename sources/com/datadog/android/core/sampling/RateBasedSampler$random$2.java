package com.datadog.android.core.sampling;

import defpackage.gu5;
import defpackage.mj8;
import java.security.SecureRandom;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/security/SecureRandom;", "T", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class RateBasedSampler$random$2 extends mj8 implements gu5<SecureRandom> {
    public static final RateBasedSampler$random$2 INSTANCE = new RateBasedSampler$random$2();

    public RateBasedSampler$random$2() {
        super(0);
    }

    @Override // defpackage.gu5
    public final SecureRandom invoke() {
        return new SecureRandom();
    }
}
