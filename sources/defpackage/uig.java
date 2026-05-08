package defpackage;

import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class uig {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;

    public uig(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
    }

    public final String a(String str, long j, int i, long j2) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            ArrayList arrayList2 = this.a;
            if (i2 >= size) {
                sb.append((String) arrayList2.get(arrayList.size()));
                return sb.toString();
            }
            sb.append((String) arrayList2.get(i2));
            if (((Integer) arrayList.get(i2)).intValue() == 1) {
                sb.append(str);
            } else {
                int iIntValue = ((Integer) arrayList.get(i2)).intValue();
                ArrayList arrayList3 = this.c;
                if (iIntValue == 2) {
                    sb.append(String.format(Locale.US, (String) arrayList3.get(i2), Long.valueOf(j)));
                } else if (((Integer) arrayList.get(i2)).intValue() == 3) {
                    sb.append(String.format(Locale.US, (String) arrayList3.get(i2), Integer.valueOf(i)));
                } else if (((Integer) arrayList.get(i2)).intValue() == 4) {
                    sb.append(String.format(Locale.US, (String) arrayList3.get(i2), Long.valueOf(j2)));
                }
            }
            i2++;
        }
    }
}
