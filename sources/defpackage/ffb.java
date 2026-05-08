package defpackage;

import android.view.MotionEvent;
import com.datadog.android.rum.internal.utils.ViewUtilsKt;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ffb implements cfb {
    public hfb b;
    public ql2 c;
    public boolean d;
    public final b e = new b();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a(ViewUtilsKt.UNKNOWN_DESTINATION_URL, 0);
            a = aVar;
            a aVar2 = new a("Dispatching", 1);
            b = aVar2;
            a aVar3 = new a("NotDispatching", 2);
            c = aVar3;
            d = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    public static final class b extends dl2 {
        public a b;
        public neb c;

        public static final class a extends mj8 implements Function1<MotionEvent, j6g> {
            final /* synthetic */ ffb this$1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ffb ffbVar) {
                super(1);
                this.this$1 = ffbVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public final j6g invoke(MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                if (motionEvent2.getActionMasked() == 0) {
                    b bVar = b.this;
                    hfb hfbVar = this.this$1.b;
                    if (hfbVar == null) {
                        wl7.g("onTouchEvent");
                        throw null;
                    }
                    bVar.b = ((Boolean) hfbVar.invoke(motionEvent2)).booleanValue() ? a.b : a.c;
                } else {
                    hfb hfbVar2 = this.this$1.b;
                    if (hfbVar2 == null) {
                        wl7.g("onTouchEvent");
                        throw null;
                    }
                    hfbVar2.invoke(motionEvent2);
                }
                return j6g.a;
            }
        }

        /* JADX INFO: renamed from: ffb$b$b, reason: collision with other inner class name */
        public static final class C0232b extends mj8 implements Function1<MotionEvent, j6g> {
            final /* synthetic */ ffb this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0232b(ffb ffbVar) {
                super(1);
                this.this$0 = ffbVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public final j6g invoke(MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                hfb hfbVar = this.this$0.b;
                if (hfbVar != null) {
                    hfbVar.invoke(motionEvent2);
                    return j6g.a;
                }
                wl7.g("onTouchEvent");
                throw null;
            }
        }

        public b() {
            super(2);
            this.b = a.a;
        }

        public final void W(neb nebVar, boolean z) {
            List<yeb> list = nebVar.a;
            List<yeb> list2 = list;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).b()) {
                    X(nebVar);
                    return;
                }
            }
            sl8 sl8Var = (sl8) this.a;
            if (sl8Var == null) {
                r6.g("layoutCoordinates not set");
                return;
            }
            h4.B(nebVar, sl8Var.a0(0L), new a(ffb.this), false);
            if (this.b == a.b) {
                if (z) {
                    int size2 = list2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        list.get(i2).a();
                    }
                }
                aj7 aj7Var = nebVar.b;
                if (aj7Var != null) {
                    aj7Var.c = !r6.d;
                }
            }
        }

        public final void X(neb nebVar) {
            if (this.b == a.b) {
                sl8 sl8Var = (sl8) this.a;
                if (sl8Var == null) {
                    r6.g("layoutCoordinates not set");
                    return;
                }
                h4.B(nebVar, sl8Var.a0(0L), new C0232b(ffb.this), true);
            }
            this.b = a.c;
        }
    }

    @Override // defpackage.cfb
    public final b u() {
        return this.e;
    }
}
