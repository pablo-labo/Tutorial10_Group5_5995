package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public final class tp4 extends qp4 {
    public final xp4 f;

    public tp4(boolean z, xp4 xp4Var) throws IOException {
        this.a = z;
        this.f = xp4Var;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        xp4Var.p(16L, byteBufferAllocate);
        this.b = xp4Var.s(28L, byteBufferAllocate);
        this.c = xp4Var.s(32L, byteBufferAllocate);
        this.d = xp4Var.p(42L, byteBufferAllocate);
        this.e = xp4Var.p(44L, byteBufferAllocate);
        xp4Var.p(46L, byteBufferAllocate);
        xp4Var.p(48L, byteBufferAllocate);
        xp4Var.p(50L, byteBufferAllocate);
    }

    @Override // defpackage.qp4
    public final pp4 a(int i, long j) {
        ee4 ee4Var = new ee4();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(this.a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = j + ((long) (i * 8));
        xp4 xp4Var = this.f;
        ee4Var.a = xp4Var.s(j2, byteBufferAllocate);
        ee4Var.b = xp4Var.s(j2 + 4, byteBufferAllocate);
        return ee4Var;
    }

    @Override // defpackage.qp4
    public final rp4 b(long j) {
        o2c o2cVar = new o2c();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(this.a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = (j * ((long) this.d)) + this.b;
        xp4 xp4Var = this.f;
        o2cVar.a = xp4Var.s(j2, byteBufferAllocate);
        o2cVar.b = xp4Var.s(4 + j2, byteBufferAllocate);
        o2cVar.c = xp4Var.s(8 + j2, byteBufferAllocate);
        o2cVar.d = xp4Var.s(j2 + 20, byteBufferAllocate);
        return o2cVar;
    }

    @Override // defpackage.qp4
    public final sp4 c() {
        uxd uxdVar = new uxd();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(this.a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        uxdVar.a = this.f.s(this.c + ((long) 0) + 28, byteBufferAllocate);
        return uxdVar;
    }
}
