package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.react.bridge.ReadableMapKeySetIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ym3 implements nb4, ReadableMapKeySetIterator {
    public final Object a;
    public final Object b;
    public Object c;

    public ym3(ReadableMapKeySetIterator readableMapKeySetIterator, k91 k91Var) {
        readableMapKeySetIterator.getClass();
        this.a = readableMapKeySetIterator;
        this.b = k91Var;
        b();
    }

    @Override // defpackage.nb4
    public Drawable a(l82 l82Var) {
        nb4 nb4Var = (nb4) this.c;
        nb4 nb4Var2 = (nb4) this.b;
        try {
            it5.a();
            if (l82Var instanceof p82) {
                p82 p82Var = (p82) l82Var;
                BitmapDrawable bitmapDrawable = new BitmapDrawable((Resources) this.a, p82Var.t1());
                if ((p82Var.X0() == 0 || p82Var.X0() == -1) && (p82Var.D0() == 1 || p82Var.D0() == 0)) {
                    return bitmapDrawable;
                }
                return new gwa(bitmapDrawable, p82Var.X0(), p82Var.D0());
            }
            if (nb4Var2 != null && nb4Var2.c(l82Var)) {
                return nb4Var2.a(l82Var);
            }
            if (nb4Var != null && nb4Var.c(l82Var)) {
                return nb4Var.a(l82Var);
            }
            it5.a();
            return null;
        } finally {
            it5.a();
        }
    }

    public void b() {
        ReadableMapKeySetIterator readableMapKeySetIterator = (ReadableMapKeySetIterator) this.a;
        while (readableMapKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIterator.nextKey();
            this.c = strNextKey;
            zb5 zb5Var = (zb5) ((k91) this.b).a;
            strNextKey.getClass();
            if (!zb5Var.b.contains(strNextKey)) {
                return;
            }
        }
        this.c = null;
    }

    @Override // defpackage.nb4
    public boolean c(l82 l82Var) {
        return true;
    }

    @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
    public boolean hasNextKey() {
        return ((String) this.c) != null;
    }

    @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
    public String nextKey() {
        String str = (String) this.c;
        str.getClass();
        b();
        return str;
    }

    public ym3(Resources resources, nb4 nb4Var, nb4 nb4Var2) {
        this.a = resources;
        this.b = nb4Var;
        this.c = nb4Var2;
    }
}
