package com.google.android.gms.internal.measurement;

import defpackage.l3i;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class zzfw extends IOException {
    private l3i zza;

    public zzfw(String str) {
        super(str);
        this.zza = null;
    }

    public static zzfw a() {
        return new zzfw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static zzfw b() {
        return new zzfw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzfw c() {
        return new zzfw("Failed to parse the message.");
    }

    public static zzfw d() {
        return new zzfw("Protocol message had invalid UTF-8.");
    }
}
