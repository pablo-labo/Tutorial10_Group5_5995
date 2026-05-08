package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class s69 {
    public HashMap c;
    public HashMap d;
    public float e;
    public HashMap f;
    public ArrayList g;
    public loe<mn5> h;
    public r59<hl8> i;
    public ArrayList j;
    public Rect k;
    public float l;
    public float m;
    public float n;
    public boolean o;
    public final b8b a = new b8b();
    public final HashSet<String> b = new HashSet<>();
    public int p = 0;

    public final void a(String str) {
        a49.b(str);
        this.b.add(str);
    }

    public final float b() {
        return (long) (((this.m - this.l) / this.n) * 1000.0f);
    }

    public final Map<String, n79> c() {
        float fC = ckg.c();
        if (fC != this.e) {
            for (Map.Entry entry : this.d.entrySet()) {
                HashMap map = this.d;
                String str = (String) entry.getKey();
                n79 n79Var = (n79) entry.getValue();
                float f = this.e / fC;
                int i = (int) (n79Var.a * f);
                int i2 = (int) (n79Var.b * f);
                n79 n79Var2 = new n79(n79Var.c, i, n79Var.d, i2, n79Var.e);
                Bitmap bitmap = n79Var.f;
                if (bitmap != null) {
                    n79Var2.f = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                }
                map.put(str, n79Var2);
            }
        }
        this.e = fC;
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            sb.append(((hl8) it.next()).a("\t"));
        }
        return sb.toString();
    }
}
