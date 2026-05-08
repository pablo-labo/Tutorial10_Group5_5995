package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class n83 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public final CharSequence a;
    public final Layout.Alignment b;
    public final Layout.Alignment c;
    public final Bitmap d;
    public final float e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final int m;
    public final int n;
    public final float o;
    public final int p;
    public final float q;
    public final int r;

    public static final class a {
        public CharSequence a = null;
        public Bitmap b = null;
        public Layout.Alignment c = null;
        public Layout.Alignment d = null;
        public float e = -3.4028235E38f;
        public int f = Integer.MIN_VALUE;
        public int g = Integer.MIN_VALUE;
        public float h = -3.4028235E38f;
        public int i = Integer.MIN_VALUE;
        public int j = Integer.MIN_VALUE;
        public float k = -3.4028235E38f;
        public float l = -3.4028235E38f;
        public float m = -3.4028235E38f;
        public boolean n = false;
        public int o = -16777216;
        public int p = Integer.MIN_VALUE;
        public float q;
        public int r;

        public final n83 a() {
            return new n83(this.a, this.c, this.d, this.b, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
        }

        public final void b(CharSequence charSequence) {
            this.a = charSequence;
            this.b = null;
        }
    }

    static {
        a aVar = new a();
        aVar.a = "";
        aVar.b = null;
        aVar.a();
        String str = vjg.a;
        s = Integer.toString(0, 36);
        t = Integer.toString(17, 36);
        u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        w = Integer.toString(3, 36);
        x = Integer.toString(18, 36);
        y = Integer.toString(4, 36);
        z = Integer.toString(5, 36);
        A = Integer.toString(6, 36);
        B = Integer.toString(7, 36);
        C = Integer.toString(8, 36);
        D = Integer.toString(9, 36);
        E = Integer.toString(10, 36);
        F = Integer.toString(11, 36);
        G = Integer.toString(12, 36);
        H = Integer.toString(13, 36);
        I = Integer.toString(14, 36);
        J = Integer.toString(15, 36);
        K = Integer.toString(16, 36);
        L = Integer.toString(19, 36);
    }

    public n83(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z2, int i5, int i6, float f6, int i7) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            ka2.l(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.a = charSequence.toString();
        } else {
            this.a = null;
        }
        this.b = alignment;
        this.c = alignment2;
        this.d = bitmap;
        this.e = f;
        this.f = i;
        this.g = i2;
        this.h = f2;
        this.i = i3;
        this.j = f4;
        this.k = f5;
        this.l = z2;
        this.m = i5;
        this.n = i4;
        this.o = f3;
        this.p = i6;
        this.q = f6;
        this.r = i7;
    }

    public static n83 b(Bundle bundle) {
        a aVar = new a();
        CharSequence charSequence = bundle.getCharSequence(s);
        if (charSequence != null) {
            aVar.b(charSequence);
            ArrayList<Bundle> parcelableArrayList = bundle.getParcelableArrayList(t);
            if (parcelableArrayList != null) {
                SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
                for (Bundle bundle2 : parcelableArrayList) {
                    int i = bundle2.getInt(rb3.a);
                    int i2 = bundle2.getInt(rb3.b);
                    int i3 = bundle2.getInt(rb3.c);
                    int i4 = bundle2.getInt(rb3.d, -1);
                    Bundle bundle3 = bundle2.getBundle(rb3.e);
                    if (i4 == 1) {
                        bundle3.getClass();
                        String string = bundle3.getString(jhd.c);
                        string.getClass();
                        spannableStringValueOf.setSpan(new jhd(string, bundle3.getInt(jhd.d)), i, i2, i3);
                    } else if (i4 == 2) {
                        bundle3.getClass();
                        spannableStringValueOf.setSpan(new xdf(bundle3.getInt(xdf.d), bundle3.getInt(xdf.e), bundle3.getInt(xdf.f)), i, i2, i3);
                    } else if (i4 == 3) {
                        spannableStringValueOf.setSpan(new ak6(), i, i2, i3);
                    } else if (i4 == 4) {
                        bundle3.getClass();
                        String string2 = bundle3.getString(htg.b);
                        string2.getClass();
                        spannableStringValueOf.setSpan(new htg(string2), i, i2, i3);
                    }
                }
                aVar.b(spannableStringValueOf);
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(u);
        if (alignment != null) {
            aVar.c = alignment;
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(v);
        if (alignment2 != null) {
            aVar.d = alignment2;
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(w);
        if (bitmap != null) {
            aVar.b = bitmap;
            aVar.a = null;
        } else {
            byte[] byteArray = bundle.getByteArray(x);
            if (byteArray != null) {
                aVar.b = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                aVar.a = null;
            }
        }
        String str = y;
        if (bundle.containsKey(str)) {
            String str2 = z;
            if (bundle.containsKey(str2)) {
                float f = bundle.getFloat(str);
                int i5 = bundle.getInt(str2);
                aVar.e = f;
                aVar.f = i5;
            }
        }
        String str3 = A;
        if (bundle.containsKey(str3)) {
            aVar.g = bundle.getInt(str3);
        }
        String str4 = B;
        if (bundle.containsKey(str4)) {
            aVar.h = bundle.getFloat(str4);
        }
        String str5 = C;
        if (bundle.containsKey(str5)) {
            aVar.i = bundle.getInt(str5);
        }
        String str6 = E;
        if (bundle.containsKey(str6)) {
            String str7 = D;
            if (bundle.containsKey(str7)) {
                float f2 = bundle.getFloat(str6);
                int i6 = bundle.getInt(str7);
                aVar.k = f2;
                aVar.j = i6;
            }
        }
        String str8 = F;
        if (bundle.containsKey(str8)) {
            aVar.l = bundle.getFloat(str8);
        }
        String str9 = G;
        if (bundle.containsKey(str9)) {
            aVar.m = bundle.getFloat(str9);
        }
        String str10 = H;
        if (bundle.containsKey(str10)) {
            aVar.o = bundle.getInt(str10);
            aVar.n = true;
        }
        if (!bundle.getBoolean(I, false)) {
            aVar.n = false;
        }
        String str11 = J;
        if (bundle.containsKey(str11)) {
            aVar.p = bundle.getInt(str11);
        }
        String str12 = K;
        if (bundle.containsKey(str12)) {
            aVar.q = bundle.getFloat(str12);
        }
        String str13 = L;
        if (bundle.containsKey(str13)) {
            aVar.r = bundle.getInt(str13);
        }
        return aVar.a();
    }

    public final a a() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = this.d;
        aVar.c = this.b;
        aVar.d = this.c;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = this.g;
        aVar.h = this.h;
        aVar.i = this.i;
        aVar.j = this.n;
        aVar.k = this.o;
        aVar.l = this.j;
        aVar.m = this.k;
        aVar.n = this.l;
        aVar.o = this.m;
        aVar.p = this.p;
        aVar.q = this.q;
        aVar.r = this.r;
        return aVar;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            bundle.putCharSequence(s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = rb3.a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (jhd jhdVar : (jhd[]) spanned.getSpans(0, spanned.length(), jhd.class)) {
                    jhdVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(jhd.c, jhdVar.a);
                    bundle2.putInt(jhd.d, jhdVar.b);
                    arrayList.add(rb3.a(spanned, jhdVar, 1, bundle2));
                }
                for (xdf xdfVar : (xdf[]) spanned.getSpans(0, spanned.length(), xdf.class)) {
                    xdfVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(xdf.d, xdfVar.a);
                    bundle3.putInt(xdf.e, xdfVar.b);
                    bundle3.putInt(xdf.f, xdfVar.c);
                    arrayList.add(rb3.a(spanned, xdfVar, 2, bundle3));
                }
                for (ak6 ak6Var : (ak6[]) spanned.getSpans(0, spanned.length(), ak6.class)) {
                    arrayList.add(rb3.a(spanned, ak6Var, 3, null));
                }
                for (htg htgVar : (htg[]) spanned.getSpans(0, spanned.length(), htg.class)) {
                    htgVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(htg.b, htgVar.a);
                    arrayList.add(rb3.a(spanned, htgVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(t, arrayList);
                }
            }
        }
        bundle.putSerializable(u, this.b);
        bundle.putSerializable(v, this.c);
        bundle.putFloat(y, this.e);
        bundle.putInt(z, this.f);
        bundle.putInt(A, this.g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.i);
        bundle.putInt(D, this.n);
        bundle.putFloat(E, this.o);
        bundle.putFloat(F, this.j);
        bundle.putFloat(G, this.k);
        bundle.putBoolean(I, this.l);
        bundle.putInt(H, this.m);
        bundle.putInt(J, this.p);
        bundle.putFloat(K, this.q);
        bundle.putInt(L, this.r);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n83.class != obj.getClass()) {
            return false;
        }
        n83 n83Var = (n83) obj;
        if (!TextUtils.equals(this.a, n83Var.a) || this.b != n83Var.b || this.c != n83Var.c) {
            return false;
        }
        Bitmap bitmap = n83Var.d;
        Bitmap bitmap2 = this.d;
        if (bitmap2 == null) {
            if (bitmap != null) {
                return false;
            }
        } else if (bitmap == null || !bitmap2.sameAs(bitmap)) {
            return false;
        }
        return this.e == n83Var.e && this.f == n83Var.f && this.g == n83Var.g && this.h == n83Var.h && this.i == n83Var.i && this.j == n83Var.j && this.k == n83Var.k && this.l == n83Var.l && this.m == n83Var.m && this.n == n83Var.n && this.o == n83Var.o && this.p == n83Var.p && this.q == n83Var.q && this.r == n83Var.r;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Float.valueOf(this.h), Integer.valueOf(this.i), Float.valueOf(this.j), Float.valueOf(this.k), Boolean.valueOf(this.l), Integer.valueOf(this.m), Integer.valueOf(this.n), Float.valueOf(this.o), Integer.valueOf(this.p), Float.valueOf(this.q), Integer.valueOf(this.r));
    }
}
