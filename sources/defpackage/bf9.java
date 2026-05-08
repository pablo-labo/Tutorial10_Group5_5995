package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class bf9 {
    public static ArrayList a(byte[] bArr) {
        long j = (((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static final float b(long j, float f, long j2, long j3) {
        long jX = pnb.x(da2.b(j, f), j3);
        float fJ = pnb.J(pnb.x(j2, jX)) + 0.05f;
        float fJ2 = pnb.J(jX) + 0.05f;
        return Math.max(fJ, fJ2) / Math.min(fJ, fJ2);
    }

    public static long c(byte b, byte b2) {
        int i;
        int i2 = b & 255;
        int i3 = b & 3;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1 && i3 != 2) {
                i = b2 & 63;
            }
        } else {
            i = 1;
        }
        int i4 = i2 >> 3;
        int i5 = i4 & 3;
        return ((long) i) * ((long) (i4 >= 16 ? 2500 << i5 : i4 >= 12 ? 10000 << (i4 & 1) : i5 == 3 ? 60000 : 10000 << i5));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.d8a d(java.lang.String r5) {
        /*
            r5.getClass()
            android.net.Uri r5 = android.net.Uri.parse(r5)
            java.lang.String r0 = r5.getPath()
            if (r0 != 0) goto Lf
            java.lang.String r0 = ""
        Lf:
            java.lang.String r1 = "/myjobs"
            r2 = 6
            r3 = 0
            int r1 = defpackage.zve.S(r0, r1, r3, r3, r2)
            if (r1 < 0) goto L1f
            int r1 = r1 + 7
            java.lang.String r0 = r0.substring(r1)
        L1f:
            java.lang.String r1 = "view"
            java.lang.String r1 = r5.getQueryParameter(r1)
            java.lang.String r2 = "from"
            java.lang.String r2 = r5.getQueryParameter(r2)
            java.lang.String r4 = "applicationId"
            java.lang.String r5 = r5.getQueryParameter(r4)
            java.lang.String r4 = "next_steps_dashboard"
            boolean r1 = defpackage.wl7.b(r1, r4)
            if (r1 == 0) goto L3c
            java.lang.String r0 = "nextStepsDashboard"
            goto L94
        L3c:
            java.lang.String r1 = "/schedule-apply/review"
            boolean r1 = defpackage.wve.K(r0, r1, r3)
            if (r1 == 0) goto L47
            java.lang.String r0 = "scheduleApplyReview"
            goto L94
        L47:
            java.lang.String r1 = "/schedule-apply"
            boolean r1 = defpackage.wve.K(r0, r1, r3)
            if (r1 == 0) goto L52
            java.lang.String r0 = "scheduleApply"
            goto L94
        L52:
            java.lang.String r1 = "/saved"
            boolean r1 = defpackage.wve.K(r0, r1, r3)
            if (r1 == 0) goto L5d
            java.lang.String r0 = "saved"
            goto L94
        L5d:
            java.lang.String r1 = "/applied"
            boolean r1 = defpackage.wve.K(r0, r1, r3)
            java.lang.String r4 = "applied"
            if (r1 == 0) goto L69
        L67:
            r0 = r4
            goto L94
        L69:
            java.lang.String r1 = "/invitations"
            boolean r1 = defpackage.wve.K(r0, r1, r3)
            if (r1 == 0) goto L74
            java.lang.String r0 = "invitations"
            goto L94
        L74:
            java.lang.String r1 = "/interviews"
            boolean r1 = defpackage.wve.K(r0, r1, r3)
            if (r1 == 0) goto L7f
            java.lang.String r0 = "interviews"
            goto L94
        L7f:
            java.lang.String r1 = "/archived"
            boolean r1 = defpackage.wve.K(r0, r1, r3)
            if (r1 == 0) goto L8a
            java.lang.String r0 = "archived"
            goto L94
        L8a:
            java.lang.String r1 = "/ghostwriterAutoApply"
            boolean r0 = defpackage.wve.K(r0, r1, r3)
            if (r0 == 0) goto L67
            java.lang.String r0 = "ghostwriterAutoApply"
        L94:
            d8a r1 = new d8a
            r1.<init>(r0, r2, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bf9.d(java.lang.String):d8a");
    }

    public static e e(e eVar, w80 w80Var) {
        return eVar.o(new PointerHoverIconModifierElement(w80Var));
    }

    public static void f(Throwable th) {
        if (Error.class.isInstance(th)) {
            throw ((Throwable) Error.class.cast(th));
        }
        if (!RuntimeException.class.isInstance(th)) {
            throw new RuntimeException(th);
        }
        throw ((Throwable) RuntimeException.class.cast(th));
    }
}
