package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.common.time.RealtimeSinceBootClock;

/* JADX INFO: loaded from: classes2.dex */
public final class vg1 implements ot1 {
    public final String a;
    public final x4d b;
    public final yfd c;
    public final r07 d;
    public final ot1 e;
    public final String f;
    public Object g;
    public final int h;

    public vg1(String str, x4d x4dVar, yfd yfdVar, r07 r07Var, ot1 ot1Var, String str2) {
        str.getClass();
        yfdVar.getClass();
        r07Var.getClass();
        this.a = str;
        this.b = x4dVar;
        this.c = yfdVar;
        this.d = r07Var;
        this.e = ot1Var;
        this.f = str2;
        this.h = ((((r07Var.hashCode() + ((yfdVar.hashCode() + (((str.hashCode() * 31) + (x4dVar != null ? x4dVar.hashCode() : 0)) * 31)) * 31)) * 31) + (ot1Var != null ? ot1Var.hashCode() : 0)) * 31) + (str2 != null ? str2.hashCode() : 0);
        RealtimeSinceBootClock.get().getClass();
        SystemClock.elapsedRealtime();
    }

    @Override // defpackage.ot1
    public final String a() {
        return this.a;
    }

    @Override // defpackage.ot1
    public final boolean b(Uri uri) {
        uri.getClass();
        String string = uri.toString();
        string.getClass();
        return zve.L(this.a, string, false);
    }

    @Override // defpackage.ot1
    public final boolean c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!vg1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        vg1 vg1Var = (vg1) obj;
        return wl7.b(this.a, vg1Var.a) && wl7.b(this.b, vg1Var.b) && wl7.b(this.c, vg1Var.c) && wl7.b(this.d, vg1Var.d) && wl7.b(this.e, vg1Var.e) && wl7.b(this.f, vg1Var.f);
    }

    public final int hashCode() {
        return this.h;
    }

    public final String toString() {
        return "BitmapMemoryCacheKey(sourceString=" + this.a + ", resizeOptions=" + this.b + ", rotationOptions=" + this.c + ", imageDecodeOptions=" + this.d + ", postprocessorCacheKey=" + this.e + ", postprocessorName=" + this.f + ")";
    }
}
