package defpackage;

import com.google.android.gms.internal.play_billing.b;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class r2i implements i3i {
    public final f2i a;
    public final beb b;
    public final boolean c;

    public r2i(beb bebVar, f2i f2iVar) {
        iwh iwhVar = lwh.a;
        this.b = bebVar;
        this.c = f2iVar instanceof zxh;
        this.a = f2iVar;
    }

    @Override // defpackage.i3i
    public final void a(Object obj, h6i h6iVar) {
        Iterator itA = ((zxh) obj).zzb.a();
        if (itA.hasNext()) {
            ((owh) ((Map.Entry) itA.next()).getKey()).zzc();
            throw null;
        }
        c5i c5iVar = ((oyh) obj).zzc;
        for (int i = 0; i < c5iVar.a; i++) {
            int i2 = c5iVar.b[i] >>> 3;
            Object obj2 = c5iVar.c[i];
            boolean z = obj2 instanceof ivh;
            b bVar = ((wvh) h6iVar).a;
            if (z) {
                bVar.o(i2, (ivh) obj2);
            } else {
                bVar.n(i2, (f2i) obj2);
            }
        }
    }

    @Override // defpackage.i3i
    public final boolean b(oyh oyhVar, oyh oyhVar2) {
        if (!oyhVar.zzc.equals(oyhVar2.zzc)) {
            return false;
        }
        if (this.c) {
            return ((zxh) oyhVar).zzb.equals(((zxh) oyhVar2).zzb);
        }
        return true;
    }

    @Override // defpackage.i3i
    public final boolean c(Object obj) {
        ((zxh) obj).zzb.c();
        return true;
    }

    @Override // defpackage.i3i
    public final int d(oyh oyhVar) {
        int iHashCode = oyhVar.zzc.hashCode();
        if (!this.c) {
            return iHashCode;
        }
        return ((zxh) oyhVar).zzb.a.hashCode() + (iHashCode * 53);
    }

    @Override // defpackage.i3i
    public final int e(oyh oyhVar) {
        c5i c5iVar = oyhVar.zzc;
        int iN = c5iVar.d;
        if (iN == -1) {
            iN = 0;
            for (int i = 0; i < c5iVar.a; i++) {
                int i2 = c5iVar.b[i] >>> 3;
                ivh ivhVar = (ivh) c5iVar.c[i];
                int iB = b.b(8);
                int iB2 = b.b(i2) + b.b(16);
                int iB3 = b.b(24);
                int iC = ivhVar.c();
                iN += iB + iB + iB2 + m6.n(iC, iC, iB3);
            }
            c5iVar.d = iN;
        }
        if (this.c) {
            q3i q3iVar = ((zxh) oyhVar).zzb.a;
            if (q3iVar.b > 0) {
                rwh.e(q3iVar.f(0));
                throw null;
            }
            Iterator it = q3iVar.b().iterator();
            if (it.hasNext()) {
                rwh.e((Map.Entry) it.next());
                throw null;
            }
        }
        return iN;
    }

    @Override // defpackage.i3i
    public final oyh zze() {
        f2i f2iVar = this.a;
        if (f2iVar instanceof oyh) {
            return (oyh) ((oyh) f2iVar).e(4);
        }
        vxh vxhVar = (vxh) f2iVar.c();
        boolean zL = vxhVar.b.l();
        oyh oyhVar = vxhVar.b;
        if (!zL) {
            return oyhVar;
        }
        oyhVar.h();
        return vxhVar.b;
    }

    @Override // defpackage.i3i
    public final void zzf(Object obj) {
        this.b.getClass();
        c5i c5iVar = ((oyh) obj).zzc;
        if (c5iVar.e) {
            c5iVar.e = false;
        }
        iwh iwhVar = lwh.a;
        ((zxh) obj).zzb.b();
    }

    @Override // defpackage.i3i
    public final void zzg(Object obj, Object obj2) {
        o3i.p(obj, obj2);
        if (this.c) {
            iwh iwhVar = lwh.a;
            if (((zxh) obj2).zzb.a.isEmpty()) {
                return;
            }
            throw null;
        }
    }
}
