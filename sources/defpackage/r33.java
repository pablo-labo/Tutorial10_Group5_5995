package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import coil.request.NullRequestDataException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class r33 implements OnCompleteListener {
    public final Object a;
    public final Object b;

    public r33(frc frcVar, m2f m2fVar) {
        Object rw8Var;
        this.a = m2fVar;
        if (d.a) {
            rw8Var = new a47(false);
        } else {
            int i = Build.VERSION.SDK_INT;
            rw8Var = (i == 26 || i == 27) ? new rw8() : new a47(true);
        }
        this.b = rw8Var;
    }

    public static vw4 b(v27 v27Var, Throwable th) {
        if (th instanceof NullRequestDataException) {
            v27Var.getClass();
            zp3 zp3Var = v27Var.y;
            zp3Var.getClass();
            zp3 zp3Var2 = j.a;
            zp3Var.getClass();
        } else {
            v27Var.y.getClass();
            zp3 zp3Var3 = j.a;
        }
        return new vw4(null, v27Var, th);
    }

    public static boolean c(v27 v27Var, Bitmap.Config config) {
        return config != Bitmap.Config.HARDWARE || v27Var.j;
    }

    public void a() {
        String str = (String) this.a;
        try {
            oa5 oa5Var = (oa5) this.b;
            oa5Var.getClass();
            new File(oa5Var.b, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.qva d(defpackage.v27 r15, defpackage.hie r16) {
        /*
            r14 = this;
            r3 = r16
            java.util.List<qrf> r1 = r15.e
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L14
            android.graphics.Bitmap$Config[] r1 = defpackage.m.a
            android.graphics.Bitmap$Config r2 = r15.c
            boolean r1 = defpackage.ut0.f0(r2, r1)
            if (r1 == 0) goto L2a
        L14:
            android.graphics.Bitmap$Config r1 = r15.c
            boolean r1 = c(r15, r1)
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r14.b
            v1 r1 = (defpackage.v1) r1
            boolean r1 = r1.M(r3)
            if (r1 == 0) goto L2a
            android.graphics.Bitmap$Config r1 = r15.c
        L28:
            r2 = r1
            goto L2d
        L2a:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            goto L28
        L2d:
            java.lang.Object r14 = r14.a
            m2f r14 = (defpackage.m2f) r14
            boolean r14 = r14.d
            if (r14 == 0) goto L39
            vt1 r14 = r15.o
        L37:
            r13 = r14
            goto L3c
        L39:
            vt1 r14 = defpackage.vt1.b
            goto L37
        L3c:
            boolean r14 = r15.k
            if (r14 == 0) goto L4f
            java.util.List<qrf> r14 = r15.e
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L4f
            android.graphics.Bitmap$Config r14 = android.graphics.Bitmap.Config.ALPHA_8
            if (r2 == r14) goto L4f
            r14 = 1
        L4d:
            r6 = r14
            goto L51
        L4f:
            r14 = 0
            goto L4d
        L51:
            t44 r14 = r3.a
            t44$b r1 = t44.b.a
            boolean r14 = defpackage.wl7.b(r14, r1)
            if (r14 != 0) goto L68
            t44 r14 = r3.b
            boolean r14 = defpackage.wl7.b(r14, r1)
            if (r14 == 0) goto L64
            goto L68
        L64:
            tmd r14 = r15.v
        L66:
            r4 = r14
            goto L6b
        L68:
            tmd r14 = defpackage.tmd.a
            goto L66
        L6b:
            qva r14 = new qva
            android.content.Context r1 = r15.a
            boolean r5 = defpackage.j.a(r15)
            boolean r7 = r15.l
            okhttp3.Headers r8 = r15.g
            d8f r9 = r15.h
            u3b r10 = r15.w
            vt1 r11 = r15.m
            vt1 r12 = r15.n
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r33.d(v27, hie):qva");
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((ywh) this.a).e((Intent) this.b);
    }

    public /* synthetic */ r33(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }
}
