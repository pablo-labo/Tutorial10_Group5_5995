package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j92 {

    public final class a extends mj8 implements gu5<Boolean> {
        public static final a a = new a(0);

        @Override // defpackage.gu5
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final boolean a(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = zr4.a;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i = 0;
                while (i < size) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    f5e f5eVar = (f5e) obj2;
                    f5e f5eVar2 = (f5e) obj;
                    arrayList2.add(new ooa((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (f5eVar2.g().b() >> 32)) - Float.intBitsToFloat((int) (f5eVar.g().b() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (f5eVar2.g().b() & 4294967295L)) - Float.intBitsToFloat((int) (f5eVar.g().b() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((ooa) z92.O0(list)).a;
            } else {
                if (list.isEmpty()) {
                    fz8.d("Empty collection can't be reduced.");
                }
                Object objO0 = z92.O0(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i2 = 1;
                    while (true) {
                        objO0 = new ooa(ooa.f(((ooa) objO0).a, ((ooa) list.get(i2)).a));
                        if (i2 == size2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((ooa) objO0).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }
}
