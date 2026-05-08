package kotlin.reflect.jvm.internal.impl.protobuf;

import defpackage.rp9;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class InvalidProtocolBufferException extends IOException {
    private rp9 unfinishedMessage;

    public InvalidProtocolBufferException(String str) {
        super(str);
        this.unfinishedMessage = null;
    }

    public static InvalidProtocolBufferException c() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public final rp9 a() {
        return this.unfinishedMessage;
    }

    public final void b(rp9 rp9Var) {
        this.unfinishedMessage = rp9Var;
    }
}
