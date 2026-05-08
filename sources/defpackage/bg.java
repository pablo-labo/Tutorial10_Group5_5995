package defpackage;

import android.media.MediaCodecInfo;
import androidx.media3.session.o;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.x;
import com.google.gson.JsonIOException;
import defpackage.e75;
import defpackage.hva;
import defpackage.lz8;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bg implements lz8.a, e75.b, x.e {
    public final /* synthetic */ int a;

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint b(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static String c(char c, int i, String str) {
        return str + i + c;
    }

    public static String d(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String e(Exception exc, String str) {
        return str + exc;
    }

    public static List f(md2 md2Var, hva.c cVar) {
        return u63.Z(new ld2(md2Var, cVar));
    }

    public static /* synthetic */ void h() {
        throw new IllegalStateException();
    }

    public static /* synthetic */ void i(Object obj, int i, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void k(Object obj, String str) {
        throw new JsonIOException(str + ((Object) obj.toString()));
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void n(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    @Override // androidx.media3.session.x.e
    public Object g(s sVar, r.d dVar, int i) {
        ((o) sVar).v(dVar);
        throw null;
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
        return ka6Var.a1();
    }
}
