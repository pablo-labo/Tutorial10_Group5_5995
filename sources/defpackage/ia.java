package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.mediacodec.f;
import com.google.android.recaptcha.internal.zzagq;
import defpackage.e47;
import defpackage.e75;
import defpackage.fr6;
import defpackage.lz8;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ia implements lz8.a, ru5, e75.b, fr6.a, f, wq2, p55 {
    public final /* synthetic */ int a;

    public static int d(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static int f(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static int g(List list, int i, int i2) {
        return (list.hashCode() + i) * i2;
    }

    public static Object k(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String l(mb8 mb8Var, lb3 lb3Var) {
        mb8Var.getClass();
        lb3Var.getClass();
        String strI0 = mb8Var.I0();
        strI0.getClass();
        return strI0;
    }

    public static String m(iwc iwcVar, Class cls, StringBuilder sb) {
        sb.append(iwcVar.b(cls));
        return sb.toString();
    }

    public static List n(String str, sna snaVar, zr4 zr4Var, List list, List list2) {
        return u63.Z(new pd2(str, snaVar, zr4Var, list, list2));
    }

    public static void o(Long l, ab8 ab8Var, String str) {
        ab8Var.j(Long.valueOf(l.longValue()), str);
    }

    public static /* synthetic */ void p(String str) throws zzagq {
        throw new zzagq(str);
    }

    public static /* synthetic */ void q(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static void r(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    @Override // defpackage.wq2
    public void accept(Object obj) {
        ((vdb) obj).G0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ru5
    public Object apply(Object obj) {
        xpf xpfVar = (xpf) obj;
        xpfVar.getClass();
        Bundle bundle = new Bundle();
        String str = xpf.e;
        qyc qycVar = xpfVar.b;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(qycVar.d);
        e47.b bVarL = qycVar.listIterator(0);
        while (bVarL.hasNext()) {
            arrayList.add(((wpf) bVarL.next()).d());
        }
        bundle.putParcelableArrayList(str, arrayList);
        return bundle;
    }

    @Override // fr6.a
    public boolean b(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.f
    public List c(String str, boolean z, boolean z2) {
        return MediaCodecUtil.d(str, z, z2);
    }

    @Override // defpackage.p55
    public m55[] h() {
        return new m55[]{new m6c()};
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        v20 v20Var = (v20) obj;
        switch (this.a) {
            case 4:
                v20Var.getClass();
                break;
            case 5:
                v20Var.getClass();
                break;
            default:
                v20Var.getClass();
                break;
        }
    }

    @Override // defpackage.wg3
    public Object j(Object obj, ka6 ka6Var) {
        return ka6Var.Z0(obj instanceof rjg ? (rjg) obj : null);
    }

    public /* synthetic */ ia(int i) {
        this.a = i;
    }
}
