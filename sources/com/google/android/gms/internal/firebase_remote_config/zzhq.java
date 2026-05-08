package com.google.android.gms.internal.firebase_remote_config;

import defpackage.a5i;
import defpackage.x8i;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class zzhq extends IOException {
    private x8i zzud;

    public zzhq(String str) {
        super(str);
        this.zzud = null;
    }

    public static zzhq b() {
        return new zzhq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static zzhq c() {
        return new zzhq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzhq d() {
        return new zzhq("CodedInputStream encountered a malformed varint.");
    }

    public static zzhq e() {
        return new zzhq("Protocol message contained an invalid tag (zero).");
    }

    public static zzhp f() {
        return new zzhp("Protocol message tag had invalid wire type.");
    }

    public static zzhq g() {
        return new zzhq("Failed to parse the message.");
    }

    public static zzhq h() {
        return new zzhq("Protocol message had invalid UTF-8.");
    }

    public final void a(a5i a5iVar) {
        this.zzud = a5iVar;
    }
}
