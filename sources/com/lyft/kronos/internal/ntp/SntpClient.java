package com.lyft.kronos.internal.ntp;

import android.os.SystemClock;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.mh2;
import defpackage.p6;
import defpackage.ypd;
import defpackage.zkd;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class SntpClient {
    public final ypd a;

    public static class InvalidServerReplyException extends IOException {
    }

    public static final class a {
        public final long a;
        public final long b;
        public final long c;

        public a(long j, long j2, long j3, ypd ypdVar) {
            this.a = j;
            this.b = j2;
            this.c = j3;
        }
    }

    public SntpClient(ypd ypdVar, zkd zkdVar, mh2 mh2Var) {
        this.a = ypdVar;
    }

    public static void a(byte b, byte b2, int i, long j) throws InvalidServerReplyException {
        if (b == 3) {
            throw new InvalidServerReplyException("unsynchronized server");
        }
        if (b2 != 4 && b2 != 5) {
            throw new InvalidServerReplyException(p6.c(b2, "untrusted mode: "));
        }
        if (i == 0 || i > 15) {
            throw new InvalidServerReplyException(p6.c(i, "untrusted stratum: "));
        }
        if (j == 0) {
            throw new InvalidServerReplyException("zero transmitTime");
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
        return ((b(i + 4, bArr) * 1000) / 4294967296L) + ((jB - 2208988800L) * 1000);
    }

    public final a d(String str, Long l) throws Throwable {
        InetAddress byName;
        DatagramSocket datagramSocket;
        DatagramSocket datagramSocket2 = null;
        try {
            str.getClass();
            byName = InetAddress.getByName(str);
            byName.getClass();
            datagramSocket = new DatagramSocket();
        } catch (Throwable th) {
            th = th;
        }
        try {
            datagramSocket.setSoTimeout(l.intValue());
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jCurrentTimeMillis / 1000;
            long j2 = jCurrentTimeMillis - (j * 1000);
            bArr[40] = (byte) (r12 >> 24);
            bArr[41] = (byte) (r12 >> 16);
            bArr[42] = (byte) (r12 >> 8);
            bArr[43] = (byte) (j + 2208988800L);
            long j3 = (j2 * 4294967296L) / 1000;
            bArr[44] = (byte) (j3 >> 24);
            bArr[45] = (byte) (j3 >> 16);
            bArr[46] = (byte) (j3 >> 8);
            bArr[47] = (byte) (Math.random() * 255.0d);
            datagramSocket.send(datagramPacket);
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 48);
            datagramSocket.receive(new DatagramPacket(bArrCopyOf, bArrCopyOf.length));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j4 = (jElapsedRealtime2 - jElapsedRealtime) + jCurrentTimeMillis;
            byte b = bArrCopyOf[0];
            int i = bArrCopyOf[1] & 255;
            long jC = c(24, bArrCopyOf);
            long jC2 = c(32, bArrCopyOf);
            long jC3 = c(40, bArrCopyOf);
            a((byte) ((b >> 6) & 3), (byte) (b & 7), i, jC3);
            a aVar = new a(j4, jElapsedRealtime2, ((jC3 - j4) + (jC2 - jC)) / 2, this.a);
            datagramSocket.close();
            return aVar;
        } catch (Throwable th2) {
            th = th2;
            datagramSocket2 = datagramSocket;
            if (datagramSocket2 != null) {
                datagramSocket2.close();
            }
            throw th;
        }
    }
}
