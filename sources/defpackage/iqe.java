package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class iqe implements dye {
    public static final Pattern g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean a;
    public final hqe b;
    public LinkedHashMap d;
    public float e = -3.4028235E38f;
    public float f = -3.4028235E38f;
    public final g4b c = new g4b();

    public iqe(List<byte[]> list) {
        if (list == null || list.isEmpty()) {
            this.a = false;
            this.b = null;
            return;
        }
        this.a = true;
        String strQ = vjg.q(list.get(0));
        ka2.l(strQ.startsWith("Format:"));
        hqe hqeVarA = hqe.a(strQ);
        hqeVarA.getClass();
        this.b = hqeVarA;
        e(new g4b(list.get(1)), StandardCharsets.UTF_8);
    }

    public static int d(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    public static long f(String str) {
        Matcher matcher = g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        String str2 = vjg.a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0251 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0265 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02d6 A[LOOP:2: B:147:0x02d4->B:148:0x02d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0243  */
    @Override // defpackage.dye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(byte[] r28, int r29, int r30, dye.b r31, defpackage.wq2<defpackage.s83> r32) {
        /*
            Method dump skipped, instruction units count: 986
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqe.b(byte[], int, int, dye$b, wq2):void");
    }

    @Override // defpackage.dye
    public final int c() {
        return 1;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(defpackage.g4b r39, java.nio.charset.Charset r40) {
        /*
            Method dump skipped, instruction units count: 850
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqe.e(g4b, java.nio.charset.Charset):void");
    }
}
