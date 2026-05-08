package defpackage;

import android.graphics.ImageDecoder;
import android.os.Bundle;
import androidx.compose.runtime.c;
import androidx.fragment.app.Fragment;
import androidx.media3.exoplayer.drm.b;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.grg;
import defpackage.lz8;
import defpackage.wqf;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o6 implements ru5, lz8.a, b.InterfaceC0045b, wq2, dv5 {
    public final /* synthetic */ int a;

    public static f51 a(p63 p63Var, t41 t41Var) {
        p63Var.getClass();
        return new f51(t41Var);
    }

    public static grg.c b(Fragment fragment) {
        grg.c defaultViewModelProviderFactory = fragment.requireActivity().getDefaultViewModelProviderFactory();
        defaultViewModelProviderFactory.getClass();
        return defaultViewModelProviderFactory;
    }

    public static /* bridge */ /* synthetic */ ImageDecoder.Source d(Object obj) {
        return (ImageDecoder.Source) obj;
    }

    public static String e(Class cls, StringBuilder sb, String str) {
        sb.append(cls.getName());
        sb.append(str);
        return sb.toString();
    }

    public static String f(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static StringBuilder g(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static /* synthetic */ void h() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void i(int i, String str) {
        throw new IllegalStateException(str + i);
    }

    public static void j(c cVar, boolean z, boolean z2, boolean z3) {
        cVar.U(z);
        cVar.U(z2);
        cVar.U(z3);
    }

    public static /* synthetic */ void k(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static void l(String str, Exception exc, String str2, boolean z, Exception exc2) {
        lz2.b(str2, str + exc, z, exc2);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void o(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + ((char) i)).toString());
    }

    public static void p(StringBuilder sb, String str, long j, String str2) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
    }

    @Override // defpackage.wq2
    public void accept(Object obj) {
        ((vdb) obj).H0();
    }

    @Override // defpackage.ru5
    public Object apply(Object obj) {
        switch (this.a) {
            case 4:
                return Integer.valueOf(((n83) obj).r);
            case DatadogLogGenerator.CRASH /* 9 */:
                return (tpf) obj;
            case 16:
                return Long.valueOf(((s83) obj).c);
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                return Boolean.valueOf(((String) obj).length() > 0);
            default:
                Bundle bundle = (Bundle) obj;
                Bundle bundle2 = bundle.getBundle(wqf.a.f);
                bundle2.getClass();
                wpf wpfVarA = wpf.a(bundle2);
                int[] intArray = bundle.getIntArray(wqf.a.g);
                int i = wpfVarA.a;
                int[] iArr = new int[i];
                if (intArray == null) {
                    intArray = iArr;
                }
                boolean[] booleanArray = bundle.getBooleanArray(wqf.a.h);
                boolean[] zArr = new boolean[i];
                if (booleanArray == null) {
                    booleanArray = zArr;
                }
                return new wqf.a(wpfVarA, bundle.getBoolean(wqf.a.i, false), intArray, booleanArray);
        }
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        v20 v20Var = (v20) obj;
        switch (this.a) {
            case 6:
                v20Var.getClass();
                break;
            default:
                v20Var.getClass();
                break;
        }
    }

    @Override // androidx.media3.exoplayer.drm.b.InterfaceC0045b
    public void release() {
    }

    public /* synthetic */ o6(int i) {
        this.a = i;
    }
}
