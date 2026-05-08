package defpackage;

import android.util.SparseIntArray;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes3.dex */
public final class zta extends yta {
    public static final SparseIntArray V0;
    public long U0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        V0 = sparseIntArray;
        sparseIntArray.put(R.id.nameMaxTextView, 4);
        sparseIntArray.put(R.id.name_divider, 5);
        sparseIntArray.put(R.id.descriptionMaxTextView, 6);
        sparseIntArray.put(R.id.description_detail, 7);
        sparseIntArray.put(R.id.description_divider, 8);
        sparseIntArray.put(R.id.category_title, 9);
        sparseIntArray.put(R.id.categoryLabelTextView, 10);
        sparseIntArray.put(R.id.category_guide, 11);
        sparseIntArray.put(R.id.category_divider, 12);
        sparseIntArray.put(R.id.searchIncludedContainer, 13);
        sparseIntArray.put(R.id.search_title, 14);
        sparseIntArray.put(R.id.search_description, 15);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    @Override // defpackage.qpg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U() {
        /*
            r20 = this;
            r1 = r20
            monitor-enter(r20)
            long r2 = r1.U0     // Catch: java.lang.Throwable -> L9f
            r4 = 0
            r1.U0 = r4     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r20)     // Catch: java.lang.Throwable -> L9f
            gua r0 = r1.S0
            r6 = 31
            long r6 = r6 & r2
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r7 = 28
            r9 = 26
            r11 = 25
            r13 = 0
            r14 = 0
            if (r6 == 0) goto L75
            long r15 = r2 & r11
            int r6 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r6 == 0) goto L33
            if (r0 == 0) goto L26
            g3a<java.lang.String> r6 = r0.d
            goto L27
        L26:
            r6 = r14
        L27:
            r1.c0(r13, r6)
            if (r6 == 0) goto L33
            java.lang.Object r6 = r6.d()
            java.lang.String r6 = (java.lang.String) r6
            goto L34
        L33:
            r6 = r14
        L34:
            long r15 = r2 & r9
            int r15 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r15 == 0) goto L50
            if (r0 == 0) goto L41
            g3a<java.lang.String> r15 = r0.f
        L3e:
            r16 = r4
            goto L43
        L41:
            r15 = r14
            goto L3e
        L43:
            r4 = 1
            r1.c0(r4, r15)
            if (r15 == 0) goto L52
            java.lang.Object r4 = r15.d()
            java.lang.String r4 = (java.lang.String) r4
            goto L53
        L50:
            r16 = r4
        L52:
            r4 = r14
        L53:
            long r18 = r2 & r7
            int r5 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r5 == 0) goto L73
            if (r0 == 0) goto L5e
            g3a<java.lang.Boolean> r0 = r0.W
            goto L5f
        L5e:
            r0 = r14
        L5f:
            r5 = 2
            r1.c0(r5, r0)
            if (r0 == 0) goto L6c
            java.lang.Object r0 = r0.d()
            r14 = r0
            java.lang.Boolean r14 = (java.lang.Boolean) r14
        L6c:
            if (r14 != 0) goto L6f
            goto L73
        L6f:
            boolean r13 = r14.booleanValue()
        L73:
            r14 = r4
            goto L78
        L75:
            r16 = r4
            r6 = r14
        L78:
            long r4 = r2 & r9
            int r0 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r0 == 0) goto L83
            android.widget.EditText r0 = r1.J0
            defpackage.dkf.a(r0, r14)
        L83:
            long r4 = r2 & r11
            int r0 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r0 == 0) goto L8e
            android.widget.EditText r0 = r1.M0
            defpackage.dkf.a(r0, r6)
        L8e:
            long r2 = r2 & r7
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 == 0) goto L9e
            android.widget.CheckBox r0 = r1.P0
            boolean r1 = r0.isChecked()
            if (r1 == r13) goto L9e
            r0.setChecked(r13)
        L9e:
            return
        L9f:
            r0 = move-exception
            monitor-exit(r20)     // Catch: java.lang.Throwable -> L9f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zta.U():void");
    }

    @Override // defpackage.qpg
    public final boolean V() {
        synchronized (this) {
            try {
                return this.U0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.qpg
    public final boolean Y(Object obj, int i, int i2) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.U0 |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.U0 |= 2;
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.U0 |= 4;
        }
        return true;
    }

    @Override // defpackage.yta
    public final void e0(gua guaVar) {
        this.S0 = guaVar;
        synchronized (this) {
            this.U0 |= 8;
        }
        K(2);
        a0();
    }
}
