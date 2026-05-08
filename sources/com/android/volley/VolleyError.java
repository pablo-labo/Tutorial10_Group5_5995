package com.android.volley;

import defpackage.wga;

/* JADX INFO: loaded from: classes.dex */
public class VolleyError extends Exception {
    public final wga networkResponse;
    private long networkTimeMs;

    public VolleyError() {
        this.networkResponse = null;
    }

    public final void a(long j) {
        this.networkTimeMs = j;
    }

    public VolleyError(wga wgaVar) {
        this.networkResponse = wgaVar;
    }

    public VolleyError(Exception exc) {
        super(exc);
        this.networkResponse = null;
    }
}
