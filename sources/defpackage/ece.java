package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class ece {
    public ie7 a = new hgd();
    public ie7 b = new hgd();
    public ie7 c = new hgd();
    public ie7 d = new hgd();
    public s03 e = new k0(0.0f);
    public s03 f = new k0(0.0f);
    public s03 g = new k0(0.0f);
    public s03 h = new k0(0.0f);
    public nf4 i = new nf4();
    public nf4 j = new nf4();
    public nf4 k = new nf4();
    public nf4 l = new nf4();

    public static final class a {
        public ie7 a = new hgd();
        public ie7 b = new hgd();
        public ie7 c = new hgd();
        public ie7 d = new hgd();
        public s03 e = new k0(0.0f);
        public s03 f = new k0(0.0f);
        public s03 g = new k0(0.0f);
        public s03 h = new k0(0.0f);
        public nf4 i = new nf4();
        public nf4 j = new nf4();
        public nf4 k = new nf4();
        public nf4 l = new nf4();

        public final ece a() {
            ece eceVar = new ece();
            eceVar.a = this.a;
            eceVar.b = this.b;
            eceVar.c = this.c;
            eceVar.d = this.d;
            eceVar.e = this.e;
            eceVar.f = this.f;
            eceVar.g = this.g;
            eceVar.h = this.h;
            eceVar.i = this.i;
            eceVar.j = this.j;
            eceVar.k = this.k;
            eceVar.l = this.l;
            return eceVar;
        }
    }

    public static a a(Context context, int i, int i2, k0 k0Var) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, lac.D);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            s03 s03VarC = c(typedArrayObtainStyledAttributes, 5, k0Var);
            s03 s03VarC2 = c(typedArrayObtainStyledAttributes, 8, s03VarC);
            s03 s03VarC3 = c(typedArrayObtainStyledAttributes, 9, s03VarC);
            s03 s03VarC4 = c(typedArrayObtainStyledAttributes, 7, s03VarC);
            s03 s03VarC5 = c(typedArrayObtainStyledAttributes, 6, s03VarC);
            a aVar = new a();
            aVar.a = ka2.u(i4);
            aVar.e = s03VarC2;
            aVar.b = ka2.u(i5);
            aVar.f = s03VarC3;
            aVar.c = ka2.u(i6);
            aVar.g = s03VarC4;
            aVar.d = ka2.u(i7);
            aVar.h = s03VarC5;
            return aVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static a b(Context context, AttributeSet attributeSet, int i, int i2) {
        k0 k0Var = new k0(0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lac.v, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, k0Var);
    }

    public static s03 c(TypedArray typedArray, int i, s03 s03Var) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new k0(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new tyc(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return s03Var;
    }

    public final boolean d(RectF rectF) {
        boolean z = this.l.getClass().equals(nf4.class) && this.j.getClass().equals(nf4.class) && this.i.getClass().equals(nf4.class) && this.k.getClass().equals(nf4.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.b instanceof hgd) && (this.a instanceof hgd) && (this.c instanceof hgd) && (this.d instanceof hgd));
    }

    public final a e() {
        a aVar = new a();
        aVar.a = new hgd();
        aVar.b = new hgd();
        aVar.c = new hgd();
        aVar.d = new hgd();
        aVar.e = new k0(0.0f);
        aVar.f = new k0(0.0f);
        aVar.g = new k0(0.0f);
        aVar.h = new k0(0.0f);
        aVar.i = new nf4();
        aVar.j = new nf4();
        aVar.k = new nf4();
        new nf4();
        aVar.a = this.a;
        aVar.b = this.b;
        aVar.c = this.c;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = this.g;
        aVar.h = this.h;
        aVar.i = this.i;
        aVar.j = this.j;
        aVar.k = this.k;
        aVar.l = this.l;
        return aVar;
    }
}
