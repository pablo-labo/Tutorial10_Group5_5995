package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.dzf;
import defpackage.hh2;
import defpackage.ps9;
import defpackage.qs9;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final qs9 a;
    public final char[] b;
    public final a c = new a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
    public final Typeface d;

    public h(Typeface typeface, qs9 qs9Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.d = typeface;
        this.a = qs9Var;
        int iA = qs9Var.a(6);
        if (iA != 0) {
            int i5 = iA + qs9Var.a;
            i = qs9Var.b.getInt(qs9Var.b.getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.b = new char[i * 2];
        int iA2 = qs9Var.a(6);
        if (iA2 != 0) {
            int i6 = iA2 + qs9Var.a;
            i2 = qs9Var.b.getInt(qs9Var.b.getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            dzf dzfVar = new dzf(this, i7);
            ps9 ps9VarB = dzfVar.b();
            int iA3 = ps9VarB.a(4);
            Character.toChars(iA3 != 0 ? ps9VarB.b.getInt(iA3 + ps9VarB.a) : 0, this.b, i7 * 2);
            ps9 ps9VarB2 = dzfVar.b();
            int iA4 = ps9VarB2.a(16);
            if (iA4 != 0) {
                int i8 = iA4 + ps9VarB2.a;
                i3 = ps9VarB2.b.getInt(ps9VarB2.b.getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            hh2.j("invalid metadata codepoint length", i3 > 0);
            a aVar = this.c;
            ps9 ps9VarB3 = dzfVar.b();
            int iA5 = ps9VarB3.a(16);
            if (iA5 != 0) {
                int i9 = iA5 + ps9VarB3.a;
                i4 = ps9VarB3.b.getInt(ps9VarB3.b.getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            aVar.a(dzfVar, 0, i4 - 1);
        }
    }

    public static class a {
        public final SparseArray<a> a;
        public dzf b;

        public a(int i) {
            this.a = new SparseArray<>(i);
        }

        public final void a(dzf dzfVar, int i, int i2) {
            int iA = dzfVar.a(i);
            SparseArray<a> sparseArray = this.a;
            a aVar = sparseArray == null ? null : sparseArray.get(iA);
            if (aVar == null) {
                aVar = new a();
                sparseArray.put(dzfVar.a(i), aVar);
            }
            if (i2 > i) {
                aVar.a(dzfVar, i + 1, i2);
            } else {
                aVar.b = dzfVar;
            }
        }

        public a() {
            this(1);
        }
    }
}
