package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public final class up4 extends qp4 {
    public final xp4 f;

    public up4(boolean z, xp4 xp4Var) throws IOException {
        this.a = z;
        this.f = xp4Var;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        xp4Var.p(16L, byteBufferAllocate);
        xp4Var.h(byteBufferAllocate, 32L, 8);
        this.b = byteBufferAllocate.getLong();
        xp4Var.h(byteBufferAllocate, 40L, 8);
        this.c = byteBufferAllocate.getLong();
        this.d = xp4Var.p(54L, byteBufferAllocate);
        this.e = xp4Var.p(56L, byteBufferAllocate);
        xp4Var.p(58L, byteBufferAllocate);
        xp4Var.p(60L, byteBufferAllocate);
        xp4Var.p(62L, byteBufferAllocate);
    }

    @Override // defpackage.qp4
    public final pp4 a(int i, long j) throws IOException {
        fe4 fe4Var = new fe4();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(this.a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = j + ((long) (i * 16));
        xp4 xp4Var = this.f;
        xp4Var.h(byteBufferAllocate, j2, 8);
        fe4Var.a = byteBufferAllocate.getLong();
        xp4Var.h(byteBufferAllocate, j2 + 8, 8);
        fe4Var.b = byteBufferAllocate.getLong();
        return fe4Var;
    }

    @Override // defpackage.qp4
    public final rp4 b(long j) throws IOException {
        p2c p2cVar = new p2c();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(this.a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = (j * ((long) this.d)) + this.b;
        xp4 xp4Var = this.f;
        p2cVar.a = xp4Var.s(j2, byteBufferAllocate);
        xp4Var.h(byteBufferAllocate, 8 + j2, 8);
        p2cVar.b = byteBufferAllocate.getLong();
        xp4Var.h(byteBufferAllocate, 16 + j2, 8);
        p2cVar.c = byteBufferAllocate.getLong();
        xp4Var.h(byteBufferAllocate, j2 + 40, 8);
        p2cVar.d = byteBufferAllocate.getLong();
        return p2cVar;
    }

    @Override // defpackage.qp4
    public final sp4 c() {
        vxd vxdVar = new vxd();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(this.a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        vxdVar.a = this.f.s(this.c + ((long) 0) + 44, byteBufferAllocate);
        return vxdVar;
    }
}
