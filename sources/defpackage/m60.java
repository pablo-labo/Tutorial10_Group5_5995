package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class m60 implements qo3, View.OnAttachStateChangeListener {
    public a3a Y;
    public long Z;
    public final AndroidComposeView a;
    public final a3a<g5e> a0;
    public final AndroidComposeView.e b;
    public g5e b0;
    public os2 c;
    public boolean c0;
    public final l60 d0;
    public final ArrayList d = new ArrayList();
    public final long e = 100;
    public a f = a.a;
    public boolean V = true;
    public final go1 W = h22.a(1, 6, null);
    public final Handler X = new Handler(Looper.getMainLooper());

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("SHOW_ORIGINAL", 0);
            a = aVar;
            a aVar2 = new a("SHOW_TRANSLATED", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public static final class b {
        public static void a(m60 m60Var, LongSparseArray longSparseArray) {
            TranslationResponseValue value;
            CharSequence text;
            i5e i5eVarB;
            f5e f5eVar;
            r5 r5Var;
            Function1 function1;
            int size = longSparseArray.size();
            for (int i = 0; i < size; i++) {
                long jKeyAt = longSparseArray.keyAt(i);
                ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(jKeyAt);
                if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (i5eVarB = m60Var.d().b((int) jKeyAt)) != null && (f5eVar = i5eVarB.a) != null && (r5Var = (r5) x4e.a(f5eVar.d, v4e.k)) != null && (function1 = (Function1) r5Var.b) != null) {
                }
            }
        }

        public static void b(m60 m60Var, long[] jArr, Consumer consumer) {
            f5e f5eVar;
            for (long j : jArr) {
                i5e i5eVarB = m60Var.d().b((int) j);
                if (i5eVarB != null && (f5eVar = i5eVarB.a) != null) {
                    ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(m60Var.a.getAutofillId(), f5eVar.g);
                    List list = (List) x4e.a(f5eVar.d, k5e.A);
                    if (list != null) {
                        builder.setValue("android:text", TranslationRequestValue.forText(new le0(fz8.b(62, "\n", list, null))));
                        consumer.accept(builder.build());
                    }
                }
            }
        }
    }

    public static final class c extends mj8 implements Function2<Integer, f5e, j6g> {
        final /* synthetic */ g5e $oldNode;
        final /* synthetic */ m60 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g5e g5eVar, m60 m60Var) {
            super(2);
            this.$oldNode = g5eVar;
            this.this$0 = m60Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Integer num, f5e f5eVar) {
            int iIntValue = num.intValue();
            f5e f5eVar2 = f5eVar;
            if (!this.$oldNode.b.b(f5eVar2.g)) {
                this.this$0.i(iIntValue, f5eVar2);
                this.this$0.W.f(j6g.a);
            }
            return j6g.a;
        }
    }

    public static final class d extends mj8 implements Function2<Integer, f5e, j6g> {
        public d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Integer num, f5e f5eVar) {
            m60.this.i(num.intValue(), f5eVar);
            return j6g.a;
        }
    }

    public m60(AndroidComposeView androidComposeView, AndroidComposeView.e eVar) {
        this.a = androidComposeView;
        this.b = eVar;
        a3a a3aVar = kh7.a;
        a3aVar.getClass();
        this.Y = a3aVar;
        this.a0 = new a3a<>();
        this.b0 = new g5e(androidComposeView.getSemanticsOwner().a(), a3aVar);
        this.d0 = new l60(this, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0080 -> B:17:0x004a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.pu2 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.o60
            if (r0 == 0) goto L13
            r0 = r8
            o60 r0 = (defpackage.o60) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            o60 r0 = new o60
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            g13 r4 = defpackage.g13.a
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            java.lang.Object r1 = r0.L$0
            g22 r1 = (defpackage.g22) r1
            defpackage.r7d.b(r8)
            goto L4a
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            r7 = 0
            return r7
        L35:
            java.lang.Object r1 = r0.L$0
            g22 r1 = (defpackage.g22) r1
            defpackage.r7d.b(r8)
            goto L55
        L3d:
            defpackage.r7d.b(r8)
            go1 r8 = r7.W
            r8.getClass()
            go1$a r1 = new go1$a
            r1.<init>()
        L4a:
            r0.L$0 = r1
            r0.label = r3
            java.lang.Object r8 = r1.b(r0)
            if (r8 != r4) goto L55
            goto L82
        L55:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L83
            r1.next()
            boolean r8 = r7.e()
            if (r8 == 0) goto L69
            r7.f()
        L69:
            boolean r8 = r7.c0
            if (r8 != 0) goto L76
            r7.c0 = r3
            android.os.Handler r8 = r7.X
            l60 r5 = r7.d0
            r8.post(r5)
        L76:
            r0.L$0 = r1
            r0.label = r2
            long r5 = r7.e
            java.lang.Object r8 = defpackage.ls3.b(r5, r0)
            if (r8 != r4) goto L4a
        L82:
            return r4
        L83:
            j6g r7 = defpackage.j6g.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m60.a(pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.jh7<defpackage.i5e> r34) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m60.b(jh7):void");
    }

    public final void c(f5e f5eVar, Function2<? super Integer, ? super f5e, j6g> function2) {
        f5eVar.getClass();
        List listJ = f5e.j(4, f5eVar);
        int size = listJ.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = listJ.get(i2);
            if (d().a(((f5e) obj).g)) {
                function2.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
    }

    public final jh7<i5e> d() {
        if (this.V) {
            this.V = false;
            this.Y = ypd.w(this.a.getSemanticsOwner());
            this.Z = System.currentTimeMillis();
        }
        return this.Y;
    }

    public final boolean e() {
        return this.c != null;
    }

    public final void f() {
        os2 os2Var = this.c;
        if (os2Var != null && Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.d;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ms2 ms2Var = (ms2) arrayList.get(i);
                int iOrdinal = ms2Var.c.ordinal();
                if (iOrdinal == 0) {
                    xrg xrgVar = ms2Var.d;
                    if (xrgVar != null) {
                        os2Var.d(xrgVar.a);
                    }
                } else if (iOrdinal != 1) {
                    l.g();
                    return;
                } else {
                    AutofillId autofillIdB = os2Var.b(ms2Var.a);
                    if (autofillIdB != null) {
                        os2Var.e(autofillIdB);
                    }
                }
            }
            os2Var.a();
            arrayList.clear();
        }
    }

    public final void g(f5e f5eVar, g5e g5eVar) {
        c(f5eVar, new c(g5eVar, this));
        List listJ = f5e.j(4, f5eVar);
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            f5e f5eVar2 = (f5e) listJ.get(i);
            jh7<i5e> jh7VarD = d();
            int i2 = f5eVar2.g;
            if (jh7VarD.a(i2)) {
                a3a<g5e> a3aVar = this.a0;
                if (a3aVar.a(i2)) {
                    g5e g5eVarB = a3aVar.b(i2);
                    if (g5eVarB == null) {
                        throw l6.k("node not present in pruned tree before this change");
                    }
                    g(f5eVar2, g5eVarB);
                } else {
                    continue;
                }
            }
        }
    }

    public final void h(int i, String str) {
        os2 os2Var;
        if (Build.VERSION.SDK_INT >= 29 && (os2Var = this.c) != null) {
            AutofillId autofillIdB = os2Var.b(i);
            if (autofillIdB == null) {
                throw l6.k("Invalid content capture ID");
            }
            os2Var.f(autofillIdB, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(int r14, defpackage.f5e r15) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m60.i(int, f5e):void");
    }

    public final void j(f5e f5eVar) {
        if (e()) {
            this.d.add(new ms2(f5eVar.g, this.Z, ns2.b, null));
            List listJ = f5e.j(4, f5eVar);
            int size = listJ.size();
            for (int i = 0; i < size; i++) {
                j((f5e) listJ.get(i));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            r17 = this;
            r0 = r17
            a3a<g5e> r1 = r0.a0
            r1.c()
            jh7 r2 = r0.d()
            int[] r3 = r2.b
            java.lang.Object[] r4 = r2.c
            long[] r2 = r2.a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L5e
            r7 = 0
        L17:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L59
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L31:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            i5e r13 = (defpackage.i5e) r13
            g5e r15 = new g5e
            f5e r13 = r13.a
            jh7 r6 = r0.d()
            r15.<init>(r13, r6)
            r1.h(r14, r15)
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L31
        L57:
            if (r10 != r11) goto L5e
        L59:
            if (r7 == r5) goto L5e
            int r7 = r7 + 1
            goto L17
        L5e:
            g5e r1 = new g5e
            androidx.compose.ui.platform.AndroidComposeView r2 = r0.a
            j5e r2 = r2.getSemanticsOwner()
            f5e r2 = r2.a()
            jh7 r3 = r0.d()
            r1.<init>(r2, r3)
            r0.b0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m60.k():void");
    }

    @Override // defpackage.qo3
    public final void onStart(zv8 zv8Var) {
        this.c = (os2) this.b.invoke();
        i(-1, this.a.getSemanticsOwner().a());
        f();
    }

    @Override // defpackage.qo3
    public final void onStop(zv8 zv8Var) {
        j(this.a.getSemanticsOwner().a());
        f();
        this.c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.X.removeCallbacks(this.d0);
        this.c = null;
    }
}
