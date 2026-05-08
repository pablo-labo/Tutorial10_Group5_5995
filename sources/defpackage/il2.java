package defpackage;

import androidx.compose.runtime.c;
import androidx.compose.runtime.d;
import androidx.compose.runtime.l;
import defpackage.nua;
import defpackage.wua;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class il2 {
    public final c a;
    public q12 b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final vh7 d = new vh7();
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public il2(c cVar, q12 q12Var) {
        this.a = cVar;
        this.b = q12Var;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            wua wuaVar = this.b.d;
            wuaVar.N1(nua.i0.c);
            wuaVar.f[wuaVar.g - wuaVar.d[wuaVar.e - 1].a] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        q12 q12Var = this.b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        q12Var.getClass();
        if (size != 0) {
            wua wuaVar2 = q12Var.d;
            wuaVar2.N1(nua.h.c);
            wua.b.a(wuaVar2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                wua wuaVar = this.b.d;
                wuaVar.N1(nua.y.c);
                int i3 = wuaVar.g - wuaVar.d[wuaVar.e - 1].a;
                int[] iArr = wuaVar.f;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                wua wuaVar2 = this.b.d;
                wuaVar2.N1(nua.s.c);
                int i6 = wuaVar2.g - wuaVar2.d[wuaVar2.e - 1].a;
                int[] iArr2 = wuaVar2.f;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        l lVar = this.a.G;
        int i = z ? lVar.i : lVar.g;
        int i2 = i - this.f;
        if (i2 < 0) {
            d.c("Tried to seek backward");
        }
        if (i2 > 0) {
            wua wuaVar = this.b.d;
            wuaVar.N1(nua.a.c);
            wuaVar.f[wuaVar.g - wuaVar.d[wuaVar.e - 1].a] = i2;
            this.f = i;
        }
    }

    public final void e() {
        l lVar = this.a.G;
        if (lVar.c > 0) {
            int i = lVar.i;
            vh7 vh7Var = this.d;
            if (vh7Var.a(-2) != i) {
                if (!this.c && this.e) {
                    d(false);
                    this.b.d.N1(nua.n.c);
                    this.c = true;
                }
                if (i > 0) {
                    x20 x20VarA = lVar.a(i);
                    vh7Var.c(i);
                    d(false);
                    wua wuaVar = this.b.d;
                    wuaVar.N1(nua.m.c);
                    wua.b.a(wuaVar, 0, x20VarA);
                    this.c = true;
                }
            }
        }
    }

    public final void f(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                d.c("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}
