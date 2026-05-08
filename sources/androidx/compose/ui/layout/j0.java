package androidx.compose.ui.layout;

import defpackage.qe7;
import defpackage.utc;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public interface j0 {
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final k0 b;
        public static final k0 c;
        public static final k0 d;
        public static final k0 e;
        public static final k0 f;
        public static final k0 g;
        public static final k0 h;
        public static final k0 i;
        public static final k0 j;

        static {
            k0 k0Var = new k0("caption bar");
            b = k0Var;
            k0 k0Var2 = new k0("display cutout");
            c = k0Var2;
            k0 k0Var3 = new k0("ime");
            d = k0Var3;
            k0 k0Var4 = new k0("mandatory system gestures");
            e = k0Var4;
            k0 k0Var5 = new k0("navigation bars");
            f = k0Var5;
            k0 k0Var6 = new k0("status bars");
            g = k0Var6;
            char c2 = 2;
            j0[] j0VarArr = {k0Var6, k0Var5, k0Var};
            ArrayList arrayList = new ArrayList(3);
            for (int i2 = 0; i2 < 3; i2++) {
                arrayList.add(j0VarArr[i2].c());
            }
            utc[] utcVarArr = (utc[]) arrayList.toArray(new utc[0]);
            new qe7((utc[]) Arrays.copyOf(utcVarArr, utcVarArr.length));
            ArrayList arrayList2 = new ArrayList(3);
            for (int i3 = 0; i3 < 3; i3++) {
                arrayList2.add(j0VarArr[i3].a());
            }
            utc[] utcVarArr2 = (utc[]) arrayList2.toArray(new utc[0]);
            new qe7((utc[]) Arrays.copyOf(utcVarArr2, utcVarArr2.length));
            k0 k0Var7 = new k0("system gestures");
            h = k0Var7;
            k0 k0Var8 = new k0("tappable element");
            i = k0Var8;
            k0 k0Var9 = new k0("waterfall");
            j = k0Var9;
            j0[] j0VarArr2 = {k0Var6, k0Var5, k0Var, k0Var2, k0Var3, k0Var8};
            ArrayList arrayList3 = new ArrayList(6);
            int i4 = 0;
            while (i4 < 6) {
                arrayList3.add(j0VarArr2[i4].c());
                i4++;
                c2 = c2;
            }
            char c3 = c2;
            utc[] utcVarArr3 = (utc[]) arrayList3.toArray(new utc[0]);
            new qe7((utc[]) Arrays.copyOf(utcVarArr3, utcVarArr3.length));
            ArrayList arrayList4 = new ArrayList(6);
            for (int i5 = 0; i5 < 6; i5++) {
                arrayList4.add(j0VarArr2[i5].a());
            }
            utc[] utcVarArr4 = (utc[]) arrayList4.toArray(new utc[0]);
            new qe7((utc[]) Arrays.copyOf(utcVarArr4, utcVarArr4.length));
            j0[] j0VarArr3 = new j0[4];
            j0VarArr3[0] = k0Var4;
            j0VarArr3[1] = k0Var7;
            j0VarArr3[c3] = k0Var8;
            j0VarArr3[3] = k0Var9;
            ArrayList arrayList5 = new ArrayList(4);
            for (int i6 = 0; i6 < 4; i6++) {
                arrayList5.add(j0VarArr3[i6].c());
            }
            utc[] utcVarArr5 = (utc[]) arrayList5.toArray(new utc[0]);
            new qe7((utc[]) Arrays.copyOf(utcVarArr5, utcVarArr5.length));
            ArrayList arrayList6 = new ArrayList(4);
            for (int i7 = 0; i7 < 4; i7++) {
                arrayList6.add(j0VarArr3[i7].a());
            }
            utc[] utcVarArr6 = (utc[]) arrayList6.toArray(new utc[0]);
            new qe7((utc[]) Arrays.copyOf(utcVarArr6, utcVarArr6.length));
            j0[] j0VarArr4 = new j0[9];
            j0VarArr4[0] = k0Var6;
            j0VarArr4[1] = k0Var5;
            j0VarArr4[c3] = k0Var;
            j0VarArr4[3] = k0Var3;
            j0VarArr4[4] = k0Var7;
            j0VarArr4[5] = k0Var4;
            j0VarArr4[6] = k0Var8;
            j0VarArr4[7] = k0Var2;
            j0VarArr4[8] = k0Var9;
            ArrayList arrayList7 = new ArrayList(9);
            for (int i8 = 0; i8 < 9; i8++) {
                arrayList7.add(j0VarArr4[i8].c());
            }
            utc[] utcVarArr7 = (utc[]) arrayList7.toArray(new utc[0]);
            new qe7((utc[]) Arrays.copyOf(utcVarArr7, utcVarArr7.length));
            ArrayList arrayList8 = new ArrayList(9);
            for (int i9 = 0; i9 < 9; i9++) {
                arrayList8.add(j0VarArr4[i9].a());
            }
            utc[] utcVarArr8 = (utc[]) arrayList8.toArray(new utc[0]);
            new qe7((utc[]) Arrays.copyOf(utcVarArr8, utcVarArr8.length));
        }
    }

    utc a();

    utc c();
}
