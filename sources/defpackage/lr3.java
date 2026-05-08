package defpackage;

import androidx.media3.common.a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.vuf;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lr3 {
    public final int a;
    public final List<a> b;

    public lr3(int i, List<a> list) {
        this.a = i;
        this.b = list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.vuf a(int r6, vuf.b r7) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr3.a(int, vuf$b):vuf");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    public final List<a> b(vuf.b bVar) {
        String str;
        int i;
        List<byte[]> listSingletonList;
        boolean zC = c(32);
        List<a> list = this.b;
        if (zC) {
            return list;
        }
        g4b g4bVar = new g4b(bVar.d);
        ArrayList arrayList = list;
        while (g4bVar.a() > 0) {
            int iX = g4bVar.x();
            int iX2 = g4bVar.b + g4bVar.x();
            if (iX == 134) {
                arrayList = new ArrayList();
                int iX3 = g4bVar.x() & 31;
                for (int i2 = 0; i2 < iX3; i2++) {
                    String strV = g4bVar.v(3, StandardCharsets.UTF_8);
                    int iX4 = g4bVar.x();
                    boolean z = (iX4 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0;
                    if (z) {
                        i = iX4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bX = (byte) g4bVar.x();
                    g4bVar.K(1);
                    if (z) {
                        boolean z2 = (bX & 64) != 0;
                        byte[] bArr = d92.a;
                        listSingletonList = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    a.C0036a c0036a = new a.C0036a();
                    c0036a.m = st9.p(str);
                    c0036a.d = strV;
                    c0036a.J = i;
                    c0036a.p = listSingletonList;
                    arrayList.add(new a(c0036a));
                }
            }
            g4bVar.J(iX2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    public final boolean c(int i) {
        return (this.a & i) != 0;
    }
}
