package defpackage;

import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class zf7 extends t4e {
    public static final /* synthetic */ int b = 0;

    public zf7(String str, long j, long j2, boolean z) {
        super(lc9.a0(new Pair("installReferrer", str), new Pair("referrerClickTimestamp", j > 0 ? yjg.c(j * 1000) : null), new Pair("installBeginTimestamp", j2 > 0 ? yjg.c(j2 * 1000) : null), new Pair("googlePlayInstantParam", Boolean.valueOf(z))), "iglu:com.android.installreferrer.api/referrer_details/jsonschema/1-0-0");
    }
}
