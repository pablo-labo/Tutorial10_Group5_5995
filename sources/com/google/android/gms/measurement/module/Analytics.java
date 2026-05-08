package com.google.android.gms.measurement.module;

import android.content.Context;
import androidx.annotation.Keep;
import defpackage.fib;
import defpackage.i0i;

/* JADX INFO: loaded from: classes2.dex */
public class Analytics {
    public static volatile Analytics a;

    @Keep
    public static Analytics getInstance(Context context) {
        if (a == null) {
            synchronized (Analytics.class) {
                try {
                    if (a == null) {
                        i0i i0iVarB = i0i.b(context, null, null);
                        Analytics analytics = new Analytics();
                        fib.i(i0iVarB);
                        a = analytics;
                    }
                } finally {
                }
            }
        }
        return a;
    }
}
