package com.datadog.android.rum;

import com.datadog.android.Datadog;
import com.datadog.android.api.SdkCore;
import com.datadog.android.rum.internal.utils.CloasableErrorExtKt;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u0001*\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"useMonitored", "R", "T", "Ljava/io/Closeable;", "sdkCore", "Lcom/datadog/android/api/SdkCore;", "block", "Lkotlin/Function1;", "(Ljava/io/Closeable;Lcom/datadog/android/api/SdkCore;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "dd-sdk-android-rum_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class CloseableExtKt {
    public static final <T extends Closeable, R> R useMonitored(T t, SdkCore sdkCore, Function1<? super T, ? extends R> function1) {
        t.getClass();
        sdkCore.getClass();
        function1.getClass();
        try {
            R rInvoke = function1.invoke(t);
            try {
                return rInvoke;
            } catch (Throwable th) {
                return rInvoke;
            }
        } catch (Throwable th2) {
            try {
                CloasableErrorExtKt.handleClosableError(th2, sdkCore);
                throw th2;
            } finally {
                try {
                    t.close();
                } catch (Throwable th3) {
                    CloasableErrorExtKt.handleClosableError(th3, sdkCore);
                }
            }
        }
    }

    public static /* synthetic */ Object useMonitored$default(Closeable closeable, SdkCore sdkCore, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            sdkCore = Datadog.getInstance$default(null, 1, null);
        }
        return useMonitored(closeable, sdkCore, function1);
    }
}
