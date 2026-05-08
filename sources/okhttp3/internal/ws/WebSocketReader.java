package okhttp3.internal.ws;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.r40;
import defpackage.to1;
import defpackage.vr1;
import defpackage.zn1;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/ws/WebSocketReader;", "Ljava/io/Closeable;", "FrameCallback", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebSocketReader implements Closeable {
    public long V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public final zn1 Z;
    public final to1 a;
    public final zn1 a0;
    public final FrameCallback b;
    public MessageInflater b0;
    public final boolean c;
    public final byte[] c0;
    public final boolean d;
    public boolean e;
    public int f;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface FrameCallback {
        void b(String str);

        void c(vr1 vr1Var);

        void d(vr1 vr1Var);

        void f(vr1 vr1Var);

        void g(int i, String str);
    }

    public WebSocketReader(to1 to1Var, RealWebSocket realWebSocket, boolean z, boolean z2) {
        to1Var.getClass();
        realWebSocket.getClass();
        this.a = to1Var;
        this.b = realWebSocket;
        this.c = z;
        this.d = z2;
        this.Z = new zn1();
        this.a0 = new zn1();
        this.c0 = null;
    }

    public final void a() {
        short s;
        String strZ1;
        long j = this.V;
        zn1 zn1Var = this.Z;
        if (j > 0) {
            this.a.C0(zn1Var, j);
        }
        int i = this.f;
        FrameCallback frameCallback = this.b;
        switch (i) {
            case 8:
                long j2 = zn1Var.b;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j2 != 0) {
                    s = zn1Var.readShort();
                    strZ1 = zn1Var.z1();
                    WebSocketProtocol.a.getClass();
                    String strA = WebSocketProtocol.a(s);
                    if (strA != null) {
                        throw new ProtocolException(strA);
                    }
                } else {
                    s = 1005;
                    strZ1 = "";
                }
                frameCallback.g(s, strZ1);
                this.e = true;
                return;
            case DatadogLogGenerator.CRASH /* 9 */:
                frameCallback.d(zn1Var.J0(zn1Var.b));
                return;
            case 10:
                frameCallback.f(zn1Var.J0(zn1Var.b));
                return;
            default:
                int i2 = this.f;
                byte[] bArr = Util.a;
                String hexString = Integer.toHexString(i2);
                hexString.getClass();
                throw new ProtocolException("Unknown control opcode: ".concat(hexString));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        MessageInflater messageInflater = this.b0;
        if (messageInflater != null) {
            messageInflater.close();
        }
    }

    public final void h() {
        boolean z;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (this.e) {
            r40.h("closed");
            return;
        }
        to1 to1Var = this.a;
        long c = to1Var.g().getC();
        to1Var.g().b();
        try {
            byte b = to1Var.readByte();
            byte[] bArr = Util.a;
            to1Var.g().g(c, timeUnit);
            int i = b & 15;
            this.f = i;
            boolean z2 = (b & 128) != 0;
            this.W = z2;
            boolean z3 = (b & 8) != 0;
            this.X = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (b & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.c) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.Y = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((b & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((b & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte b2 = to1Var.readByte();
            boolean z5 = (b2 & 128) != 0;
            if (z5) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long j = b2 & 127;
            this.V = j;
            if (j == 126) {
                this.V = to1Var.readShort() & 65535;
            } else if (j == 127) {
                long j2 = to1Var.readLong();
                this.V = j2;
                if (j2 < 0) {
                    String hexString = Long.toHexString(this.V);
                    hexString.getClass();
                    throw new ProtocolException("Frame length 0x" + hexString + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.X && this.V > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                byte[] bArr2 = this.c0;
                bArr2.getClass();
                to1Var.readFully(bArr2);
            }
        } catch (Throwable th) {
            to1Var.g().g(c, timeUnit);
            throw th;
        }
    }
}
