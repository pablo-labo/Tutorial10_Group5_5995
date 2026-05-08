package com.google.android.recaptcha.internal;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class zzto {
    public static final zzadm zza = zzadm.zzb(new byte[0]);

    public static final zzadm zza(int i) {
        return zzadm.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final zzadm zzb(int i) {
        return zzadm.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
