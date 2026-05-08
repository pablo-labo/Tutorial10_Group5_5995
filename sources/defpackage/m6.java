package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.google.android.gms.internal.play_billing.b;
import com.google.android.recaptcha.internal.zzaeo;
import defpackage.lz8;
import defpackage.zu8;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m6 implements lz8.a, wrf, pa3, zu8.a, wq2 {
    public final /* synthetic */ int a;

    public static int a(int i, int i2, int i3) {
        return zzaeo.zzx(i) + i2 + i3;
    }

    public static int b(int i, int i2, int i3, int i4) {
        return ((i + i2) - i3) + i4;
    }

    public static Object e(String str, String str2, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        return bundle.get(str2);
    }

    public static String f(Class cls, String str) {
        return str + cls;
    }

    public static String g(String str, String str2, ArrayList arrayList) {
        return str + arrayList + str2;
    }

    public static String h(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String i(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder j(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    public static /* synthetic */ void k(int i, int i2) {
        StringBuilder sb = new StringBuilder(40);
        sb.append((Object) "Length too large: ");
        sb.append(i);
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void l(Object obj, String str) {
        throw new IllegalStateException((str + obj + '\'').toString());
    }

    public static /* synthetic */ void m(String str) {
        throw new JSApplicationIllegalArgumentException(str);
    }

    public static int n(int i, int i2, int i3) {
        return b.b(i) + i2 + i3;
    }

    @Override // defpackage.wq2
    public void accept(Object obj) {
        ((vdb) obj).B();
    }

    @Override // defpackage.wrf
    public Object apply(Object obj) {
        f9e.a.getClass();
        String strA = f9e.b.a((e9e) obj);
        strA.getClass();
        Log.d("EventGDTLogger", "Session Event: ".concat(strA));
        byte[] bytes = strA.getBytes(a32.b);
        bytes.getClass();
        return bytes;
    }

    @Override // zu8.a
    public String d(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        v20 v20Var = (v20) obj;
        switch (this.a) {
            case 5:
                v20Var.getClass();
                break;
            default:
                v20Var.getClass();
                break;
        }
    }

    public /* synthetic */ m6(int i) {
        this.a = i;
    }
}
