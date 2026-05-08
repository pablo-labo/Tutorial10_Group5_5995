package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import coil.memory.MemoryCache;
import defpackage.c6d;
import defpackage.gm6;
import defpackage.hr1;
import defpackage.ig1;
import defpackage.iu0;
import defpackage.kt2;
import defpackage.ng2;
import defpackage.o95;
import defpackage.ob4;
import defpackage.pg1;
import defpackage.v03;
import defpackage.z03;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes.dex */
public final class frc {
    public final zp3 a;
    public final d2f b;
    public final r33 c;
    public final d2f d;
    public final ng2 e;
    public final ArrayList f;

    public frc(Context context, zp3 zp3Var, d2f d2fVar, d2f d2fVar2, d2f d2fVar3, ng2 ng2Var, ee3 ee3Var) {
        this.a = zp3Var;
        this.b = d2fVar;
        eze ezeVarA = wea.a();
        eq3 eq3Var = a74.a;
        f13.a(v03.a.C0438a.c(ezeVarA, m89.a.J1()).d1(new erc(z03.a.a)));
        ee3Var.getClass();
        m2f m2fVar = new m2f(this, context);
        r33 r33Var = new r33(this, m2fVar);
        this.c = r33Var;
        this.d = d2fVar;
        ng2.a aVar = new ng2.a(ng2Var);
        aVar.b(new mm6(), HttpUrl.class);
        aVar.b(new ive(), String.class);
        aVar.b(new cb5(), Uri.class);
        aVar.b(new f6d(), Uri.class);
        aVar.b(new ar1(1), Integer.class);
        aVar.b(new ar1(0), byte[].class);
        Pair pair = new Pair(new ohg(), Uri.class);
        ArrayList arrayList = aVar.c;
        arrayList.add(pair);
        arrayList.add(new Pair(new t95(), File.class));
        aVar.a(new gm6.a(d2fVar3, d2fVar2), Uri.class);
        aVar.a(new o95.a(), File.class);
        aVar.a(new iu0.a(), Uri.class);
        aVar.a(new kt2.a(), Uri.class);
        aVar.a(new c6d.a(), Uri.class);
        aVar.a(new ob4.a(), Drawable.class);
        aVar.a(new pg1.a(), Bitmap.class);
        aVar.a(new hr1.a(), ByteBuffer.class);
        ig1.b bVar = new ig1.b();
        ArrayList arrayList2 = aVar.e;
        arrayList2.add(bVar);
        List listG = q92.G(aVar.a);
        this.e = new ng2(listG, q92.G(aVar.b), q92.G(arrayList), q92.G(aVar.d), q92.G(arrayList2));
        this.f = z92.g1(new ht4(this, r33Var), listG);
        new AtomicBoolean(false);
        context.registerComponentCallbacks(m2fVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e4, code lost:
    
        if (defpackage.u63.m(r0, r3) == r9) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3 A[Catch: all -> 0x00f7, TryCatch #2 {all -> 0x00f7, blocks: (B:42:0x00ed, B:44:0x00f3, B:47:0x00fb), top: B:85:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016a A[Catch: all -> 0x017f, TryCatch #7 {all -> 0x017f, blocks: (B:55:0x0164, B:57:0x016a, B:61:0x0181, B:63:0x0185), top: B:93:0x0164 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0181 A[Catch: all -> 0x017f, TryCatch #7 {all -> 0x017f, blocks: (B:55:0x0164, B:57:0x016a, B:61:0x0181, B:63:0x0185), top: B:93:0x0164 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.frc r17, defpackage.v27 r18, int r19, defpackage.pu2 r20) {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.frc.a(frc, v27, int, pu2):java.lang.Object");
    }

    public final MemoryCache b() {
        return (MemoryCache) this.d.getValue();
    }
}
