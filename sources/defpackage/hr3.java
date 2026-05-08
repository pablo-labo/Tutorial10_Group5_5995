package defpackage;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.exoplayer.l;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.dqf;
import defpackage.gc9;
import defpackage.ka;
import defpackage.p35;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class hr3 extends gc9 implements l.a {
    public static final vva<Integer> k = new hd2(new bb1(1));
    public final Object c;
    public final Context d;
    public final ka.b e;
    public d f;
    public Thread g;
    public f h;
    public ox0 i;
    public Boolean j;

    public static final class a extends h<a> implements Comparable<a> {
        public final String V;
        public final d W;
        public final boolean X;
        public final int Y;
        public final int Z;
        public final int a0;
        public final boolean b0;
        public final boolean c0;
        public final int d0;
        public final int e;
        public final int e0;
        public final boolean f;
        public final boolean f0;
        public final int g0;
        public final int h0;
        public final int i0;
        public final int j0;
        public final boolean k0;
        public final boolean l0;
        public final boolean m0;

        /* JADX WARN: Removed duplicated region for block: B:49:0x00a7  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(int r8, defpackage.wpf r9, int r10, hr3.d r11, int r12, boolean r13, defpackage.gr3 r14, int r15) {
            /*
                Method dump skipped, instruction units count: 418
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: hr3.a.<init>(int, wpf, int, hr3$d, int, boolean, gr3, int):void");
        }

        @Override // hr3.h
        public final int a() {
            return this.e;
        }

        @Override // hr3.h
        public final boolean c(h hVar) {
            int i;
            String str;
            a aVar = (a) hVar;
            androidx.media3.common.a aVar2 = aVar.d;
            this.W.getClass();
            androidx.media3.common.a aVar3 = this.d;
            int i2 = aVar3.F;
            if (i2 == -1 || i2 != aVar2.F) {
                return false;
            }
            return (this.b0 || ((str = aVar3.n) != null && TextUtils.equals(str, aVar2.n))) && (i = aVar3.G) != -1 && i == aVar2.G && this.k0 == aVar.k0 && this.l0 == aVar.l0;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final int compareTo(a aVar) {
            boolean z = this.X;
            boolean z2 = this.f;
            Object objA = (z2 && z) ? hr3.k : hr3.k.a();
            boolean z3 = aVar.X;
            int i = aVar.i0;
            id2 id2VarC = id2.a.c(z, z3);
            Integer numValueOf = Integer.valueOf(this.Z);
            Integer numValueOf2 = Integer.valueOf(aVar.Z);
            kaa.a.getClass();
            sad sadVar = sad.a;
            id2 id2VarB = id2VarC.b(numValueOf, numValueOf2, sadVar).a(this.Y, aVar.Y).a(this.a0, aVar.a0).c(this.f0, aVar.f0).c(this.c0, aVar.c0).b(Integer.valueOf(this.d0), Integer.valueOf(aVar.d0), sadVar).a(this.e0, aVar.e0).c(z2, aVar.f).b(Integer.valueOf(this.j0), Integer.valueOf(aVar.j0), sadVar);
            boolean z4 = this.W.B;
            int i2 = this.i0;
            if (z4) {
                id2VarB = id2VarB.b(Integer.valueOf(i2), Integer.valueOf(i), hr3.k.a());
            }
            id2 id2VarB2 = id2VarB.c(this.k0, aVar.k0).c(this.l0, aVar.l0).c(this.m0, aVar.m0).b(Integer.valueOf(this.g0), Integer.valueOf(aVar.g0), objA).b(Integer.valueOf(this.h0), Integer.valueOf(aVar.h0), objA);
            if (Objects.equals(this.V, aVar.V)) {
                id2VarB2 = id2VarB2.b(Integer.valueOf(i2), Integer.valueOf(i), objA);
            }
            return id2VarB2.e();
        }
    }

    public static final class b extends h<b> implements Comparable<b> {
        public final int e;
        public final int f;

        public b(int i, wpf wpfVar, int i2, d dVar, int i3) {
            int i4;
            super(i, wpfVar, i2);
            this.e = l.d(i3, dVar.t0) ? 1 : 0;
            androidx.media3.common.a aVar = this.d;
            int i5 = aVar.u;
            int i6 = -1;
            if (i5 != -1 && (i4 = aVar.v) != -1) {
                i6 = i5 * i4;
            }
            this.f = i6;
        }

        @Override // hr3.h
        public final int a() {
            return this.e;
        }

        @Override // hr3.h
        public final /* bridge */ /* synthetic */ boolean c(h hVar) {
            return false;
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            return Integer.compare(this.f, bVar.f);
        }
    }

    public static final class c implements Comparable<c> {
        public final boolean a;
        public final boolean b;

        public c(androidx.media3.common.a aVar, int i) {
            this.a = (aVar.e & 1) != 0;
            this.b = l.d(i, false);
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            c cVar2 = cVar;
            return id2.a.c(this.b, cVar2.b).c(this.a, cVar2.a).e();
        }
    }

    public static final class e {
        public static final String a;
        public static final String b;
        public static final String c;

        static {
            String str = vjg.a;
            a = Integer.toString(0, 36);
            b = Integer.toString(1, 36);
            c = Integer.toString(2, 36);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                if (Arrays.equals((int[]) null, (int[]) null)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode((int[]) null) * 31;
        }
    }

    public static class f {
        public final Spatializer a;
        public final boolean b;
        public final Handler c;
        public final a d;

        public class a implements Spatializer$OnSpatializerStateChangedListener {
            public final /* synthetic */ hr3 a;

            public a(hr3 hr3Var) {
                this.a = hr3Var;
            }

            public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
                vva<Integer> vvaVar = hr3.k;
                this.a.j();
            }

            public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
                vva<Integer> vvaVar = hr3.k;
                this.a.j();
            }
        }

        public f(Context context, hr3 hr3Var, Boolean bool) {
            AudioManager audioManagerA = context == null ? null : ey0.a(context);
            if (audioManagerA == null || (bool != null && bool.booleanValue())) {
                this.a = null;
                this.b = false;
                this.c = null;
                this.d = null;
                return;
            }
            Spatializer spatializer = audioManagerA.getSpatializer();
            this.a = spatializer;
            this.b = spatializer.getImmersiveAudioLevel() != 0;
            a aVar = new a(hr3Var);
            this.d = aVar;
            Looper looperMyLooper = Looper.myLooper();
            ka2.r(looperMyLooper);
            final Handler handler = new Handler(looperMyLooper);
            this.c = handler;
            spatializer.addOnSpatializerStateChangedListener(new Executor() { // from class: ir3
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, aVar);
        }

        public final boolean a(ox0 ox0Var, androidx.media3.common.a aVar) {
            String str = aVar.n;
            String str2 = aVar.n;
            int i = aVar.F;
            if (Objects.equals(str, "audio/eac3-joc")) {
                if (i == 16) {
                    i = 12;
                }
            } else if (Objects.equals(str2, "audio/iamf")) {
                if (i == -1) {
                    i = 6;
                }
            } else if (Objects.equals(str2, "audio/ac4") && (i == 18 || i == 21)) {
                i = 24;
            }
            int iS = vjg.s(i);
            if (iS == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iS);
            int i2 = aVar.G;
            if (i2 != -1) {
                channelMask.setSampleRate(i2);
            }
            Spatializer spatializer = this.a;
            spatializer.getClass();
            return spatializer.canBeSpatialized(ox0Var.b().a, channelMask.build());
        }

        public final boolean b() {
            Spatializer spatializer = this.a;
            spatializer.getClass();
            return spatializer.isAvailable();
        }

        public final boolean c() {
            Spatializer spatializer = this.a;
            spatializer.getClass();
            return spatializer.isEnabled();
        }

        public final void d() {
            a aVar;
            Handler handler;
            Spatializer spatializer = this.a;
            if (spatializer == null || (aVar = this.d) == null || (handler = this.c) == null) {
                return;
            }
            spatializer.removeOnSpatializerStateChangedListener(aVar);
            handler.removeCallbacksAndMessages(null);
        }
    }

    public static final class g extends h<g> implements Comparable<g> {
        public final boolean V;
        public final boolean W;
        public final int X;
        public final int Y;
        public final int Z;
        public final int a0;
        public final boolean b0;
        public final int e;
        public final boolean f;

        public g(int i, wpf wpfVar, int i2, d dVar, int i3, String str, String str2) {
            int i4;
            super(i, wpfVar, i2);
            int i5 = 0;
            this.f = l.d(i3, false);
            int i6 = this.d.e;
            int i7 = dVar.y;
            e47<String> e47Var = dVar.v;
            int i8 = i6 & (~i7);
            this.V = (i8 & 1) != 0;
            this.W = (i8 & 2) != 0;
            e47<String> e47VarN = str2 != null ? e47.n(str2) : e47Var.isEmpty() ? e47.n("") : e47Var;
            int i9 = 0;
            while (true) {
                if (i9 >= e47VarN.size()) {
                    i4 = 0;
                    i9 = Integer.MAX_VALUE;
                    break;
                } else {
                    i4 = hr3.i(this.d, e47VarN.get(i9), dVar.z);
                    if (i4 > 0) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            this.X = i9;
            this.Y = i4;
            int i10 = str2 != null ? 1088 : dVar.w;
            int i11 = this.d.f;
            vva<Integer> vvaVar = hr3.k;
            int iBitCount = (i11 == 0 || i11 != i10) ? Integer.bitCount(i10 & i11) : Integer.MAX_VALUE;
            this.Z = iBitCount;
            this.b0 = (1088 & this.d.f) != 0;
            int i12 = hr3.i(this.d, str, hr3.k(str) == null);
            this.a0 = i12;
            boolean z = i4 > 0 || (e47Var.isEmpty() && iBitCount > 0) || this.V || (this.W && i12 > 0);
            if (l.d(i3, dVar.t0) && z) {
                i5 = 1;
            }
            this.e = i5;
        }

        @Override // hr3.h
        public final int a() {
            return this.e;
        }

        @Override // hr3.h
        public final /* bridge */ /* synthetic */ boolean c(h hVar) {
            return false;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public final int compareTo(g gVar) {
            id2 id2VarC = id2.a.c(this.f, gVar.f);
            Integer numValueOf = Integer.valueOf(this.X);
            Integer numValueOf2 = Integer.valueOf(gVar.X);
            vva vvaVar = kaa.a;
            vvaVar.getClass();
            sad sadVar = sad.a;
            id2 id2VarB = id2VarC.b(numValueOf, numValueOf2, sadVar);
            int i = gVar.Y;
            int i2 = this.Y;
            id2 id2VarA = id2VarB.a(i2, i);
            int i3 = gVar.Z;
            int i4 = this.Z;
            id2 id2VarC2 = id2VarA.a(i4, i3).c(this.V, gVar.V);
            Boolean boolValueOf = Boolean.valueOf(this.W);
            Boolean boolValueOf2 = Boolean.valueOf(gVar.W);
            if (i2 != 0) {
                vvaVar = sadVar;
            }
            id2 id2VarA2 = id2VarC2.b(boolValueOf, boolValueOf2, vvaVar).a(this.a0, gVar.a0);
            if (i4 == 0) {
                id2VarA2 = id2VarA2.d(this.b0, gVar.b0);
            }
            return id2VarA2.e();
        }
    }

    public static abstract class h<T extends h<T>> {
        public final int a;
        public final wpf b;
        public final int c;
        public final androidx.media3.common.a d;

        public interface a<T extends h<T>> {
            qyc g(int i, wpf wpfVar, int[] iArr);
        }

        public h(int i, wpf wpfVar, int i2) {
            this.a = i;
            this.b = wpfVar;
            this.c = i2;
            this.d = wpfVar.d[i2];
        }

        public abstract int a();

        public abstract boolean c(T t);
    }

    public static final class i extends h<i> {
        public final boolean V;
        public final boolean W;
        public final boolean X;
        public final int Y;
        public final int Z;
        public final int a0;
        public final int b0;
        public final int c0;
        public final int d0;
        public final boolean e;
        public final boolean e0;
        public final d f;
        public final int f0;
        public final boolean g0;
        public final int h0;
        public final boolean i0;
        public final boolean j0;
        public final int k0;

        /* JADX WARN: Removed duplicated region for block: B:127:0x0177  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0072  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public i(int r7, defpackage.wpf r8, int r9, hr3.d r10, int r11, java.lang.String r12, int r13, boolean r14) {
            /*
                Method dump skipped, instruction units count: 482
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: hr3.i.<init>(int, wpf, int, hr3$d, int, java.lang.String, int, boolean):void");
        }

        public static int e(i iVar, i iVar2) {
            id2 id2VarC = id2.a.c(iVar.W, iVar2.W);
            Integer numValueOf = Integer.valueOf(iVar.b0);
            Integer numValueOf2 = Integer.valueOf(iVar2.b0);
            kaa.a.getClass();
            sad sadVar = sad.a;
            id2 id2VarB = id2VarC.b(numValueOf, numValueOf2, sadVar).a(iVar.c0, iVar2.c0).a(iVar.d0, iVar2.d0).c(iVar.e0, iVar2.e0).a(iVar.f0, iVar2.f0).c(iVar.X, iVar2.X).c(iVar.e, iVar2.e).c(iVar.V, iVar2.V).b(Integer.valueOf(iVar.a0), Integer.valueOf(iVar2.a0), sadVar);
            boolean z = iVar.i0;
            id2 id2VarC2 = id2VarB.c(z, iVar2.i0);
            boolean z2 = iVar.j0;
            id2 id2VarC3 = id2VarC2.c(z2, iVar2.j0);
            if (z && z2) {
                id2VarC3 = id2VarC3.a(iVar.k0, iVar2.k0);
            }
            return id2VarC3.e();
        }

        @Override // hr3.h
        public final int a() {
            return this.h0;
        }

        @Override // hr3.h
        public final boolean c(h hVar) {
            i iVar = (i) hVar;
            if (!this.g0 && !Objects.equals(this.d.n, iVar.d.n)) {
                return false;
            }
            this.f.getClass();
            return this.i0 == iVar.i0 && this.j0 == iVar.j0;
        }
    }

    public hr3(Context context) {
        ka.b bVar = new ka.b();
        d dVar = d.x0;
        this.c = new Object();
        this.d = context.getApplicationContext();
        this.e = bVar;
        if (dVar != null) {
            this.f = dVar;
        } else {
            dVar.getClass();
            d.a aVar = new d.a(dVar);
            aVar.e(dVar);
            this.f = new d(aVar);
        }
        this.i = ox0.h;
        boolean z = this.f.s0;
    }

    public static void h(xpf xpfVar, d dVar, HashMap map) {
        for (int i2 = 0; i2 < xpfVar.a; i2++) {
            cqf cqfVar = dVar.D.get(xpfVar.a(i2));
            if (cqfVar != null) {
                wpf wpfVar = cqfVar.a;
                cqf cqfVar2 = (cqf) map.get(Integer.valueOf(wpfVar.c));
                if (cqfVar2 == null || (cqfVar2.b.isEmpty() && !cqfVar.b.isEmpty())) {
                    map.put(Integer.valueOf(wpfVar.c), cqfVar);
                }
            }
        }
    }

    public static int i(androidx.media3.common.a aVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(aVar.d)) {
            return 4;
        }
        String strK = k(str);
        String strK2 = k(aVar.d);
        if (strK2 == null || strK == null) {
            return (z && strK2 == null) ? 1 : 0;
        }
        if (strK2.startsWith(strK) || strK.startsWith(strK2)) {
            return 3;
        }
        String str2 = vjg.a;
        return strK2.split("-", 2)[0].equals(strK.split("-", 2)[0]) ? 2 : 0;
    }

    public static String k(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean l(d dVar, int i2, androidx.media3.common.a aVar) {
        if ((i2 & 3584) == 0) {
            return false;
        }
        dqf.a aVar2 = dVar.u;
        if (aVar2.c && (i2 & 2048) == 0) {
            return false;
        }
        if (aVar2.b) {
            boolean z = (aVar.I == 0 && aVar.J == 0) ? false : true;
            boolean z2 = (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0;
            if (z && !z2) {
                return false;
            }
        }
        return true;
    }

    public static Pair m(int i2, gc9.a aVar, int[][][] iArr, h.a aVar2, Comparator comparator) {
        int i3;
        RandomAccess randomAccessN;
        gc9.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int i4 = aVar3.a;
        int i5 = 0;
        while (i5 < i4) {
            if (i2 == aVar3.b[i5]) {
                xpf xpfVar = aVar3.c[i5];
                for (int i6 = 0; i6 < xpfVar.a; i6++) {
                    wpf wpfVarA = xpfVar.a(i6);
                    qyc qycVarG = aVar2.g(i5, wpfVarA, iArr[i5][i6]);
                    int i7 = wpfVarA.a;
                    boolean[] zArr = new boolean[i7];
                    int i8 = 0;
                    while (i8 < i7) {
                        h hVar = (h) qycVarG.get(i8);
                        int iA = hVar.a();
                        if (zArr[i8] || iA == 0) {
                            i3 = i4;
                        } else {
                            if (iA == 1) {
                                randomAccessN = e47.n(hVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(hVar);
                                int i9 = i8 + 1;
                                while (i9 < i7) {
                                    h hVar2 = (h) qycVarG.get(i9);
                                    int i10 = i4;
                                    if (hVar2.a() == 2 && hVar.c(hVar2)) {
                                        arrayList2.add(hVar2);
                                        zArr[i9] = true;
                                    }
                                    i9++;
                                    i4 = i10;
                                }
                                randomAccessN = arrayList2;
                            }
                            i3 = i4;
                            arrayList.add(randomAccessN);
                        }
                        i8++;
                        i4 = i3;
                    }
                }
            }
            i5++;
            aVar3 = aVar;
            i4 = i4;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            iArr2[i11] = ((h) list.get(i11)).c;
        }
        h hVar3 = (h) list.get(0);
        return Pair.create(new p35.a(0, hVar3.b, iArr2), Integer.valueOf(hVar3.a));
    }

    @Override // defpackage.fqf
    public final dqf a() {
        d dVar;
        synchronized (this.c) {
            dVar = this.f;
        }
        return dVar;
    }

    @Override // defpackage.fqf
    public final l.a b() {
        return this;
    }

    @Override // defpackage.fqf
    public final void d() {
        f fVar;
        synchronized (this.c) {
            try {
                Thread thread = this.g;
                if (thread != null) {
                    ka2.p("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (fVar = this.h) != null) {
            fVar.d();
            this.h = null;
        }
        super.d();
    }

    @Override // defpackage.fqf
    public final void f(ox0 ox0Var) {
        if (this.i.equals(ox0Var)) {
            return;
        }
        this.i = ox0Var;
        j();
    }

    @Override // defpackage.fqf
    public final void g(dqf dqfVar) {
        d dVar;
        if (dqfVar instanceof d) {
            n((d) dqfVar);
        }
        synchronized (this.c) {
            dVar = this.f;
        }
        d.a aVar = new d.a(dVar);
        aVar.e(dqfVar);
        n(new d(aVar));
    }

    public final void j() {
        boolean z;
        androidx.media3.exoplayer.e eVar;
        f fVar;
        synchronized (this.c) {
            try {
                z = this.f.s0 && Build.VERSION.SDK_INT >= 32 && (fVar = this.h) != null && fVar.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (eVar = this.a) == null) {
            return;
        }
        eVar.W.k(10);
    }

    public final void n(d dVar) {
        boolean zEquals;
        synchronized (this.c) {
            zEquals = this.f.equals(dVar);
            this.f = dVar;
        }
        if (zEquals) {
            return;
        }
        if (dVar.s0 && this.d == null) {
            zkd.T("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        androidx.media3.exoplayer.e eVar = this.a;
        if (eVar != null) {
            eVar.W.k(10);
        }
    }

    public static final class d extends dqf {
        public static final String A0;
        public static final String B0;
        public static final String C0;
        public static final String D0;
        public static final String E0;
        public static final String F0;
        public static final String G0;
        public static final String H0;
        public static final String I0;
        public static final String J0;
        public static final String K0;
        public static final String L0;
        public static final String M0;
        public static final String N0;
        public static final String O0;
        public static final String P0;
        public static final String Q0;
        public static final d x0 = new d(new a());
        public static final String y0;
        public static final String z0;
        public final boolean o0;
        public final boolean p0;
        public final boolean q0;
        public final boolean r0;
        public final boolean s0;
        public final boolean t0;
        public final boolean u0;
        public final SparseArray<Map<xpf, e>> v0;
        public final SparseBooleanArray w0;

        static {
            String str = vjg.a;
            y0 = Integer.toString(1000, 36);
            z0 = Integer.toString(1001, 36);
            A0 = Integer.toString(1002, 36);
            B0 = Integer.toString(1003, 36);
            C0 = Integer.toString(1004, 36);
            D0 = Integer.toString(1005, 36);
            E0 = Integer.toString(1006, 36);
            F0 = Integer.toString(1007, 36);
            G0 = Integer.toString(1008, 36);
            H0 = Integer.toString(1009, 36);
            I0 = Integer.toString(1010, 36);
            J0 = Integer.toString(1011, 36);
            K0 = Integer.toString(1012, 36);
            L0 = Integer.toString(1013, 36);
            M0 = Integer.toString(1014, 36);
            N0 = Integer.toString(1015, 36);
            O0 = Integer.toString(1016, 36);
            P0 = Integer.toString(1017, 36);
            Q0 = Integer.toString(1018, 36);
        }

        public d(a aVar) {
            super(aVar);
            this.o0 = aVar.F;
            this.p0 = aVar.G;
            this.q0 = aVar.H;
            this.r0 = aVar.I;
            this.s0 = aVar.J;
            this.t0 = aVar.K;
            this.u0 = aVar.L;
            this.v0 = aVar.M;
            this.w0 = aVar.N;
        }

        @Override // defpackage.dqf
        public final dqf.b a() {
            return new a(this);
        }

        @Override // defpackage.dqf
        public final Bundle c() {
            Bundle bundleC = super.c();
            bundleC.putBoolean(y0, this.o0);
            bundleC.putBoolean(z0, false);
            bundleC.putBoolean(A0, this.p0);
            bundleC.putBoolean(M0, false);
            bundleC.putBoolean(B0, this.q0);
            bundleC.putBoolean(C0, false);
            bundleC.putBoolean(D0, false);
            bundleC.putBoolean(E0, false);
            bundleC.putBoolean(N0, false);
            bundleC.putBoolean(Q0, this.r0);
            bundleC.putBoolean(O0, this.s0);
            bundleC.putBoolean(F0, this.t0);
            bundleC.putBoolean(G0, false);
            bundleC.putBoolean(H0, this.u0);
            bundleC.putBoolean(P0, false);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray = new SparseArray();
            int i = 0;
            while (true) {
                SparseArray<Map<xpf, e>> sparseArray2 = this.v0;
                if (i >= sparseArray2.size()) {
                    break;
                }
                int iKeyAt = sparseArray2.keyAt(i);
                for (Map.Entry<xpf, e> entry : sparseArray2.valueAt(i).entrySet()) {
                    e value = entry.getValue();
                    if (value != null) {
                        sparseArray.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(Integer.valueOf(iKeyAt));
                }
                bundleC.putIntArray(I0, bm7.P1(arrayList));
                bundleC.putParcelableArrayList(J0, vp1.b(arrayList2, new ia(7)));
                SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>(sparseArray.size());
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    int iKeyAt2 = sparseArray.keyAt(i2);
                    ((e) sparseArray.valueAt(i2)).getClass();
                    Bundle bundle = new Bundle();
                    bundle.putInt(e.a, 0);
                    bundle.putIntArray(e.b, null);
                    bundle.putInt(e.c, 0);
                    sparseArray3.put(iKeyAt2, bundle);
                }
                bundleC.putSparseParcelableArray(K0, sparseArray3);
                i++;
            }
            SparseBooleanArray sparseBooleanArray = this.w0;
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i3 = 0; i3 < sparseBooleanArray.size(); i3++) {
                iArr[i3] = sparseBooleanArray.keyAt(i3);
            }
            bundleC.putIntArray(L0, iArr);
            return bundleC;
        }

        @Override // defpackage.dqf
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (super.equals(dVar) && this.o0 == dVar.o0 && this.p0 == dVar.p0 && this.q0 == dVar.q0 && this.r0 == dVar.r0 && this.s0 == dVar.s0 && this.t0 == dVar.t0 && this.u0 == dVar.u0) {
                    SparseBooleanArray sparseBooleanArray = dVar.w0;
                    SparseBooleanArray sparseBooleanArray2 = this.w0;
                    int size = sparseBooleanArray2.size();
                    if (sparseBooleanArray.size() == size) {
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                SparseArray<Map<xpf, e>> sparseArray = dVar.v0;
                                SparseArray<Map<xpf, e>> sparseArray2 = this.v0;
                                int size2 = sparseArray2.size();
                                if (sparseArray.size() == size2) {
                                    for (int i2 = 0; i2 < size2; i2++) {
                                        int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                                        if (iIndexOfKey >= 0) {
                                            Map<xpf, e> mapValueAt = sparseArray2.valueAt(i2);
                                            Map<xpf, e> mapValueAt2 = sparseArray.valueAt(iIndexOfKey);
                                            if (mapValueAt2.size() == mapValueAt.size()) {
                                                for (Map.Entry<xpf, e> entry : mapValueAt.entrySet()) {
                                                    xpf key = entry.getKey();
                                                    if (!mapValueAt2.containsKey(key) || !Objects.equals(entry.getValue(), mapValueAt2.get(key))) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return true;
                                }
                            } else {
                                if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) < 0) {
                                    break;
                                }
                                i++;
                            }
                        }
                    }
                }
            }
            return false;
        }

        @Override // defpackage.dqf
        public final int hashCode() {
            return (((((((((((((((super.hashCode() + 31) * 31) + (this.o0 ? 1 : 0)) * 961) + (this.p0 ? 1 : 0)) * 961) + (this.q0 ? 1 : 0)) * 28629151) + (this.r0 ? 1 : 0)) * 31) + (this.s0 ? 1 : 0)) * 31) + (this.t0 ? 1 : 0)) * 961) + (this.u0 ? 1 : 0)) * 31;
        }

        public static final class a extends dqf.b {
            public final boolean F;
            public final boolean G;
            public final boolean H;
            public final boolean I;
            public final boolean J;
            public final boolean K;
            public final boolean L;
            public final SparseArray<Map<xpf, e>> M;
            public final SparseBooleanArray N;

            public a(d dVar) {
                e(dVar);
                this.F = dVar.o0;
                this.G = dVar.p0;
                this.H = dVar.q0;
                this.I = dVar.r0;
                this.J = dVar.s0;
                this.K = dVar.t0;
                this.L = dVar.u0;
                SparseArray<Map<xpf, e>> sparseArray = dVar.v0;
                SparseArray<Map<xpf, e>> sparseArray2 = new SparseArray<>();
                for (int i = 0; i < sparseArray.size(); i++) {
                    sparseArray2.put(sparseArray.keyAt(i), new HashMap(sparseArray.valueAt(i)));
                }
                this.M = sparseArray2;
                this.N = dVar.w0.clone();
            }

            @Override // dqf.b
            public final dqf.b a(cqf cqfVar) {
                this.D.put(cqfVar.a, cqfVar);
                return this;
            }

            @Override // dqf.b
            public final dqf b() {
                return new d(this);
            }

            @Override // dqf.b
            public final dqf.b c() {
                super.c();
                return this;
            }

            @Override // dqf.b
            public final dqf.b d(int i) {
                super.d(i);
                return this;
            }

            @Override // dqf.b
            public final dqf.b g(Set set) {
                super.g(set);
                return this;
            }

            @Override // dqf.b
            public final dqf.b h() {
                this.y = -3;
                return this;
            }

            @Override // dqf.b
            public final dqf.b i(cqf cqfVar) {
                super.i(cqfVar);
                return this;
            }

            @Override // dqf.b
            public final dqf.b j() {
                super.j();
                return this;
            }

            @Override // dqf.b
            public final dqf.b k(String[] strArr) {
                super.k(strArr);
                return this;
            }

            @Override // dqf.b
            public final dqf.b l() {
                super.l();
                return this;
            }

            @Override // dqf.b
            public final dqf.b m(int i, boolean z) {
                super.m(i, z);
                return this;
            }

            public a() {
                this.M = new SparseArray<>();
                this.N = new SparseBooleanArray();
                this.F = true;
                this.G = true;
                this.H = true;
                this.I = true;
                this.J = true;
                this.K = true;
                this.L = true;
            }
        }
    }
}
