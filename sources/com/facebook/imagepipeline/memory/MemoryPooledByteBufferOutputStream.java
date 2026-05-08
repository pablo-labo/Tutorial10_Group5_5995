package com.facebook.imagepipeline.memory;

import defpackage.bgb;
import defpackage.im3;
import defpackage.n82;
import defpackage.r6;
import defpackage.uz;
import defpackage.wn9;
import defpackage.xn9;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
public final class MemoryPooledByteBufferOutputStream extends bgb {
    public final b a;
    public im3 b;
    public int c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0002j\u0002`\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/imagepipeline/memory/MemoryPooledByteBufferOutputStream$InvalidStreamException;", "Lkotlin/RuntimeException;", "Ljava/lang/RuntimeException;", "<init>", "()V", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InvalidStreamException extends RuntimeException {
        public InvalidStreamException() {
            super("OutputStream no longer valid");
        }
    }

    public MemoryPooledByteBufferOutputStream(b bVar, int i) {
        if (i <= 0) {
            r6.g("Check failed.");
            throw null;
        }
        this.a = bVar;
        this.c = 0;
        this.b = n82.d0(bVar.get(i), bVar, n82.f);
    }

    @Override // defpackage.bgb, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        n82.G(this.b);
        this.b = null;
        this.c = -1;
        super.close();
    }

    @Override // defpackage.bgb
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final xn9 a() {
        if (!n82.W(this.b)) {
            throw new InvalidStreamException();
        }
        im3 im3Var = this.b;
        if (im3Var != null) {
            return new xn9(im3Var, this.c);
        }
        r6.g("Required value was null.");
        return null;
    }

    @Override // defpackage.bgb
    public final int size() {
        return this.c;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws Throwable {
        bArr.getClass();
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            StringBuilder sbF = uz.f("length=", bArr.length, "; regionStart=", i, "; regionLength=");
            sbF.append(i2);
            throw new ArrayIndexOutOfBoundsException(sbF.toString());
        }
        if (!n82.W(this.b)) {
            throw new InvalidStreamException();
        }
        int i3 = this.c + i2;
        if (!n82.W(this.b)) {
            throw new InvalidStreamException();
        }
        im3 im3Var = this.b;
        if (im3Var == null) {
            r6.g("Required value was null.");
            return;
        }
        if (i3 > ((wn9) im3Var.P()).a()) {
            b bVar = this.a;
            wn9 wn9Var = bVar.get(i3);
            wn9Var.getClass();
            wn9 wn9Var2 = wn9Var;
            im3 im3Var2 = this.b;
            if (im3Var2 == null) {
                r6.g("Required value was null.");
                return;
            }
            ((wn9) im3Var2.P()).v(wn9Var2, this.c);
            im3 im3Var3 = this.b;
            im3Var3.getClass();
            im3Var3.close();
            this.b = n82.d0(wn9Var2, bVar, n82.f);
        }
        im3 im3Var4 = this.b;
        if (im3Var4 == null) {
            r6.g("Required value was null.");
        } else {
            ((wn9) im3Var4.P()).s(this.c, i, i2, bArr);
            this.c += i2;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }
}
