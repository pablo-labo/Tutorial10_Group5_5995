package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.mediacodec.d;
import com.apollographql.apollo.exception.JsonDataException;
import com.google.android.gms.internal.measurement.zzev;
import com.google.gson.JsonSyntaxException;
import defpackage.e75;
import defpackage.gl2;
import defpackage.lz8;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ja implements lz8.a, e75.b, MediaCodecUtil.c, wq2 {
    public final /* synthetic */ int a;

    public static int b(int i, int i2, int i3) {
        return zzev.d2(i) + i2 + i3;
    }

    public static c c(gu5 gu5Var, gu5 gu5Var2, b bVar, int i) {
        gu5Var.getClass();
        gu5Var2.getClass();
        return bVar.h(i);
    }

    public static IllegalStateException e(mb8 mb8Var, lb3 lb3Var, String str) {
        mb8Var.getClass();
        lb3Var.getClass();
        return new IllegalStateException(str);
    }

    public static String f(char c, String str, String str2) {
        return str + str2 + c;
    }

    public static String g(int i, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static void h(int i, c cVar, int i2, gl2.a.C0251a c0251a) {
        cVar.p(Integer.valueOf(i));
        cVar.b(Integer.valueOf(i2), c0251a);
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void k(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2) {
        throw new JsonDataException(str + obj + ((Object) " at path ") + obj2, null);
    }

    public static /* synthetic */ void m(String str, Throwable th) {
        throw new IllegalStateException(str, th);
    }

    public static /* synthetic */ void n(StringBuilder sb, Object obj, Throwable th) {
        sb.append(obj);
        throw new JsonSyntaxException(sb.toString(), th);
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2) throws IOException {
        throw new IOException(str + obj + ((Object) " to ") + obj2);
    }

    public static /* synthetic */ void p(String str, Object obj, Object obj2) {
        throw new AssertionError(str + obj + obj2);
    }

    public static /* synthetic */ void q(String str, Object obj, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    @Override // defpackage.wq2
    public void accept(Object obj) {
        ((vdb) obj).Q();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.c
    public int d(Object obj) {
        String str = ((d) obj).a;
        return (str.startsWith("OMX.google") || str.startsWith("c2.android")) ? 1 : 0;
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        v20 v20Var = (v20) obj;
        switch (this.a) {
            case 6:
                v20Var.getClass();
                break;
            case 7:
                v20Var.getClass();
                break;
            default:
                v20Var.getClass();
                break;
        }
    }

    @Override // defpackage.wg3
    public Object j(Object obj, ka6 ka6Var) {
        ka6Var.Y0();
        return null;
    }

    public /* synthetic */ ja(int i) {
        this.a = i;
    }
}
