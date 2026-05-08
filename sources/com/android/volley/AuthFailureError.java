package com.android.volley;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public class AuthFailureError extends VolleyError {
    private Intent mResolutionIntent;

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.mResolutionIntent != null ? "User needs to (re)enter credentials." : super.getMessage();
    }
}
