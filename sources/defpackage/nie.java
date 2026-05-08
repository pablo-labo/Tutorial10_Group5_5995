package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class nie {
    public static final Bitmap.Config[] d;
    public static final Bitmap.Config[] e;
    public static final Bitmap.Config[] f;
    public static final Bitmap.Config[] g;
    public static final Bitmap.Config[] h;
    public final c a = new c();
    public final rd6<b, Bitmap> b = new rd6<>();
    public final HashMap c = new HashMap();

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class b implements yfb {
        public final c a;
        public int b;
        public Bitmap.Config c;

        public b(c cVar) {
            this.a = cVar;
        }

        @Override // defpackage.yfb
        public final void a() {
            this.a.H(this);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.b == bVar.b && xjg.b(this.c, bVar.c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = this.b * 31;
            Bitmap.Config config = this.c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return nie.c(this.b, this.c);
        }
    }

    public static class c extends o81 {
        public final yfb I() {
            return new b(this);
        }
    }

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        d = configArr;
        e = configArr;
        f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapD = d(bitmap.getConfig());
        Integer num2 = navigableMapD.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapD.remove(num);
                return;
            } else {
                navigableMapD.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        StringBuilder sb = new StringBuilder("Tried to decrement empty size, size: ");
        sb.append(num);
        String strC = c(xjg.c(bitmap), bitmap.getConfig());
        sb.append(", removed: ");
        sb.append(strC);
        sb.append(", this: ");
        sb.append(this);
        throw new NullPointerException(sb.toString());
    }

    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iD = xjg.d(config) * i * i2;
        c cVar = this.a;
        yfb yfbVarI = (yfb) ((ArrayDeque) cVar.c).poll();
        if (yfbVarI == null) {
            yfbVarI = cVar.I();
        }
        b bVar = (b) yfbVarI;
        bVar.b = iD;
        bVar.c = config;
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = e;
        } else {
            int i3 = a.a[config.ordinal()];
            configArr = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? new Bitmap.Config[]{config} : h : g : f : d;
        }
        int length = configArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i4];
            Integer numCeilingKey = d(config2).ceilingKey(Integer.valueOf(iD));
            if (numCeilingKey == null || numCeilingKey.intValue() > iD * 8) {
                i4++;
            } else if (numCeilingKey.intValue() != iD || (config2 != null ? !config2.equals(config) : config != null)) {
                cVar.H(bVar);
                int iIntValue = numCeilingKey.intValue();
                yfb yfbVarI2 = (yfb) ((ArrayDeque) cVar.c).poll();
                if (yfbVarI2 == null) {
                    yfbVarI2 = cVar.I();
                }
                bVar = (b) yfbVarI2;
                bVar.b = iIntValue;
                bVar.c = config2;
            }
        }
        Bitmap bitmapA = this.b.a(bVar);
        if (bitmapA != null) {
            a(Integer.valueOf(bVar.b), bitmapA);
            bitmapA.reconfigure(i, i2, config);
        }
        return bitmapA;
    }

    public final NavigableMap<Integer, Integer> d(Bitmap.Config config) {
        HashMap map = this.c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    public final void e(Bitmap bitmap) {
        int iC = xjg.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        c cVar = this.a;
        yfb yfbVarI = (yfb) ((ArrayDeque) cVar.c).poll();
        if (yfbVarI == null) {
            yfbVarI = cVar.I();
        }
        b bVar = (b) yfbVarI;
        bVar.b = iC;
        bVar.c = config;
        this.b.b(bVar, bitmap);
        NavigableMap<Integer, Integer> navigableMapD = d(bitmap.getConfig());
        Integer num = navigableMapD.get(Integer.valueOf(bVar.b));
        navigableMapD.put(Integer.valueOf(bVar.b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sbG = q6.g("SizeConfigStrategy{groupedMap=");
        sbG.append(this.b);
        sbG.append(", sortedSizes=(");
        HashMap map = this.c;
        for (Map.Entry entry : map.entrySet()) {
            sbG.append(entry.getKey());
            sbG.append('[');
            sbG.append(entry.getValue());
            sbG.append("], ");
        }
        if (!map.isEmpty()) {
            sbG.replace(sbG.length() - 2, sbG.length(), "");
        }
        sbG.append(")}");
        return sbG.toString();
    }
}
