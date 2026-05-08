package androidx.media3.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.SparseBooleanArray;
import androidx.media3.session.legacy.c;
import androidx.media3.session.r;
import androidx.media3.session.z;
import defpackage.bh5;
import defpackage.e47;
import defpackage.gdb;
import defpackage.ij9;
import defpackage.ka2;
import defpackage.v9e;
import defpackage.vjg;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    public static final c.a a = new c.a("androidx.media3.session.MediaLibraryService", null);

    public static boolean a(v9e v9eVar, v9e v9eVar2) {
        gdb.d dVar = v9eVar.a;
        int i = dVar.b;
        gdb.d dVar2 = v9eVar2.a;
        return i == dVar2.b && dVar.e == dVar2.e && dVar.h == dVar2.h && dVar.i == dVar2.i;
    }

    public static int b(long j, long j2) {
        if (j == -9223372036854775807L || j2 == -9223372036854775807L) {
            return 0;
        }
        if (j2 == 0) {
            return 100;
        }
        return vjg.i(vjg.S(j, j2), 0, 100);
    }

    public static long c(z zVar, long j, long j2, long j3) {
        v9e v9eVar = zVar.c;
        v9e v9eVar2 = zVar.c;
        boolean z = v9eVar.equals(v9e.l) || j2 < v9eVar2.c;
        if (zVar.v) {
            if (z || j == -9223372036854775807L) {
                if (j3 == -9223372036854775807L) {
                    j3 = SystemClock.elapsedRealtime() - v9eVar2.c;
                }
                long j4 = v9eVar2.a.f + ((long) (j3 * zVar.g.a));
                long j5 = v9eVar2.d;
                return j5 != -9223372036854775807L ? Math.min(j4, j5) : j4;
            }
        } else if (z || j == -9223372036854775807L) {
            return v9eVar2.a.f;
        }
        return j;
    }

    public static gdb.a d(gdb.a aVar, gdb.a aVar2) {
        if (aVar != null) {
            bh5 bh5Var = aVar.a;
            if (aVar2 != null) {
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i = 0; i < bh5Var.a.size(); i++) {
                    if (aVar2.a(bh5Var.b(i))) {
                        int iB = bh5Var.b(i);
                        ka2.q(!false);
                        sparseBooleanArray.append(iB, true);
                    }
                }
                ka2.q(!false);
                return new gdb.a(new bh5(sparseBooleanArray));
            }
        }
        return gdb.a.b;
    }

    public static z e(z zVar, z zVar2, z.a aVar, gdb.a aVar2) {
        if (aVar.a && aVar2.a(17)) {
            zVar2 = zVar2.l(zVar.j);
        }
        return (aVar.b && aVar2.a(30)) ? zVar2.b(zVar.D) : zVar2;
    }

    public static void f(gdb gdbVar, r.e eVar) {
        int i = eVar.b;
        long j = eVar.c;
        e47<ij9> e47Var = eVar.a;
        if (i == -1) {
            if (gdbVar.O0(20)) {
                gdbVar.J0(e47Var);
                return;
            } else {
                if (e47Var.isEmpty()) {
                    return;
                }
                gdbVar.J(e47Var.get(0));
                return;
            }
        }
        if (gdbVar.O0(20)) {
            gdbVar.l0(e47Var, eVar.b, j);
        } else {
            if (e47Var.isEmpty()) {
                return;
            }
            gdbVar.m(e47Var.get(0), j);
        }
    }

    public static ArrayList g(List list) {
        ArrayList arrayList = new ArrayList();
        Parcel parcelObtain = Parcel.obtain();
        for (int i = 0; i < list.size(); i++) {
            try {
                Parcelable parcelable = (Parcelable) list.get(i);
                parcelObtain.writeParcelable(parcelable, 0);
                if (parcelObtain.dataSize() >= 262144) {
                    break;
                }
                arrayList.add(parcelable);
            } finally {
                parcelObtain.recycle();
            }
        }
        return arrayList;
    }
}
