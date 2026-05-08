package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public interface kpg {

    public static final class a implements kpg {
        public static final a a = new a();

        /* JADX INFO: renamed from: kpg$a$a, reason: collision with other inner class name */
        public static final class C0297a extends mj8 implements gu5<j6g> {
            final /* synthetic */ c $listener;
            final /* synthetic */ n1 $view;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0297a(n1 n1Var, c cVar) {
                super(0);
                this.$view = n1Var;
                this.$listener = cVar;
            }

            @Override // defpackage.gu5
            public final j6g invoke() {
                this.$view.removeOnAttachStateChangeListener(this.$listener);
                return j6g.a;
            }
        }

        public static final class b extends mj8 implements gu5<j6g> {
            final /* synthetic */ luc<gu5<j6g>> $disposer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(luc<gu5<j6g>> lucVar) {
                super(0);
                this.$disposer = lucVar;
            }

            @Override // defpackage.gu5
            public final j6g invoke() {
                this.$disposer.element.invoke();
                return j6g.a;
            }
        }

        public static final class c implements View.OnAttachStateChangeListener {
            public final /* synthetic */ n1 a;
            public final /* synthetic */ luc<gu5<j6g>> b;

            public c(n1 n1Var, luc<gu5<j6g>> lucVar) {
                this.a = n1Var;
                this.b = lucVar;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [T, mpg] */
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                n1 n1Var = this.a;
                zv8 zv8VarA = zte.a(n1Var);
                if (zv8VarA != null) {
                    this.b.element = npg.a(n1Var, zv8VarA.getLifecycle());
                    n1Var.removeOnAttachStateChangeListener(this);
                    return;
                }
                ae7.c("View tree for " + n1Var + " has no ViewTreeLifecycleOwner");
                r40.e();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
            }
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, kpg$a$a] */
        @Override // defpackage.kpg
        public final gu5<j6g> a(n1 n1Var) {
            if (!n1Var.isAttachedToWindow()) {
                luc lucVar = new luc();
                c cVar = new c(n1Var, lucVar);
                n1Var.addOnAttachStateChangeListener(cVar);
                lucVar.element = new C0297a(n1Var, cVar);
                return new b(lucVar);
            }
            zv8 zv8VarA = zte.a(n1Var);
            if (zv8VarA != null) {
                return npg.a(n1Var, zv8VarA.getLifecycle());
            }
            ae7.c("View tree for " + n1Var + " has no ViewTreeLifecycleOwner");
            r40.e();
            return null;
        }
    }

    gu5<j6g> a(n1 n1Var);
}
