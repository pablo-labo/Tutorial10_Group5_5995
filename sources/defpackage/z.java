package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class z implements ag7 {
    public final Object a;
    public final Object b;

    public z(CharSequence charSequence, int i) {
        wg2 wg2Var = wg2.d;
        charSequence.getClass();
        this.a = charSequence;
        this.b = wg2Var;
    }

    public pl2 a(en6 en6Var, ArrayList arrayList) {
        en6Var.getClass();
        ((wg2) this.b).getClass();
        if (en6Var.equals(pg8.c) ? true : en6Var.equals(pg8.d)) {
            return new ly8(en6Var, arrayList);
        }
        kd9 kd9Var = pg8.e;
        return en6Var.equals(kd9Var) ? new qy8(kd9Var, arrayList) : new pl2(en6Var, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050 A[EDGE_INSN: B:26:0x0050->B:20:0x0050 BREAK  A[LOOP:0: B:5:0x0010->B:19:0x0042], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List b(defpackage.en6 r8, int r9, int r10) {
        /*
            r7 = this;
            r8.getClass()
            zd9$a r0 = defpackage.zd9.M
            boolean r1 = r8.equals(r0)
            if (r1 == 0) goto L5b
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L10:
            if (r9 >= r10) goto L50
            java.lang.Object r1 = r7.b
            wg2 r1 = (defpackage.wg2) r1
            r1.getClass()
            java.lang.Object r1 = r7.a
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r1.getClass()
            int r2 = r10 + (-1)
            r3 = -1
            if (r9 > r2) goto L34
            r4 = r9
        L26:
            char r5 = r1.charAt(r4)
            r6 = 10
            if (r5 != r6) goto L2f
            goto L35
        L2f:
            if (r4 == r2) goto L34
            int r4 = r4 + 1
            goto L26
        L34:
            r4 = r3
        L35:
            if (r4 != r3) goto L38
            goto L50
        L38:
            if (r4 <= r9) goto L42
            ut8 r1 = new ut8
            r1.<init>(r0, r9, r4)
            r8.add(r1)
        L42:
            ut8 r9 = new ut8
            int r1 = r4 + 1
            kd9 r2 = defpackage.zd9.p
            r9.<init>(r2, r4, r1)
            r8.add(r9)
            r9 = r1
            goto L10
        L50:
            if (r10 <= r9) goto L5a
            ut8 r7 = new ut8
            r7.<init>(r0, r9, r10)
            r8.add(r7)
        L5a:
            return r8
        L5b:
            ut8 r7 = new ut8
            r7.<init>(r8, r9, r10)
            java.util.List r7 = defpackage.u63.Z(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z.b(en6, int, int):java.util.List");
    }

    @Override // defpackage.ag7
    public void c(int i) {
        yn0 yn0Var = (yn0) this.b;
        if (i != 0) {
            if (i == 1) {
                c49.a("zf7", "Install referrer API connection couldn't be established.", new Object[0]);
                yn0Var.invoke(null);
                return;
            } else {
                if (i != 2) {
                    return;
                }
                c49.a("zf7", "Install referrer API not available on the current Play Store app.", new Object[0]);
                yn0Var.invoke(null);
                return;
            }
        }
        try {
            Bundle bundle = ((yf7) this.a).w0().a;
            String string = bundle.getString("install_referrer");
            string.getClass();
            yn0Var.invoke(new zf7(string, bundle.getLong("referrer_click_timestamp_seconds"), bundle.getLong("install_begin_timestamp_seconds"), bundle.getBoolean("google_play_instant")));
        } catch (RemoteException unused) {
            c49.a("zf7", "Install referrer API remote exception.", new Object[0]);
            yn0Var.invoke(null);
        } catch (NoSuchMethodError unused2) {
            c49.a("zf7", "Upgrade InstallReferrer package to v1.1 or higher to add the install referrer details entity.", new Object[0]);
            yn0Var.invoke(null);
        }
    }

    public Object d(qf8 qf8Var, Object obj) {
        qf8Var.getClass();
        return Integer.valueOf(((nm0) this.a).f((String) this.b));
    }

    public void e(qf8 qf8Var, Object obj, Object obj2) {
        int iIntValue = ((Number) obj2).intValue();
        qf8Var.getClass();
        ((nm0) this.a).d(iIntValue, (String) this.b);
    }

    public /* synthetic */ z(Serializable serializable, Object obj) {
        this.a = obj;
        this.b = serializable;
    }
}
