package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface vte {

    public static final class a {
        public static final C0462a a = new C0462a();

        /* JADX INFO: renamed from: vte$a$a, reason: collision with other inner class name */
        public static final class C0462a implements vte {
            @Override // defpackage.vte
            public final z2a a(int i, int i2, gh7 gh7Var) {
                int i3;
                if (i2 - i < 0 || (i3 = gh7Var.b) == 0) {
                    return hh7.a;
                }
                oh7 oh7VarH = nic.H(0, i3);
                int i4 = oh7VarH.a;
                int i5 = oh7VarH.b;
                int iA = -1;
                if (i4 <= i5) {
                    while (gh7Var.a(i4) <= i) {
                        iA = gh7Var.a(i4);
                        if (i4 == i5) {
                            break;
                        }
                        i4++;
                    }
                }
                if (iA == -1) {
                    return hh7.a;
                }
                z2a z2aVar = hh7.a;
                z2a z2aVar2 = new z2a(1);
                z2aVar2.c(iA);
                return z2aVar2;
            }

            @Override // defpackage.vte
            public final int b(ArrayList arrayList, int i, int i2, int i3, int i4) {
                Object obj;
                int i5;
                int size = arrayList.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size) {
                        obj = null;
                        break;
                    }
                    obj = arrayList.get(i6);
                    if (((br8) obj).getIndex() != i) {
                        break;
                    }
                    i6++;
                }
                br8 br8Var = (br8) obj;
                if (br8Var != null) {
                    long jK = br8Var.k(0);
                    i5 = (int) (br8Var.f() ? jK & 4294967295L : jK >> 32);
                } else {
                    i5 = Integer.MIN_VALUE;
                }
                int iMax = i3 == Integer.MIN_VALUE ? -i4 : Math.max(-i4, i3);
                return i5 != Integer.MIN_VALUE ? Math.min(iMax, i5 - i2) : iMax;
            }
        }
    }

    z2a a(int i, int i2, gh7 gh7Var);

    int b(ArrayList arrayList, int i, int i2, int i3, int i4);
}
