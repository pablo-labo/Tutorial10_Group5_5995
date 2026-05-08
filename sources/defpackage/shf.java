package defpackage;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@sy3
public final class shf implements scb {
    public final View a;
    public final xe7 b;
    public final uhf c;
    public boolean d;
    public Function1<? super List<? extends qh4>, j6g> e;
    public Function1<? super s37, j6g> f;
    public jhf g;
    public t37 h;
    public final ArrayList i;
    public final Lazy j;
    public Rect k;
    public final n93 l;
    public final j4a<a> m;
    public l60 n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final /* synthetic */ a[] e;

        static {
            a aVar = new a("StartInput", 0);
            a = aVar;
            a aVar2 = new a("StopInput", 1);
            b = aVar2;
            a aVar3 = new a("ShowKeyboard", 2);
            c = aVar3;
            a aVar4 = new a("HideKeyboard", 3);
            d = aVar4;
            e = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    public static final class b extends mj8 implements Function1<List<? extends qh4>, j6g> {
        public static final b a = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ j6g invoke(List<? extends qh4> list) {
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function1<s37, j6g> {
        public static final c a = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ j6g invoke(s37 s37Var) {
            int i = s37Var.a;
            return j6g.a;
        }
    }

    public shf(View view, AndroidComposeView androidComposeView) {
        xe7 xe7Var = new xe7(view);
        uhf uhfVar = new uhf(Choreographer.getInstance());
        this.a = view;
        this.b = xe7Var;
        this.c = uhfVar;
        this.e = txa.c;
        this.f = uxa.c;
        this.g = new jhf("", kjf.b, 4);
        this.h = t37.g;
        this.i = new ArrayList();
        this.j = boa.E(qt8.c, new thf(this));
        this.l = new n93(androidComposeView, xe7Var);
        this.m = new j4a<>(new a[16]);
    }

    @Override // defpackage.scb
    public final void a() {
        i(a.a);
    }

    @Override // defpackage.scb
    public final void b(jhf jhfVar, roa roaVar, mif mifVar, if0 if0Var, qtc qtcVar, qtc qtcVar2) {
        n93 n93Var = this.l;
        synchronized (n93Var.c) {
            try {
                n93Var.j = jhfVar;
                n93Var.l = roaVar;
                n93Var.k = mifVar;
                n93Var.m = if0Var;
                n93Var.n = qtcVar;
                n93Var.o = qtcVar2;
                if (n93Var.e || n93Var.d) {
                    n93Var.a();
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.scb
    public final void c() {
        this.d = false;
        this.e = b.a;
        this.f = c.a;
        this.k = null;
        i(a.b);
    }

    @Override // defpackage.scb
    public final void d(jhf jhfVar, jhf jhfVar2) {
        boolean z = (kjf.b(this.g.b, jhfVar2.b) && wl7.b(this.g.c, jhfVar2.c)) ? false : true;
        this.g = jhfVar2;
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            jtc jtcVar = (jtc) ((WeakReference) this.i.get(i)).get();
            if (jtcVar != null) {
                jtcVar.d = jhfVar2;
            }
        }
        n93 n93Var = this.l;
        synchronized (n93Var.c) {
            n93Var.j = null;
            n93Var.l = null;
            n93Var.k = null;
            n93Var.m = l93.b;
            n93Var.n = null;
            n93Var.o = null;
            j6g j6gVar = j6g.a;
        }
        if (wl7.b(jhfVar, jhfVar2)) {
            if (z) {
                xe7 xe7Var = this.b;
                int iF = kjf.f(jhfVar2.b);
                int iE = kjf.e(jhfVar2.b);
                kjf kjfVar = this.g.c;
                int iF2 = kjfVar != null ? kjf.f(kjfVar.a) : -1;
                kjf kjfVar2 = this.g.c;
                xe7Var.a(iF, iE, iF2, kjfVar2 != null ? kjf.e(kjfVar2.a) : -1);
                return;
            }
            return;
        }
        if (jhfVar != null && (!wl7.b(jhfVar.a.b, jhfVar2.a.b) || (kjf.b(jhfVar.b, jhfVar2.b) && !wl7.b(jhfVar.c, jhfVar2.c)))) {
            xe7 xe7Var2 = this.b;
            ((InputMethodManager) xe7Var2.b.getValue()).restartInput(xe7Var2.a);
            return;
        }
        int size2 = this.i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jtc jtcVar2 = (jtc) ((WeakReference) this.i.get(i2)).get();
            if (jtcVar2 != null) {
                jhf jhfVar3 = this.g;
                xe7 xe7Var3 = this.b;
                if (jtcVar2.h) {
                    jtcVar2.d = jhfVar3;
                    if (jtcVar2.f) {
                        ((InputMethodManager) xe7Var3.b.getValue()).updateExtractedText(xe7Var3.a, jtcVar2.e, cr8.G(jhfVar3));
                    }
                    kjf kjfVar3 = jhfVar3.c;
                    long j = jhfVar3.b;
                    int iF3 = kjfVar3 != null ? kjf.f(kjfVar3.a) : -1;
                    kjf kjfVar4 = jhfVar3.c;
                    xe7Var3.a(kjf.f(j), kjf.e(j), iF3, kjfVar4 != null ? kjf.e(kjfVar4.a) : -1);
                }
            }
        }
    }

    @Override // defpackage.scb
    public final void e() {
        i(a.d);
    }

    @Override // defpackage.scb
    @sy3
    public final void f(qtc qtcVar) {
        Rect rect;
        this.k = new Rect(gf9.b(qtcVar.a), gf9.b(qtcVar.b), gf9.b(qtcVar.c), gf9.b(qtcVar.d));
        if (!this.i.isEmpty() || (rect = this.k) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // defpackage.scb
    public final void g(jhf jhfVar, t37 t37Var, t2d t2dVar, or orVar) {
        this.d = true;
        this.g = jhfVar;
        this.h = t37Var;
        this.e = t2dVar;
        this.f = orVar;
        i(a.a);
    }

    @Override // defpackage.scb
    public final void h() {
        i(a.c);
    }

    public final void i(a aVar) {
        this.m.b(aVar);
        if (this.n == null) {
            l60 l60Var = new l60(this, 3);
            this.c.execute(l60Var);
            this.n = l60Var;
        }
    }
}
