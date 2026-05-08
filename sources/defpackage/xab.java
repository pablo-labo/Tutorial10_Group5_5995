package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class xab {
    public static final b a;
    public static final a b;

    public static final class a {
        public final String a;

        public a() {
            String property = System.getProperty("java.version");
            String property2 = System.getProperty("java.runtime.version");
            System.getProperty("java.runtime.name");
            System.getProperty("java.vm.vendor");
            String property3 = System.getProperty("java.vendor.version");
            property = property == null ? "" : property;
            this.a = property3 == null ? "" : property3;
            property2 = (property.isEmpty() || property2 == null) ? property : property2;
            if (property.length() + 1 >= property2.length()) {
                return;
            }
            property2.substring(property.length() + 1);
        }
    }

    public static final class b {
        public final int a;
        public final int b;
        public final int c;

        public b(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    static {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        String property = System.getProperty("java.version");
        int iIndexOf = property.indexOf(45);
        int i = 0;
        if (iIndexOf >= 0) {
            property = property.substring(0, iIndexOf);
        }
        try {
            ArrayList arrayListC = c(property);
            iIntValue = ((Integer) arrayListC.get(0)).intValue();
            try {
                if (iIntValue == 1) {
                    iIntValue = ((Integer) arrayListC.get(1)).intValue();
                    iIntValue2 = ((Integer) arrayListC.get(2)).intValue();
                    try {
                        iIntValue3 = ((Integer) arrayListC.get(3)).intValue();
                    } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                    }
                } else {
                    int iIntValue4 = ((Integer) arrayListC.get(1)).intValue();
                    try {
                        iIntValue3 = ((Integer) arrayListC.get(2)).intValue();
                        iIntValue2 = iIntValue4;
                    } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                        iIntValue2 = iIntValue4;
                    }
                }
                i = iIntValue3;
            } catch (IndexOutOfBoundsException | NumberFormatException unused3) {
                iIntValue2 = i;
            }
        } catch (IndexOutOfBoundsException | NumberFormatException unused4) {
            iIntValue = 0;
            iIntValue2 = 0;
        }
        a = new b(iIntValue, iIntValue2, i);
        b = new a();
    }

    public static boolean a(int i) {
        return a.a == i;
    }

    public static boolean b(int i, int i2) {
        b bVar = a;
        int i3 = bVar.a;
        int i4 = bVar.b;
        int i5 = bVar.c;
        if (i3 > i) {
            return true;
        }
        if (i3 != i || i4 <= 0) {
            return i3 == i && i4 == 0 && i5 >= i2;
        }
        return true;
    }

    public static ArrayList c(String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= '0' && cCharAt <= '9') {
                i = (cCharAt - '0') + (i * 10);
            } else {
                if (cCharAt != '.' && cCharAt != '_' && cCharAt != '+') {
                    throw new NumberFormatException();
                }
                arrayList.add(Integer.valueOf(i));
                i = 0;
            }
        }
        arrayList.add(Integer.valueOf(i));
        return arrayList;
    }
}
