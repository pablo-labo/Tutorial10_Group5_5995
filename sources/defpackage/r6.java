package defpackage;

import android.os.Bundle;
import androidx.media3.common.StreamKey;
import defpackage.dye;
import defpackage.e75;
import defpackage.lz8;
import defpackage.v20;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r6 implements lz8.a, e75.b, ru5, p55 {
    public final /* synthetic */ int a = 7;

    public /* synthetic */ r6() {
    }

    public static String c(long j, String str) {
        return str + j;
    }

    public static String d(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String f(Locale locale, String str, Locale locale2) {
        locale.getClass();
        String lowerCase = str.toLowerCase(locale2);
        lowerCase.getClass();
        return lowerCase;
    }

    public static /* synthetic */ void g(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void i(String str, Object[] objArr) {
        throw new ArrayIndexOutOfBoundsException(String.format(str, objArr));
    }

    public static void k(HashSet hashSet, String str, String str2, String str3, String str4) {
        hashSet.add(str);
        hashSet.add(str2);
        hashSet.add(str3);
        hashSet.add(str4);
    }

    @Override // defpackage.ru5
    public Object apply(Object obj) {
        StreamKey streamKey = (StreamKey) obj;
        streamKey.getClass();
        Bundle bundle = new Bundle();
        int i = streamKey.a;
        if (i != 0) {
            bundle.putInt(StreamKey.d, i);
        }
        int i2 = streamKey.b;
        if (i2 != 0) {
            bundle.putInt(StreamKey.e, i2);
        }
        int i3 = streamKey.c;
        if (i3 != 0) {
            bundle.putInt(StreamKey.f, i3);
        }
        return bundle;
    }

    @Override // defpackage.p55
    public m55[] h() {
        return new m55[]{new x0a(dye.a.a, 16)};
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        v20 v20Var = (v20) obj;
        switch (this.a) {
            case 3:
                v20Var.getClass();
                break;
            default:
                v20Var.getClass();
                break;
        }
    }

    @Override // defpackage.wg3
    public Object j(Object obj, ka6 ka6Var) {
        ByteBuffer byteBufferP0 = ka6Var.P0(null);
        if (!(obj instanceof rjg)) {
            return new rjg(byteBufferP0.array());
        }
        rjg rjgVar = (rjg) obj;
        rjgVar.f(new rjg(byteBufferP0.array()));
        return rjgVar;
    }

    public /* synthetic */ r6(v20.a aVar, ak3 ak3Var) {
    }

    public /* synthetic */ r6(v20.a aVar, String str, long j, long j2) {
    }

    public /* synthetic */ r6(e75 e75Var) {
    }
}
