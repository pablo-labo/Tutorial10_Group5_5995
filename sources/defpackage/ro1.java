package defpackage;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes3.dex */
public interface ro1 extends fie, WritableByteChannel {
    ro1 H();

    ro1 Y(String str);

    long a1(pne pneVar);

    zn1 f();

    @Override // defpackage.fie, java.io.Flushable
    void flush();

    ro1 p0(int i, byte[] bArr, int i2);

    ro1 q1(long j);

    ro1 v0(vr1 vr1Var);

    OutputStream w();

    ro1 write(byte[] bArr);

    ro1 writeByte(int i);

    ro1 writeInt(int i);

    ro1 writeShort(int i);

    ro1 z0(long j);
}
