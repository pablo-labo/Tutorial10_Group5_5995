package okhttp3.internal.ws;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.l5;
import defpackage.r40;
import defpackage.ro1;
import defpackage.vr1;
import defpackage.zn1;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/ws/WebSocketWriter;", "Ljava/io/Closeable;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebSocketWriter implements Closeable {
    public final zn1 V;
    public boolean W;
    public MessageDeflater X;
    public final byte[] Y;
    public final zn1.c Z;
    public final ro1 a;
    public final Random b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final zn1 f;

    public WebSocketWriter(ro1 ro1Var, Random random, boolean z, boolean z2, long j) {
        ro1Var.getClass();
        this.a = ro1Var;
        this.b = random;
        this.c = z;
        this.d = z2;
        this.e = j;
        this.f = new zn1();
        this.V = ro1Var.f();
        this.Y = new byte[4];
        this.Z = new zn1.c();
    }

    public final void a(vr1 vr1Var, int i) throws IOException {
        if (this.W) {
            r40.h("closed");
            return;
        }
        int iH = vr1Var.h();
        if (iH > 125) {
            l5.q("Payload size must be less than or equal to 125");
            return;
        }
        int i2 = i | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        zn1 zn1Var = this.V;
        zn1Var.r0(i2);
        zn1Var.r0(iH | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        byte[] bArr = this.Y;
        bArr.getClass();
        this.b.nextBytes(bArr);
        zn1Var.write(bArr, 0, bArr.length);
        if (iH > 0) {
            long j = zn1Var.b;
            zn1Var.o0(vr1Var);
            zn1.c cVar = this.Z;
            cVar.getClass();
            zn1Var.d0(cVar);
            cVar.h(j);
            WebSocketProtocol.a.getClass();
            WebSocketProtocol.b(cVar, bArr);
            cVar.close();
        }
        this.a.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        MessageDeflater messageDeflater = this.X;
        if (messageDeflater != null) {
            messageDeflater.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(defpackage.vr1 r22, int r23) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.WebSocketWriter.h(vr1, int):void");
    }
}
