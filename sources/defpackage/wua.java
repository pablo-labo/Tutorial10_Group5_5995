package defpackage;

import androidx.compose.runtime.n;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class wua extends ka6 {
    public int e;
    public int g;
    public int i;
    public nua[] d = new nua[16];
    public int[] f = new int[16];
    public Object[] h = new Object[16];

    public final class a {
        public int a;
        public int b;
        public int c;

        public a() {
        }

        public final int a(int i) {
            return wua.this.f[this.b + i];
        }

        public final <T> T b(int i) {
            return (T) wua.this.h[this.c + i];
        }
    }

    @fd8
    public static final class b {
        public static final <T> void a(wua wuaVar, int i, T t) {
            wuaVar.h[(wuaVar.i - wuaVar.d[wuaVar.e - 1].b) + i] = t;
        }

        public static final <T, U> void b(wua wuaVar, int i, T t, int i2, U u) {
            int i3 = wuaVar.i - wuaVar.d[wuaVar.e - 1].b;
            Object[] objArr = wuaVar.h;
            objArr[i + i3] = t;
            objArr[i3 + i2] = u;
        }

        public static final void c(wua wuaVar, Object obj, Object obj2, Object obj3) {
            int i = wuaVar.i - wuaVar.d[wuaVar.e - 1].b;
            Object[] objArr = wuaVar.h;
            objArr[i] = obj;
            objArr[i + 1] = obj2;
            objArr[i + 2] = obj3;
        }
    }

    public final void J1() {
        this.e = 0;
        this.g = 0;
        Arrays.fill(this.h, 0, this.i, (Object) null);
        this.i = 0;
    }

    public final void K1(nr0<?> nr0Var, n nVar, b0d b0dVar, tua tuaVar) {
        if (M1()) {
            a aVar = new a();
            while (true) {
                wua wuaVar = wua.this;
                nua nuaVar = wuaVar.d[aVar.a];
                x20 x20VarB = nuaVar.b(aVar);
                nr0<?> nr0Var2 = nr0Var;
                n nVar2 = nVar;
                b0d b0dVar2 = b0dVar;
                tua tuaVar2 = tuaVar;
                try {
                    nuaVar.a(aVar, nr0Var2, nVar2, b0dVar2, tuaVar2);
                    int i = aVar.a;
                    int i2 = wuaVar.e;
                    if (i < i2) {
                        nua nuaVar2 = wuaVar.d[i];
                        aVar.b += nuaVar2.a;
                        aVar.c += nuaVar2.b;
                        int i3 = i + 1;
                        aVar.a = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        nr0Var = nr0Var2;
                        nVar = nVar2;
                        b0dVar = b0dVar2;
                        tuaVar = tuaVar2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        J1();
    }

    public final boolean L1() {
        return this.e == 0;
    }

    public final boolean M1() {
        return this.e != 0;
    }

    public final void N1(nua nuaVar) {
        int i = this.e;
        nua[] nuaVarArr = this.d;
        int length = nuaVarArr.length;
        int i2 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        if (i == length) {
            nua[] nuaVarArr2 = new nua[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(nuaVarArr, 0, nuaVarArr2, 0, i);
            this.d = nuaVarArr2;
        }
        int i3 = this.g;
        int i4 = nuaVar.a;
        int i5 = nuaVar.b;
        int i6 = i3 + i4;
        int[] iArr = this.f;
        int length2 = iArr.length;
        if (i6 > length2) {
            int i7 = (length2 > 1024 ? 1024 : length2) + length2;
            if (i7 >= i6) {
                i6 = i7;
            }
            int[] iArr2 = new int[i6];
            pyd.h(0, 0, length2, iArr, iArr2);
            this.f = iArr2;
        }
        int i8 = this.i + i5;
        Object[] objArr = this.h;
        int length3 = objArr.length;
        if (i8 > length3) {
            if (length3 <= 1024) {
                i2 = length3;
            }
            int i9 = i2 + length3;
            if (i9 >= i8) {
                i8 = i9;
            }
            Object[] objArr2 = new Object[i8];
            System.arraycopy(objArr, 0, objArr2, 0, length3);
            this.h = objArr2;
        }
        nua[] nuaVarArr3 = this.d;
        int i10 = this.e;
        this.e = i10 + 1;
        nuaVarArr3[i10] = nuaVar;
        this.g += nuaVar.a;
        this.i += i5;
    }
}
