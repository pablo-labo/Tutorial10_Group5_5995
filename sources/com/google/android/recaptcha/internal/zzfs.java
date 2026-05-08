package com.google.android.recaptcha.internal;

import android.content.Context;
import defpackage.hb5;
import defpackage.r40;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfs {
    public zzfs(Context context) {
    }

    public static final byte[] zza(File file) {
        return hb5.S(file);
    }

    public static final void zzb(File file, byte[] bArr) throws IOException {
        if (!file.exists() || file.delete()) {
            hb5.W(file, bArr);
        } else {
            r40.h("Unable to delete existing encrypted file");
        }
    }
}
