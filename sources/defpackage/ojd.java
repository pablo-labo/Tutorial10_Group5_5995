package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import androidx.compose.ui.e;
import java.io.File;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public class ojd {
    public static int A(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void B(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.p63 a(defpackage.jrg r2, androidx.compose.runtime.b r3) {
        /*
            r0 = -563811291(0xffffffffde64ec25, float:-4.12390005E18)
            r3.u(r0)
            boolean r0 = r2 instanceof androidx.navigation.d
            if (r0 == 0) goto L22
            r0 = r2
            androidx.navigation.d r0 = (androidx.navigation.d) r0
            android.os.Bundle r1 = r0.a()
            if (r1 == 0) goto L22
            android.os.Bundle r0 = r0.a()
            if (r0 == 0) goto L1f
            p63 r2 = defpackage.pnb.Q(r0, r2)
            if (r2 != 0) goto L32
        L1f:
            p63$a r2 = p63.a.b
            goto L32
        L22:
            boolean r0 = r2 instanceof defpackage.hg6
            if (r0 == 0) goto L30
            hg6 r2 = (defpackage.hg6) r2
            p63 r2 = r2.getDefaultViewModelCreationExtras()
            r2.getClass()
            goto L32
        L30:
            p63$a r2 = p63.a.b
        L32:
            r3.J()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ojd.a(jrg, androidx.compose.runtime.b):p63");
    }

    public static String b(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static final le0 c(jhf jhfVar) {
        le0 le0Var = jhfVar.a;
        long j = jhfVar.b;
        le0Var.getClass();
        return le0Var.subSequence(kjf.f(j), kjf.e(j));
    }

    public static final le0 d(jhf jhfVar, int i) {
        le0 le0Var = jhfVar.a;
        long j = jhfVar.b;
        return le0Var.subSequence(kjf.e(j), Math.min(kjf.e(j) + i, jhfVar.a.b.length()));
    }

    public static final le0 e(jhf jhfVar, int i) {
        le0 le0Var = jhfVar.a;
        long j = jhfVar.b;
        return le0Var.subSequence(Math.max(0, kjf.f(j) - i), kjf.f(j));
    }

    public static boolean f(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean g(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static String h(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            l5.q("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static e i(e eVar, float f, dce dceVar, boolean z, int i) {
        if ((i & 4) != 0) {
            z = Float.compare(f, 0.0f) > 0;
        }
        boolean z2 = z;
        long j = dd6.a;
        return (Float.compare(f, 0.0f) > 0 || z2) ? eVar.o(new ShadowGraphicsLayerElement(f, dceVar, z2, j, j)) : eVar;
    }

    public static final boolean j(List list, Map map) {
        boolean zBooleanValue;
        Iterator it = list.iterator();
        do {
            zBooleanValue = false;
            if (!it.hasNext()) {
                return false;
            }
            ((nd2) it.next()).getClass();
            Object obj = map.get("includeRequireResponse");
            Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        } while (zBooleanValue);
        return true;
    }

    public static final File k(Uri uri) {
        if (!wl7.b(uri.getScheme(), "file")) {
            h5.k(p6.d(uri, "Uri lacks 'file' scheme: "));
            return null;
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        h5.k(p6.d(uri, "Uri path is null: "));
        return null;
    }

    public static void l(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iA = A(parcel, i);
        parcel.writeBundle(bundle);
        B(parcel, iA);
    }

    public static void m(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                y(parcel, i, 0);
            }
        } else {
            int iA = A(parcel, i);
            parcel.writeByteArray(bArr);
            B(parcel, iA);
        }
    }

    public static void n(Parcel parcel, int i, Double d) {
        if (d == null) {
            return;
        }
        y(parcel, i, 8);
        parcel.writeDouble(d.doubleValue());
    }

    public static void o(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iA = A(parcel, i);
        parcel.writeStrongBinder(iBinder);
        B(parcel, iA);
    }

    public static void p(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iA = A(parcel, i);
        parcel.writeIntArray(iArr);
        B(parcel, iA);
    }

    public static void q(Parcel parcel, int i, Integer num) {
        if (num == null) {
            return;
        }
        y(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    public static void r(Parcel parcel, int i, Long l) {
        if (l == null) {
            return;
        }
        y(parcel, i, 8);
        parcel.writeLong(l.longValue());
    }

    public static void s(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                y(parcel, i, 0);
            }
        } else {
            int iA = A(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            B(parcel, iA);
        }
    }

    public static void t(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                y(parcel, i, 0);
            }
        } else {
            int iA = A(parcel, i);
            parcel.writeString(str);
            B(parcel, iA);
        }
    }

    public static void u(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iA = A(parcel, i);
        parcel.writeStringArray(strArr);
        B(parcel, iA);
    }

    public static void v(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iA = A(parcel, i);
        parcel.writeStringList(list);
        B(parcel, iA);
    }

    public static void w(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iA = A(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        B(parcel, iA);
    }

    public static void x(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                y(parcel, i, 0);
                return;
            }
            return;
        }
        int iA = A(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        B(parcel, iA);
    }

    public static void y(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static boolean z(Comparator comparator, Collection collection) {
        Comparator comparator2;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            comparator2 = ((SortedSet) collection).comparator();
            if (comparator2 == null) {
                comparator2 = umh.a;
            }
        } else {
            if (!(collection instanceof joh)) {
                return false;
            }
            comparator2 = ((joh) collection).comparator();
        }
        return comparator.equals(comparator2);
    }
}
