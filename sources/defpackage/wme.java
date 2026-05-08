package defpackage;

import android.os.SystemClock;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.upstream.Loader;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes.dex */
public final class wme {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public static boolean c;
    public static long d;

    public static final class a implements Loader.a<Loader.d> {
        public final DashMediaSource.a a;

        public a(DashMediaSource.a aVar) {
            this.a = aVar;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.a
        public final Loader.b g(Loader.d dVar, long j, long j2, IOException iOException, int i) {
            DashMediaSource.this.z(iOException);
            return Loader.e;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.a
        public final void r(Loader.d dVar, long j, long j2) {
            boolean z;
            DashMediaSource.a aVar = this.a;
            synchronized (wme.b) {
                z = wme.c;
            }
            if (z) {
                aVar.a();
            } else {
                DashMediaSource.this.z(new IOException(new ConcurrentModificationException()));
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.a
        public final void v(Loader.d dVar, long j, long j2, boolean z) {
        }
    }

    public static final class b implements Loader.d {
        @Override // androidx.media3.exoplayer.upstream.Loader.d
        public final void a() {
            synchronized (wme.a) {
                Object obj = wme.b;
                synchronized (obj) {
                    if (wme.c) {
                        return;
                    }
                    long jA = wme.a();
                    synchronized (obj) {
                        SystemClock.elapsedRealtime();
                        wme.d = jA;
                        wme.c = true;
                    }
                }
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.d
        public final void b() {
        }
    }

    public static long a() {
        byte b2;
        SocketTimeoutException socketTimeoutException;
        byte[] bArr;
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            Object obj = b;
            synchronized (obj) {
            }
            datagramSocket.setSoTimeout(1000);
            synchronized (obj) {
            }
            InetAddress[] allByName = InetAddress.getAllByName("time.android.com");
            int length = allByName.length;
            byte b3 = 0;
            SocketTimeoutException socketTimeoutException2 = null;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                byte[] bArr2 = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr2, 48, allByName[i], 123);
                bArr2[b3] = 27;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jCurrentTimeMillis == 0) {
                    Arrays.fill(bArr2, 40, 48, b3);
                    b2 = b3;
                    socketTimeoutException = socketTimeoutException2;
                    bArr = bArr2;
                } else {
                    long j = jCurrentTimeMillis / 1000;
                    long j2 = jCurrentTimeMillis - (j * 1000);
                    b2 = b3;
                    socketTimeoutException = socketTimeoutException2;
                    long j3 = j + 2208988800L;
                    bArr = bArr2;
                    bArr[40] = (byte) (j3 >> 24);
                    bArr[41] = (byte) (j3 >> 16);
                    bArr[42] = (byte) (j3 >> 8);
                    bArr[43] = (byte) j3;
                    long j4 = (j2 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j4 >> 24);
                    bArr[45] = (byte) (j4 >> 16);
                    bArr[46] = (byte) (j4 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                }
                datagramSocket.send(datagramPacket);
                byte[] bArr3 = bArr;
                try {
                    datagramSocket.receive(new DatagramPacket(bArr3, 48));
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j5 = (jElapsedRealtime2 - jElapsedRealtime) + jCurrentTimeMillis;
                    byte b4 = bArr3[b2];
                    byte b5 = (byte) ((b4 >> 6) & 3);
                    byte b6 = (byte) (b4 & 7);
                    int i3 = bArr3[1] & 255;
                    long jC = c(24, bArr3);
                    long jC2 = c(32, bArr3);
                    long jC3 = c(40, bArr3);
                    if (b5 == 3) {
                        r40.h("SNTP: Unsynchronized server");
                    } else if (b6 != 4 && b6 != 5) {
                        r40.h(p6.c(b6, "SNTP: Untrusted mode: "));
                    } else if (i3 == 0 || i3 > 15) {
                        r40.h(p6.c(i3, "SNTP: Untrusted stratum: "));
                    } else if (jC3 == 0) {
                        r40.h("SNTP: Zero transmitTime");
                    }
                    long j6 = (j5 + (((jC3 - j5) + (jC2 - jC)) / 2)) - jElapsedRealtime2;
                    datagramSocket.close();
                    return j6;
                } catch (SocketTimeoutException e) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException2 = e;
                    } else {
                        SocketTimeoutException socketTimeoutException3 = socketTimeoutException;
                        socketTimeoutException3.addSuppressed(e);
                        socketTimeoutException2 = socketTimeoutException3;
                    }
                    int i4 = i2 + 1;
                    if (i2 >= 10) {
                        socketTimeoutException2.getClass();
                        throw socketTimeoutException2;
                    }
                    i++;
                    i2 = i4;
                    b3 = b2;
                }
            }
            socketTimeoutException2.getClass();
            throw socketTimeoutException2;
        } finally {
        }
    }

    public static long b(int i, byte[] bArr) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            i2 = (i2 & 127) + IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            i3 = (i3 & 127) + IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i4 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            i4 = (i4 & 127) + IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i5 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            i5 = (i5 & 127) + IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }

    public static long c(int i, byte[] bArr) {
        long jB = b(i, bArr);
        long jB2 = b(i + 4, bArr);
        if (jB == 0 && jB2 == 0) {
            return 0L;
        }
        return ((jB2 * 1000) / 4294967296L) + ((jB - 2208988800L) * 1000);
    }
}
