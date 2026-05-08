package defpackage;

import android.content.Context;
import android.os.LocaleList;
import android.view.textclassifier.TextClassifier;
import androidx.compose.runtime.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class icb implements dcb {
    public final v03 a;
    public final Context b;
    public final o2e c;
    public final b19 d;
    public TextClassifier f;
    public final a5a e = pnb.i();
    public final g4a g = r.f(null);
    public final Object h = new Object();

    public icb(v03 v03Var, Context context, o2e o2eVar, b19 b19Var) {
        this.a = v03Var;
        this.b = context;
        this.c = o2eVar;
        this.d = b19Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(defpackage.icb r16, java.lang.CharSequence r17, long r18, android.view.textclassifier.TextClassifier r20, defpackage.pu2 r21) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.icb.c(icb, java.lang.CharSequence, long, android.view.textclassifier.TextClassifier, pu2):java.lang.Object");
    }

    @Override // defpackage.dcb
    public final Object a(CharSequence charSequence, long j, pu2 pu2Var) {
        if (charSequence.length() == 0 || kjf.c(j)) {
            return j6g.a;
        }
        return u63.q0(this.a, new gcb(this, new fcb(j, null, this, charSequence), null), pu2Var);
    }

    @Override // defpackage.dcb
    public final Object b(CharSequence charSequence, long j, c1f c1fVar) {
        if (charSequence.length() == 0 || kjf.c(j)) {
            return null;
        }
        return u63.q0(this.a, new gcb(this, new hcb(j, null, this, charSequence), null), c1fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.wcf r6, java.lang.CharSequence r7, long r8, kotlin.jvm.functions.Function1<? super defpackage.wcf, defpackage.j6g> r10) {
        /*
            r5 = this;
            a5a r0 = r5.e
            boolean r1 = r0.d()
            r2 = 0
            if (r1 != 0) goto La
            goto L30
        La:
            g4a r1 = r5.g
            gme r1 = (defpackage.gme) r1
            java.lang.Object r1 = r1.getValue()
            tcf r1 = (defpackage.tcf) r1
            if (r1 == 0) goto L2b
            jte r3 = defpackage.kcb.a
            long r3 = r1.b
            boolean r8 = defpackage.kjf.b(r8, r3)
            if (r8 == 0) goto L2b
            java.lang.CharSequence r8 = r1.a
            boolean r7 = defpackage.wl7.b(r7, r8)
            if (r7 == 0) goto L2b
            android.view.textclassifier.TextClassification r7 = r1.c
            goto L2c
        L2b:
            r7 = r2
        L2c:
            r0.p(r2)
            r2 = r7
        L30:
            if (r2 != 0) goto L36
            r10.invoke(r6)
            return
        L36:
            java.util.List r7 = r2.getActions()
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            r8 = 0
            java.lang.Object r5 = r5.h
            if (r7 != 0) goto L50
            ldf r7 = new ldf
            r7.<init>(r5, r2, r8)
            p3a<xcf> r9 = r6.a
            r9.g(r7)
            goto L77
        L50:
            android.graphics.drawable.Drawable r7 = r2.getIcon()
            if (r7 != 0) goto L60
            java.lang.CharSequence r7 = r2.getLabel()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L77
        L60:
            android.content.Intent r7 = r2.getIntent()
            if (r7 != 0) goto L6c
            android.view.View$OnClickListener r7 = r2.getOnClickListener()
            if (r7 == 0) goto L77
        L6c:
            ldf r7 = new ldf
            r9 = -1
            r7.<init>(r5, r2, r9)
            p3a<xcf> r9 = r6.a
            r9.g(r7)
        L77:
            r10.invoke(r6)
            java.util.List r7 = r2.getActions()
            r9 = r7
            java.util.Collection r9 = (java.util.Collection) r9
            int r9 = r9.size()
        L85:
            if (r8 >= r9) goto L9c
            java.lang.Object r10 = r7.get(r8)
            android.app.RemoteAction r10 = (android.app.RemoteAction) r10
            if (r8 <= 0) goto L99
            ldf r10 = new ldf
            r10.<init>(r5, r2, r8)
            p3a<xcf> r0 = r6.a
            r0.g(r10)
        L99:
            int r8 = r8 + 1
            goto L85
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.icb.d(wcf, java.lang.CharSequence, long, kotlin.jvm.functions.Function1):void");
    }

    public final LocaleList e() {
        b19 b19Var = this.d;
        if (b19Var == null) {
            return new LocaleList(ubb.a.a().a.get(0).a);
        }
        ArrayList arrayList = new ArrayList(t92.r0(b19Var, 10));
        Iterator<a19> it = b19Var.a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
