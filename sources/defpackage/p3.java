package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.h3;
import defpackage.rp9;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p3<MessageType extends rp9> implements n4b<MessageType> {
    static {
        int i = s45.b;
    }

    public static void b(rp9 rp9Var) {
        if (rp9Var == null || rp9Var.d()) {
            return;
        }
        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException((rp9Var instanceof h3 ? new UninitializedMessageException() : new UninitializedMessageException()).getMessage());
        invalidProtocolBufferException.b(rp9Var);
        throw invalidProtocolBufferException;
    }

    public final rp9 c(ByteArrayInputStream byteArrayInputStream, s45 s45Var) throws InvalidProtocolBufferException {
        MessageType messagetypeA;
        try {
            int i = byteArrayInputStream.read();
            if (i == -1) {
                messagetypeA = null;
            } else {
                if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
                    i &= 127;
                    int i2 = 7;
                    while (true) {
                        if (i2 >= 32) {
                            while (i2 < 64) {
                                int i3 = byteArrayInputStream.read();
                                if (i3 == -1) {
                                    throw InvalidProtocolBufferException.c();
                                }
                                if ((i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
                                    i2 += 7;
                                }
                            }
                            throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
                        }
                        int i4 = byteArrayInputStream.read();
                        if (i4 == -1) {
                            throw InvalidProtocolBufferException.c();
                        }
                        i |= (i4 & 127) << i2;
                        if ((i4 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
                            break;
                        }
                        i2 += 7;
                    }
                }
                e92 e92Var = new e92(new h3.a.C0253a(byteArrayInputStream, i));
                messagetypeA = a(e92Var, s45Var);
                try {
                    e92Var.a(0);
                } catch (InvalidProtocolBufferException e) {
                    e.b(messagetypeA);
                    throw e;
                }
            }
            b(messagetypeA);
            return messagetypeA;
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        }
    }
}
