package defpackage;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class dp1 extends xf1 {
    public static final dp1 f = new dp1(Arrays.copyOf(new int[]{1, 0, 7}, 3));

    public static final class a {
        public static dp1 a(InputStream inputStream) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            oh7 oh7Var = new oh7(1, dataInputStream.readInt(), 1);
            ArrayList arrayList = new ArrayList(t92.r0(oh7Var, 10));
            Iterator<Integer> it = oh7Var.iterator();
            while (((nh7) it).c) {
                ((fh7) it).nextInt();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] iArrY1 = z92.y1(arrayList);
            int[] iArrCopyOf = Arrays.copyOf(iArrY1, iArrY1.length);
            return new dp1(Arrays.copyOf(iArrCopyOf, iArrCopyOf.length));
        }
    }

    static {
        new dp1(Arrays.copyOf(new int[0], 0));
    }
}
