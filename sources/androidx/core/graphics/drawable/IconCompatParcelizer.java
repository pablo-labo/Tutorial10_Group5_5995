package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import defpackage.eng;
import defpackage.l5;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(eng engVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = engVar.j(iconCompat.a, 1);
        byte[] bArrF = iconCompat.c;
        if (engVar.h(2)) {
            bArrF = engVar.f();
        }
        iconCompat.c = bArrF;
        Parcelable parcelableK = iconCompat.d;
        if (engVar.h(3)) {
            parcelableK = engVar.k();
        }
        iconCompat.d = parcelableK;
        iconCompat.e = engVar.j(iconCompat.e, 4);
        iconCompat.f = engVar.j(iconCompat.f, 5);
        Parcelable parcelableK2 = iconCompat.g;
        if (engVar.h(6)) {
            parcelableK2 = engVar.k();
        }
        iconCompat.g = (ColorStateList) parcelableK2;
        String strL = iconCompat.i;
        if (engVar.h(7)) {
            strL = engVar.l();
        }
        iconCompat.i = strL;
        String strL2 = iconCompat.j;
        if (engVar.h(8)) {
            strL2 = engVar.l();
        }
        iconCompat.j = strL2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    return iconCompat;
                }
                l5.q("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr = iconCompat.c;
                iconCompat.b = bArr;
                iconCompat.a = 3;
                iconCompat.e = 0;
                iconCompat.f = bArr.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = str;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, eng engVar) {
        engVar.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            engVar.s(i, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            engVar.n(2);
            engVar.p(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            engVar.n(3);
            engVar.t(parcelable);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            engVar.s(i2, 4);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            engVar.s(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            engVar.n(6);
            engVar.t(colorStateList);
        }
        String str = iconCompat.i;
        if (str != null) {
            engVar.n(7);
            engVar.u(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            engVar.n(8);
            engVar.u(str2);
        }
    }
}
