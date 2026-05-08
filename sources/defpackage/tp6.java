package defpackage;

import android.os.Bundle;
import androidx.navigation.e;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import defpackage.kv8;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.bottomnav.IanMainFragment$observeAgeSignalsEvent$1", f = "IanMainFragment.kt", l = {1485}, m = "invokeSuspend")
public final class tp6 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ IanMainFragment this$0;

    @uh3(c = "com.indeed.android.jobsearch.bottomnav.IanMainFragment$observeAgeSignalsEvent$1$1", f = "IanMainFragment.kt", l = {1486}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;
        final /* synthetic */ IanMainFragment this$0;

        /* JADX INFO: renamed from: tp6$a$a, reason: collision with other inner class name */
        public static final class C0425a<T> implements wi5 {
            public final /* synthetic */ IanMainFragment a;

            public C0425a(IanMainFragment ianMainFragment) {
                this.a = ianMainFragment;
            }

            @Override // defpackage.wi5
            public final Object a(Object obj, lu2 lu2Var) {
                i00 i00Var = (i00) obj;
                if (i00Var != null) {
                    IanMainFragment ianMainFragment = this.a;
                    ((g00) ianMainFragment.Y.getValue()).getClass();
                    if (g00.c(i00Var)) {
                        m99 m99Var = (m99) ianMainFragment.m0.getValue();
                        e eVarK = mh2.k(ianMainFragment);
                        eVarK.getClass();
                        m99Var.g("native_app_blocking_pending_verification");
                        m99Var.j("native_app_blocking_pending_verification");
                        eVarK.n(R.id.navActionDirectlyBlockingPendingVerification, new Bundle());
                        g3a<jz2<j6g>> g3aVar = kqg.a;
                        lr5 lr5VarU = ianMainFragment.requireActivity().u();
                        lr5VarU.getClass();
                        kqg.b(lr5VarU);
                        lr5 lr5VarU2 = ianMainFragment.requireActivity().u();
                        lr5VarU2.getClass();
                        web.D(lr5VarU2, "FsdvFragment");
                        ArrayList arrayList = lz2.a;
                        lz2.d("FsdvUtils", "Closing FSDV Fragment", false, null);
                    }
                }
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(IanMainFragment ianMainFragment, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.this$0 = ianMainFragment;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.this$0, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) throws Throwable {
            ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            return g13.a;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    throw s6.e(obj);
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            gse gseVar = ((g00) this.this$0.Y.getValue()).V;
            C0425a c0425a = new C0425a(this.this$0);
            this.label = 1;
            gseVar.e(c0425a, this);
            return g13.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp6(IanMainFragment ianMainFragment, lu2<? super tp6> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ianMainFragment;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new tp6(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((tp6) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            zv8 viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            a aVar = new a(this.this$0, null);
            this.label = 1;
            Object objB = c2d.b(viewLifecycleOwner, kv8.b.c, aVar, this);
            g13 g13Var = g13.a;
            if (objB == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        return j6g.a;
    }
}
