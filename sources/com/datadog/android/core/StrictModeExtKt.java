package com.datadog.android.core;

import android.os.StrictMode;
import com.datadog.android.lint.InternalApi;
import defpackage.gu5;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"T", "Lkotlin/Function0;", "operation", "allowThreadDiskReads", "(Lgu5;)Ljava/lang/Object;", "allowThreadDiskWrites", "dd-sdk-android-core_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class StrictModeExtKt {
    @InternalApi
    public static final <T> T allowThreadDiskReads(gu5<? extends T> gu5Var) {
        gu5Var.getClass();
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return gu5Var.invoke();
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    @InternalApi
    public static final <T> T allowThreadDiskWrites(gu5<? extends T> gu5Var) {
        gu5Var.getClass();
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            return gu5Var.invoke();
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
        }
    }
}
