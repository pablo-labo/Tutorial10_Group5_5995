package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public interface to1 extends pne, ReadableByteChannel {
    boolean B(long j, vr1 vr1Var);

    void C0(zn1 zn1Var, long j);

    int E0(pva pvaVar);

    vr1 J0(long j);

    long P1();

    String S(long j);

    byte[] S0();

    boolean W0();

    long Z(vr1 vr1Var);

    zn1 f();

    String i0();

    long k1(fie fieVar);

    byte[] l0(long j);

    String m1(Charset charset);

    short n0();

    uqc peek();

    long q0();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    boolean request(long j);

    void skip(long j);

    InputStream x();

    void x0(long j);

    int x1();

    String z1();
}
