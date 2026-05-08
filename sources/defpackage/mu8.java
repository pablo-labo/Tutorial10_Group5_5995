package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.emoji2.text.d;
import defpackage.b80;
import defpackage.eo4;
import defpackage.iu8;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class mu8 implements ncb {
    public final View a;
    public final ye7 b;
    public lu8 e;
    public rgf f;
    public opg g;
    public Rect l;
    public final fu8 m;
    public Function1<? super List<? extends qh4>, j6g> c = new nf(17);
    public Function1<? super s37, j6g> d = new dc(14);
    public jhf h = new jhf("", kjf.b, 4);
    public t37 i = t37.g;
    public final ArrayList j = new ArrayList();
    public final Lazy k = boa.E(qt8.c, new le(this, 8));

    public static final class a {
        public a() {
        }
    }

    public mu8(View view, b80.a.b bVar, ye7 ye7Var) {
        this.a = view;
        this.b = ye7Var;
        this.m = new fu8(bVar, ye7Var);
    }

    @Override // defpackage.ncb
    public final ktc a(EditorInfo editorInfo) {
        int i;
        int i2;
        jhf jhfVar = this.h;
        String str = jhfVar.a.b;
        long j = jhfVar.b;
        t37 t37Var = this.i;
        int i3 = t37Var.e;
        int i4 = t37Var.d;
        boolean z = t37Var.a;
        if (i3 == 1) {
            i = z ? 6 : 0;
        } else if (i3 == 0) {
            i = 1;
        } else if (i3 == 2) {
            i = 2;
        } else if (i3 == 6) {
            i = 5;
        } else if (i3 == 5) {
            i = 7;
        } else if (i3 == 3) {
            i = 3;
        } else if (i3 == 4) {
            i = 4;
        } else {
            if (i3 != 7) {
                r6.g("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        b19 b19Var = t37Var.f;
        if (wl7.b(b19Var, b19.c)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(t92.r0(b19Var, 10));
            Iterator<a19> it = b19Var.a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        if (i4 == 1) {
            i2 = 1;
        } else if (i4 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i2 = 1;
        } else if (i4 == 3) {
            i2 = 2;
        } else if (i4 == 4) {
            i2 = 3;
        } else if (i4 == 5) {
            i2 = 17;
        } else if (i4 == 6) {
            i2 = 33;
        } else if (i4 == 7) {
            i2 = 129;
        } else if (i4 == 8) {
            i2 = 18;
        } else {
            if (i4 != 9) {
                r6.g("Invalid Keyboard Type");
                return null;
            }
            i2 = 8194;
        }
        editorInfo.inputType = i2;
        if (!z && (i2 & 1) == 1) {
            editorInfo.inputType = 131072 | i2;
            if (t37Var.e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i5 = editorInfo.inputType;
        if ((i5 & 1) == 1) {
            int i6 = t37Var.b;
            if (i6 == 1) {
                editorInfo.inputType = i5 | 4096;
            } else if (i6 == 2) {
                editorInfo.inputType = i5 | 8192;
            } else if (i6 == 3) {
                editorInfo.inputType = i5 | 16384;
            }
            if (t37Var.c) {
                editorInfo.inputType |= 32768;
            }
        }
        int i7 = kjf.c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        eo4.a(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!owe.a || i4 == 7 || i4 == 8) {
            if (vo1.a()) {
                eo4.b.a(editorInfo, false);
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
        } else {
            if (vo1.a()) {
                eo4.b.a(editorInfo, true);
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
            do4.c(editorInfo);
        }
        iu8.a aVar = iu8.a;
        if (d.d()) {
            d.a().i(editorInfo);
        }
        ktc ktcVar = new ktc(this.h, new a(), this.i.c, this.e, this.f, this.g);
        this.j.add(new WeakReference(ktcVar));
        return ktcVar;
    }
}
