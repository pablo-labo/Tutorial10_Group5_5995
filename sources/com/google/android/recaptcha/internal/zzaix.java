package com.google.android.recaptcha.internal;

import defpackage.k20;

/* JADX INFO: loaded from: classes2.dex */
final class zzaix extends IllegalArgumentException {
    public zzaix(int i, int i2) {
        super(k20.l("Unpaired surrogate at index ", i, i2, " of "));
    }
}
