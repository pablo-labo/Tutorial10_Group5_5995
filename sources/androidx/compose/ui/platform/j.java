package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.b;
import com.indeed.android.jobsearch.R;
import defpackage.bh2;
import defpackage.j6g;
import defpackage.jf8;
import defpackage.mj8;
import defpackage.rm2;
import defpackage.to4;
import defpackage.vf7;
import defpackage.ze8;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class j extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
    final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $content;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(k kVar, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2) {
        super(2);
        this.this$0 = kVar;
        this.$content = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
        androidx.compose.runtime.b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object tag = this.this$0.a.getTag(R.id.inspection_slot_table_set);
            Set set = (!(tag instanceof Set) || ((tag instanceof ze8) && !(tag instanceof jf8))) ? null : (Set) tag;
            if (set == null) {
                Object parent = this.this$0.a.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                set = (!(tag2 instanceof Set) || ((tag2 instanceof ze8) && !(tag2 instanceof jf8))) ? null : (Set) tag2;
            }
            if (set != null) {
                set.add(bVar2.w());
                bVar2.r();
            }
            k kVar = this.this$0;
            AndroidComposeView androidComposeView = kVar.a;
            boolean zX = bVar2.x(kVar);
            k kVar2 = this.this$0;
            Object objV = bVar2.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new g(kVar2, null);
                bVar2.p(objV);
            }
            to4.d(bVar2, androidComposeView, (Function2) objV);
            k kVar3 = this.this$0;
            AndroidComposeView androidComposeView2 = kVar3.a;
            boolean zX2 = bVar2.x(kVar3);
            k kVar4 = this.this$0;
            Object objV2 = bVar2.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new h(kVar4, null);
                bVar2.p(objV2);
            }
            to4.d(bVar2, androidComposeView2, (Function2) objV2);
            rm2.a(vf7.a.a(set), bh2.c(-280240369, new i(this.this$0, this.$content), bVar2), bVar2, 56);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
