package com.facebook.soloader;

import android.util.Log;
import defpackage.vp4;
import defpackage.wp4;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedByInterruptException;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    public static class a extends UnsatisfiedLinkError {
    }

    public static String[] a(vp4 vp4Var) throws ClosedByInterruptException {
        if (!(vp4Var instanceof wp4)) {
            return b(vp4Var);
        }
        wp4 wp4Var = (wp4) vp4Var;
        int i = 0;
        while (true) {
            try {
                return b(wp4Var);
            } catch (ClosedByInterruptException e) {
                i++;
                if (i > 4) {
                    throw e;
                }
                Thread.interrupted();
                Log.e("MinElf", "retrying extract_DT_NEEDED due to ClosedByInterruptException", e);
                FileInputStream fileInputStream = new FileInputStream(wp4Var.a);
                wp4Var.b = fileInputStream;
                wp4Var.c = fileInputStream.getChannel();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0242 A[LOOP:1: B:50:0x00f4->B:134:0x0242, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String[] b(defpackage.vp4 r37) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.e.b(vp4):java.lang.String[]");
    }

    public static long c(vp4 vp4Var, ByteBuffer byteBuffer, long j) {
        d(vp4Var, byteBuffer, 4, j);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    public static void d(vp4 vp4Var, ByteBuffer byteBuffer, int i, long j) {
        int iH0;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (iH0 = vp4Var.H0(j, byteBuffer)) != -1) {
            j += (long) iH0;
        }
        if (byteBuffer.remaining() > 0) {
            throw new a("ELF file truncated");
        }
        byteBuffer.position(0);
    }
}
