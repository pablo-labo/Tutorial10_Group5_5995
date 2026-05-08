package androidx.compose.ui.platform;

import androidx.compose.ui.platform.AndroidComposeView;
import com.indeed.android.jobsearch.R;
import defpackage.ah2;
import defpackage.cm2;
import defpackage.j6g;
import defpackage.km2;
import defpackage.kv8;
import defpackage.mj8;
import defpackage.nk2;
import defpackage.uv8;
import defpackage.zv8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class k implements cm2, uv8 {
    public final AndroidComposeView a;
    public final km2 b;
    public boolean c;
    public kv8 d;
    public Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> e = nk2.a;

    public static final class a extends mj8 implements Function1<AndroidComposeView.b, j6g> {
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2) {
            super(1);
            this.$content = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(AndroidComposeView.b bVar) {
            AndroidComposeView.b bVar2 = bVar;
            if (!k.this.c) {
                kv8 lifecycle = bVar2.a.getLifecycle();
                k kVar = k.this;
                kVar.e = this.$content;
                if (kVar.d == null) {
                    kVar.d = lifecycle;
                    lifecycle.a(kVar);
                } else if (lifecycle.b().compareTo(kv8.b.c) >= 0) {
                    k kVar2 = k.this;
                    kVar2.b.h(new ah2(1330788943, new j(kVar2, this.$content), true));
                }
            }
            return j6g.a;
        }
    }

    public k(AndroidComposeView androidComposeView, km2 km2Var) {
        this.a = androidComposeView;
        this.b = km2Var;
    }

    @Override // defpackage.uv8
    public final void G(zv8 zv8Var, kv8.a aVar) {
        if (aVar == kv8.a.ON_DESTROY) {
            dispose();
        } else {
            if (aVar != kv8.a.ON_CREATE || this.c) {
                return;
            }
            h(this.e);
        }
    }

    @Override // defpackage.cm2
    public final void dispose() {
        if (!this.c) {
            this.c = true;
            this.a.getView().setTag(R.id.wrapped_composition_tag, null);
            kv8 kv8Var = this.d;
            if (kv8Var != null) {
                kv8Var.c(this);
            }
        }
        this.b.dispose();
    }

    @Override // defpackage.cm2
    public final void h(Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2) {
        this.a.setOnViewTreeOwnersAvailable(new a(function2));
    }
}
